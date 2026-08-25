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
}