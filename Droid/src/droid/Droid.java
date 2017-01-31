/*
 * In this project you will create a simple Droid (robot) that can be activated,
charged, and hover above ground. This project creates some baseline 
behaviors of the droid. The last level should be 80, but I haven't figured 
it out yet. 
 */
package droid;

public class Droid {

    int batteryLevel;

    public static void main(String[] args) {

        Droid droidB = new Droid();
        droidB.activate();
        droidB.chargeBattery(5);
        droidB.hover(2);
    }

    public Droid() {
        batteryLevel = 100;
    } //end Droid constructor

    void activate() {
        System.out.println("Activated. How may I help you?");
        batteryLevel = batteryLevel - 5;
        System.out.println("Battery level is: " + batteryLevel + " percent.");

    }// end activate method

    void chargeBattery(int hours) {
        System.out.println("Droid is charging...:::");
        batteryLevel = batteryLevel + hours;
        if (batteryLevel > 100) {
            batteryLevel = 100;
            System.out.println("Battery level is: " + batteryLevel + " percent.");
        } else {

            System.out.println("Battery level is: " + batteryLevel + " percent.");
        } //

    }//end chargeBattery method

    public int checkBatteryLevel() {

        System.out.println("Querying...Battery level is: " + batteryLevel + " percent.");
        return batteryLevel;
    }//end checkBatteryLevel method

    public void hover(int feet) {
        if (feet > 2) {
            System.out.println("Error! I cannot hover above 2 feet.");
        } else {
            System.out.println("Hovering...");
            batteryLevel = batteryLevel - 5;
            System.out.println("Battery level is: " + batteryLevel + " percent.");
        }
    } //end hover method
}
