package com.javabillingappservices.demo.controller.sales;

import com.javabillingappservices.demo.model.sales.MainSaleModel;
import com.javabillingappservices.demo.service.MainSaleService;
import com.sun.tools.javac.Main;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mainsale")
public class MainSaleController {
    MainSaleService mainSaleService;

    public MainSaleController(MainSaleService mainSaleService){
        this.mainSaleService = mainSaleService;
    }

    @GetMapping("{mainSaleId}")
    public MainSaleModel getMainSaleById(@PathVariable("mainSaleId") String mainSaleId){
        return mainSaleService.getMainSale(mainSaleId);
    }

    @PostMapping
    public String createMainSale(@RequestBody MainSaleModel mainSaleModel){
        mainSaleService.createMainSale(mainSaleModel);
        return "Success";
    }

}
