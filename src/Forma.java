public class Forma {
    private Integer x;
    private Integer y;

    public Forma(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer calcolaArea() {
        if (x < 0 || y < 0) {
            return null;
        } else if (x == null || y == null) {
            return null;
        } else {
            return x * y;
        }
    }
}