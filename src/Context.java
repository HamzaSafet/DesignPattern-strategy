public class Context {

    private IStrategy iStrategy=null;

    public Context(){
        this.iStrategy=new DefaultStrategyImpl();
    }
    public void processe(){
        System.out.println("Etape 1 de l'algorithme");
        iStrategy.applyStrategy();
        System.out.println("Etape finale de l'algorithme");
    }

    public void setiStrategy(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }
}
