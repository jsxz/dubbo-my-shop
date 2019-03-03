package vip.anjun.myshop.web.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication(scanBasePackages = "vip.anjun.myshop", exclude = DataSourceAutoConfiguration.class)
public class MyShopWebAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyShopWebAdminApplication.class, args);
    }
}