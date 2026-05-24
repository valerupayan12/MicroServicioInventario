package com.example.MicroInventario.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class StockInventarioDTO {
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Request {
        
        @NotNull(message = "La tienda es obligatoria")
        private Integer id_tienda; // Recibimos el ID para asociar la Tienda
        
        @NotNull(message = "El producto es obligatorio")
        private Integer id_producto; // Recibimos el ID para asociar el Producto
        
        @NotNull(message = "La cantidad es obligatoria")
        @PositiveOrZero(message = "La cantidad en stock no puede ser negativa")
        private Integer cantidad;
        
        @NotNull(message = "El stock mínimo es obligatorio")
        @PositiveOrZero(message = "El stock mínimo no puede ser negativo")
        private Integer stock_min;
    }
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response {
        private int id_stock;
        
        // Datos de la Tienda simplificados para la respuesta
        private int id_tienda;
        private String nombre_tienda;
        
        // Datos del Producto simplificados para la respuesta
        private int id_producto;
        private String nombre_producto;
        
        private int cantidad;
        private int stock_min;
    }
}
