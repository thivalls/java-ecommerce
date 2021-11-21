package com.br.javaecommerce.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "clients")
@PrimaryKeyJoinColumn(name = "id")
public class Client extends Person{

    @Column(nullable = false)
    private String cpf;

    @Temporal(TemporalType.DATE)
    private Date birthday;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
