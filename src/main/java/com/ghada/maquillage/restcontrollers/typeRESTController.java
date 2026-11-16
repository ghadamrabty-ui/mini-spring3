package com.ghada.maquillage.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ghada.maquillage.entities.type;
import com.ghada.maquillage.repos.typeRepository;

@RestController
@RequestMapping("/api/typ")
@CrossOrigin("*")
public class typeRESTController {

    @Autowired
    private typeRepository typeRepository;

	//@RequestMapping(method=RequestMethod.GET)
    @GetMapping
    public List<type> getAlltype() {
        return typeRepository.findAll();
    }
}