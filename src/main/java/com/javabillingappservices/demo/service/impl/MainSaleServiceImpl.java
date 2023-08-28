package com.javabillingappservices.demo.service.impl;

import com.javabillingappservices.demo.model.sales.MainSaleModel;
import com.javabillingappservices.demo.repository.MainSaleRepository;
import com.javabillingappservices.demo.service.MainSaleService;
import org.springframework.stereotype.Service;

@Service
public class MainSaleServiceImpl implements MainSaleService {
    MainSaleRepository mainSaleRepository;

    public MainSaleServiceImpl(MainSaleRepository mainSaleRepository){
        this.mainSaleRepository = mainSaleRepository;
    }

    @Override
    public String createMainSale(MainSaleModel mainSaleModel){
        mainSaleRepository.save(mainSaleModel);
        return "Success";
    }

    @Override
    public MainSaleModel getMainSale(String mainSaleId){
        return mainSaleRepository.findById(mainSaleId).get();
    }
}
