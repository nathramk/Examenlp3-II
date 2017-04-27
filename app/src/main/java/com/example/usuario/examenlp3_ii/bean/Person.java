package com.example.usuario.examenlp3_ii.bean;

/**
 * Created by Usuario on 25/04/2017.
 */

public class Person {

    private int id;
    private String alias;
    private String name;
    private String lastName;
    private String numberPhone;
    private String email;
    private String favorite;
    private String address;
    private String sex;
    private String score;
    private String status;
    private Integer photo;

    public Person() {

    }


    @Override
    public String toString() {
        return name + " " + lastName + " " + numberPhone + " " + score + " " + status;
    }

    public Person(int id, String alias, String name, String lastName, String numberPhone, String email, String favorite, String address, String sex, String score, String status, Integer photo) {
        this.id = id;
        this.alias = alias;
        this.name = name;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
        this.email = email;
        this.favorite = favorite;
        this.address = address;
        this.sex = sex;
        this.score = score;
        this.status = status;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
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

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getPhoto() {
        return photo;
    }

    public void setPhoto(Integer photo) {
        this.photo = photo;
    }
}
