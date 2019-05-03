package com.fuge.xyin.domain;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * ES操作类
 */
public interface VideoEsRepository extends ElasticsearchRepository<VideoEs,Long> {
}
