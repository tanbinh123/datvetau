package com.mycompany.datvetau.entities;

import com.mycompany.datvetau.entities.enums.TrainClasses;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class TauEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String tenTau;

    @OneToMany
    @Column(nullable = false)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<ToaTauEntity> toaTaus;

    public TauEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenTau() {
        return tenTau;
    }

    public void setTenTau(String tenTau) {
        this.tenTau = tenTau;
    }

    public List<ToaTauEntity> getToaTaus() {
        return toaTaus;
    }

    public void setToaTaus(List<ToaTauEntity> toaTaus) {
        this.toaTaus = toaTaus;
    }
}
