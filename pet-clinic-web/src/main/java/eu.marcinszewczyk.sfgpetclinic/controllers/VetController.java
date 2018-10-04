package eu.marcinszewczyk.sfgpetclinic.controllers;

import eu.marcinszewczyk.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @Autowired
    VetService vetService;

    @RequestMapping({"/vets", "/vets/index"} )
    public String listVets(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
