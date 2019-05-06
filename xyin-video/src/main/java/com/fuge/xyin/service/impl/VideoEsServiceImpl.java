//package com.fuge.xyin.service.impl;
//
//import com.fuge.xyin.domain.Video;
//import com.fuge.xyin.domain.VideoEs;
//import com.fuge.xyin.domain.VideoEsRepository;
//import com.fuge.xyin.service.VideoEsService;
//import org.elasticsearch.index.query.QueryBuilders;
//import org.elasticsearch.index.query.functionscore.FunctionScoreQueryBuilder;
//import org.elasticsearch.index.query.functionscore.ScoreFunctionBuilders;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
//import org.springframework.data.elasticsearch.core.query.SearchQuery;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
///**
// * 城市 ES 业务逻辑类实现
// */
//@Service
//public class VideoEsServiceImpl implements VideoEsService {
//    private static final Logger LOGGER = LoggerFactory.getLogger(VideoEsServiceImpl.class);
//    /* 分页参数 */
//    Integer PAGE_SIZE = 12; //每页数量
//    Integer DEFAULT_PAGE_NUMBER = 0; //默认当前页
//
//    /* 搜索模式*/
//    String SCORE_MODE_SUM = "sum";  //权重分求和模式
//    Float MIN_SCORE = 10.0F;  // 由于无相关性的分值默认为1，设置权重分最小值为 10
//
//    @Autowired
//    VideoEsRepository videoEsRepository; //ES 操作类
//
//    @Override
//    public Long saveVideo(VideoEs videoEs) {
//        VideoEs videoResult = videoEsRepository.save(videoEs);
//        return videoResult.getId();
//    }
//
//
//    @Override
//    public List<VideoEs> searchVideo(Integer pageNumber, Integer pageSize, String searchContent) {
//       //校验分页参数
//        if (pageSize == null || pageSize <= 0){
//            pageSize = PAGE_SIZE;
//        }
//        if (pageNumber == null || pageNumber < DEFAULT_PAGE_NUMBER){
//            pageNumber = DEFAULT_PAGE_NUMBER;
//        }
//        SearchQuery searchQuery = getVideoQuery(pageNumber,pageSize,searchContent);
//        Page<VideoEs> videosPage = videoEsRepository.search(searchQuery);
//        return videosPage.getContent();
//    }
//
//    /**
//     * 根据搜索词构造搜索查询语句
//     *      代码流程
//     *          - 权重分查询
//     *          - 短语匹配
//     *          - 设置权重分最小值
//     *          - 设置分页参数
//     * @param pageNumber 当前页码
//     * @param pageSize 每页大小
//     * @param searchContent 搜索内容
//     * @return
//     */
//    private SearchQuery getVideoQuery(Integer pageNumber, Integer pageSize, String searchContent) {
//        // 短语匹配到的搜索词，求和模式累加权重分
//        // 权重分查询 https://www.elastic.co/guide/cn/elasticsearch/guide/current/function-score-query.html
//        //   - 短语匹配 https://www.elastic.co/guide/cn/elasticsearch/guide/current/phrase-matching.html
//        //   - 字段对应权重分设置，可以优化成 enum
//        //   - 由于无相关性的分值默认为 1 ，设置权重分最小值为 10
//        FunctionScoreQueryBuilder functionScoreQueryBuilder = QueryBuilders.functionScoreQuery()
//                .add(QueryBuilders.matchPhraseQuery("videotitle",searchContent),
//                        ScoreFunctionBuilders.weightFactorFunction(1000))
//                .add(QueryBuilders.matchPhraseQuery("videocontent",searchContent),
//                        ScoreFunctionBuilders.weightFactorFunction(500))
//                .scoreMode(SCORE_MODE_SUM).setMinScore(MIN_SCORE);
//
//        //分页参数
//        Pageable pageable = new PageRequest(pageNumber,pageSize);
//        return new NativeSearchQueryBuilder()
//                .withPageable(pageable)
//                .withQuery(functionScoreQueryBuilder).build();
//
//    }
//}
