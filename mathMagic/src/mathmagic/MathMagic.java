/*
 * Angela Andrews
 * Codecademy Project: Math Magic
 * 1/26/17
 */
package mathmagic;

public class MathMagic {

    public static void main(String[] args) {
        int myNumber = 419; //pick any int
        int stepOne = myNumber * myNumber; //multiply the original number by itself & assign it.
        int stepTwo = stepOne + myNumber; //This is the number squared then added then assigned.
        int stepThree = stepTwo / myNumber;//take the previous number and divide it by the orginal number.
        int stepFour = stepThree + 17; //this is the magic, little old 17. Getting added to the previous step.
        int stepFive = stepFour - myNumber;//Previous # minus orginal number
        int stepSix = stepFive / 6;// now divide by 6.

        System.out.println(stepSix); //no matter what you enter at myNumber, you'll get the same answer.

    } //end main()
} //end class Magic
