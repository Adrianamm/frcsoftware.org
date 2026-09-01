/*
 * Copyright 2026 FRCSoftware
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

void main() {
    // [syntaxError]
    int number = 4;
    System.out.println(numer); // <- number is misspelled!
    // [/syntaxError]

    // [syntaxError2]
    int number = 4;
    Systme.out.println(number); // <- System is misspelled!
    // [/syntaxError2]

    //[logicError1]
    int width = 2;
    int height = 5;
    int area = width + height; 
    System.out.println("Area of the rectangle is " + area);
    //[/logicError1]

    // [logicError2]
    double alarmTime = 600; //This is 6:00AM, the time the alarm should go off
    boolean makeNoise; //If the alarm makes a noise or not

    if (alarmTime == 600) { // If alarm time is equal to 6:00AM
        makeNoise = false; // the alarm makes no noise 
    } else { // If the alarm time is anything but 6:00AM
        makeNoise = false; // the alarm makes no noise
    }
    // [/logicError2]
}