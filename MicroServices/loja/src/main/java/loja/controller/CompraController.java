package loja.controller;

import loja.controller.data.CompraRequest;
import loja.domain.CompraDomain;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/compra")
@RequiredArgsConstructor
public class CompraController {

    private final CompraDomain compraDomain;

    @PostMapping
    public void realizaCompra(@RequestBody CompraRequest compraRequest) {

        compraDomain.realizarCompra(compraRequest);

    }

}
