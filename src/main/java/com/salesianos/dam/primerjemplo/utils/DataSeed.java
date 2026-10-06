package com.salesianos.dam.primerjemplo.utils;

import com.salesianos.dam.primerjemplo.dto.EditCategoryDto;
import com.salesianos.dam.primerjemplo.dto.EditProductDto;
import com.salesianos.dam.primerjemplo.service.CategoryService;
import com.salesianos.dam.primerjemplo.service.ProductService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataSeed {

    private final CategoryService categoryService;
    private final ProductService productService;

    @PostConstruct
    public void initData() {

        /*
            Invocar a los servicios para insertar
            datos de ejemplo
         */
        categoryService.addCategory(new EditCategoryDto("Bebidas").to());
        categoryService.addCategory(new EditCategoryDto("Tapas").to());
        categoryService.addCategory(new EditCategoryDto("Postres").to());

        productService.addProduct(new EditProductDto("Pan y picos", 1.0, "Servicio de mesa"));
        productService.addProduct(new EditProductDto("Refresco de cola", 2.0, "Lata 33cl"));
        productService.addProduct(new EditProductDto("Tarta de queso", 4.5, "Porción casera"));


    }

}
