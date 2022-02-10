package com.wiki_cloud.meta_wiki.dto.resp;

import lombok.Data;
/**
 * @author qingfeng
 * meta_wiki
 */
@Data
public class EbookQueryRespDto {
    private Long id;

    private String name;

    private Long category1Id;

    private Long category2Id;

    private String description;

    private String cover;

    private Integer docCount;

    private Integer viewCount;

    private Integer voteCount;
}
