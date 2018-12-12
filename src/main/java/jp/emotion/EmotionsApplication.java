package jp.emotion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

/**
 * 
 * @author shinri
 */
@SpringBootApplication
public class EmotionsApplication extends SpringBootServletInitializer {
	/**
     * メイン関数。
     * @param args メイン引数。
     */
    public static void main(String[] args) {
        SpringApplication.run(EmotionsApplication.class, args);
    }
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EmotionsApplication.class);
    }
    
    @Bean
    public ServletContextInitializer servletContextInitializer() {
        return servletContext -> servletContext.getSessionCookieConfig().setName("em.session");
    }
}
