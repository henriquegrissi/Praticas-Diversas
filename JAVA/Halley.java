
//Autor: Henirque Grissi
public class Halley {
        public static void main(String args[]) {
        int ano = MyIO.readInt(); //Recebe o primeiro ano
        int passagem = 0;
        while (ano != 0){
            passagem = ano + 76; //Calcula quandos erá a passagem
            System.out.println(passagem);
            ano = MyIO.readInt(); //Recebe outro ano e testa no loop
        }
    }
}
