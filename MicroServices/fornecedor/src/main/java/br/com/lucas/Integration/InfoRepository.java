package br.com.lucas.Integration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface InfoRepository extends JpaRepository<FornecedorEntity, Long> {

    FornecedorEntity findByEstado(String estado);

}
