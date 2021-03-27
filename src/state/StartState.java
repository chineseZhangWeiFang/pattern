package state;

public class StartState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start here");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
