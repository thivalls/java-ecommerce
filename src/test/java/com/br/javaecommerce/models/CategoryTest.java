package com.br.javaecommerce.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CategoryTest {
    private Category category;

    @BeforeEach
    void setUp() {
        this.category = new Category(1L,  "Fulano");
    }

    @Test
    @DisplayName("Must be able to crate a new object with constructor and without parameters")
    void teste1() {
        Category testCategory = new Category();
        Assertions.assertNotNull(testCategory);
        Assertions.assertNull(testCategory.getId());
        Assertions.assertNull(testCategory.getName());
    }

    @Test
    @DisplayName("Must be able to crate a new object with constructor and with parameters")
    void teste2() {
        Category testCategory = new Category(2L, "Fulano 2");
        Assertions.assertNotNull(testCategory);
        Assertions.assertEquals(2L, testCategory.getId());
        Assertions.assertEquals("Fulano 2", testCategory.getName());
    }

    @Test
    @DisplayName("Must get correct ID of category")
    void teste3() {
        Assertions.assertEquals(1L, this.category.getId());
    }

    @Test
    @DisplayName("Must get correct name of category")
    void teste4() {
        Assertions.assertEquals("Fulano", this.category.getName());
    }

    @Test
    @DisplayName("Must be able to set a new name after the object has been created")
    void teste5() {
        Assertions.assertEquals("Fulano", this.category.getName());
        this.category.setName("Outro Fulano");
        Assertions.assertEquals("Outro Fulano", this.category.getName());
    }
}