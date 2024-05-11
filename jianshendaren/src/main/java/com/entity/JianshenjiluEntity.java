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
 * 健身记录
 *
 * @author 
 * @email
 */
@TableName("jianshenjilu")
public class JianshenjiluEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JianshenjiluEntity() {

	}

	public JianshenjiluEntity(T t) {
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
    @TableField(value = "jianshenjilu_name")

    private String jianshenjiluName;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 运动类型
     */
    @TableField(value = "jianshenkecheng_types")

    private Integer jianshenkechengTypes;


    /**
     * 开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "jianshenjiluk_time")

    private Date jianshenjilukTime;


    /**
     * 结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "jianshenjiluj_time")

    private Date jianshenjilujTime;


    /**
     * 运动内容
     */
    @TableField(value = "jianshenjilu_content")

    private String jianshenjiluContent;


    /**
     * 健身效果
     */
    @TableField(value = "jianshenjilu_xiaoguo_content")

    private String jianshenjiluXiaoguoContent;


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
    public String getJianshenjiluName() {
        return jianshenjiluName;
    }


    /**
	 * 获取：标题
	 */

    public void setJianshenjiluName(String jianshenjiluName) {
        this.jianshenjiluName = jianshenjiluName;
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
	 * 设置：运动类型
	 */
    public Integer getJianshenkechengTypes() {
        return jianshenkechengTypes;
    }


    /**
	 * 获取：运动类型
	 */

    public void setJianshenkechengTypes(Integer jianshenkechengTypes) {
        this.jianshenkechengTypes = jianshenkechengTypes;
    }
    /**
	 * 设置：开始时间
	 */
    public Date getJianshenjilukTime() {
        return jianshenjilukTime;
    }


    /**
	 * 获取：开始时间
	 */

    public void setJianshenjilukTime(Date jianshenjilukTime) {
        this.jianshenjilukTime = jianshenjilukTime;
    }
    /**
	 * 设置：结束时间
	 */
    public Date getJianshenjilujTime() {
        return jianshenjilujTime;
    }


    /**
	 * 获取：结束时间
	 */

    public void setJianshenjilujTime(Date jianshenjilujTime) {
        this.jianshenjilujTime = jianshenjilujTime;
    }
    /**
	 * 设置：运动内容
	 */
    public String getJianshenjiluContent() {
        return jianshenjiluContent;
    }


    /**
	 * 获取：运动内容
	 */

    public void setJianshenjiluContent(String jianshenjiluContent) {
        this.jianshenjiluContent = jianshenjiluContent;
    }
    /**
	 * 设置：健身效果
	 */
    public String getJianshenjiluXiaoguoContent() {
        return jianshenjiluXiaoguoContent;
    }


    /**
	 * 获取：健身效果
	 */

    public void setJianshenjiluXiaoguoContent(String jianshenjiluXiaoguoContent) {
        this.jianshenjiluXiaoguoContent = jianshenjiluXiaoguoContent;
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
        return "Jianshenjilu{" +
            "id=" + id +
            ", jianshenjiluName=" + jianshenjiluName +
            ", yonghuId=" + yonghuId +
            ", jianshenkechengTypes=" + jianshenkechengTypes +
            ", jianshenjilukTime=" + jianshenjilukTime +
            ", jianshenjilujTime=" + jianshenjilujTime +
            ", jianshenjiluContent=" + jianshenjiluContent +
            ", jianshenjiluXiaoguoContent=" + jianshenjiluXiaoguoContent +
            ", createTime=" + createTime +
        "}";
    }
}
