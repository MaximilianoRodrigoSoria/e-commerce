package ar.com.laboratory.ecommerce.infrastructure.controller.api;


import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Tag(name = "User", description = "Operations related to users")
public class UserRestController {
    @GetMapping("/health")
    public ResponseEntity<String> health(){
        return ResponseEntity
                .ok()
                .body("OK");
    }
}
