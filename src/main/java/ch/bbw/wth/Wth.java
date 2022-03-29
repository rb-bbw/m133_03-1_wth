package ch.bbw.wth;

public class Wth {
    private double wth;
    private int height;
    private int waist;

    public void calculateWth(){
        this.wth = (double) this.waist / height;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getWaist() {
        return waist;
    }
    public void setWaist(int waist) {
        this.waist = waist;
    }

    public double getWth() {
        return wth;
    }
    public void setBmi() {
        calculateWth();
    }

    public String toString() {
        return this.height + ", " + this.waist + ", " + getWth();
    }
}
