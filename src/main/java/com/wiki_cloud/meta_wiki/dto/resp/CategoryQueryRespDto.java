package com.wiki_cloud.meta_wiki.dto.resp;

import lombok.Data;
/**
 * @author qingfeng
 * meta_wiki
 */
@Data
public class CategoryQueryRespDto {
    private Long id;

    private Long parent;

    private String name;

    private Integer sort;
}