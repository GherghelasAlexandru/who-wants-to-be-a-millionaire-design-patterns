public class ChoosingState implements State {
    @Override
    public void doAction(Context context){
        System.out.println("*** Choosing state ***");
        context.setState(this);
    }

    public String toString(){
        return "Choosing State";
    }
}
