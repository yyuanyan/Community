package com.mutual.cmt.mapper;

import com.mutual.cmt.model.Question;
import com.mutual.cmt.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yyuanyan
 * @create 2019 - 10 - 05 - 2:47
 */
@Mapper
public interface QuestionMapper {
    @Insert("insert into question(title,description,gmt_create,gmt_modified,creator,tag) values(#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},#{tag})")
    void insert(Question question);
}
