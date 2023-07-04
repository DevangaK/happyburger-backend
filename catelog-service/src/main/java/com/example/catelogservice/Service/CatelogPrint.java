package com.example.catelogservice.Service;

import com.example.catelogservice.Model.CatelogModel;

public interface CatelogPrint {
    public CatelogModel addProduct(CatelogModel catelog);
    public Iterable<CatelogModel> findall();
    public CatelogModel findById(Integer id);
    public void delete (CatelogModel catelog);
    public Iterable<CatelogModel> findByPName(String PName);
}
