package com.example.controllerQueryParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HelloController {
    @RequestMapping("/ciao")
    public String ciaoNomeProvincia(
            @RequestParam String nome,
            @RequestParam String provincia
    ) {
        return ("Ciao " + nome + ", com'è il tempo in " + provincia + "?");
    }

}
