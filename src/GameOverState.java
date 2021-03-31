public class GameOverState implements State {

    @Override
    public void doAction(Context context){
        System.out.println("*** Game is over ***");
        context.setState(this);
    }

    public String toString(){
        return "GameOver State";
    }
}
