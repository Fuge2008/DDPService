package com.fuge.xyin.service.impl;

import com.fuge.xyin.domain.Video;
import com.fuge.xyin.domain.VideoRepository;
import com.fuge.xyin.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = "videos")
public class VideoServiceImpl implements VideoService {
    @Autowired
    VideoRepository videoRepository;

    @Override
    public List<Video> findAll() {
        return videoRepository.findAll();
    }

    @Override
    public Video insertByVideo(Video video) {
        return videoRepository.save(video);
    }

    @CachePut(key = "#p0.id")
    @Override
    public Video updata(Video video) {
        return videoRepository.save(video);
    }

    @CacheEvict(key = "#p0")
    @Override
    public Video delete(Long id) {
        Video video = videoRepository.findOne(id);
        videoRepository.delete(video);
        return video;
    }

    @Cacheable(key = "#p0")
    @Override
    public Video findById(Long id) {
        return videoRepository.findOne(id);
    }
}
