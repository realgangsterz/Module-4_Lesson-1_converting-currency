package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Converter {
    @GetMapping("/convert")
    public String inputConvert(){
        return "input";
    }

    @GetMapping("/doConvert")
    public String outputConvert(@RequestParam double rate ,@RequestParam(value = "usd",defaultValue = "0") double usd, Model result){
        double convertRate = rate;
        double inputCurrency = usd;
        double outputCurrency = convertRate*inputCurrency;
        result.addAttribute("result",outputCurrency);
        return "output";
    }
}
