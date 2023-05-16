
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import UserAddManager from "./grid/UserAddGrid"
import UserAddDetail from "./components/listers/UserAddDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/userAdds',
                name: 'UserAddManager',
                component: UserAddManager
            },
            {
                path: '/userAdds/:id',
                name: 'UserAddDetail',
                component: UserAddDetail
            },



    ]
})
