package com.atguigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.wms.entity.WareEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author ruige
 * @email wxrcz@qq.com
 * @date 2021-02-02 14:53:59
 */
public interface WareService extends IService<WareEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

