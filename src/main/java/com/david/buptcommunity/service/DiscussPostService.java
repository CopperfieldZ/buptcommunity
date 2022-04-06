package com.david.buptcommunity.service;

import com.david.buptcommunity.dao.DiscussPostMapper;
import com.david.buptcommunity.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussPostService {
    @Autowired
    private DiscussPostMapper discussPostMapper;

    public List<DiscussPost> getDiscussPosts(int userId, int offest, int limit){
        return discussPostMapper.selectDiscussPosts(userId, offest, limit);
    }

    public int getDiscusspostRows(int userId){
        return discussPostMapper.selectDiscussPostRows(userId);
    }
}
