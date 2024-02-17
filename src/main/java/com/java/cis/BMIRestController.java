package com.java.cis;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class BMIRestController
{
    @PostMapping("/bmirest")
    public String calculateBMI(@RequestParam("height") double height, @RequestParam("weight") double weight) {
        // Calculate BMI
        double bmi = calculateBMIValue(height, weight);

        // Convert BMI to String
        return String.format("Your BMI is: %.2f", bmi);
    }

    private double calculateBMIValue(double height, double weight) {
        // Formula: BMI = weight / (height * height)
        return weight / (height * height);
    }
}
