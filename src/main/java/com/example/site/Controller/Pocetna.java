package com.example.site.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Pocetna {

    @GetMapping("/Pocetna")
    public String Pocetna() {
        return "Pocetna/pocetna"; // Ovdje se vraća putanja do HTML datoteke u templates direktoriju
    }
}

