package com.xxq.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxq.entity.HotelOrder;
import com.xxq.mapper.HotelOrderMapper;
import com.xxq.service.HotelOrderService;
@Service
public class HotelOrderServiceImpl extends ServiceImpl<HotelOrderMapper, HotelOrder> implements HotelOrderService{

}
