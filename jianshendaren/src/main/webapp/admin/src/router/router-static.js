import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

         import users from '@/views/modules/users/list'
        import address from '@/views/modules/address/list'
        import cart from '@/views/modules/cart/list'
        import dictionary from '@/views/modules/dictionary/list'
        import forum from '@/views/modules/forum/list'
        import goods from '@/views/modules/goods/list'
        import goodsCommentback from '@/views/modules/goodsCommentback/list'
        import goodsOrder from '@/views/modules/goodsOrder/list'
        import jianshenjihua from '@/views/modules/jianshenjihua/list'
        import jianshenjilu from '@/views/modules/jianshenjilu/list'
        import jianshenkecheng from '@/views/modules/jianshenkecheng/list'
        import jianshenkechengCollection from '@/views/modules/jianshenkechengCollection/list'
        import news from '@/views/modules/news/list'
        import yonghu from '@/views/modules/yonghu/list'
        import config from '@/views/modules/config/list'
        import dictionaryForumState from '@/views/modules/dictionaryForumState/list'
        import dictionaryGoods from '@/views/modules/dictionaryGoods/list'
        import dictionaryGoodsOrder from '@/views/modules/dictionaryGoodsOrder/list'
        import dictionaryGoodsOrderPayment from '@/views/modules/dictionaryGoodsOrderPayment/list'
        import dictionaryIsdefault from '@/views/modules/dictionaryIsdefault/list'
        import dictionaryJianshenkecheng from '@/views/modules/dictionaryJianshenkecheng/list'
        import dictionaryJianshenkechengCollection from '@/views/modules/dictionaryJianshenkechengCollection/list'
        import dictionaryNews from '@/views/modules/dictionaryNews/list'
        import dictionarySex from '@/views/modules/dictionarySex/list'
        import dictionaryShangxia from '@/views/modules/dictionaryShangxia/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryForumState',
        name: '帖子状态',
        component: dictionaryForumState
    }
    ,{
        path: '/dictionaryGoods',
        name: '商品名称',
        component: dictionaryGoods
    }
    ,{
        path: '/dictionaryGoodsOrder',
        name: '订单类型名称',
        component: dictionaryGoodsOrder
    }
    ,{
        path: '/dictionaryGoodsOrderPayment',
        name: '支付方式',
        component: dictionaryGoodsOrderPayment
    }
    ,{
        path: '/dictionaryIsdefault',
        name: '是否默认地址',
        component: dictionaryIsdefault
    }
    ,{
        path: '/dictionaryJianshenkecheng',
        name: '类型名称',
        component: dictionaryJianshenkecheng
    }
    ,{
        path: '/dictionaryJianshenkechengCollection',
        name: '点赞记录表类型',
        component: dictionaryJianshenkechengCollection
    }
    ,{
        path: '/dictionaryNews',
        name: '公告类型名称',
        component: dictionaryNews
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型名称',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryShangxia',
        name: '上下架',
        component: dictionaryShangxia
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/address',
        name: '收货地址',
        component: address
      }
    ,{
        path: '/cart',
        name: '购物车',
        component: cart
      }
    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/forum',
        name: '论坛',
        component: forum
      }
    ,{
        path: '/goods',
        name: '商品信息',
        component: goods
      }
    ,{
        path: '/goodsCommentback',
        name: '商品评价',
        component: goodsCommentback
      }
    ,{
        path: '/goodsOrder',
        name: '商品订单',
        component: goodsOrder
      }
    ,{
        path: '/jianshenjihua',
        name: '个人健身计划',
        component: jianshenjihua
      }
    ,{
        path: '/jianshenjilu',
        name: '健身记录',
        component: jianshenjilu
      }
    ,{
        path: '/jianshenkecheng',
        name: '健身课程',
        component: jianshenkecheng
      }
    ,{
        path: '/jianshenkechengCollection',
        name: '商品点赞记录',
        component: jianshenkechengCollection
      }
    ,{
        path: '/news',
        name: '公告',
        component: news
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
