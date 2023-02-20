package nl.donyell.springmvc.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    // Need controller method to show initial HTML form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // Need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    // Add controller method to read form data
    // add data to the model

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {
        // Read the request parameter from the HTML form
        String studentName = request.getParameter("studentName");

        // Convert the data to all caps
        String uppercaseName = studentName.toUpperCase();

        // Create the message
        String result = "Yo! " + uppercaseName;

        // Add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }
    @RequestMapping("/processFormVersionThree")
    public String requestParamForm(
            @RequestParam("studentName") String studentName,
            Model model
    ) {
        // Convert the data to all caps
        String uppercaseName = studentName.toUpperCase();

        // Create the message
        String result = "Yo! " + uppercaseName;

        // Add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }
}
