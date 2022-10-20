package ru.itpark.stepik11;

public class Stepik11 {
    public static void Task11() {

        Robot robot = new Robot();
        moveRobot(robot, 5, 2);
    }

    public static void moveRobot(Robot robot, int toX, int toY) {

        if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                if (robot.getDirection() == Direction.UP) robot.turnLeft();
                else robot.turnRight();
            }
            while (robot.getX() != toX) robot.stepForward();
        } else if (robot.getX() < toX)
            while (robot.getDirection() != Direction.RIGHT) {
                if (robot.getDirection() == Direction.DOWN) robot.turnLeft();
                else robot.turnRight();
            }
        while (robot.getX() != toX) robot.stepForward();

        if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                if (robot.getDirection() == Direction.LEFT) robot.turnLeft();
                else robot.turnRight();
            }
            while (robot.getY() != toY) robot.stepForward();
        } else if (robot.getY() < toY)
            while (robot.getDirection() != Direction.UP) {
                if (robot.getDirection() == Direction.RIGHT) robot.turnLeft();
                else robot.turnRight();
            }
        while (robot.getY() != toY) robot.stepForward();

        System.out.println("Sample Output: ");
        System.out.println("Robot coord X: " + robot.getX());
        System.out.println("Robot coord Y: " + robot.getY());
    }
}
