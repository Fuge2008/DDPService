package com.fuge.xyin.dao;

import com.fuge.xyin.domain.VideoMb;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 城市DAO 接口类
 */
public interface VideoDao {
    /**
     * 获取视频信息列表
     * @return
     */
    List<VideoMb> findAllVideo();

    /**
     * 根据视频 ID，获取视频信息
     * @param id
     * @return
     */
    VideoMb findById(@Param("id") Long id);

    Long saveVideo(VideoMb videoMb);

    Long updateVideo(VideoMb videoMb);

    Long deleteVideo(Long id);
}
