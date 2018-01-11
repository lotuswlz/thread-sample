package cathywu.sample.thread.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class OperationController {

    @GetMapping("/test/{var}")
    public String test(@PathVariable("var") String var) {
        return var;
    }
}
