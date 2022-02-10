package com.wiki_cloud.meta_wiki.mapper;

import com.wiki_cloud.meta_wiki.dto.resp.StatisticRespDto;

import java.util.List;
/**
 * @author qingfeng
 * meta_wiki
 */
public interface EbookSnapshotMapperCustom {
    void genSnapshot();

    List<StatisticRespDto> getStatistic();

    List<StatisticRespDto> get30DayStatistic();
}
