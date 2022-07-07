package subsistema1crm;

public class CrmService {

    private CrmService(){
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado){
        System.out.println("O cliente: " + nome + " de " + cidade +
         "/" + estado + " foi salvo no sistema de CRM.");
    }
    
}
