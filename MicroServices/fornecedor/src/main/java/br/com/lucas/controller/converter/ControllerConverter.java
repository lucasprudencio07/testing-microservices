package br.com.lucas.controller.converter;

import br.com.lucas.controller.data.FornecedorController;
import br.com.lucas.domain.data.FornecedorDomain;
import org.springframework.stereotype.Component;

@Component
public class ControllerConverter {

    public FornecedorController convertDomainToController(FornecedorDomain fornecedorDomain) {
        return FornecedorController.builder()
                                    .id(fornecedorDomain.getId())
                                    .nome(fornecedorDomain.getNome())
                                    .estado(fornecedorDomain.getEstado())
                                    .endereco(fornecedorDomain.getEndereco())
                                    .build();
    }
}
