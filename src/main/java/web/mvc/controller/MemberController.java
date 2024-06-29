package web.mvc.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.mvc.domain.Member;
import web.mvc.service.MemberService;
@Tag(name = "Member API", description = "Member Swagger 테스트용 API")
@RestController
@RequiredArgsConstructor
@Slf4j
public class MemberController {
    private final MemberService memberService;
    /**
     * 가입하기
     * */


    @PostMapping("/members")
    public ResponseEntity<?> signUp(@RequestBody Member member){ //json전달
       log.info("member = {}", member);
        memberService.signUp(member);

        return ResponseEntity.status(HttpStatus.CREATED).body("OK");
    }

    //중복체크
    @GetMapping("/members/{id}")
    public String duplicateIdCheck(@PathVariable String id){
        System.out.println("id = " + id);
        return memberService.duplicateCheck(id);
    }
}
