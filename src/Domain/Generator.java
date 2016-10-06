/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.Random;

/**
 *
 * @author jx
 */
public class Generator {
    
    // generate visitor type: one of the four 
    public static String generateVisitorType(Random rn){
        String type;
        int rnNumber = rn.nextInt(Constant.NUMBER_OF_TYPE);
        type = Constant.VISITOR_TYPE[rnNumber];
        return type;
    }
    
    // generate visitor type: one of the four 
    public static String generateFirstLocation(Random rn){
        String type;
        int rnNumber = rn.nextInt(Constant.NUMBER_OF_LOCATION);
        type = Constant.LOCATION_TYPE[rnNumber];
        return type;
    }
    
    // generate visitor type: one of the file (adding "Leave")    
    public static String generateNextLocation(Random rn){
        String type;
        int rnNumber = rn.nextInt(Constant.NUMBER_OF_LOCATION+1);
        type = Constant.LOCATION_TYPE[rnNumber];
        return type;
    }      
    
}
