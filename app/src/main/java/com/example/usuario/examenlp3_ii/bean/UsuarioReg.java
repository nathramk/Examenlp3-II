package com.example.usuario.examenlp3_ii.bean;

/**
 * Created by Usuario on 25/04/2017.
 */

public class UsuarioReg {

    private int usuarioId;
    private String name;
    private String lastName;
    private String user;
    private String password;

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UsuarioReg(int usuarioId, String name, String lastName, String user, String password) {
        this.usuarioId = usuarioId;
        this.name = name;
        this.lastName = lastName;
        this.user = user;
        this.password = password;
    }

    @Override
    public String toString() {
        return name + " " + lastName + " " + user;
    }
}
