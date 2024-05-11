package com.dao;

import com.entity.JianshenjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JianshenjiluView;

/**
 * 健身记录 Dao 接口
 *
 * @author 
 */
public interface JianshenjiluDao extends BaseMapper<JianshenjiluEntity> {

   List<JianshenjiluView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
