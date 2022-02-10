package com.wiki_cloud.meta_wiki.controller;

import com.wiki_cloud.meta_wiki.dto.req.CategoryQueryReqDto;
import com.wiki_cloud.meta_wiki.dto.req.CategorySaveReqDto;
import com.wiki_cloud.meta_wiki.dto.resp.CategoryQueryRespDto;
import com.wiki_cloud.meta_wiki.dto.resp.ErrorCode;
import com.wiki_cloud.meta_wiki.dto.resp.PageRespDto;
import com.wiki_cloud.meta_wiki.dto.resp.RestfulModel;
import com.wiki_cloud.meta_wiki.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;
/**
 * @author qingfeng
 * meta_wiki
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Resource
    private CategoryService categoryService;

    /**
     * 获取全部 Category 的接口
     */
    @GetMapping("/all")
    public RestfulModel<List<CategoryQueryRespDto>> allCategories() {
        List<CategoryQueryRespDto> categoryList = categoryService.fetchAllCategories();
        return new RestfulModel<>(ErrorCode.SUCCESS, "", categoryList);
    }

    /**
     * 对 category 进行查询的接口
     * @param categoryQueryReqDto 查询条件的参数
     * @return 查询到的所有category
     */
    @GetMapping("/query")
    public RestfulModel<PageRespDto<CategoryQueryRespDto>> queryCategorys(@Valid CategoryQueryReqDto categoryQueryReqDto) {
        PageRespDto<CategoryQueryRespDto> bookList = categoryService.queryCategorys(categoryQueryReqDto);
        return new RestfulModel<>(ErrorCode.SUCCESS, "", bookList);
    }

    /**
     * 根据请求的参数保存一个 category，若id非空则为更新，否则为新增
     */
    @PostMapping("/save")
    public RestfulModel<Integer> saveCategory(@RequestBody @Valid CategorySaveReqDto categorySaveReqDto) {
        categoryService.save(categorySaveReqDto);
        return new RestfulModel<>(ErrorCode.SUCCESS, "", 0);
    }

    @DeleteMapping("/delete/{categoryId}")
    public RestfulModel<Integer> deleteCategory(@PathVariable Long categoryId) {
        categoryService.deleteOneCategory(categoryId);
        return new RestfulModel<>(ErrorCode.SUCCESS, "", 0);
    }
}
