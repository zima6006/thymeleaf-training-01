package pl.zima6006.tymeleafhelloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {

    @GetMapping("/car")
    public  String getCar(Model model){
        Car car = new Car("Fiat","Abart");

        model.addAttribute("name", "Michał");
        model.addAttribute("car",car);
        return "car";
    }
}
