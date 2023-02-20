const {
	defineConfig
} = require('@vue/cli-service')

const port = 8080 // 端口
module.exports = defineConfig({
	transpileDependencies: true,
	devServer: { //记住，别写错了devServer//设置本地默认端口  选填
		host: '0.0.0.0',
		open: false,
		port: port,
		proxy: { //设置代理，必须填
			[process.env.VUE_APP_BASE_API]: {
				target: `http://localhost:8181`,
				changeOrigin: true,
				pathRewrite: {
					['^' + process.env.VUE_APP_BASE_API]: ''
				}
			}
		}
	}

})
