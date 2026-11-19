package com.ghada.maquillage.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ghada.maquillage.entities.type;
import com.ghada.maquillage.repos.typeRepository;
import java.util.Map;
import java.util.Map;

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
    @PostMapping
    public type save(@RequestBody type t) {
        t.setIdtyp(null);
        return typeRepository.save(t);
    }

    @PutMapping("/{id}")
    public type update(@PathVariable Long id, @RequestBody type t) {
        t.setIdtyp(id);
        return typeRepository.save(t);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
    	typeRepository.deleteById(id);
    }
}