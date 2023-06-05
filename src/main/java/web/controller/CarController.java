package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String getListCar(Model model,
                             @RequestParam(defaultValue = "5") Integer count) {
        model.addAttribute("cars", new CarServiceImp().getListCar(count));
        return "cars";
    }
}
