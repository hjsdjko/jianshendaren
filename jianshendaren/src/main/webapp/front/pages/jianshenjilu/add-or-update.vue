























<template>
	<view class="content">
		<form class="app-update-pv">
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}'
                      class="title">标题</view>
                <input   readonly="readonly"
                         :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"28rpx","borderStyle":"solid","height":"68rpx"}'
                         :disabled="ro.jianshenjiluName" type="text" v-model="ruleForm.jianshenjiluName" placeholder="标题"></input>
            </view>
                <view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                      class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}'
                          class="title">运动类型</view>
                    <picker @change="jianshenkechengTypesChange" :value="jianshenkechengTypesIndex" :range="jianshenkechengTypesOptions" range-key="indexName">
                        <view
                                :style='{"borderColor":"rgba(0, 102, 51, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}'
                                class="uni-input">{{ruleForm.jianshenkechengTypes?ruleForm.jianshenkechengValue:"请选择运动类型"}}</view>
                    </picker>
                </view>
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}'
                      class="title">开始时间</view>
                <input
                        :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"28rpx","borderStyle":"solid","height":"68rpx"}'
                        v-model="ruleForm.jianshenjilukTime" placeholder="开始时间" :readonly="ro.jianshenjilukTime"
                        @tap="toggleTab('jianshenjilukTime')"></input>
            </view>
			            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}'
                      class="title">结束时间</view>
                <input
                        :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"28rpx","borderStyle":"solid","height":"68rpx"}'
                        v-model="ruleForm.jianshenjilujTime" placeholder="结束时间" :readonly="ro.jianshenjilujTime"
                        @tap="toggleTab('jianshenjilujTime')"></input>
            </view>
			<!-- text后缀 -->
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"210rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}'
                      class="title">运动内容</view>
                <textarea :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"28rpx","borderStyle":"solid","height":"200rpx"}'
                          :disabled="ro.jianshenjiluContent" v-model="ruleForm.jianshenjiluContent" placeholder="运动内容"/>
            </view>
<!-- text后缀 -->
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"210rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}'
                      class="title">健身效果</view>
                <textarea :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"28rpx","borderStyle":"solid","height":"200rpx"}'
                          :disabled="ro.jianshenjiluXiaoguoContent" v-model="ruleForm.jianshenjiluXiaoguoContent" placeholder="健身效果"/>
            </view>

			<view class="btn">
				<button
					:style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"rgba(0, 102, 51, 1)","borderColor":"#409EFF","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","width":"70%","fontSize":"32rpx","borderStyle":"solid","height":"80rpx"}'
					@tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

					<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="jianshenjilukTimeConfirm"
						  ref="jianshenjilukTime" themeColor="#333333"></w-picker>
					<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="jianshenjilujTimeConfirm"
						  ref="jianshenjilujTime" themeColor="#333333"></w-picker>
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
                ro:{
					jianshenjiluName: false,
					yonghuId: false,
					jianshenkechengTypes: false,
					jianshenjilukTime: false,
					jianshenjilujTime: false,
					jianshenjiluContent: false,
					jianshenjiluXiaoguoContent: false,
					createTime: false,
				},
				ruleForm: {
					jianshenjiluName: '',
					yonghuId: '',
					jianshenkechengTypes: '',//数字
					jianshenkechengValue: '',//数字对应的值
					jianshenjilukTime: '',
					jianshenjilujTime: '',
					jianshenjiluContent: '',
					jianshenjiluXiaoguoContent: '',
					createTime: '',
				},
				// 登陆用户信息
				user: {},
				jianshenkechengTypesOptions: [],
				jianshenkechengTypesIndex : 0,

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
				let res = await this.$api.info(`jianshenjilu`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			if(options.jianshenjiluId){
                this.ruleForm.jianshenjiluId = options.jianshenjiluId;
			}
			// 跨表
			// this.styleChange()
		},
		methods: {
			// 下拉变化
            jianshenkechengTypesChange(e) {
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


			// 日期控件
			jianshenjilukTimeConfirm(val) {
                console.log(val)
                this.ruleForm.jianshenjilukTime = val.result;
                this.$forceUpdate();
            },
			// 日期控件
			jianshenjilujTimeConfirm(val) {
                console.log(val)
                this.ruleForm.jianshenjilujTime = val.result;
                this.$forceUpdate();
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
				if ((!this.ruleForm.jianshenjiluName)) {
					this.$utils.msg(`标题不能为空`);
					return
				}
				if ((!this.ruleForm.jianshenkechengTypes)) {
					this.$utils.msg(`运动类型不能为空`);
					return
				}
				if ((!this.ruleForm.jianshenjilukTime)) {
					this.$utils.msg(`开始时间不能为空`);
					return
				}
				if ((!this.ruleForm.jianshenjilujTime)) {
					this.$utils.msg(`结束时间不能为空`);
					return
				}
				if (this.ruleForm.id) {
					await this.$api.update(`jianshenjilu`, this.ruleForm);
				} else {
					await this.$api.save(`jianshenjilu`, this.ruleForm);
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