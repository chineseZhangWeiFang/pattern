package state;

public class StopState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop here");
    }

    public String toString(){
        return "Stop State";
    }
}
