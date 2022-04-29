package com.ua.learning.project.models.Pages;

public abstract class BasePage{

    private String pageURL="http://www.google.com.ua";

   public BasePage (){

    }
    public void openWindow(){
        System.out.println(pageURL);
    }
}
