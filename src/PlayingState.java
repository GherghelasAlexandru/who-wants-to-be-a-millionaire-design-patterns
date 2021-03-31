public class PlayingState implements State {

    @Override
    public void doAction(Context context){
        System.out.println("*** Game is currently running ***");
        context.setState(this);
    }

    public String toString(){
        return "Playing State";
    }
}
