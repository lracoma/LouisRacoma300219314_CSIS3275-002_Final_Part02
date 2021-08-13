package com.example.louisracoma300219314_csis3275002_final_part02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping
@Controller
public class SavingsController {

    @Autowired
    SavingsService service;
    @RequestMapping(value = "/savings", method = RequestMethod.GET)
    public String showSavingsPage(ModelMap model, @RequestParam(defaultValue = "")String id)
    {
        return "savings";
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showSavingsPage2()
    {
        return "savings";
    }


}
