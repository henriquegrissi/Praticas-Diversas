/*Faça um programa que e recebe uma string como parametro e
retorna true se essa é um palindromo. Na saıda padrão, para cada linha de entrada, escreva
uma linha de saída com SIM/NAO indicando se a linha é um palíndromo. Destaca-se que uma 
linha de entrada pode ter caracteres não letras. A entrada termina com a leitura de FIM.*/
//Autor: Henrique Grissi
#include <string.h>
#include <stdio.h>
#include<stdbool.h>
#define TAM 700
int fim (char r[TAM],int tam){
    int resp = 0; //False
    if(tam == 2 && r[0] == 'F' && r[1] == 'I' && r[2] == 'M'){
        return resp;
    }else{
        resp = 1;//true
    }
    return resp;
}
int main (void){
    char palavra[700];
    int tam, c; //Váriável do tamanho da string
    fgets(palavra, 700, stdin);
    tam = strlen(palavra);//Usando a função "strlen" para saber qual é o tamanho da string (não considera o caractere NULL)
    tam -= 2; //Ajustando para o tamanho do array
    c = fim(palavra,tam);
    while(c){
        for(int i=0;i<=tam;i++){
            if(palavra[i] != palavra[tam]){
              printf("NAO\n");
              break; //Interrompe o loop, para não printar "NÃO" mais de uma vez 
            }
            else{
                printf("SIM\n");
                break; //Interrompe o loop, para não printar "SIM" mais de uma vez 
            }
            tam--;
        }
      //Recebendo informações da nova palavra que será lida
      fgets(palavra, 700, stdin); //Input
      tam = strlen(palavra); //Saber o tamanho da nova String 
      tam -= 2; //Ajustando o tamanho para o tamanho do array.
      c = fim(palavra,tam); //Chama a função para testar "FIM"
    }
  return 0;
}