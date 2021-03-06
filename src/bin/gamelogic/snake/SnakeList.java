package bin.gamelogic.snake;

public class SnakeList {
    private int size=2;
    private SquareDOT head;
    private SquareDOT second;
    private SquareDOT last;


    SnakeList(String color){
        this.head = new SquareDOT("#d44a0e");
        this.second = new SquareDOT(color);
        head.setNext(second);
        second.setPrevious(head);
        this.last = second;
    }

    public void add(SquareDOT dot){
        dot.setPrevious(last);
        last.setNext(dot);
        last = dot;
        size++;
    }

    public void add_second(SquareDOT dot){
        head.setNext(dot);
        second.setPrevious(dot);
        dot.setNext(second);
        second = dot;
    }

    public void delete_last(){
        last.getPrevious().setNext(null);
        last = last.getPrevious();
    }

    public int size() {
        return size;
    }

    public SquareDOT getHead() {
        return head;
    }

    public SquareDOT getLast() {
        return last;
    }

    public void setLast(SquareDOT last) {
        this.last = last;
    }
}
