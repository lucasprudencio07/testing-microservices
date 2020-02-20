package br.com.lucas.domain.data;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Builder
public class FornecedorDomain {

    private Long id;
    private String nome;
    private String estado;
    private String endereco;

}
