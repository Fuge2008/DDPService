package com.fuge.xyin.service;

import com.fuge.xyin.domain.VideoMb;

/**
 * 视频业务逻辑接口类
 */
public interface VideoMrService {
    /**
     * 根据视频 ID,查询城市信息
     * @param id
     * @return
     */
    VideoMb findVideoById(Long id);

    /**
     * 新增视频信息
     * @param videoMb
     * @return
     */
   Long saveVideo(VideoMb videoMb);

    /**
     * 更新视频信息
     * @param videoMb
     * @return
     */
   Long updateVideo(VideoMb videoMb);

    /**
     * 根据视频 Id,删除视频信息
     * @param id
     * @return
     */
   Long delete(Long id);
}
