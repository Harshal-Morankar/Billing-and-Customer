package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
    @GetMapping("customerfallback")
    public String customerFallBack(){
        return "Customer Service Is Down Please Wait!!!!";

    } @GetMapping("billingfallback")
    public String billingFallBack(){
        return "Billing Service Is Down Please Wait!!!!";

    }

}
