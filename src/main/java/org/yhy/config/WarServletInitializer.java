package org.yhy.config;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Profile;
import org.yhy.MainStarter;

/**
 * war bao servlet 初始化
 */
public class WarServletInitializer extends SpringBootServletInitializer {

    @Profile(value = "war")//mvn -P war, prod maven使用外置tomcat的时候使用此启动类
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MainStarter.class);
    }

}
