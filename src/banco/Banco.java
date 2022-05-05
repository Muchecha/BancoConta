package banco;
public class Banco {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(7777777);
        p1.abrirConta("CC");
        p1.setDono("Murilo");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(33333333);
        p2.abrirConta("CP");
        p2.setDono("Caroline");
        
      
        p1.depositar(100);
        p2.depositar(1000);
        p2.sacar(750);
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
}
