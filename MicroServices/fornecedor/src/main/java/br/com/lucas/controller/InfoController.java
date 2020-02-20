package br.com.lucas.controller;

import br.com.lucas.Integration.FornecedorEntity;
import br.com.lucas.Integration.InfoRepository;
import br.com.lucas.controller.converter.ControllerConverter;
import br.com.lucas.controller.data.FornecedorController;
import br.com.lucas.domain.InfoDomain;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
@RequiredArgsConstructor
public class InfoController {

    private final InfoDomain infoDomain;
    private final ControllerConverter controllerConverter;
    private final InfoRepository infoRepository;

    @GetMapping("/{estado}")
    public FornecedorController getInfoEstado(@PathVariable String estado) {

        return controllerConverter.convertDomainToController(infoDomain.getInfoEstadoDomain(estado));

    }

    @GetMapping("/encontrar/{id}")
    public FornecedorEntity getInfoId(@PathVariable Long id) {
        return infoRepository.getOne(id);
    }

}
