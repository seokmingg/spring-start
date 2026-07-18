package hello.springmvc.basic;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {
//    어노테이션 @Slf4j 하면 밑에 주석 안써도됨
//    private final Logger log= LoggerFactory.getLogger(getClass());


    @GetMapping("/log-test")
    public String logTest(){

        String name="Spring";
        String name2="Spring log test";



        //문자열이라고 그냥 +이거로 하면 안된다 연산이 일어나면 안된다. 출력을안해도 이미 +때문에 안쓰는레벨로그여도 연산을해버림,의미없는연산


//        log.info("info log="+ name);

        //로깅 레벨 순서 trace => error
        log.trace("trace log={},{}",name,name2);
        log.debug("trace log={},{}",name,name2);
        log.warn("trace log={},{}",name,name2);
        log.error("trace log={},{}",name,name2);

        log.info("info log={}", name);
        return "ok";
    }
}
