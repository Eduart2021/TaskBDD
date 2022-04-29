package com.ua.learning.project.automation.implementation.submit_registration;

import com.ua.learning.project.automation.BaseTest;
import com.ua.learning.project.models.Pages.LoginPage;
import com.ua.learning.project.models.entity.RegistrationForm;
import com.ua.learning.project.models.menu.AbcMenu;
import com.ua.learning.project.models.menu.CDIMenu;
import com.ua.learning.project.models.menu.MainMenu;
import com.ua.learning.project.utils.test_constants.TestConstants;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.HashSet;

public class SubmitRegistrationTest extends BaseTest {


    public SubmitRegistrationTest(){};

    @Test
    public void loginSystem(){
        LoginPage link = new LoginPage();
        link.openWindow();
    }
    @Test
    public void callMenus(){
        AbcMenu abc = new AbcMenu();
        abc.selectMenu();
        CDIMenu cdi = new CDIMenu();
        cdi.selectMenu();
        MainMenu mm = new MainMenu();
        mm.selectMenu();
    }
    @Test
    public void getRegister(){

       TestConstants tc = new TestConstants();

        RegistrationForm rf = new RegistrationForm(tc.NAME,tc.LASTNAME, tc.DATEofBIRTH, tc.AGE);
        System.out.println("RegistrationForm "+rf.fName()+", "+rf.lName()+", "+rf.bDay()+", "+rf.hashCode());
    /** hashCode test*/
        System.out.println("");
        System.out.println(rf.CheckHashCode("Petrov"));

    }
///////Task 3,4,5

    @Test
    public void task5(){
        String findVowels = "abracadabra";
        String[] splited = findVowels.toLowerCase().trim().split("");
        String vowels = "aeiou";
        String res = "";

        for (int i=0; i < splited.length; i++){
            if(vowels.contains(splited[i])){
                res += splited[i];
            }
        }
        Assert.assertEquals(5,res.length(),"Nope!");
        System.out.println("Task 5: "+res.length());
    }
    @Test
    public void task6(){
        int[] initialOne = {2,1,3,5,4};
        int[] initialTwo = {3};
        HashSet<Integer> table = new HashSet<>();
        for (int i=0 ; i < initialOne.length; i++){
           for (int j=0 ; j < initialTwo.length ; j++) {
               if (!(initialOne[i] == initialTwo[j])) {
                   table.add(initialOne[i]);
               }
           }
        }
        System.out.println("Task 6: "+table);
    }
    @Test
    public void Task4(){
        String input1 = "aa";
        String input2 = "bb";
        String input3 = "cc";

        String[] inSplit1 = input1.split("");
        String[] inSplit2 = input2.split("");
        String[] inSplit3 = input3.split("");

        String result ="";
        for (int i=0 ; i < inSplit1.length; i++) {
            result += inSplit1[i] + inSplit2[i] + inSplit3[i];
        }
        System.out.println("Task 4: "+result);
    }

}
