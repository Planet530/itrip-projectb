package com.xxq.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxq.mapper.ImageMapper;
import com.xxq.entity.Image;
import com.xxq.service.ImageService;
@Service
public class ImageServiceImpl extends ServiceImpl<ImageMapper, Image> implements ImageService{

}
