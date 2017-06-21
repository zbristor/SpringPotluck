package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by student on 6/21/17.
 */
@Controller
public class PotluckController {

    @Autowired
    PotluckRepository potluckRepository;

    @RequestMapping (path="/")
    public String mapPotluck(){
        return "potluckentry";}

    @GetMapping (path="/")
    public String getPotluck(Model model){
        model.addAttribute(new Potluck());
        return "potluckentry";}

    @PostMapping (path="/potluckentry")
    public String postPotluck (@ModelAttribute Potluck potluck)
    {
        potluckRepository.save(potluck);
        return "redirect:/potlucklist";
    }
    @GetMapping (path="/potlucklist")
    public @ResponseBody Iterable<Potluck> getAllPotluck(){
        return potluckRepository.findAll();
    }


    }


