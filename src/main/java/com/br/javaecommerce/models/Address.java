package com.br.javaecommerce.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "addesses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String street;
    private String zipcode;
    private String number;
    private String complement;
    private String neighborhood;
    private String state;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;
    // private AddresType type;


}
