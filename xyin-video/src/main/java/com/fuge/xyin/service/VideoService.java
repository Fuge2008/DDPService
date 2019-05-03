package com.fuge.xyin.service;

import com.fuge.xyin.domain.Video;

import java.util.List;

public interface VideoService {
    /**
     * 查询所有 Video
     * @return
     */
    List<Video> findAll();

    /**
     * 新增 Video
     * @param video
     * @return
     */
    Video insertByVideo(Video video);

    /**
     * 更新 Video
     * @param video
     * @return
     */
    Video updata(Video video);

    /**
     * 删除 Video
     * @param id
     * @return
     */
    Video delete(Long id);

    /**
     * 获取Book
     * @param id
     * @return
     */
    Video findById(Long id);
}
