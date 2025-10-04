public class Conversao {
    public static void main(String[] args) {
        double salario = 1800.57;
        int salarioInteiro = (int) salario; // conversão explícita
        System.out.println(salario + " " + salarioInteiro);

        int numInteiro = 10;
        float numFloat = numInteiro; //conversão implícita
        System.out.println(numFloat);
    }
}
