package com.example.proxy.foo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class FooController {

    @GetMapping("/foos/{id}")
    public Foo findById(
      @PathVariable long id, HttpServletRequest req, HttpServletResponse res) {
        return new Foo(12L, "abcd");
    }
}