package com.javabillingappservices.demo.controller.sales;

import com.javabillingappservices.demo.model.sales.NewSaleModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/newsales")
public class NewSaleServiceController {

    @GetMapping("{salestatus}")
    public NewSaleModel getNewSalesResponse(String status){
        return new NewSaleModel("fadsf", "sadfafd", "dafsdf", 12);
    }

}
