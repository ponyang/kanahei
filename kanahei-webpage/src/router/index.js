import Vue from 'vue'
import Router from 'vue-router'
import ImageManage from '@/components/ImageManage'
import Index from '@/components/Index'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/image',
      name: '이미지 관리',
      component: ImageManage
    },
    {
      path: '/',
      name: 'home',
      component: Index
    }
  ]
})
