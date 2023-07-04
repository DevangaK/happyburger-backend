package com.example.catelogservice.Controller;

import com.example.catelogservice.Model.CatelogModel;
import com.example.catelogservice.Service.CatelogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CatelogController {

    @Autowired
    private CatelogService catelogservice;

    @PostMapping("/add")
    public CatelogModel addProduct(@RequestBody CatelogModel catelogmodel){
        //Entity class eke type eken thamai return eka denne
        return catelogservice.addProduct(catelogmodel);
    }

    @GetMapping("/all")
    public Iterable<CatelogModel> findAllProducts(){
        //find all
        return catelogservice.findall();
    }

    @GetMapping("/find/{Id}")
    public CatelogModel findProductById(@PathVariable Integer Id) {
        return catelogservice.findById(Id);
    }

    @GetMapping("/Products/{PName}")
    public Iterable<CatelogModel> findProductsByName(@PathVariable String PName){
        return catelogservice.findByPName(PName);
    }

    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<?> deleteProductById(@PathVariable Integer Id) {
        CatelogModel cm= catelogservice.findById(Id);
        catelogservice.delete(cm);
        return new ResponseEntity<String>("Deleted", HttpStatus.OK);
    }
}
