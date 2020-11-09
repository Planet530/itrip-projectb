package com.xxq.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxq.mapper.UserLinkUserMapper;
import com.xxq.entity.UserLinkUser;
import com.xxq.service.UserLinkUserService;
@Service
public class UserLinkUserServiceImpl extends ServiceImpl<UserLinkUserMapper, UserLinkUser> implements UserLinkUserService{

}
