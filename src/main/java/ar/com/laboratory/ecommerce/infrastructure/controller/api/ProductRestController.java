package ar.com.laboratory.ecommerce.infrastructure.controller.api;
import ar.com.laboratory.ecommerce.application.service.ProductService;
import ar.com.laboratory.ecommerce.domain.Product;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@Tag(name = "Product", description = "Operations related to products")
@AllArgsConstructor

public class ProductRestController {

    private ProductService productService;
    @GetMapping("/health")
    @ApiResponse(responseCode = "200", description = "Successful response", content = @Content(schema = @Schema(implementation = String.class)))
    public ResponseEntity<String> health(){
        return ResponseEntity
                .ok()
                .body("OK");}
    @GetMapping("/products")
    @ApiResponse(responseCode = "200", description = "Successful response", content = @Content(schema = @Schema(implementation = Product.class)))
    public ResponseEntity<Iterable<Product>> getProducts(){
        return  ResponseEntity
                .ok()
                .body(productService.getProducts());
    }
    @GetMapping("/product/{id}")
    @ApiResponse(responseCode = "200", description = "Successful response", content = @Content(schema = @Schema(implementation = Product.class)))
    public ResponseEntity<Iterable<Product>> getProduct(@PathVariable Integer id){
        return  ResponseEntity
                .ok()
                .body(productService.getProducts());
    }

}
