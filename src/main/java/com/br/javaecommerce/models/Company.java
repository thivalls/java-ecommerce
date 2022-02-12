package com.br.javaecommerce.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "companies")
@PrimaryKeyJoinColumn(name = "id")
public class Company extends Person{

    @Column(nullable = false)
    private String cnpj;

    @Column(name = "state_register")
    private String stateRegister;

    @Column(name = "city_register")
    private String cityRegister;

    @Column(name = "name_register")
    private String nameRegister;

    @Column(name = "corporate_name")
    private String corporateName;

    private String category;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getStateRegister() {
        return stateRegister;
    }

    public void setStateRegister(String stateRegister) {
        this.stateRegister = stateRegister;
    }

    public String getCityRegister() {
        return cityRegister;
    }

    public void setCityRegister(String cityRegister) {
        this.cityRegister = cityRegister;
    }

    public String getNameRegister() {
        return nameRegister;
    }

    public void setNameRegister(String nameRegister) {
        this.nameRegister = nameRegister;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
