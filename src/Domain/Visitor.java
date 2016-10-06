/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author jx
 */
public class Visitor {
    private String name;
    private Boolean attitude; 
 
    // constructors
    public Visitor(String name){
        this.name = name;
    }
    public Visitor(){
    }
    
    // return the name
    public String getName(){
        return name;
    }
    
    // set the name
    public void setName(String inputName){
        this.name = inputName;
    }
    
    // retrun the atttitude: like: 1 or dislike 0
    public Boolean getAttitude(){
        return attitude;
    }
    
    // set the attitude based on the location and type
    public void setAttitude(String location){
        // student
        if(this.name == "Student"){
            switch(location){
                case "The Cathedral of Learning":
                    this.attitude = false;
                    break;
                case "Squirrel Hill":
                    this.attitude = true;
                    break;            
                case "The Point":
                    this.attitude = true;
                    break;
                case "Downtown":
                    this.attitude = true;
                    break;
                default:
                    System.out.println("No such place.");
                    System.exit(0);                    
            }        
        }
        
        // Professor
        if(this.name == "Professor"){
            switch(location){
                case "The Cathedral of Learning":
                    this.attitude = true;
                    break;
                case "Squirrel Hill":
                    this.attitude = true;
                    break;            
                case "The Point":
                    this.attitude = true;
                    break;
                case "Downtown":
                    this.attitude = true;
                    break;    
                default:
                    System.out.println("No such place.");
                    System.exit(0);
            }        
        }        
        
        // Business Person
        if(this.name == "Business Person"){
            switch(location){
                case "The Cathedral of Learning":
                    this.attitude = false;
                    break;
                case "Squirrel Hill":
                    this.attitude = true;
                    break;            
                case "The Point":
                    this.attitude = false;
                    break;
                case "Downtown":
                    this.attitude = true;
                    break;
                default:
                    System.out.println("No such place.");
                    System.exit(0);                    
            }        
        }        
        //blogger
        if(this.name == "Blogger"){
            switch(location){
                case "The Cathedral of Learning":
                    this.attitude = false;
                    break;
                case "Squirrel Hill":
                    this.attitude = false;
                    break;            
                case "The Point":
                    this.attitude = false;
                    break;
                case "Downtown":
                    this.attitude = false;
                    break;
                default:
                    System.out.println("No such place.");
                    System.exit(0);                    
            }        
        }        
    }
    
    // arrange a visit
    public void visitLocation(int visitorID, String location){
        System.out.println("Visitor "+ visitorID + " is going to "+ location + ".");
        
        this.setAttitude(location);
        
        if (this.getAttitude()){
            System.out.println("Visitor "+ visitorID + " did like "+ location+ ".");
        }else{
            System.out.println("Visitor "+ visitorID + " did not like "+ location+ ".");
        }
    }
}
