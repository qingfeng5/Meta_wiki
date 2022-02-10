package com.wiki_cloud.meta_wiki.controller;


import com.wiki_cloud.meta_wiki.dto.resp.ErrorCode;
import com.wiki_cloud.meta_wiki.dto.resp.RestfulModel;
import com.wiki_cloud.meta_wiki.dto.resp.StatisticRespDto;
import com.wiki_cloud.meta_wiki.service.EbookSnapshotService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
/**
 * @author qingfeng
 * meta_wiki
 */
@RestController
@RequestMapping("/ebook-snapshot")
@Api("电子书快照管理")
public class EbookSnapshotController {

    @Resource
    private EbookSnapshotService ebookSnapshotService;

    @GetMapping("/get-statistic")
    @ApiOperation(value = "从电子书快照中昨天和今天的获取统计数据")
    public RestfulModel<List<StatisticRespDto>> getStatistic() {
        List<StatisticRespDto> statisticRespDtoList = ebookSnapshotService.getStatistic();
        return new RestfulModel<>(ErrorCode.SUCCESS, "", statisticRespDtoList);
    }

    @GetMapping("/get-30-statistic")
    @ApiOperation(value = "从电子书快照中获取近30天的统计数据")
    public RestfulModel<List<StatisticRespDto>> get30DayStatistic() {
        List<StatisticRespDto> statisticRespDtoList = ebookSnapshotService.get30DayStatistic();
        return new RestfulModel<>(ErrorCode.SUCCESS, "", statisticRespDtoList);
    }
}
