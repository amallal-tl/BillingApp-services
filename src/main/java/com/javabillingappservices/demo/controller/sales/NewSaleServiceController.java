package com.javabillingappservices.demo.controller.sales;

import com.javabillingappservices.demo.model.sales.NewSaleModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/newsales")
public class NewSaleServiceController {

    @GetMapping("{salestatus}")
    public NewSaleModel getNewSalesResponse(String status){
        return new NewSaleModel("fadsf", "sadfafd", "dafsdf", 12);
    }

    @PostMapping
    public String postNewSalesRequest(@RequestBody NewSaleModel newSaleModel){
        return "Inserted new sale";
    }


}
