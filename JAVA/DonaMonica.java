
//Auto: Henrique Grissi
public class DonaMonica {
    public static int idadeMaisVelho (int monica, int filho1, int filho2){
        int filho3 = 0, maisVelho = 0;
        filho3 = monica - filho1 - filho2; //Cáculo para achar a idade do filho 3
        //Condições para saber qual filho é o mais velho.
        if (filho1 > filho2 && filho1 > filho3 ){
            maisVelho = filho1;
        }
        else if (filho2 > filho3 && filho2> filho1){
            maisVelho = filho2;
        }
        else if (filho3 > filho2 && filho3 > filho1){
            maisVelho = filho3;
        }
        return maisVelho;
    }
    public static void main(String args[]) {
        int monica = MyIO.readInt();//Lê as idade de monica
        int filho1, filho2;
        do{
            filho1 = MyIO.readInt(); //Recebe idades
            filho2 = MyIO.readInt(); //Recebe idades
            MyIO.print(idadeMaisVelho(monica,filho1,filho2)+"\n");//Chama o método e printa a idade do mais velho
            //Recebe nova idade e testa
            monica = MyIO.readInt(); //Recebe nova idade e testa
        }while (monica != 0);
    }
}