/*
 * Copyright 2026 FRCSoftware
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

void main() {
 
    //[logicError1]
    int width = 2;
    int height = 5;
    int area = width + height; 
    System.out.println("Area of the rectangle is " + area);
    //[/logicError1]
    
    //[runtime]
    int answer = 10 / 0;
    System.out.println(answer);
    //[/runtime]

}