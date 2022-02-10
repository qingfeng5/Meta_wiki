package com.wiki_cloud.meta_wiki.dto.req;

import lombok.Data;
import lombok.EqualsAndHashCode;
/**
 * @author qingfeng
 * meta_wiki
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserQueryReqDto extends PageReqDto {

    private String loginName;

}
