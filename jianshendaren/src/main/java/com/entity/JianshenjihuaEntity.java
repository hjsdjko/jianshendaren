package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 个人健身计划
 *
 * @author 
 * @email
 */
@TableName("jianshenjihua")
public class JianshenjihuaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JianshenjihuaEntity() {

	}

	public JianshenjihuaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Jianshenjihua{" +
            "id=" + id +
            ", jianshenjihuaName=" + jianshenjihuaName +
            ", yonghuId=" + yonghuId +
            ", jianshenkechengId=" + jianshenkechengId +
            ", jianshenjihuaShijian=" + jianshenjihuaShijian +
            ", jianshenjihuaContent=" + jianshenjihuaContent +
            ", createTime=" + createTime +
        "}";
    }
}
