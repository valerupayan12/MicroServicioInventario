package com.example.MicroInventario.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class TiendaDTO {
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Request {
        
        @NotBlank(message = "El nombre de la tienda es obligatorio")
        @Size(max = 100, message = "El nombre no puede superar los 100 caracteres")
        private String nombre;
        
        @NotBlank(message = "La dirección es obligatoria")
        private String direccion;
        
        @NotNull(message = "La comuna es obligatoria")
        private Integer id_comuna;
        
        @NotNull(message = "La región es obligatoria")
        private Integer id_region;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response {
        private int id_tienda;
        private String nombre;
        private String direccion;
        
        // Transformamos los IDs en datos legibles para la respuesta
        private int id_comuna;
        private String nombre_comuna;
        
        private int id_region;
        private String nombre_region;
    }
}
