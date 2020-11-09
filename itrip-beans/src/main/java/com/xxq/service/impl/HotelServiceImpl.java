package com.xxq.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxq.mapper.HotelMapper;
import com.xxq.entity.Hotel;
import com.xxq.service.HotelService;
@Service
public class HotelServiceImpl extends ServiceImpl<HotelMapper, Hotel> implements HotelService{

}
