package com.entity.view;

import com.entity.JianshenjihuaEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 个人健身计划
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jianshenjihua")
public class JianshenjihuaView extends JianshenjihuaEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 jianshenkecheng
			/**
			* 健身课程标题
			*/
			private String jianshenkechengName;
			/**
			* 课程类型
			*/
			private Integer jianshenkechengTypes;
				/**
				* 课程类型的值
				*/
				private String jianshenkechengValue;
			/**
			* 课程封面
			*/
			private String jianshenkechengPhoto;
			/**
			* 视频
			*/
			private String jianshenkechengVideo;
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

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 照片
			*/
			private String yonghuPhoto;
			/**
			* 余额
			*/
			private Double newMoney;
			/**
			* 腰围(cm)
			*/
			private Double yonghuYaowei;
			/**
			* 身高(m)
			*/
			private Double yonghuShengao;
			/**
			* 体重(kg)
			*/
			private Double yonghuTizhong;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public JianshenjihuaView() {

	}

	public JianshenjihuaView(JianshenjihuaEntity jianshenjihuaEntity) {
		try {
			BeanUtils.copyProperties(this, jianshenjihuaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



































				//级联表的get和set jianshenkecheng
					/**
					* 获取： 健身课程标题
					*/
					public String getJianshenkechengName() {
						return jianshenkechengName;
					}
					/**
					* 设置： 健身课程标题
					*/
					public void setJianshenkechengName(String jianshenkechengName) {
						this.jianshenkechengName = jianshenkechengName;
					}
					/**
					* 获取： 课程类型
					*/
					public Integer getJianshenkechengTypes() {
						return jianshenkechengTypes;
					}
					/**
					* 设置： 课程类型
					*/
					public void setJianshenkechengTypes(Integer jianshenkechengTypes) {
						this.jianshenkechengTypes = jianshenkechengTypes;
					}


						/**
						* 获取： 课程类型的值
						*/
						public String getJianshenkechengValue() {
							return jianshenkechengValue;
						}
						/**
						* 设置： 课程类型的值
						*/
						public void setJianshenkechengValue(String jianshenkechengValue) {
							this.jianshenkechengValue = jianshenkechengValue;
						}
					/**
					* 获取： 课程封面
					*/
					public String getJianshenkechengPhoto() {
						return jianshenkechengPhoto;
					}
					/**
					* 设置： 课程封面
					*/
					public void setJianshenkechengPhoto(String jianshenkechengPhoto) {
						this.jianshenkechengPhoto = jianshenkechengPhoto;
					}
					/**
					* 获取： 视频
					*/
					public String getJianshenkechengVideo() {
						return jianshenkechengVideo;
					}
					/**
					* 设置： 视频
					*/
					public void setJianshenkechengVideo(String jianshenkechengVideo) {
						this.jianshenkechengVideo = jianshenkechengVideo;
					}
					/**
					* 获取： 播放量
					*/
					public Integer getJianshenkechengClickNumber() {
						return jianshenkechengClickNumber;
					}
					/**
					* 设置： 播放量
					*/
					public void setJianshenkechengClickNumber(Integer jianshenkechengClickNumber) {
						this.jianshenkechengClickNumber = jianshenkechengClickNumber;
					}
					/**
					* 获取： 赞
					*/
					public Integer getZanNumber() {
						return zanNumber;
					}
					/**
					* 设置： 赞
					*/
					public void setZanNumber(Integer zanNumber) {
						this.zanNumber = zanNumber;
					}
					/**
					* 获取： 踩
					*/
					public Integer getCaiNumber() {
						return caiNumber;
					}
					/**
					* 设置： 踩
					*/
					public void setCaiNumber(Integer caiNumber) {
						this.caiNumber = caiNumber;
					}
					/**
					* 获取： 课程详情
					*/
					public String getJianshenkechengContent() {
						return jianshenkechengContent;
					}
					/**
					* 设置： 课程详情
					*/
					public void setJianshenkechengContent(String jianshenkechengContent) {
						this.jianshenkechengContent = jianshenkechengContent;
					}








				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}
					/**
					* 获取： 腰围(cm)
					*/
					public Double getYonghuYaowei() {
						return yonghuYaowei;
					}
					/**
					* 设置： 腰围(cm)
					*/
					public void setYonghuYaowei(Double yonghuYaowei) {
						this.yonghuYaowei = yonghuYaowei;
					}
					/**
					* 获取： 身高(m)
					*/
					public Double getYonghuShengao() {
						return yonghuShengao;
					}
					/**
					* 设置： 身高(m)
					*/
					public void setYonghuShengao(Double yonghuShengao) {
						this.yonghuShengao = yonghuShengao;
					}
					/**
					* 获取： 体重(kg)
					*/
					public Double getYonghuTizhong() {
						return yonghuTizhong;
					}
					/**
					* 设置： 体重(kg)
					*/
					public void setYonghuTizhong(Double yonghuTizhong) {
						this.yonghuTizhong = yonghuTizhong;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}




}
