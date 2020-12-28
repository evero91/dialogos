/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evero91.dialogos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author ever
 */
@ManagedBean
@ViewScoped
public class IndexBean implements Serializable {

    private List<MiPojo> misPojos;
    private MiPojo pojo;

    @PostConstruct
    public void init() {
        misPojos = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            MiPojo p = new MiPojo((i + 1), "Valor " + (i + 1));
            misPojos.add(p);
        }
    }

    public void mostrarDialogo2() {
        pojo = new MiPojo();
    }

    public void agregarPojo() {
        misPojos.add(new MiPojo(pojo.getId(), pojo.getValor()));
    }

    public List<MiPojo> getMisPojos() {
        return misPojos;
    }

    public void setMisPojos(List<MiPojo> misPojos) {
        this.misPojos = misPojos;
    }

    public MiPojo getPojo() {
        return pojo;
    }

    public void setPojo(MiPojo pojo) {
        this.pojo = pojo;
    }
}
