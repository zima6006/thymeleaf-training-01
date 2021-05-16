package pl.zima6006.tymeleafhelloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    private List<Car> cars = new ArrayList<>();

    public CarController() {
        Car car1 = new Car("Audi","80");
        Car car2 = new Car("Bentley","super");
        Car car3 = new Car("Citroen","C5");
        Car car4 = new Car("Dacia","Doper");
        Car car5 = new Car("Fiat","Abart");
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
    }

    @GetMapping("/car")
    public  String getCar(Model model){

        model.addAttribute("cars", cars);
        model.addAttribute("newCar", new Car());
        return "car";
    }

    @PostMapping("/add-car")
    public String addCar(@ModelAttribute Car car){
        System.out.println(car);
        cars.add(car);
        return "redirect:/car";
    }

}
