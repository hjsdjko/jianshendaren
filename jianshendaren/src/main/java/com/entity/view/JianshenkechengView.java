package com.entity.view;

import com.entity.JianshenkechengEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 健身课程
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jianshenkecheng")
public class JianshenkechengView extends JianshenkechengEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 课程类型的值
		*/
		private String jianshenkechengValue;



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

		//级联表 users
			/**
			* 用户名
			*/
			private String uusername;
			/**
			* 密码
			*/
			private String upassword;
			/**
			* 角色
			*/
			private String urole;
			/**
			* 新增时间
			*/
			private Date uaddtime;

	public JianshenkechengView() {

	}

	public JianshenkechengView(JianshenkechengEntity jianshenkechengEntity) {
		try {
			BeanUtils.copyProperties(this, jianshenkechengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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




			//级联表的get和set users
					/**
					* 获取： 用户名
					*/
					public String getUusername() {
						return uusername;
					}
					/**
					* 设置： 用户名
					*/
					public void setUusername(String uusername) {
						this.uusername = uusername;
					}
					/**
					* 获取： 密码
					*/
					public String getUpassword() {
						return upassword;
					}
					/**
					* 设置： 密码
					*/
					public void setUpassword(String upassword) {
						this.upassword = upassword;
					}
					/**
					* 获取： 角色
					*/
					public String getUrole() {
						return urole;
					}
					/**
					* 设置： 角色
					*/
					public void setUrole(String urole) {
						this.urole = urole;
					}
					/**
					* 获取： 新增时间
					*/
					public Date getUaddtime() {
						return uaddtime;
					}
					/**
					* 设置： 新增时间
					*/
					public void setUaddtime(Date uaddtime) {
						this.uaddtime = uaddtime;
					}
}
