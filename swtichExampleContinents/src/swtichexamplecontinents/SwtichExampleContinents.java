/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swtichexamplecontinents;

/**
 *
 * @author caramel_mom_98
 */
public class SwtichExampleContinents {

    public static void main(String[] args) {
        /*This program will print out the largerst city in a continent based on an integer.
         */
        int continent = 1;
        String printLargest;
        switch (continent) {
            case 1:
                printLargest = "North America: Mexico City, Mexico";
                break;
            case 2:
                printLargest = "South America: Sao Paulo, Brazil";
                break;
            case 3:
                printLargest = "Europe: Moscow, Russia";
                break;
            case 4:
                printLargest = "Africa: Lagos, Nigera";
                break;
            case 5:
                printLargest = "Asia: Shanghai, China";
                break;
            case 6:
                printLargest = "Australia: Sydney, Australia";
                break;
            case 7:
                printLargest = "Antartica: McMurdo Station, US";
                break;
            default:
                printLargest = "Undefined continent!";
                break;
        }

        System.out.println(printLargest);

    }
}
