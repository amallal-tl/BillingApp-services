package com.javabillingappservices.demo.repository;

import com.javabillingappservices.demo.model.sales.MainSaleModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MainSaleRepository extends JpaRepository <MainSaleModel, Integer>{

}
