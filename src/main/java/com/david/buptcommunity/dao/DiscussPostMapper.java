package com.david.buptcommunity.dao;

import com.david.buptcommunity.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    // @Param注解用于给参数取别名,
    // 如果只有一个参数,并且在<if>里使用,则必须加别名.上一个方法中userId则不需要，因为不止一个参数
    int selectDiscussPostRows(@Param("userId") int userId);

}
