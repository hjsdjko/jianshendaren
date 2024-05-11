package com.entity.vo;

import com.entity.JianshenjihuaEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 个人健身计划
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jianshenjihua")
public class JianshenjihuaVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "jianshenjihua_name")
    private String jianshenjihuaName;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 健身课程
     */

    @TableField(value = "jianshenkecheng_id")
    private Integer jianshenkechengId;


    /**
     * 计划时间
     */

    @TableField(value = "jianshenjihua_shijian")
    private String jianshenjihuaShijian;


    /**
     * 计划内容
     */

    @TableField(value = "jianshenjihua_content")
    private String jianshenjihuaContent;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：标题
	 */
    public String getJianshenjihuaName() {
        return jianshenjihuaName;
    }


    /**
	 * 获取：标题
	 */

    public void setJianshenjihuaName(String jianshenjihuaName) {
        this.jianshenjihuaName = jianshenjihuaName;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：健身课程
	 */
    public Integer getJianshenkechengId() {
        return jianshenkechengId;
    }


    /**
	 * 获取：健身课程
	 */

    public void setJianshenkechengId(Integer jianshenkechengId) {
        this.jianshenkechengId = jianshenkechengId;
    }
    /**
	 * 设置：计划时间
	 */
    public String getJianshenjihuaShijian() {
        return jianshenjihuaShijian;
    }


    /**
	 * 获取：计划时间
	 */

    public void setJianshenjihuaShijian(String jianshenjihuaShijian) {
        this.jianshenjihuaShijian = jianshenjihuaShijian;
    }
    /**
	 * 设置：计划内容
	 */
    public String getJianshenjihuaContent() {
        return jianshenjihuaContent;
    }


    /**
	 * 获取：计划内容
	 */

    public void setJianshenjihuaContent(String jianshenjihuaContent) {
        this.jianshenjihuaContent = jianshenjihuaContent;
    }
    /**
	 * 设置：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
