package no.mesan.springsec;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/loggInn")
public class LoggInnKontroller {
    
    @RequestMapping(method = RequestMethod.GET)
    public String visInnlogging() {
        return "logg-inn";
    }
}
