package br.com.lucas.domain.converter;

import br.com.lucas.Integration.FornecedorEntity;
import br.com.lucas.domain.data.FornecedorDomain;
import org.springframework.stereotype.Component;

@Component
public class DomainConverter {

    public FornecedorDomain convertEntityToDomain(FornecedorEntity fornecedorEntity) {

        return FornecedorDomain.builder()
                                .id(fornecedorEntity.getId())
                                .nome(fornecedorEntity.getNome())
                                .estado(fornecedorEntity.getEstado())
                                .endereco(fornecedorEntity.getEndereco())
                                .build();

    }

}
