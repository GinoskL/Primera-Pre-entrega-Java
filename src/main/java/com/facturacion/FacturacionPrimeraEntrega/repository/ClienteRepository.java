package com.facturacion.FacturacionPrimeraEntrega.repository;

import com.facturacion.FacturacionPrimeraEntrega.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
