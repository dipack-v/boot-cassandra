package com.example;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Transient;
import org.springframework.data.cassandra.mapping.Column;


@Table(value="CONTAINER")
public class Container {
    @PrimaryKey
    @Column("containerNumber")
    private String containerNumber;
    private String type;
    private int size;
    @Transient
    private List<String> cargoes;
    @Transient
    private List<String> cargoDetailsSet;
    @Transient
    private List<String> commodities;
    public Container() {
        super();
        this.cargoes = new ArrayList<String>();
        this.cargoDetailsSet = new ArrayList<String>();
        this.commodities = new ArrayList<String>();
        
    }
    public Container(String containerNumber, String type, int size) {
        super();
        this.containerNumber = containerNumber;
        this.type = type;
        this.size = size;
        this.cargoes = new ArrayList<String>();
        this.cargoDetailsSet = new ArrayList<String>();
        this.commodities = new ArrayList<String>();
    }
    public String getContainerNumber() {
        return containerNumber;
    }
    public void setContainerNumber(String containerNumber) {
        this.containerNumber = containerNumber;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public List<String> getCargoes() {
        return cargoes;
    }
    public void setCargoes(List<String> cargoes) {
        this.cargoes = cargoes;
    }
    public List<String> getCargoDetailsSet() {
        return cargoDetailsSet;
    }
    public void setCargoDetailsSet(List<String> cargoDetailsSet) {
        this.cargoDetailsSet = cargoDetailsSet;
    }
    public List<String> getCommodities() {
        return commodities;
    }
    public void setCommodities(List<String> commodities) {
        this.commodities = commodities;
    }

}
