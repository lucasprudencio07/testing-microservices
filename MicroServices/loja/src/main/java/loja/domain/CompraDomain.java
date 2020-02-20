package loja.domain;

import loja.client.FornecedorClient;
import loja.controller.data.CompraRequest;
import loja.controller.data.InfoFornecedorRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class CompraDomain {

    private final RestTemplate restClient;
//    private final DiscoveryClient eurekaClient;

    private final FornecedorClient fornecedorClient;

    public void realizarCompra(CompraRequest compraRequest) {

        InfoFornecedorRequest info = fornecedorClient.getInfoPorEstado(compraRequest.getEndereco()
                                                                                    .getEstado());

        System.out.println(info.getEndereco());

//        ResponseEntity<InfoFornecedorRequest> exchange = restClient.exchange(
//                                        "http://fornecedor/info/" + compraRequest.getEndereco().getEstado(),
//                                            HttpMethod.GET, null, InfoFornecedorRequest.class);
//
//        String enderecoFornecedor = exchange.getBody().getEndereco();
//
//        System.out.println(enderecoFornecedor);
//
//        /** isto eh para imprimir as diferentes instancias de fornecedor que podemos ter rodando ao mesmo tempo,
//        assim ele irah imprimir no console a que foi utilizada **/
//        eurekaClient.getInstances("fornecedor")
//                    .stream()
//                    .forEach(fornecedor -> System.out.println("localhost:" + fornecedor.getHost()));
//
//        return enderecoFornecedor;

    }

}
