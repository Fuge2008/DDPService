package com.fuge.xyin.service;

import com.fuge.xyin.domain.Video;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface VideoPageServie {
    /**
     * 获取视频分页列表
     * @param pageable
     * @return
     */
    Page<Video> findByPage(Pageable pageable);

    /**
     * 新增视频
     * @param video
     * @return
     */
    Video insertByVideo(Video video);
}
