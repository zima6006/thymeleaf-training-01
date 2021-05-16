package pl.zima6006.tymeleafhelloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/car")
    public  String getCar(Model model){
        Car car1 = new Car("Audi","80");
        Car car2 = new Car("Bentley","super");
        Car car3 = new Car("Citroen","C5");
        Car car4 = new Car("Dacia","Doper");
        Car car5 = new Car("Fiat","Abart");

        List<Car> cars =Arrays.asList(car1,car2,car3,car4,car5);

        model.addAttribute("cars", cars);

        for(Car car :cars){
            System.out.println("a");
        }

        return "car";
    }
}
