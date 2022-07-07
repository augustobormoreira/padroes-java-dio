import facade.Facade;
import singleton.*;
import strategy.*;


public class Test {
    public static void main (String [] args){
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Strategy
        
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setcomportamento(normal);

        robo.mover();
        robo.mover();
        robo.setcomportamento(defensivo);
        robo.mover();
        robo.setcomportamento(agressivo);
        robo.mover();

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Andre", "142511165");
    
    }
}
