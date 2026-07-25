/*
 * Copyright 2026 FRCSoftware
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */
// [variables]
boolean condition = true;
int statement1 = 0;
boolean statement2 = true;
int statement3 = 1;
// [/variables]

void main() {
    // [whileSyntax]
    while (condition) {
    // code to run when condition is true
    }
    // [/whileSyntax]

    // [whileExample]
    int i = 0; 
    while (i < 6) {
        System.out.println(i);
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

    // [forSyntax]
    for (statement1; statement2; statement3) {
        // code to run when statement 2 is true
    }
    // [/forSyntax]

    // [forExample]
    for (int i = 0; i < 5; i++){
        System.out.println(i);
    }
    // [/forExample]

    // [forExample2]
    int timer = 0;
    while (timer < 7){
        drivetrain.setThrottle(1); // sets drive motors to full speed 
    }
    // [/forExample2]
}
