package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.JianshenjiluDao;
import com.entity.JianshenjiluEntity;
import com.service.JianshenjiluService;
import com.entity.view.JianshenjiluView;

/**
 * 健身记录 服务实现类
 */
@Service("jianshenjiluService")
@Transactional
public class JianshenjiluServiceImpl extends ServiceImpl<JianshenjiluDao, JianshenjiluEntity> implements JianshenjiluService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<JianshenjiluView> page =new Query<JianshenjiluView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
