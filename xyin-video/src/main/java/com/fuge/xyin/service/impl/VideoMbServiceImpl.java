package com.fuge.xyin.service.impl;

import com.fuge.xyin.domain.VideoMb;
import com.fuge.xyin.service.VideoMbService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 城市业务逻辑实现类
 */
@Service
public class VideoMbServiceImpl implements VideoMbService {
    //模拟数据库插入操作
    private Map<String,VideoMb> videoMbMap = new HashMap<>();

    @Cacheable(value = "baseVideoInfo")
    public VideoMb getVideoByName(String videoName) {
        //模拟数据库查询并返回
        return videoMbMap.get(videoName);
    }

    public void saveVideo(VideoMb videoMb) {
        //模拟数据库插入操作
        videoMbMap.put(videoMb.getVideotitle(),videoMb);
    }

    @Cacheable(value = "baseVideoInfo")
    public void updateVideoUrl(String videoTitle, String url) {
        VideoMb videoMb = videoMbMap.get(videoTitle);
        videoMb.setVideourl(url);
        //模拟更新数据库
        videoMbMap.put(videoTitle,videoMb);
    }
}
