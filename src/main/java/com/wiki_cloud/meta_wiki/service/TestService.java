package com.wiki_cloud.meta_wiki.service;

import com.wiki_cloud.meta_wiki.domain.Test;
import com.wiki_cloud.meta_wiki.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author qingfeng
 * meta_wiki
 */

@Service
public class TestService {
    @Autowired
    private TestMapper testMapper;

    public List<Test> list() {
        return testMapper.list();
    }
}
