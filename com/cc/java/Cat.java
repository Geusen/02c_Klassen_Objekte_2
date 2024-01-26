package com.cc.java;

public class Cat {

  private String name;
  private String furColor;
  private int age; 
  private int counter;




  public Cat(String name, String furColor, int age) {
    this.name = name;
    this.furColor = furColor;
    this.age = age;
  }

  public String getStringAttributes(String op) {
  switch (op) {
    case "#name":
      return name;
    case "#color":
      return furColor;
    default:
      return "ERROR!";
  }
}

  public String getAge() {
    return checkCompliance();
    
  }

  private String checkCompliance() {
    counter++;
    return switch (counter){
        case 1 -> "This is an inappropriate question!";
        case 2 -> "i#ve told you once!";
        case 3 -> "Talk to the hand!";
        default -> "1#!?&&%";
    };
}
}
   
 
  




  
