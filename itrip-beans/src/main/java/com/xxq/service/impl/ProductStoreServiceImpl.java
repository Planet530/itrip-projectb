package com.xxq.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxq.entity.ProductStore;
import com.xxq.mapper.ProductStoreMapper;
import com.xxq.service.ProductStoreService;
@Service
public class ProductStoreServiceImpl extends ServiceImpl<ProductStoreMapper, ProductStore> implements ProductStoreService{

}
