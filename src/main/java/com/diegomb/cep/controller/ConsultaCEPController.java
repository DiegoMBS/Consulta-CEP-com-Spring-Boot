package com.diegomb.cep.controller;

import com.diegomb.cep.dto.CepResultDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/consulta-cep")
@CrossOrigin(origins = "*") // Permite requisições de qualquer domínio
public class ConsultaCEPController {
    @GetMapping("{cep}")
    public CepResultDTO consultaCEP(@PathVariable("cep") String cep) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<CepResultDTO> resp =
                restTemplate.getForEntity("https://viacep.com.br/ws/{cep}/json/", CepResultDTO.class, cep);
        return resp.getBody();
    }
}

