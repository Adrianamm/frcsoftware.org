/*
 * Copyright 2026 FRCSoftware
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

boolean condition = true;

void main() {
    // [whileSyntax]
    while (condition) {
    // code to run when condition is true
    }
    // [/whileSyntax]

    // [whileExample]
    int i = 0; 
    while (i < 6) {
        System.out.println(i); // prints 0, 1, 2, 3, 4, 5
        i++;
    }
    // [/whileExample]

    // [whileExample2]
    int autoTime = 0;
    while (autoTime <= 15){
        System.out.println("AutoMode is happening");
        autoTime++;
    }
    // [/whileExample2]


    // [forExample]
    for (int i = 0; i < 5; i++){
        System.out.println(i); // prints 0, 1, 2, 3, 4
    }
    // [/forExample]

    // [Infinite1]
    int timer = 0;
    while (timer < 7){
        drivetrain.setThrottle(1); // sets drive motors to full speed 
    }
    // [/Infinite1]

    // [Infinite2]
    int timer = 0;
    while (timer < 7){
        drivetrain.setThrottle(1); // sets drive motors to full speed 
        timer++; // increments timer by 1
    }
    // [/Infinite2]
}