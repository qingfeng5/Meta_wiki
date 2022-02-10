package com.wiki_cloud.meta_wiki.mapper;

import com.wiki_cloud.meta_wiki.domain.User;
import com.wiki_cloud.meta_wiki.domain.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * @author qingfeng
 * meta_wiki
 */
public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}