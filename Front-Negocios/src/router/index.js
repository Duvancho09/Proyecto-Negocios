import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import KpiView from '../views/KpiView.vue'
import Hijo from '../components/hijo.vue'
import Padre from '../components/padre.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/kpi',
      name: 'kpis',
      component: KpiView
    },
    {
      path: '/hijo',
      name: 'hijo',
      component: Hijo
    },
    {
      path: '/padre',
      name: 'padre',
      component: Padre
    },
    {
      path: '/estadisticas',
      name: 'estadisticas',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../views/EstadisticasView.vue')
    }
  ]
})

export default router
