package cat.itacademy.s04.t01.n02.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HelloWorld2")
public class HelloWorld2Controller {

    @GetMapping({"/","/{name}"})
    public String saluda2 (@PathVariable (required = false) String name){

        if (name==null || name.isEmpty()){

            name= "Unknown";
        }


    String saluda2 = "Hola " + name + ", estas ejecutando un proyecto gradl";

        return  saluda2;

    }

}
