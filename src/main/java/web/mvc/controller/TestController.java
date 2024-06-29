package web.mvc.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Test API", description = "Test Swagger 테스트용 API")
@RestController
@Slf4j
public class TestController {

    @GetMapping("/test")
    public String test(){
        log.info("test요청됨....");

        return "spring Security 시작!";
    }

}
