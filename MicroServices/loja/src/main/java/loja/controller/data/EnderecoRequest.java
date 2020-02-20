package loja.controller.data;

import lombok.Data;

@Data
public class EnderecoRequest {

    private String rua;
    private Integer numero;
    private String estado;
}
