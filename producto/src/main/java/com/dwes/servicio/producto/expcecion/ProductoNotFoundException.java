package com.dwes.servicio.producto.expcecion;

public class ProductoNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

	public ProductoNotFoundException(String message) {
        super(message);
    }

}
