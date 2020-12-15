package cz.educanet.webik;

public class CounterResource{

    private int counter = 0;

    public int getCounter(){
        return counter;
    }

    public void add() {
        this.counter ++;
    }
}