package com.javabillingappservices.demo.model.sales;

public class NewSaleModel {
    private String uniqueSaleId;
    private String saleItem;
    private String saleQuantity;
    private int saleAmount;

    public NewSaleModel() {
    }

    public NewSaleModel(String uniqueSaleId, String saleItem, String saleQuantity, int saleAmount) {
        this.uniqueSaleId = uniqueSaleId;
        this.saleItem = saleItem;
        this.saleQuantity = saleQuantity;
        this.saleAmount = saleAmount;
    }

    public String getUniqueSaleId() {
        return uniqueSaleId;
    }

    public void setUniqueSaleId(String uniqueSaleId) {
        this.uniqueSaleId = uniqueSaleId;
    }

    public String getSaleItem() {
        return saleItem;
    }

    public void setSaleItem(String saleItem) {
        this.saleItem = saleItem;
    }

    public String getSaleQuantity() {
        return saleQuantity;
    }

    public void setSaleQuantity(String saleQuantity) {
        this.saleQuantity = saleQuantity;
    }

    public int getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(int saleAmount) {
        this.saleAmount = saleAmount;
    }
}
