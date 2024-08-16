package com.meedom.springbookonetomany.Entities.Repository.Controller;

import com.meedom.springbookonetomany.Entities.Owner;
import com.meedom.springbookonetomany.Entities.Repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/owner")
public class OwnerController {

    @Autowired
    private OwnerRepository ownerRepository;

    @PostMapping("/saveOwner")
    public Owner saveOwner(@RequestBody Owner owner) {
        System.out.println("Owner save called...");
        Owner ownerOut = ownerRepository.save(owner);
        System.out.println("Saved!!!");

        return ownerOut;
    }

    @GetMapping("/getOwner/{id}")
    public String getOwner(@PathVariable(name = "id") String id) {
        System.out.println("Owner get called...");
        Owner ownerOut = ownerRepository.getById(Integer.valueOf(id));
        System.out.println("\nOwner details with Blogs :: \n" + ownerOut);
        System.out.println("\nList of Blogs :: \n" + ownerOut.getBlogList());
        System.out.println("\nDone!!!");

        return "Owner fetched...";
    }
}
