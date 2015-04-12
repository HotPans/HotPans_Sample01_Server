package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Bread;
import com.example.service.BreadService;

@RestController
@RequestMapping("api/breads")
public class BreadRestController {
    @Autowired
    BreadService breadService;

    // パン全部取得
    @RequestMapping(method = RequestMethod.GET)
    List<Bread> getBreads(){
        List<Bread> Breads = breadService.findAll();
        System.out.println("★パン全部取得");
        return Breads;
    }

    // パン１つ取得
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    Bread getBread(@PathVariable Integer id){
        Bread Bread = breadService.findOne(id);
        return Bread;
    }

    // パン新規登録
    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    Bread postBread(@RequestBody Bread bread){
        System.out.println("★パン新規登録");
        return breadService.create(bread);
    }

    // パン１つ更新
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    Bread putBread(@PathVariable Integer id, @RequestBody Bread bread){
        bread.setId(id);
        return breadService.update(bread);
    }

    // パン１つ削除
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteBread(@PathVariable Integer id){
        breadService.delete(id);
    }

}
