import { createRouter, createWebHistory } from 'vue-router'
import DefaultLayout from '@/layouts/DefaultLayout.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      component: DefaultLayout,
      children: [
        { path: '', name: 'dashboard', component: () => import('@/views/DashboardView.vue') },
        { path: 'ra', name: 'ra', component: () => import('@/views/RaView.vue') },
        { path: 'ca', name: 'ca', component: () => import('@/views/CaView.vue') },
        { path: 'tsa', name: 'tsa', component: () => import('@/views/TsaView.vue') },
      ],
    },
  ],
})

export default router
