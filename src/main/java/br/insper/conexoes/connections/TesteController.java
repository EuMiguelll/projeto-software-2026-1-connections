package br.insper.conexoes.connections;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    @GetMapping("/hello-world")
    public String teste() {
        return "hello-world";
    }

}
