package com.example.cadastro;

import java.util.Objects;

public class Formulario {
    private String name;
    private String phone;
    private String email;
    private Boolean ingressedListOfEmail;
    private String genders;
    private String city;
    private String UF;

    public Formulario() {
    }

    public Formulario(String name, String phone, String email, Boolean ingressedListOfEmail, String genders, String city, String UF) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.ingressedListOfEmail = ingressedListOfEmail;
        this.genders = genders;
        this.city = city;
        this.UF = UF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIngressedListOfEmail() {
        return ingressedListOfEmail;
    }

    public void setIngressedListOfEmail(Boolean ingressedListOfEmail) {
        this.ingressedListOfEmail = ingressedListOfEmail;
    }

    public String getGenders() {
        return genders;
    }

    public void setGenders(String genders) {
        this.genders = genders;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    @Override
    public String toString() {
        return "Formulario{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", ingressedListOfEmail=" + ingressedListOfEmail +
                ", genders='" + genders + '\'' +
                ", city='" + city + '\'' +
                ", UF='" + UF + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Formulario that = (Formulario) o;
        return Objects.equals(name, that.name) && Objects.equals(phone, that.phone) && Objects.equals(email, that.email) && Objects.equals(ingressedListOfEmail, that.ingressedListOfEmail) && Objects.equals(genders, that.genders) && Objects.equals(city, that.city) && Objects.equals(UF, that.UF);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, email, ingressedListOfEmail, genders, city, UF);
    }
}
