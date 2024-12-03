public class segment {
    private int extr1;
    private int extr2;

    public segment(int extr1, int extr2) {
        this.extr1 = extr1;
        this.extr2 = extr2;
    }

    public int getExtr1() {
        return extr1;
    }

    public int getExtr2() {
        return extr2;
    }

    public void setExtr1(int extr1) {
        this.extr1 = extr1;
    }

    public void setExtr2(int extr2) {
        this.extr2 = extr2;
    }

    public int longueur() {
        return extr2 - extr1;
    }

    public boolean appartient(int point) {
        return point >= extr1 && point <= extr2;
    }


    public String toString() {
        return "Segment (" + extr1 + ", " + extr2 + ")";
    }
}