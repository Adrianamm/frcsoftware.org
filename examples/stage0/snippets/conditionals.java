boolean condition_A;
boolean condition_B;
boolean condition;

public Drivetrain drivetrain = new drivetrain();

void main() {
   
    // [ifSyntax]
    if (condition) {
    // code to run when condition is true
    }
    // [/ifSyntax]

    //[ifExample]
    double distance = 6;
    if (distance < 10) {
        System.out.println("Motors are spinning");
        drivetrain.setThrottle(1); // runs the motor at full speed
    }
    // [/ifExample]

    // [elseIfSyntax]
    if (condition_A) {
    // code to run when condition_A is true
    } else if (condition_B) {
        // code to run when Condition_B is true
    }
    // [/elseIfSyntax]

    // [elseIfExample]
    double distance = 15;
    if (distance < 10) {
        System.out.println("Motors are half speed");
        drivetrain.setThrottle(0.5); // runs the motors at half speed
    } else if (distance > 10) {
        System.out.println("Motors are at full speed");
        drivetrain.setThrottle(1); // runs the motors at full speed
    }
    // [/elseIfExample]

    // [ifElseSyntax]
    if (condition) {
    // block of code to be executed if the condition is true
    } else {
    // block of code to be executed if the condition is false
    }
    // [/ifElseSyntax]

    // [elseExample]
    double distance = 21;
    if (distance < 10) {
        System.out.println("Motors are at half speed");
        drivetrain.setThrottle(0.5); // runs the motors at half speed
    } else {
        System.out.println("Motors are not spinning");
        drivetrain.setThrottle(0); // stops the motors
    }
    // [/elseExample]

    //[conditionalExample]
        double distance = 21;
    if (distance < 10) {
        System.out.println("Motors are at half speed");
        drivetrain.setThrottle(0.5); // runs the motors at half speed
    } else if (distance <= 20) {
        System.out.println("Motors are at full speed");
        drivetrain.setThrottle(1); // runs the motors at full speed
    } else {
        System.out.println("Motors are not spinning");
        drivetrain.setThrottle(0); // stops the motors
    }
    //[/conditionalExample]

}