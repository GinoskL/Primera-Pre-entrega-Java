package com.facturacion.FacturacionPrimeraEntrega.repository;

import com.facturacion.FacturacionPrimeraEntrega.entity.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Long> {
}
