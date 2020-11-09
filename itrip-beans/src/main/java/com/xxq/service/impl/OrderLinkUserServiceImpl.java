package com.xxq.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxq.entity.OrderLinkUser;
import com.xxq.mapper.OrderLinkUserMapper;
import com.xxq.service.OrderLinkUserService;
@Service
public class OrderLinkUserServiceImpl extends ServiceImpl<OrderLinkUserMapper, OrderLinkUser> implements OrderLinkUserService{

}
