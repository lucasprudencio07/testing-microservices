package br.com.lucas.controller.data;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Builder
public class FornecedorController {

    private Long id;
    private String nome;
    private String estado;
    private String endereco;
}
