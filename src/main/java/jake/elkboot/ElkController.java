package jake.elkboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ElkController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/test")
    @ResponseBody
    public void test() {
        logger.info("test", "helloworld");
        logger.warn("haha");
        logger.error("errororoaet12hg");
        logger.debug("haha", "hahahahah");
    }
}
