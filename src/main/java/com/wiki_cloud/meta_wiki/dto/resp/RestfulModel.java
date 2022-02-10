package com.wiki_cloud.meta_wiki.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
/**
 * @author qingfeng
 * meta_wiki
 */
@Data
@AllArgsConstructor
public class RestfulModel<T> {

    /**
     * 响应的错误码
     */
    private int code;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 返回泛型数据，自定义类型
     */
    private T data;
}
