package com.javabillingappservices.demo.service.impl;

import com.javabillingappservices.demo.model.sales.MainSaleModel;
import com.javabillingappservices.demo.repository.MainSaleRepository;
import com.javabillingappservices.demo.service.MainSaleService;

public class MainSaleServiceImpl implements MainSaleService {
    MainSaleRepository mainSaleRepository;

    public MainSaleServiceImpl(MainSaleRepository mainSaleRepository){
        this.mainSaleRepository = mainSaleRepository;
    }

    @Override
    public String createMainSale(MainSaleModel mainSaleModel){

    }

    @Override
    public String getMainSale(Integer saleId){
        return null;
    }
}
