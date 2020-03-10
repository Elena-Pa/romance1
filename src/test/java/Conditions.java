import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conditions extends BaseUI{

    @Test
    public void test1(){
        String fruit1 = "";
        String fruit2 = "";

        if(fruit1.contains("kiwi")){
            System.out.println("We can find our fruit 1!");
        }
        if(fruit2.contains("orange")){
            System.out.println("We can find our fruit 2 !!!!!!");
        }
        else{
            Assert.fail("We can't find our fruit");
        }
    }

    @Test
    public void test2(){
        String fruit11 = "kiwi";
        String fruit22 = "kiwi";

        if(fruit22.contains("orange") && fruit11.contains("kiwi")){
            System.out.println("We can find our fruit 1!");
        }
        if(fruit22.contains("orange")){
            System.out.println("We can find our fruit 2 !!!!!!");
        }
        else{
            Assert.fail("We can't find our fruit");
        }
    }

    @Test
    public void test3(){
        String fruit111 = "kiwi";
        String fruit222 = "kiwi";

        if(fruit222.contains("orange") || fruit111.contains("kiwi")){
            System.out.println("We can find our fruit 1!");
        }
        if(fruit222.contains("orange")){
            System.out.println("We can find our fruit 2 !!!!!!");
        }
        else{
            Assert.fail("We can't find our fruit");
        }
    }

    @Test
    public void test4(){
        int number = 10;
        int sum;
        if(number == 10 + 5){
            sum = 95 + 100;
        }else{
            sum = 100 -95;
        }
        System.out.println(sum);
    }

    @Test
    public void test5(){
         boolean requirement = true;
         if(requirement){
             System.out.println("Boolean is true!");
         }else {
             Assert.fail("Boolean is false");
         }
    }

    @Test
    public void test6(){
        boolean requirement6 = true;
        if(!requirement6){
            System.out.println("Boolean is true!");
        }else {
            Assert.fail("Boolean is false");
        }
    }

    @Test
    public void test7(){
        boolean requirement7 = false;
        if(!requirement7){
            System.out.println("Boolean is true!");
        }else {
            Assert.fail("Boolean is false");
        }
    }

    @Test
    public void test8() {
        WebElement tabSearch = driver.findElement(Locators.LINK_SEARCH);
        if (tabSearch.getText().contains("PRETTY WOMEN")){
            tabSearch.click();
    }else {
            Assert.fail("We can't find Pretty Women tab");
        }
    }

    @Test
    public void test9() {
        WebElement tabSearch9 = driver.findElement(Locators.LINK_SEARCH);
        if (tabSearch9.isDisplayed()){
            tabSearch9.click();
        }else {
            Assert.fail("We can't find Pretty Women tab");
        }
    }

    @Test
    public void test10() {
        WebElement tabSearch10 = driver.findElement(Locators.LINK_SEARCH);
        if (driver.findElement(Locators.LINK_SEARCH).getText().contains("PRETTY WOMEN")){
            tabSearch10.click();
        }else {
            Assert.fail("We can't find Pretty Women tab");
        }
    }

// verify - checkbox(or radiobutton) is selected or not

    @Test
    public void test11() {
        mainPage.clickJoinButton();

        WebElement checkbox = driver.findElement(Locators.CHECKBOX);

        if (!checkbox.isSelected()){
            checkbox.click();
            System.out.println("Checkbox is selected");
        }
    }


// ARRAY LIST

// to get specific data from  List
    @Test
    public void test12() {
        ArrayList <String> crunchifyList1 = new ArrayList<>(Arrays.asList("kiwi", "orange", "melon"));
        String element = crunchifyList1.get(0);
        System.out.println(element);
    }

// to get this list
    @Test
    public void test13() {
        ArrayList<String> crunchifyList13 = new ArrayList<>(Arrays.asList("kiwi", "orange", "melon"));
        if (crunchifyList13.contains("orange")) {
            System.out.println(crunchifyList13);
        }
    }


    @Test
    public void test14() {
        List <Integer> crunchifyList13 = new ArrayList<>(Arrays.asList(5, 10, 19));
        int sum = crunchifyList13.get(1) + crunchifyList13.get(2);
        System.out.println(sum);
    }



// !!!FOR-LOOP!!!

//  how many elements the list has
//  print all elements of list (Web elements)
//  click on every element(every link in this case, every time bach on main page)
/*
output:
8
HOME
HOW WE WORK
PRETTY WOMEN
PHOTOS
GIFTS
TOUR TO UKRAINE
BLOG
SIGN IN
*/

    @Test
    public void test15(){
        List<WebElement> links = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));
        System.out.println(links.size());

        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();
            driver.get(Data.mainUrl);
            links = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));
        }
    }
}
