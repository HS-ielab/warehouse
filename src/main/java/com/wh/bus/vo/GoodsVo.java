package com.wh.bus.vo;

import com.wh.bus.entity.Goods;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author: YHS
 * @Date: 2019/12/6 22:30
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GoodsVo extends Goods {

    private Integer page = 1;
    private Integer limit = 10;

}
