package com.diegomb.cep.controller;

import com.diegomb.cep.dto.CepResultDTO;
import java.net.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.Map;

@RestController
@RequestMapping("/consulta-cep")
@CrossOrigin(origins = "https://fresh-libby-dmsilva-93394af4.koyeb.app/consulta-cep/") // Permite requisições de qualquer domínio
public class ConsultaCEPController {
    @GetMapping("{cep}")
    public CepResultDTO consultaCEP(@PathVariable("cep") String cep) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<CepResultDTO> resp =
                restTemplate.getForEntity("https://viacep.com.br/ws/{cep}/json/", CepResultDTO.class, cep);
        return resp.getBody();
    }
}

