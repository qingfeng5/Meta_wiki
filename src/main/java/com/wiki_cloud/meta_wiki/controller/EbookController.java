package com.wiki_cloud.meta_wiki.controller;

import com.wiki_cloud.meta_wiki.dto.req.EbookQueryReqDto;
import com.wiki_cloud.meta_wiki.dto.req.EbookSaveReqDto;
import com.wiki_cloud.meta_wiki.dto.resp.EbookQueryRespDto;
import com.wiki_cloud.meta_wiki.dto.resp.ErrorCode;
import com.wiki_cloud.meta_wiki.dto.resp.PageRespDto;
import com.wiki_cloud.meta_wiki.dto.resp.RestfulModel;
import com.wiki_cloud.meta_wiki.service.EbookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
/**
 * @author qingfeng
 * meta_wiki
 */
@Api("电子书管理")
@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    /**
     * @param ebookQueryReqDto 查询条件的参数
     * @return 查询到的所有ebook
     */
    @ApiOperation("对 ebook 进行查询的接口")
    @GetMapping("/query")
    public RestfulModel<PageRespDto<EbookQueryRespDto>> queryEbooks(@Valid EbookQueryReqDto ebookQueryReqDto) {
        PageRespDto<EbookQueryRespDto> bookList = ebookService.queryEbooks(ebookQueryReqDto);
        return new RestfulModel<>(ErrorCode.SUCCESS, "", bookList);
    }

    /**
     * 根据请求的参数保存一个 ebook，若id非空则为更新，否则为新增
     */
    @ApiOperation(value = "根据请求的参数保存一个 ebook",
            notes = "若id非空则为更新，否则为新增")
    @PostMapping("/save")
    public RestfulModel<Integer> saveEbook(@RequestBody @Valid EbookSaveReqDto ebookSaveReqDto) {
        ebookService.save(ebookSaveReqDto);
        return new RestfulModel<>(ErrorCode.SUCCESS, "", 0);
    }

    @ApiOperation(value = "删除一个 ebook")
    @DeleteMapping("/delete/{ebookId}")
    public RestfulModel<Integer> deleteEbook(@PathVariable Long ebookId) {
        ebookService.deleteOneEbook(ebookId);
        return new RestfulModel<>(ErrorCode.SUCCESS, "", 0);
    }
}
