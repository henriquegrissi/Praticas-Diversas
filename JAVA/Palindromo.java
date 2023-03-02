/*Crie um m ́etodo iterativo que recebe uma string como parˆametro e
retorna true se essa  ́e um pal ́ındromo. Na sa ́ıda padr ̃ao, para cada linha de entrada, escreva
uma linha de sa ́ıda com SIM/N  ̃AO indicando se a linha  ́e um pal ́ındromo. Destaca-se que uma
linha de entrada pode ter caracteres n ̃ao letras. A entrada termina com a leitura de FIM.*/

import java.util.Scanner;  
public class Palindromo {
    public static boolean fim (String r){
        boolean fim = true;
        if (r.charAt(0) == 'F' && r.charAt(1) == 'I' && r.charAt(2) == 'M'){
            fim = false;
            return fim;
        }else{
            return fim;
        }

    }
    public static boolean palindromo (String p){
        int tam = 0;
        boolean pali = false;
        tam = p.length(); //atribuindo a variável tam o TAMANHO da string 
        tam--;
        for (int i=0; i<=tam; i++){
            if(p.charAt(i) != p.charAt(tam)){
                return pali;
            }else{
                pali = true;
            }
            tam--;
        }
        return pali;
    }
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        boolean resp = false; //True = palindromo, false = não palindromo
        String palavra = MyIO.readLine();
        while (fim(palavra)){  //Chama o método para confirmar se a palavra é "FIM" (enquanto for true o loop continua)
            resp = palindromo(palavra); //Chama o método de verificação do palíndromo
            if(resp==true){
                System.out.println("SIM");
            }else{
                System.out.println("NAO");
            }
            palavra = MyIO.readLine();
        }
        leitor.close();//"Fechando" o scanner 
    }         
}
