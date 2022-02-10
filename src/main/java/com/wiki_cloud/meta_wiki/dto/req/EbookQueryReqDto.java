package com.wiki_cloud.meta_wiki.dto.req;

import lombok.Data;
import lombok.EqualsAndHashCode;
/**
 * @author qingfeng
 * meta_wiki
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class EbookQueryReqDto extends PageReqDto {

    private String name;

    private Long CategoryId2;
}
