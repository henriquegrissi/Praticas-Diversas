//Autor: Henrique Grissi
#include <stdio.h>
int maisVelho (int monica, int filho1, int filho2) {
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
int main (void){
    int monica, filho1,filho2;
    scanf("%d",&monica);
    do{
        scanf("%d",&filho1);
        scanf("%d",&filho2);
         //Calculando a idade do mais velho
        printf("%d\n",maisVelho(monica, filho1, filho2)); //Printa chamando o método
        scanf("%d",&monica);
    }while(monica != 0);
    return 0;
}