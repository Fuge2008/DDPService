package com.fuge.xyin.service;

import com.fuge.xyin.domain.VideoMb;

/**
 * 城市业务逻辑接口类
 */
public interface VideoMbService {
    /**
     * 获取视频
     * @param videoName
     * @return
     */
    VideoMb getVideoByName(String videoName);

    /**
     * 新增视频信息
     * @param videoMb
     */
    void saveVideo(VideoMb videoMb);

    /**
     * 更新视频信息
     * @param videoTitle
     * @param url
     * */
    void updateVideoUrl(String videoTitle,String url);
}
