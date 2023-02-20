package nl.donyell.springmvc.controller;

import jakarta.validation.Valid;
import nl.donyell.springmvc.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class CustomerController {

    public String processForm(
            @Valid
            @ModelAttribute("customer")Customer customer,
            BindingResult bindingResult
    ) {
        if (bindingResult.hasErrors()) {

        }
        return "";
    }
}
