package com.dao;

import com.entity.JianshenkechengCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JianshenkechengCollectionView;

/**
 * 商品收藏 Dao 接口
 *
 * @author 
 */
public interface JianshenkechengCollectionDao extends BaseMapper<JianshenkechengCollectionEntity> {

   List<JianshenkechengCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
