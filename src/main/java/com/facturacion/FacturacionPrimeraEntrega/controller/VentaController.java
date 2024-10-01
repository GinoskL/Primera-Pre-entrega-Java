package com.facturacion.FacturacionPrimeraEntrega.controller;

import com.facturacion.FacturacionPrimeraEntrega.entity.Venta;
import com.facturacion.FacturacionPrimeraEntrega.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    @Autowired
    private VentaRepository ventaRepository;

    // Obtener todas las ventas
    @GetMapping
    public List<Venta> getAllVentas() {
        return ventaRepository.findAll();
    }

    // Crear una nueva venta
    @PostMapping
    public Venta createVenta(@RequestBody Venta venta) {
        return ventaRepository.save(venta);
    }

    // Actualizar una venta
    @PutMapping("/{id}")
    public Venta updateVenta(@PathVariable Long id, @RequestBody Venta ventaActualizada) {
        Venta venta = ventaRepository.findById(id).orElseThrow(() -> new RuntimeException("Venta no encontrada"));
        venta.setFecha(ventaActualizada.getFecha());
        venta.setCliente(ventaActualizada.getCliente());
        venta.setProducto(ventaActualizada.getProducto());
        venta.setCantidad(ventaActualizada.getCantidad());
        return ventaRepository.save(venta);
    }

    // Eliminar una venta
    @DeleteMapping("/{id}")
    public void deleteVenta(@PathVariable Long id) {
        ventaRepository.deleteById(id);
    }
}
