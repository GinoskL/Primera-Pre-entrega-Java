package com.facturacion.FacturacionPrimeraEntrega.repository;

import com.facturacion.FacturacionPrimeraEntrega.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
