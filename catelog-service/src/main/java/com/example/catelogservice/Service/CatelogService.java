package com.example.catelogservice.Service;

import CatelogService.Model.CatelogModel;
import CatelogService.Repository.CatelogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatelogService implements CatelogPrint{

    @Autowired
    private CatelogRepository repo;

    public CatelogModel addProduct(CatelogModel catelog)
    {
        return repo.save(catelog);
    }

    public Iterable<CatelogModel> findall() {
        return repo.findAll();
    }

    public CatelogModel findById(Integer id)
    {
        return repo.findById(id).orElse(null);
    }

    public Iterable<CatelogModel> findByPName(String PName)
    {
        return repo.findByPName(PName);
    }


    public void delete (CatelogModel catelog)
    {
        repo.delete(catelog);
    }

}
