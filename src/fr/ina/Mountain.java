package fr.ina;

public class Mountain {
    private Position position;

    public Mountain(Integer x, Integer y) {
        this.position = new Position(x, y);
    }

    public Mountain(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
