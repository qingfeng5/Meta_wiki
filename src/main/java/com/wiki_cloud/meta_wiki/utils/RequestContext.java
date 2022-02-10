package com.wiki_cloud.meta_wiki.utils;

import java.io.Serializable;
/**
 * @author qingfeng
 * meta_wiki
 */
public class RequestContext implements Serializable {

    private static final ThreadLocal<String> remoteAddr = new ThreadLocal<>();

    public static String getRemoteAddr() {
        return remoteAddr.get();
    }

    public static void setRemoteAddr(String remoteAddr) {
        RequestContext.remoteAddr.set(remoteAddr);
    }

}
