package no.mesan.springsec;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/aapen")
public class AapenKontroller {
    
    @RequestMapping(method=RequestMethod.GET)
    public String get() {
        return "aapen";
    }
}
