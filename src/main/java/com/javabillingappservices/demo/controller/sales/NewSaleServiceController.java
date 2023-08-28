package com.javabillingappservices.demo.controller.sales;

import com.javabillingappservices.demo.model.sales.MainSaleModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/newsale")
public class NewSaleServiceController {


    @GetMapping("{salestatus}")
    public MainSaleModel getNewSalesResponse(String status){
        return new MainSaleModel();
    }

    @PostMapping
    public String postNewSalesRequest(@RequestBody MainSaleModel newSaleModel){
        return "Inserted new sale";
    }

}
