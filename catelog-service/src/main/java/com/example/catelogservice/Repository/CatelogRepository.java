package com.example.catelogservice.Repository;

import com.example.catelogservice.Model.CatelogModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatelogRepository extends JpaRepository<CatelogModel,Integer> {
    Iterable<CatelogModel> findByPName(String PName);
}
