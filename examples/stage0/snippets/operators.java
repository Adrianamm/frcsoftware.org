/*
 * Copyright 2026 FRCSoftware
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */
// [variables]
int answer1 = 2 + 4;
int answer2 = 6 / 3;
int answer3 = 10 - 3;
// [/variables]

void main() {
    // [multiplication]
    int magicNumber = 6;
    System.out.print(magicNumber * 2);
    // [/multiplication]

    // [increments]
    int x = 6;
    int y = 7;

    System.out.println(++x);
    System.out.println(--y);
    // [/increments]

    // [arithmetic]
    int A = 10;
    int B = 5;
    A += 1;
    B -= 1;

    System.out.println(A); // prints 11
    System.out.println(B); // prints 4
    // [/arithmetic]

    // [comparison]
    int C = 2;
    int D = 4;
    System.out.print(A > B);
    // [/comparison]

    // [logical]
    boolean AnswerOne = 5 > 3; // True
    boolean AnswerTwo = 9 < 2; // False

    System.out.println(AnswerOne && AnswerTwo);
    System.out.println(AnswerOne || AnswerTwo);
    System.out.println(!AnswerOne);
    // [/logical]
}
