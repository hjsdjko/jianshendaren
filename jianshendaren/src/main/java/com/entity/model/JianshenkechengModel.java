package com.entity.model;

import com.entity.JianshenkechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 健身课程
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JianshenkechengModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 健身课程标题
     */
    private String jianshenkechengName;


    /**
     * 课程类型
     */
    private Integer jianshenkechengTypes;


    /**
     * 课程封面
     */
    private String jianshenkechengPhoto;


    /**
     * 视频
     */
    private String jianshenkechengVideo;


    /**
     * 发布用户
     */
    private Integer yonghuId;


    /**
     * 管理员
     */
    private Integer usersId;


    /**
     * 播放量
     */
    private Integer jianshenkechengClickNumber;


    /**
     * 赞
     */
    private Integer zanNumber;


    /**
     * 踩
     */
    private Integer caiNumber;


    /**
     * 课程详情
     */
    private String jianshenkechengContent;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：健身课程标题
	 */
    public String getJianshenkechengName() {
        return jianshenkechengName;
    }


    /**
	 * 设置：健身课程标题
	 */
    public void setJianshenkechengName(String jianshenkechengName) {
        this.jianshenkechengName = jianshenkechengName;
    }
    /**
	 * 获取：课程类型
	 */
    public Integer getJianshenkechengTypes() {
        return jianshenkechengTypes;
    }


    /**
	 * 设置：课程类型
	 */
    public void setJianshenkechengTypes(Integer jianshenkechengTypes) {
        this.jianshenkechengTypes = jianshenkechengTypes;
    }
    /**
	 * 获取：课程封面
	 */
    public String getJianshenkechengPhoto() {
        return jianshenkechengPhoto;
    }


    /**
	 * 设置：课程封面
	 */
    public void setJianshenkechengPhoto(String jianshenkechengPhoto) {
        this.jianshenkechengPhoto = jianshenkechengPhoto;
    }
    /**
	 * 获取：视频
	 */
    public String getJianshenkechengVideo() {
        return jianshenkechengVideo;
    }


    /**
	 * 设置：视频
	 */
    public void setJianshenkechengVideo(String jianshenkechengVideo) {
        this.jianshenkechengVideo = jianshenkechengVideo;
    }
    /**
	 * 获取：发布用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：发布用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：管理员
	 */
    public Integer getUsersId() {
        return usersId;
    }


    /**
	 * 设置：管理员
	 */
    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }
    /**
	 * 获取：播放量
	 */
    public Integer getJianshenkechengClickNumber() {
        return jianshenkechengClickNumber;
    }


    /**
	 * 设置：播放量
	 */
    public void setJianshenkechengClickNumber(Integer jianshenkechengClickNumber) {
        this.jianshenkechengClickNumber = jianshenkechengClickNumber;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 设置：赞
	 */
    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 设置：踩
	 */
    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：课程详情
	 */
    public String getJianshenkechengContent() {
        return jianshenkechengContent;
    }


    /**
	 * 设置：课程详情
	 */
    public void setJianshenkechengContent(String jianshenkechengContent) {
        this.jianshenkechengContent = jianshenkechengContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
