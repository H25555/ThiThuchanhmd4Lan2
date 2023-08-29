package com.example.thithuchanh2.controller;

import com.example.thithuchanh2.model.Type;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
public class BookController {
    @GetMapping
    public ModelAndView showHome(){
        ModelAndView view = new ModelAndView("home");
        Type[] enumValues = Type.values();
        view.addObject("enumValues", enumValues);
        return view;
    }
}
