package web.mvc.config;
import org.springframework.context.annotation.Configuration;
import 
org.springframework.web.servlet.config.annotation.CorsRegistry;
import 
org.springframework.web.servlet.config.annotation.EnableWebMvc;
import 
org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
* WebMvcConfigurer 를 이용해서 @CrossOrigin 글로벌 설정
* */
@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {
  @Override
  public void addCorsMappings(CorsRegistry registry) {
     registry.addMapping("/**")
       .allowedOrigins("*")
     //.allowedOrigins("http://3.36.91.175:3000")
      // .allowedOrigins("http://grace24.o-r.kr:3000")
      //  .allowedOrigins("http://grace24.shop:3000")
      //       .allowedOrigins("http://localhost:3000")
     .allowedMethods("OPTIONS","GET","POST","PUT","DELETE");
  }
}
