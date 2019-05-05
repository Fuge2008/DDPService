package com.fuge.xyin.service.impl;

import com.fuge.xyin.dao.VideoDao;
import com.fuge.xyin.domain.VideoMb;
import com.fuge.xyin.service.VideoMrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class VideoMrServiceImpl implements VideoMrService {
    @Autowired
    private VideoDao videoDao;
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 获取城市逻辑：
     *      如果缓存存在，从缓存中获取视频信息
     *      如果缓存不存在，从DB 中获取视频信息，然后插入缓存
     * @param id
     * @return
     */
    public VideoMb findVideoById(Long id) {
        //从缓存中获取视频信息
        String key = "video_"+id;
        ValueOperations<String,VideoMb> operations = redisTemplate.opsForValue();

        //缓存存在
        boolean hasKey = redisTemplate.hasKey(key);
        if (hasKey) {
            VideoMb videoMb = operations.get(key);
            return videoMb;
        }
        //从DB中获取视频信息
        VideoMb videoMb = videoDao.findById(id);
        //插入缓存
        operations.set(key,videoMb,10, TimeUnit.SECONDS);
        return videoMb;
    }


    @Override
    public Long saveVideo(VideoMb videoMb) {
        return null;
    }

    /**
     * 更新视频逻辑
     * 如果缓存存在，删除
     * 如果缓存不存在，不操作
     * @param videoMb
     * @return
     */
    @Override
    public Long updateVideo(VideoMb videoMb) {
        Long ret = videoDao.updateVideo(videoMb);
        //缓存存在，删除缓存
        String key  = "video_" +videoMb.getId();
        boolean hasKey = redisTemplate.hasKey(key);
        if (hasKey) {
            redisTemplate.delete(key);
        }
        return ret;
    }

    @Override
    public Long delete(Long id) {
        Long ret = videoDao.deleteVideo(id);
        //缓存存在，删除缓存
        String key = "video_" + id;
        boolean hasKey = redisTemplate.hasKey(key);
        if (hasKey) {
            redisTemplate.delete(key);
            if (hasKey){
                redisTemplate.delete(key);

            }
        }
        return ret;
    }
}
