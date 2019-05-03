package com.fuge.xyin.service.impl;

import com.fuge.xyin.domain.Video;
import com.fuge.xyin.domain.VideoPageRepository;
import com.fuge.xyin.service.VideoPageServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class VideoPageServiceImpl implements VideoPageServie {
    @Autowired
    VideoPageRepository videoPageRepository;
    @Override
    public Page<Video> findByPage(Pageable pageable) {
        return videoPageRepository.findAll(pageable);
    }

    @Override
    public Video insertByVideo(Video video) {
        return videoPageRepository.save(video);
    }
}
