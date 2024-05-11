<template>
	<view class="content">
		<form class="app-update-pv">
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}'
					class="title">健身课程</view>
				<input readonly="readonly"
					:style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"28rpx","borderStyle":"solid","height":"68rpx"}'
					:disabled="ro.jianshenkechengName" type="text" v-model="ruleForm.jianshenkechengName"
					placeholder="课程标题标题"></input>
			</view>
			<view
				  :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderStyle":"solid","height":"108rpx"}'
				  class="cu-form-group select">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}'
					  class="title">课程类型</view>
				<picker @change="yonghujianshenkechengTypesChange" :value="jianshenkechengTypesIndex" :range="jianshenkechengTypesOptions" range-key="indexName">
					<view style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"68rpx"}'
						  class="uni-input picker-select-input">{{ruleForm.jianshenkechengValue?ruleForm.jianshenkechengValue:"请选择课程类型"}}</view>
				</picker>
			</view>
			<view
				:style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(218, 220, 219, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"108rpx"}'
				class="cu-form-group" @tap="jianshenkechengPhotoTap">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}'
					class="title">课程封面</view>
				<view class="right-input" style="padding:0;textAlign:left">
					<image
						:style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
						class="avator" v-if="ruleForm.jianshenkechengPhoto" :src="ruleForm.jianshenkechengPhoto"
						mode="aspectFill">
					</image>
					<image
						:style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
						class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
			<view
				:style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(218, 220, 219, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"108rpx"}'
				class="cu-form-group" @tap="jianshenkechengVideoTap">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}'
					class="title">课程视频</view>
				<view class="right-input" style="padding:0;textAlign:left">
					<image
						:style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
						class="avator" v-if="ruleForm.jianshenkechengVideo" :src="ruleForm.jianshenkechengVideo"
						mode="aspectFill">
					</image>
					<image
						:style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
						class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"210rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}'
					class="title">课程详情</view>
				<textarea
					:style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"28rpx","borderStyle":"solid","height":"200rpx"}'
					:disabled="ro.jianshenkechengContent" v-model="ruleForm.jianshenkechengContent"
					placeholder="课程详情" />
			</view>

			<view class="btn">
				<button
					:style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"rgba(0, 102, 51, 1)","borderColor":"#409EFF","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","width":"70%","fontSize":"32rpx","borderStyle":"solid","height":"80rpx"}'
					@tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="createTimeConfirm"
			ref="createTime" themeColor="#333333"></w-picker>


	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				cross: '',
				ro: {
					jianshenkechengName: false,
					jianshenkechengTypes: false,
					jianshenkechengPhoto: false,
					jianshenkechengVideo: false,
					yonghuId: false,
					usersId: false,
					jianshenkechengClickNumber: false,
					zanNumber: false,
					caiNumber: false,
					jianshenkechengContent: false,
					createTime: false,
				},
				ruleForm: {
					jianshenkechengName: '',
					jianshenkechengTypes: '', //数字
					jianshenkechengValue: '', //数字对应的值
					jianshenkechengPhoto: '',
					jianshenkechengVideo: '',
					yonghuId: '',
					usersId: '',
					jianshenkechengClickNumber: '',
					zanNumber: '',
					caiNumber: '',
					jianshenkechengContent: '',
					createTime: '',
				},
				// 登陆用户信息
				user: {},
				jianshenkechengTypesOptions: [],
				jianshenkechengTypesIndex: 0,

			}
		},
		components: {
			wPicker
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
		},
		async onLoad(options) {

			/*下拉框*/
			let jianshenkechengTypesParams = {
				page: 1,
				limit: 100,
				dicCode: 'jianshenkecheng_types',
			}
			let jianshenkechengTypes = await this.$api.page(`dictionary`, jianshenkechengTypesParams);
			this.jianshenkechengTypesOptions = jianshenkechengTypes.data.list


			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				let res = await this.$api.info(`jianshenkecheng`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			if (options.jianshenkechengId) {
				this.ruleForm.jianshenkechengId = options.jianshenkechengId;
			}
			// 跨表
			// this.styleChange()
		},
		methods: {
			// 下拉变化
			yonghujianshenkechengTypesChange(e) {
				this.jianshenkechengTypesIndex = e.target.value
				this.ruleForm.jianshenkechengValue = this.jianshenkechengTypesOptions[this.jianshenkechengTypesIndex].indexName
				this.ruleForm.jianshenkechengTypes = this.jianshenkechengTypesOptions[this.jianshenkechengTypesIndex].codeIndex
			},


			// styleChange() {
			// 	this.$nextTick(() => {
			// 		// document.querySelectorAll('.app-update-pv .cu-form-group .uni-input-input').forEach(el=>{
			// 		//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
			// 		// })
			// 	})
			// },


			jianshenkechengPhotoTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.jianshenkechengPhoto = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(() => {
						// _this.styleChange()
					})
				});
			},
			jianshenkechengVideoTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.jianshenkechengVideo = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(() => {
						// _this.styleChange()
					})
				});
			},
			// 日期控件
			createTimeConfirm(val) {
				console.log(val)
				this.ruleForm.createTime = val.result;
				this.$forceUpdate();
			},




			getUUID() {
				return new Date().getTime();
			},
			async onSubmitTap() {
				if ((!this.ruleForm.jianshenkechengName)) {
					this.$utils.msg(`健身课程标题不能为空`);
					return
				}
				if ((!this.ruleForm.jianshenkechengPhoto)) {
					this.$utils.msg(`课程封面不能为空`);
					return
				}
				if ((!this.ruleForm.jianshenkechengVideo)) {
					this.$utils.msg(`课程视频不能为空`);
					return
				}
				
				if (this.ruleForm.id) {
					await this.$api.update(`jianshenkecheng`, this.ruleForm);
				} else {
					await this.$api.save(`jianshenkecheng`, this.ruleForm);
				}
				uni.setStorageSync('pingluenStateState', true);
				this.$utils.msgBack('提交成功');
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}

	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
		background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}

	.cu-form-group.active {
		justify-content: space-between;
	}

	.btn {
		display: flex;
		align-items: center;
		justify-content: center;
		flex-wrap: wrap;
		padding: 20upx 0;
	}

	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}

	.cu-form-group+.cu-form-group {
		border: 0;
	}

	.cu-form-group uni-input {
		padding: 0 30upx;
	}

	.uni-input {
		padding: 0 30upx;
	}

	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}

	.cu-form-group uni-picker::after {
		line-height: 68rpx;
	}

	.select .uni-input {
		line-height: 68rpx;
	}

	.input .right-input {
		line-height: 68rpx;
	}
</style>
