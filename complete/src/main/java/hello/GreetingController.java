package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class GreetingController {


    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greeting(@RequestParam(required = false) Integer id,
                           @RequestParam(required = false) String account,
                           @RequestParam(required = false) String type) throws ResponseStatusException {

        if (account.equals("personal")) {
            return "Hi userId " + id;
        }

        if (account.equals("business") && type.equals("big")) {
            return "Welcome, business user!";
        }

        if (account.equals("business") && type.equals("small")) {
            return new PathNotImplementedException().getMessage();
        }

         else {
            return "¯\\_(ツ)_/¯";
        }
    }
}
