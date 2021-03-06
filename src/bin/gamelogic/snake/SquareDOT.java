package bin.gamelogic.snake;

import bin.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class SquareDOT extends Rectangle{
    private SquareDOT previous;
    private SquareDOT next;
    SquareDOT(String color){
        setFill(Color.web(color));
        setWidth(11);
        setHeight(11);
        setStroke(Color.BLACK);
    }

    public boolean hasNext(){
        return next != null;
    }

    public SquareDOT getPrevious() {
        return previous;
    }

    public void setPrevious(SquareDOT previous) {
        this.previous = previous;
    }

    public SquareDOT getNext() {
        return next;
    }

    public void setNext(SquareDOT next) {
        this.next = next;
    }
}
