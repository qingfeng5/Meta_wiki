package com.wiki_cloud.meta_wiki.dto.resp;

import lombok.Data;
/**
 * @author qingfeng
 * meta_wiki
 */
@Data
public class DocQueryRespDto {
    private Long id;

    private Long ebookId;

    private Long parent;

    private String name;

    private Integer sort;

    private Integer viewCount;

    private Integer voteCount;
}
