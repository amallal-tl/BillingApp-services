package com.javabillingappservices.demo.service;

import com.javabillingappservices.demo.model.sales.MainSaleModel;

public interface MainSaleService {
    public String createMainSale(MainSaleModel mainSaleModel);
    public MainSaleModel getMainSale(String mainSaleId);
}
