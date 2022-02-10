package com.wiki_cloud.meta_wiki.mapper;

import com.wiki_cloud.meta_wiki.domain.Demo;
import com.wiki_cloud.meta_wiki.domain.DemoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * @author qingfeng
 * meta_wiki
 */
public interface DemoMapper {
    long countByExample(DemoExample example);

    int deleteByExample(DemoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Demo record);

    int insertSelective(Demo record);

    List<Demo> selectByExample(DemoExample example);

    Demo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Demo record, @Param("example") DemoExample example);

    int updateByExample(@Param("record") Demo record, @Param("example") DemoExample example);

    int updateByPrimaryKeySelective(Demo record);

    int updateByPrimaryKey(Demo record);
}