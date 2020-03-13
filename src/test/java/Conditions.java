
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conditions extends BaseUI {
    //public class Conditions {
    @Test
    public void test1() {
        String fruit1 = "";
        String fruit2 = "";

        if (fruit1.contains("kiwi")) {
            System.out.println("We can find our fruit 1!");
        }
        if (fruit2.contains("orange")) {
            System.out.println("We can find our fruit 2 !!!!!!");
        } else {
            Assert.fail("We can't find our fruit");
        }
    }

    @Test
    public void test2() {
        String fruit11 = "kiwi";
        String fruit22 = "kiwi";

        if (fruit22.contains("orange") && fruit11.contains("kiwi")) {
            System.out.println("We can find our fruit 1!");
        }
        if (fruit22.contains("orange")) {
            System.out.println("We can find our fruit 2 !!!!!!");
        } else {
            Assert.fail("We can't find our fruit");
        }
    }

    @Test
    public void test3() {
        String fruit111 = "kiwi";
        String fruit222 = "kiwi";

        if (fruit222.contains("orange") || fruit111.contains("kiwi")) {
            System.out.println("We can find our fruit 1!");
        }
        if (fruit222.contains("orange")) {
            System.out.println("We can find our fruit 2 !!!!!!");
        } else {
            Assert.fail("We can't find our fruit");
        }
    }

    @Test
    public void test4() {
        int number = 10;
        int sum;
        if (number == 10 + 5) {
            sum = 95 + 100;
        } else {
            sum = 100 - 95;
        }
        System.out.println(sum);
    }

    @Test
    public void test5() {
        boolean requirement = true;
        if (requirement) {
            System.out.println("Boolean is true!");
        } else {
            Assert.fail("Boolean is false");
        }
    }

    @Test
    public void test6() {
        boolean requirement6 = true;
        if (!requirement6) {
            System.out.println("Boolean is true!");
        } else {
            Assert.fail("Boolean is false");
        }
    }

    @Test
    public void test7() {
        boolean requirement7 = false;
        if (!requirement7) {
            System.out.println("Boolean is true!");
        } else {
            Assert.fail("Boolean is false");
        }
    }

    @Test
    public void test8() {
        WebElement tabSearch = driver.findElement(Locators.LINK_SEARCH);
        if (tabSearch.getText().contains("PRETTY WOMEN")) {
            tabSearch.click();
        } else {
            Assert.fail("We can't find Pretty Women tab");
        }
    }

    @Test
    public void test9() {
        WebElement tabSearch9 = driver.findElement(Locators.LINK_SEARCH);
        if (tabSearch9.isDisplayed()) {
            tabSearch9.click();
        } else {
            Assert.fail("We can't find Pretty Women tab");
        }
    }

    @Test
    public void test10() {
        WebElement tabSearch10 = driver.findElement(Locators.LINK_SEARCH);
        if (driver.findElement(Locators.LINK_SEARCH).getText().contains("PRETTY WOMEN")) {
            tabSearch10.click();
        } else {
            Assert.fail("We can't find Pretty Women tab");
        }
    }

// verify - checkbox(or radiobutton) is selected or not   Remember: this verification only for radiobutton or checkbox!!!
    @Test
    public void test11() {
        mainPage.clickJoinButton();

        WebElement checkbox = driver.findElement(Locators.CHECKBOX);

        if (!checkbox.isSelected()) {
            checkbox.click();
            System.out.println("Checkbox is selected");
        }
    }


//                                          ARRAY LIST

// get specific data from List
    @Test
    public void test12() {
        ArrayList<String> crunchifyList1 = new ArrayList<>(Arrays.asList("kiwi", "orange", "melon"));
        String element = crunchifyList1.get(0);
        System.out.println(element);
    }

// print List
    @Test
    public void test13() {
        ArrayList<String> crunchifyList13 = new ArrayList<>(Arrays.asList("kiwi", "orange", "melon"));
        if (crunchifyList13.contains("orange")) {
            System.out.println(crunchifyList13);
        }
    }


    @Test
    public void test14() {
        List<Integer> crunchifyList13 = new ArrayList<>(Arrays.asList(5, 10, 19));
        int sum = crunchifyList13.get(1) + crunchifyList13.get(2);
        System.out.println(sum);
    }


//                                           FOR-LOOP


//  how many elements List has
//  print all elements of List (WebElements type)
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
    public void test15() {
        List<WebElement> list = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            String info = list.get(i).getText();
            System.out.println(info);
            list.get(i).click();

            //after click() will be redirection from Main Page to different page with different url
            // this line of code for back to Main Page
            driver.get(Data.MAIN_URL);

            // it's necessary to collect web elements for List again, because for Selenium they have different id
            // this line of code for creating a new List after each iteration
            list = driver.findElements(Locators.TAB_OF_MAIN_PAGE);

        }
    }


//                                            FOR_LOOP for integer items of List
// get integer elements of List
    @Test
    public void test16() {
        List<Integer> list16 = new ArrayList<>(Arrays.asList(5, 10, 19));
        for (int i = 0; i < list16.size(); i++) {
            int element = list16.get(i);
            System.out.println(element);
        }
    }


// add some value to List (it should be integer) and print size of List
    @Test
    public void test17() {
        List<Integer> list17 = new ArrayList<>(Arrays.asList(5, 10, 19));
        System.out.println(" ");
        System.out.println("List17:   " + list17);
        System.out.println(" ");
        int sizeBeforeAddingElements = list17.size();
        System.out.println("Size of list17 before adding the elements: " + sizeBeforeAddingElements);
        System.out.println(" ");
        list17.add(11);
        int sizeAfterAddingElements = list17.size();
        System.out.println("Size of list17 after adding the elements:  " + sizeAfterAddingElements);
        for (int i = 0; i < list17.size(); i++) {
            int element = list17.get(i);
            System.out.println(" ");
            System.out.println((i + 1) + " element of list17:  " + element);
        }
        System.out.println(" ");
        System.out.println("List17:   " + list17);
    }


//                                            FOR_LOOP for String elements of List
// add String elements to List
// verification for element of List - Does an element contain this text "abs"?
    @Test
    public void test18() {
        List<String> list18 = new ArrayList<>(Arrays.asList("apple", "kiwi", "orange"));

        list18.add("melon");
        System.out.println(" ");
        System.out.println(list18);
        for (int i = 0; i < list18.size(); i++) {
            String element = list18.get(i);
            if (element.contains("me")) {
                System.out.println(" ");
                System.out.println(" Melon is inside list");
            }
        }
    }


// change String element in List, which contains "abc" text and then again verify - Does an element contain this text "abs"?
// if contains - print this new element
// print iteration for us because we want to verify -  What iteration we have now?
    @Test
    public void test19() {
        String phrase = "Melon is inside list";
        List<String> list19 = new ArrayList<>(Arrays.asList("apple", "kiwi", phrase));

        list19.add("Melon");
        System.out.println(" ");
        System.out.println(list19);
        for (int i = 0; i < list19.size(); i++) {
            String element = list19.get(i);
            System.out.println(" ");
            System.out.println(i + " iteration");
            if (element.contains("Me")) {
                System.out.println(" ");
                System.out.println(phrase);
            }
        }
    }


// add more conditions in the code "if - else",  use method ".equals()", "continue"
    @Test
    public void test20() {
        String phrase = "Mellon is inside list";
        List<String> list20 = new ArrayList<>(Arrays.asList("apple", "kiwi", phrase));

        list20.add("Melon");
        System.out.println(list20);
        for (int i = 0; i < list20.size(); i++) {
            String element = list20.get(i);
            System.out.println(i + " iteration");

            if (element.contains("apple")) {
                System.out.println(phrase);
                continue;
            }
            if (element.equals("orange")) {
                System.out.println("Orange");
            }
            if (element.contains("i")) {
                System.out.println("IIIII");
            } else {
                System.out.println("Bad loop");
            }
        }
    }


// add "break" in code
    @Test
    public void test21() {
        String phrase = "Mellon is inside list";
        List<String> list21 = new ArrayList<>(Arrays.asList("apple", "kiwi", phrase));

        list21.add("Melon");
        System.out.println(list21);
        for (int i = 0; i < list21.size(); i++) {
            String element = list21.get(i);
            System.out.println(i + " iteration");

            if (element.contains("apple")) {
                System.out.println(phrase);
                break;
            }
            if (element.equals("orange")) {
                System.out.println("Orange");
            }
            if (element.contains("i")) {
                System.out.println("IIIII");
            } else {
                System.out.println("Bad loop");
            }
        }
    }


    @Test
    public void test22() {
        String phrase = "Mellon is inside list";
        List<String> list22 = new ArrayList<>(Arrays.asList("apple", "kiwi", phrase));

        list22.add("Melon");
        System.out.println(list22);
        for (int i = 0; i < list22.size(); i++) {
            System.out.println(i + " iteration");
            break;
        }
    }


    @Test
    public void test23() {
        String phrase = "Mellon is inside list";
        List<String> list23 = new ArrayList<>(Arrays.asList("apple", "kiwi", phrase));

        list23.add("Melon");
        System.out.println(list23);
        for (int i = 0; i < list23.size(); i++) {
            System.out.println(i + " iteration");
            continue;
        }
    }


//                                            FOR-LOOP for WEB ELEMENTS

// go back to List of web elements "links" from test15() and edd some conditions into this test case
    @Test
    public void test24() {
        String expectedTitleHowWeWork = Data.TITLE_TEXT_CONTENT_PAGE;
        List<WebElement> links1 = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        System.out.println("Size of List web elements: " + links1.size());

        for (int i = 0; i < links1.size(); i++) {
            String info = links1.get(i).getText();
            System.out.println(info);
            links1.get(i).click();                         // link "HOW WE WORK"
            if (info.contains("WORK")) {
            // verify a title of Content Page "Ukrainian women for marriage"
                String actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText();
                Assert.assertEquals(expectedTitleHowWeWork, actualTitle);
            }
            // this line of code for back to Main Page
            driver.get(Data.MAIN_URL);

            // it's necessary to collect web elements for List again, because for Selenium they have different id
            // this line of code for creating a new List after each iteration
            links1 = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        }
    }


// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  SUPER TEST CASE  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

// This TEST CASE can be a pattern for a lot of new test cases (it can verify titles, images, element is displayed, element is present, and more)
    @Test
    public void test25() {
        String actualTitle;
        String actualUrlPrettyWomen;
        String expectedUrlPrettyWomen = Data.EXPECTED_URL_SEARCH;
        String expectedTitleHowWeWork = Data.TITLE_TEXT_CONTENT_PAGE;
        String expectedTitlePrettyWomen = Data.TITLE_TEXT_SEARCH_PAGE;
        List<WebElement> links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        System.out.println("Web Elements List size: " + links.size());

        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();

            if (info.contains("WORK")) {
                actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText();
                Assert.assertEquals(expectedTitleHowWeWork, actualTitle);
            }

            if (info.contains("PRETTY WOMEN")) {
                actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText();
                actualUrlPrettyWomen = driver.getCurrentUrl();

                // verification Title of the Page
                Assert.assertEquals(expectedTitlePrettyWomen, actualTitle);

                // verification - element is displayed
                Assert.assertEquals(actualUrlPrettyWomen, expectedUrlPrettyWomen);
                driver.findElement(Locators.IMAGE_ELEMENT_SEARCH_PAGE).isDisplayed();
            }

            driver.get(Data.MAIN_URL);
            links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        }
    }
}