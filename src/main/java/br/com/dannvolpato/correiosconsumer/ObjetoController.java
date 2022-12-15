package br.com.dannvolpato.correiosconsumer;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ObjetoController {

    private final CorreiosApi correiosApi;

    @GetMapping
    public String ola(){
        return "olá";
    }

    @GetMapping(path = "/{objeto}")
    public String getObjeto(@PathVariable("objeto") String objeto) {

        return correiosApi.getRastroObjetoV1(objeto);
    }
}
