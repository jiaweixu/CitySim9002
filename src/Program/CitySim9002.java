/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.util.Random;

import Domain.Validator;
import Domain.Constant;
import Domain.Visitor;
import Domain.Generator;

/**
 *
 * @author AsphaltPanthers
 */
public class CitySim9002 {

    public static String errorMessage = "Please enter one integer argument, seed";

    public static void main(String[] args) {
        int seed =0;
        int visitorID;
        String visitorName;
        Visitor visitor = new Visitor();
        String location;
        

        if (new Validator().validateArguments(args)) {
            //           return 0;
            seed = Integer.parseInt(args[0]);
            System.out.println("Welcome to CitySim! Your seed is " + seed + ".");
        } else {
            System.out.println(errorMessage);
            System.exit(0);
        }
        
        Random rn = new Random(seed);
        
        
        for (int i = 1; i <= Constant.NUMBER_OF_VISITORS; i++) {
            // visitor coming
            visitorID = i;
            visitorName = Generator.generateVisitorType(rn);
            visitor.setName(visitorName);

            System.out.println("Visitor " + visitorID + " is a " + visitor.getName() + ".");

            // visitor start visiting the first place
            location = Generator.generateFirstLocation(rn);
            visitor.visitLocation(visitorID, location);

            // visitor continues visiting
            location = Generator.generateNextLocation(rn);

            while (location != "Leave") {
                visitor.visitLocation(visitorID, location);
                location = Generator.generateNextLocation(rn);
            }

            System.out.println("Visitor " + visitorID + " has left the city.");
            System.out.println("***");

        }

    }
}
