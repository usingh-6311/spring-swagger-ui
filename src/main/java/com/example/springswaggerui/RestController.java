package com.example.springswaggerui;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@Tag(name = "Demo", description = "Swagger APIs")
@RequestMapping("/api/")
public class RestController {

    @GetMapping("sw")
    public String sayHello() {
        return "Swagger Hello World";
    }
}
