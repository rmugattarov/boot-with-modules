package rmugattarov.bootwithmodules.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    @RequestMapping("/")
    public String get() {
        return "Howdy";
    }
}
