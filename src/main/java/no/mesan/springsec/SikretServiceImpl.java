package no.mesan.springsec;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

@Service
public class SikretServiceImpl implements SikretService {

    @Override
    @Secured("ROLE_ADMIN")
    public String sayHelloAdmin() {
        return "Hei til administrator!";
    }

    @Override
    @Secured("ROLE_WORKER")
    public String sayHello() {
        return "Hei til arbeider...";
    }
}
