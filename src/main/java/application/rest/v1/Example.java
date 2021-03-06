package application.rest.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class Example {


	@GetMapping(path = {"/","/default"})
    public @ResponseBody ResponseEntity<String> example() {
        List<String> list = new ArrayList<>();
        //return a simple list of strings
        list.add("Congratulations, your application is up and and running");
        return new ResponseEntity<String>(list.toString(), HttpStatus.OK);
    }

}
