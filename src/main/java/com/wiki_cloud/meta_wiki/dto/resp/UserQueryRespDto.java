package com.wiki_cloud.meta_wiki.dto.resp;

import lombok.Data;
/**
 * @author qingfeng
 * meta_wiki
 */
@Data
public class UserQueryRespDto {
    private Long id;

    private String loginName;

    private String name;

    private String password;

}
