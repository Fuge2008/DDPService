package com.fuge.xyin.domain;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 用户持久层操作接口
 */
public interface VideoPageRepository extends PagingAndSortingRepository<Video,Long> {
}
