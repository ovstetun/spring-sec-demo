package no.mesan.springsec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ekstra/")
public class EkstrasikretKontroller {
    
    @Autowired
    private SikretService service;
    
    @RequestMapping(value="/admin", method=RequestMethod.GET)
    public String getAdmin(ModelMap modell) {
        String melding = service.sayHelloAdmin();
        modell.addAttribute("melding", melding);
        return "ekstra";
    }
    
    @RequestMapping(value="/arbeider", method=RequestMethod.GET)
    public String getArbeider(ModelMap modell) {
        String melding = service.sayHello();
        modell.addAttribute("melding", melding);
        return "ekstra";
    }
}
