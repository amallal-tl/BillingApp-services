package com.javabillingappservices.demo.repository;

import com.javabillingappservices.demo.model.sales.MainSaleModel;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MainSaleRepository extends JpaRepository <MainSaleModel, String>{

}
