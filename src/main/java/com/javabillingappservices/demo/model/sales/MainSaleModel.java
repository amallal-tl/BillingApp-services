package com.javabillingappservices.demo.model.sales;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="main_sale")
public class MainSaleModel {
    @Id
    private String mainSaleId;
    private String uniqueSaleId;
    private double totalAmount;
    private int saleStatus;
    private String userId;
    private String machineId;

    public MainSaleModel() {
    }

    public MainSaleModel(String uniqueSaleId, double totalAmount, int saleStatus, String userId, String machineId) {
        this.uniqueSaleId = uniqueSaleId;
        this.totalAmount = totalAmount;
        this.saleStatus = saleStatus;
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
        return saleStatus;
    }

    public void setSalestatus(int salestatus) {
        this.saleStatus = salestatus;
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

    public String getMainSaleId() {
        return mainSaleId;
    }

    public void setMainSaleId(String mainSaleId) {
        this.mainSaleId = mainSaleId;
    }

}

