package loja.controller.data;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CompraRequest {

    private List<ItemRequest> itens;
    private EnderecoRequest endereco;

}
