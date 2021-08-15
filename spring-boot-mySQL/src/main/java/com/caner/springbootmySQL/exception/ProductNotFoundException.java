package com.caner.springbootmySQL.exception;

public class ProductNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ProductNotFoundException(Long id){
        super("This product with " + id + " cannot be found");
    }

}
