public class referencia {
    public static void main(String[] args) {
        String meuNome = new String("rato");

        int tamanhoNome = meuNome.length();
        System.out.println(tamanhoNome);

        meuNome = meuNome.concat(" da Silva");
        // concatena ao final da string

        tamanhoNome = meuNome.length();
        System.out.println(tamanhoNome);

        System.out.println(meuNome);

    }
}
