public class Funcao {
    //Funcao - sem retorno - sem parametro
    void hello(){
        System.out.println("Ola!");
    }

    //Funcao - sem retorno - com parametro
    void hello1(String nome){
        System.out.println("Ola" + nome + "!");
    }

    //Funcao - com retorno - sem parametro
    String hello3(){
        return "Ola!";
    }

    //Funcao - com retorno - com parametro
    String hello4(String nome){
        return "Ola," + nome + "!";
    }

    public static void main(String[] args){
        new Funcao().hello();

        new Funcao().hello1("Joao Victor");

        String x = new Funcao().hello3();
        System.out.println(x);

        String y = new Funcao().hello4("Valeska");
        System.out.println(y);
    }
}
