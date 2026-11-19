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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ghada.maquillage.entities.maquillage;
import com.ghada.maquillage.service.maquillageService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
@AllArgsConstructor
public class maquillageRESTController {

    //@Autowired
    private final maquillageService maquillageService;
    
    
    //@RequestMapping(method=RequestMethod.GET)
    @GetMapping()
    List<maquillage> getAllmaquillage(){
    	return maquillageService.getAllmaquillage();
    	
    	
    }
  //@RequestMapping(value="/{id}",method = RequestMethod.GET)
    @GetMapping("/{idmaquillage}")
    public maquillage getmaquillageById(@PathVariable("idmaquillage") Long idmaquillage) {
    return maquillageService.getmaquillage(idmaquillage);
     }
  //@RequestMapping(method = RequestMethod.POST)
    @PostMapping()
    public maquillage createmaquillage(@RequestBody maquillage maquillage) {
    return maquillageService.savemaquillage(maquillage);
    }
  //@RequestMapping(method = RequestMethod.PUT)
    @PutMapping()
    public maquillage updatemaquillage(@RequestBody maquillage maquillage) {
    return maquillageService.updatemaquillage(maquillage);
    }
    
  //@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    @DeleteMapping("/{idmaquillage}")
   public void deletemaquillage(@PathVariable("idmaquillage") Long idmaquillage)
   {
    	maquillageService.deletemaquillageById(idmaquillage);
   }
    
    //@RequestMapping(value="/prodstyp/{idtyp}",method = RequestMethod.GET)
    @GetMapping("/prodstyp/{idtyp}")
   public List<maquillage> getProduitsByCatId(@PathVariable("idtyp") Long idtyp) {
   return maquillageService.findBytypeIdtyp(idtyp);
   }

   /*@GetMapping("/musByName/{nom}")
   public List<maquillage> findByNommaquillageContaining(@PathVariable("nom") String nom) {
       return maquillageService.findByNommaquillage(nom);
   }*/
    
    
    
    
    
}