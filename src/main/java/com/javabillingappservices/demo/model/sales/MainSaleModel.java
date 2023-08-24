package com.javabillingappservices.demo.model.sales;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sales")
public class MainSaleModel {

    @Id
    private String uniqueSaleId;
    private double totalAmount;
    private int salestatus;
    private String userId;
    private String machineId;

    public MainSaleModel() {
    }

    public MainSaleModel(String uniqueSaleId, double totalAmount, int salestatus, String userId, String machineId) {
        this.uniqueSaleId = uniqueSaleId;
        this.totalAmount = totalAmount;
        this.salestatus = salestatus;
        this.userId = userId;
        this.machineId = machineId;
    }

    public String getUniqueSaleId() {
        return uniqueSaleId;
    }

    public void setUniqueSaleId(String uniqueSaleId) {
        this.uniqueSaleId = uniqueSaleId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getSalestatus() {
        return salestatus;
    }

    public void setSalestatus(int salestatus) {
        this.salestatus = salestatus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }
}

