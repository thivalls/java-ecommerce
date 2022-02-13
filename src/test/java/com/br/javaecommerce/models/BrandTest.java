package com.br.javaecommerce.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BrandTest {
    private Brand brand;

    @BeforeEach
    void setUp() {
        this.brand = new Brand(1L,  "Fulano");
    }

    @Test
    @DisplayName("Must be able to crate a new object with constructor and without parameters")
    void teste1() {
        Brand testBrand = new Brand();
        Assertions.assertNotNull(testBrand);
        Assertions.assertNull(testBrand.getId());
        Assertions.assertNull(testBrand.getName());
    }

    @Test
    @DisplayName("Must be able to crate a new object with constructor and with parameters")
    void teste2() {
        Brand testBrand = new Brand(2L, "Fulano 2");
        Assertions.assertNotNull(testBrand);
        Assertions.assertEquals(2L, testBrand.getId());
        Assertions.assertEquals("Fulano 2", testBrand.getName());
    }

    @Test
    @DisplayName("Must get correct ID of brand")
    void teste3() {
        Assertions.assertEquals(1L, this.brand.getId());
    }

    @Test
    @DisplayName("Must get correct name of brand")
    void teste4() {
        Assertions.assertEquals("Fulano", this.brand.getName());
    }

    @Test
    @DisplayName("Must be able to set a new name after the object has been created")
    void teste5() {
        Assertions.assertEquals("Fulano", this.brand.getName());
        this.brand.setName("Outro Fulano");
        Assertions.assertEquals("Outro Fulano", this.brand.getName());
    }
}