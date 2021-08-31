package icu.bleuweb.eurekaconsumerdemo.config;

import feign.RequestInterceptor;
import icu.bleuweb.eurekaconsumerdemo.interceptor.FeignBasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: wuxy
 * @create: 2021-08-31
 **/

@Configuration
public class FeignSupportConfig {
    /**
     * feign请求拦截器
     *
     * @return
     */
    @Bean
    public RequestInterceptor requestInterceptor() {
        return new FeignBasicAuthRequestInterceptor();
    }
}