package task;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/test/{status}")
    public ResponseEntity<String> returnStatusCode(@PathVariable int status) {
        return new ResponseEntity<>(HttpStatus.valueOf(status));
    }

}
