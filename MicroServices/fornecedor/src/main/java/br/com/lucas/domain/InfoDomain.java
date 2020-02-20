package br.com.lucas.domain;

import br.com.lucas.Integration.InfoRepository;
import br.com.lucas.domain.converter.DomainConverter;
import br.com.lucas.domain.data.FornecedorDomain;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InfoDomain {

    private final DomainConverter domainConverter;
    private final InfoRepository infoRepository;

    public FornecedorDomain getInfoEstadoDomain(String estado) {

         return domainConverter.convertEntityToDomain(infoRepository.findByEstado(estado));
    }

}
