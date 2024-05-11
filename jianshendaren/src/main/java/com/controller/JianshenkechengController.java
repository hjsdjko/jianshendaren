


























package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 健身课程
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/jianshenkecheng")
public class JianshenkechengController {
    private static final Logger logger = LoggerFactory.getLogger(JianshenkechengController.class);

    @Autowired
    private JianshenkechengService jianshenkechengService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private YonghuService yonghuService;
    @Autowired
    private UsersService usersService;



    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = jianshenkechengService.queryPage(params);

        //字典表数据转换
        List<JianshenkechengView> list =(List<JianshenkechengView>)page.getList();
        for(JianshenkechengView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        JianshenkechengEntity jianshenkecheng = jianshenkechengService.selectById(id);
        if(jianshenkecheng !=null){
            //entity转view
            JianshenkechengView view = new JianshenkechengView();
            BeanUtils.copyProperties( jianshenkecheng , view );//把实体数据重构到view中

                //级联表
                YonghuEntity yonghu = yonghuService.selectById(jianshenkecheng.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //管理员用户表做特殊处理,防止和用户表账户姓名字段冲突
                UsersEntity users = usersService.selectById(jianshenkecheng.getUsersId());
                if(users != null){
                    view.setUsersId(users.getId());
                    view.setUusername(users.getUsername());
                    view.setUpassword(users.getPassword());
                    view.setUrole(users.getRole());
                    view.setUaddtime(users.getAddtime());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody JianshenkechengEntity jianshenkecheng, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,jianshenkecheng:{}",this.getClass().getName(),jianshenkecheng.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("用户".equals(role))
            jianshenkecheng.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        else if("管理员".equals(role))
            jianshenkecheng.setUsersId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<JianshenkechengEntity> queryWrapper = new EntityWrapper<JianshenkechengEntity>()
            .eq("jianshenkecheng_name", jianshenkecheng.getJianshenkechengName())
            .eq("jianshenkecheng_types", jianshenkecheng.getJianshenkechengTypes())
            .eq("jianshenkecheng_video", jianshenkecheng.getJianshenkechengVideo())
            .eq("yonghu_id", jianshenkecheng.getYonghuId())
            .eq("users_id", jianshenkecheng.getUsersId())
            .eq("jianshenkecheng_click_number", jianshenkecheng.getJianshenkechengClickNumber())
            .eq("zan_number", jianshenkecheng.getZanNumber())
            .eq("cai_number", jianshenkecheng.getCaiNumber())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JianshenkechengEntity jianshenkechengEntity = jianshenkechengService.selectOne(queryWrapper);
        if(jianshenkechengEntity==null){
            jianshenkecheng.setCreateTime(new Date());
            jianshenkechengService.insert(jianshenkecheng);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody JianshenkechengEntity jianshenkecheng, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,jianshenkecheng:{}",this.getClass().getName(),jianshenkecheng.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(StringUtil.isEmpty(role))
//            return R.error(511,"权限为空");
//        else if("用户".equals(role))
//            jianshenkecheng.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
//        else if("管理员".equals(role))
//            jianshenkecheng.setUsersId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<JianshenkechengEntity> queryWrapper = new EntityWrapper<JianshenkechengEntity>()
            .notIn("id",jianshenkecheng.getId())
            .andNew()
            .eq("jianshenkecheng_name", jianshenkecheng.getJianshenkechengName())
            .eq("jianshenkecheng_types", jianshenkecheng.getJianshenkechengTypes())
            .eq("jianshenkecheng_video", jianshenkecheng.getJianshenkechengVideo())
            .eq("yonghu_id", jianshenkecheng.getYonghuId())
            .eq("users_id", jianshenkecheng.getUsersId())
            .eq("jianshenkecheng_click_number", jianshenkecheng.getJianshenkechengClickNumber())
            .eq("zan_number", jianshenkecheng.getZanNumber())
            .eq("cai_number", jianshenkecheng.getCaiNumber())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JianshenkechengEntity jianshenkechengEntity = jianshenkechengService.selectOne(queryWrapper);
        if("".equals(jianshenkecheng.getJianshenkechengPhoto()) || "null".equals(jianshenkecheng.getJianshenkechengPhoto())){
                jianshenkecheng.setJianshenkechengPhoto(null);
        }
        if("".equals(jianshenkecheng.getJianshenkechengVideo()) || "null".equals(jianshenkecheng.getJianshenkechengVideo())){
                jianshenkecheng.setJianshenkechengVideo(null);
        }
        if(jianshenkechengEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      jianshenkecheng.set
            //  }
            jianshenkechengService.updateById(jianshenkecheng);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        jianshenkechengService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }

    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<JianshenkechengEntity> jianshenkechengList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            JianshenkechengEntity jianshenkechengEntity = new JianshenkechengEntity();
//                            jianshenkechengEntity.setJianshenkechengName(data.get(0));                    //健身课程标题 要改的
//                            jianshenkechengEntity.setJianshenkechengTypes(Integer.valueOf(data.get(0)));   //课程类型 要改的
//                            jianshenkechengEntity.setJianshenkechengPhoto("");//照片
//                            jianshenkechengEntity.setJianshenkechengVideo(data.get(0));                    //视频 要改的
//                            jianshenkechengEntity.setYonghuId(Integer.valueOf(data.get(0)));   //发布用户 要改的
//                            jianshenkechengEntity.setUsersId(Integer.valueOf(data.get(0)));   //管理员 要改的
//                            jianshenkechengEntity.setJianshenkechengClickNumber(Integer.valueOf(data.get(0)));   //播放量 要改的
//                            jianshenkechengEntity.setZanNumber(Integer.valueOf(data.get(0)));   //赞 要改的
//                            jianshenkechengEntity.setCaiNumber(Integer.valueOf(data.get(0)));   //踩 要改的
//                            jianshenkechengEntity.setJianshenkechengContent("");//照片
//                            jianshenkechengEntity.setCreateTime(date);//时间
                            jianshenkechengList.add(jianshenkechengEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        jianshenkechengService.insertBatch(jianshenkechengList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = jianshenkechengService.queryPage(params);

        //字典表数据转换
        List<JianshenkechengView> list =(List<JianshenkechengView>)page.getList();
        for(JianshenkechengView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        JianshenkechengEntity jianshenkecheng = jianshenkechengService.selectById(id);
            if(jianshenkecheng !=null){


                //entity转view
                JianshenkechengView view = new JianshenkechengView();
                BeanUtils.copyProperties( jianshenkecheng , view );//把实体数据重构到view中

                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(jianshenkecheng.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                    UsersEntity users = usersService.selectById(jianshenkecheng.getUsersId());
                if(users != null){
                    view.setUsersId(users.getId());
                    view.setUusername(users.getUsername());
                    view.setUpassword(users.getPassword());
                    view.setUrole(users.getRole());
                    view.setUaddtime(users.getAddtime());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody JianshenkechengEntity jianshenkecheng, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,jianshenkecheng:{}",this.getClass().getName(),jianshenkecheng.toString());
        Wrapper<JianshenkechengEntity> queryWrapper = new EntityWrapper<JianshenkechengEntity>()
            .eq("jianshenkecheng_name", jianshenkecheng.getJianshenkechengName())
            .eq("jianshenkecheng_types", jianshenkecheng.getJianshenkechengTypes())
            .eq("jianshenkecheng_video", jianshenkecheng.getJianshenkechengVideo())
            .eq("yonghu_id", jianshenkecheng.getYonghuId())
            .eq("users_id", jianshenkecheng.getUsersId())
            .eq("jianshenkecheng_click_number", jianshenkecheng.getJianshenkechengClickNumber())
            .eq("zan_number", jianshenkecheng.getZanNumber())
            .eq("cai_number", jianshenkecheng.getCaiNumber())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JianshenkechengEntity jianshenkechengEntity = jianshenkechengService.selectOne(queryWrapper);
        if(jianshenkechengEntity==null){
            jianshenkecheng.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      jianshenkecheng.set
        //  }
        jianshenkechengService.insert(jianshenkecheng);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
