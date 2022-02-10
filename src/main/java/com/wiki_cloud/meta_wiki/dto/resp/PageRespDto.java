package com.wiki_cloud.meta_wiki.dto.resp;

import lombok.Data;

import java.util.List;
/**
 * @author qingfeng
 * meta_wiki
 */
@Data
public class PageRespDto<T> {

    private long total;

    private List<T> list;
}
