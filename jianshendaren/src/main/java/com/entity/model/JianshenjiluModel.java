package com.entity.model;

import com.entity.JianshenjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 健身记录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JianshenjiluModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String jianshenjiluName;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 运动类型
     */
    private Integer jianshenkechengTypes;


    /**
     * 开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jianshenjilukTime;


    /**
     * 结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jianshenjilujTime;


    /**
     * 运动内容
     */
    private String jianshenjiluContent;


    /**
     * 健身效果
     */
    private String jianshenjiluXiaoguoContent;


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
    public String getJianshenjiluName() {
        return jianshenjiluName;
    }


    /**
	 * 设置：标题
	 */
    public void setJianshenjiluName(String jianshenjiluName) {
        this.jianshenjiluName = jianshenjiluName;
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
	 * 获取：运动类型
	 */
    public Integer getJianshenkechengTypes() {
        return jianshenkechengTypes;
    }


    /**
	 * 设置：运动类型
	 */
    public void setJianshenkechengTypes(Integer jianshenkechengTypes) {
        this.jianshenkechengTypes = jianshenkechengTypes;
    }
    /**
	 * 获取：开始时间
	 */
    public Date getJianshenjilukTime() {
        return jianshenjilukTime;
    }


    /**
	 * 设置：开始时间
	 */
    public void setJianshenjilukTime(Date jianshenjilukTime) {
        this.jianshenjilukTime = jianshenjilukTime;
    }
    /**
	 * 获取：结束时间
	 */
    public Date getJianshenjilujTime() {
        return jianshenjilujTime;
    }


    /**
	 * 设置：结束时间
	 */
    public void setJianshenjilujTime(Date jianshenjilujTime) {
        this.jianshenjilujTime = jianshenjilujTime;
    }
    /**
	 * 获取：运动内容
	 */
    public String getJianshenjiluContent() {
        return jianshenjiluContent;
    }


    /**
	 * 设置：运动内容
	 */
    public void setJianshenjiluContent(String jianshenjiluContent) {
        this.jianshenjiluContent = jianshenjiluContent;
    }
    /**
	 * 获取：健身效果
	 */
    public String getJianshenjiluXiaoguoContent() {
        return jianshenjiluXiaoguoContent;
    }


    /**
	 * 设置：健身效果
	 */
    public void setJianshenjiluXiaoguoContent(String jianshenjiluXiaoguoContent) {
        this.jianshenjiluXiaoguoContent = jianshenjiluXiaoguoContent;
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
