package ru.itpark.stepik11;

public class Robot {
    int x = 5;
    int y = 1;
    Direction direction = Direction.LEFT;

    public Direction getDirection() {
        return direction; // текущее направление взгляда
    }

    public int getX() {
        return x; // текущая координата X
    }

    public int getY() {
        return y; // текущая координата Y
    }

    public void turnLeft() {

        if (direction == Direction.UP) {
            this.direction = Direction.LEFT;
            return;
        }

        if (direction == Direction.RIGHT) {
            this.direction = Direction.UP;
            return;
        }

        if (direction == Direction.DOWN) {
            this.direction = Direction.RIGHT;
            return;
        }

        if (direction == Direction.LEFT) {
            this.direction = Direction.DOWN;
        }
    }

    public void turnRight() {

        if (direction == Direction.UP) {
            this.direction = Direction.RIGHT;
            return;
        }

        if (direction == Direction.RIGHT) {
            this.direction = Direction.DOWN;
            return;
        }

        if (direction == Direction.DOWN) {
            this.direction = Direction.LEFT;
            return;
        }

        if (direction == Direction.LEFT) {
            this.direction = Direction.UP;
        }
    }

    public void stepForward() {

        if (direction == Direction.UP) {
            this.y++;
        }

        if (direction == Direction.RIGHT) {
            this.x++;
        }

        if (direction == Direction.DOWN) {
            this.y--;
        }

        if (direction == Direction.LEFT) {
            this.x--;
        }
    }
}
