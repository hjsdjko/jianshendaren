package com.entity.model;

import com.entity.JianshenjihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 个人健身计划
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JianshenjihuaModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String jianshenjihuaName;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 健身课程
     */
    private Integer jianshenkechengId;


    /**
     * 计划时间
     */
    private String jianshenjihuaShijian;


    /**
     * 计划内容
     */
    private String jianshenjihuaContent;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：标题
	 */
    public String getJianshenjihuaName() {
        return jianshenjihuaName;
    }


    /**
	 * 设置：标题
	 */
    public void setJianshenjihuaName(String jianshenjihuaName) {
        this.jianshenjihuaName = jianshenjihuaName;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：健身课程
	 */
    public Integer getJianshenkechengId() {
        return jianshenkechengId;
    }


    /**
	 * 设置：健身课程
	 */
    public void setJianshenkechengId(Integer jianshenkechengId) {
        this.jianshenkechengId = jianshenkechengId;
    }
    /**
	 * 获取：计划时间
	 */
    public String getJianshenjihuaShijian() {
        return jianshenjihuaShijian;
    }


    /**
	 * 设置：计划时间
	 */
    public void setJianshenjihuaShijian(String jianshenjihuaShijian) {
        this.jianshenjihuaShijian = jianshenjihuaShijian;
    }
    /**
	 * 获取：计划内容
	 */
    public String getJianshenjihuaContent() {
        return jianshenjihuaContent;
    }


    /**
	 * 设置：计划内容
	 */
    public void setJianshenjihuaContent(String jianshenjihuaContent) {
        this.jianshenjihuaContent = jianshenjihuaContent;
    }
    /**
	 * 获取：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
