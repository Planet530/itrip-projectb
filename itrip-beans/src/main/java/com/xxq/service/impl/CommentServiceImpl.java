package com.xxq.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxq.entity.Comment;
import com.xxq.mapper.CommentMapper;
import com.xxq.service.CommentService;
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService{

}
