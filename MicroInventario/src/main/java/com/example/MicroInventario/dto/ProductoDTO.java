package com.example.MicroInventario.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ProductoDTO {
    @Data 
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Request {
       @NotBlank(message = "El nombre del producto es obligatorio")
        @Size(max = 100, message = "El nombre no puede superar los 100 caracteres")
        private String nombre;
        
        @NotBlank(message = "La descripción es obligatoria")
        private String descripcion;
        
        @NotNull(message = "La categoría es obligatoria")
        private Integer id_categoria; // Usamos el ID para registrar/asociar
        
        @NotNull(message = "El precio base es obligatorio")
        @PositiveOrZero(message = "El precio base no puede ser negativo")
        private Integer precio_base;
        
        @NotNull(message = "El estado es obligatorio")
        private Boolean estado;
    }
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response {
        private Integer id_producto;
        private String nombre;
        private String descripcion;
        private Integer id_categoria; // Usamos el ID para mostrar la categoría
        private Integer precio_base;
        private Boolean estado;
    }
}
