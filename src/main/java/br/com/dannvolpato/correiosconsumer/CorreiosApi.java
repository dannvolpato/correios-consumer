package br.com.dannvolpato.correiosconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://api.correios.com.br", name = "rastro-v1")
public interface CorreiosApi {

    @GetMapping(path = "/rastro/v1/objetos/{objeto}")
    String getRastroObjetoV1(@PathVariable("objeto") String objeto);
}