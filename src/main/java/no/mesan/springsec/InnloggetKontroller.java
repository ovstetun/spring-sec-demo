package no.mesan.springsec;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/innlogget")
public class InnloggetKontroller {
    @RequestMapping(method=RequestMethod.GET)
    public String get() {
        return "innlogget";
    }
}
