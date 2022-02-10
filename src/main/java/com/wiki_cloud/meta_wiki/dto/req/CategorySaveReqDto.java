package com.wiki_cloud.meta_wiki.dto.req;

import lombok.Data;
/**
 * @author qingfeng
 * meta_wiki
 */
@Data
public class CategorySaveReqDto {
    private Long id;

    private Long parent;

    private String name;

    private Integer sort;
}