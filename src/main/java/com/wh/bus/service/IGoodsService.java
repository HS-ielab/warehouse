package com.wh.bus.service;

import com.wh.bus.entity.Goods;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * InnoDB free: 9216 kB; (`providerid`) REFER `warehouse/bus_provider`(`id`) 服务类
 * </p>
 *
 * @author YHS
 * @since 2019-12-06
 */
public interface IGoodsService extends IService<Goods> {

    /**
     * 根据商品id删除商品
     * @param id
     */
    void deleteGoodsById(Integer id);
}
