package com.wiki_cloud.meta_wiki.mapper;

import com.wiki_cloud.meta_wiki.domain.Test;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * @author qingfeng
 * meta_wiki
 */
@Repository
public interface TestMapper {
    List<Test> list();
}
