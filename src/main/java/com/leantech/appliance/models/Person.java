package com.leantech.appliance.models;

import javax.persistence.*;


@Entity
@Table(name = "Candidate")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "address")
    private String address;

    @Column(name = "cell_phone")
    private String cellPhone;

    @Column(name = "city_name")
    private String cityName;

    public Person(Integer id, String name, String lastName, String address, String cellPhone, String cityName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.cellPhone = cellPhone;
        this.cityName = cityName;
    }

    public Person() {}

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
