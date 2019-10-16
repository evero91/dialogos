/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evero91.dialogos;

import java.io.Serializable;

/**
 *
 * @author ever
 */
public class MiPojo implements Serializable {

    private long id;
    private String valor;

    public MiPojo() {
    }

    public MiPojo(long id, String valor) {
        this.id = id;
        this.valor = valor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
