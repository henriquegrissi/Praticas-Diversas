//Autor: Henrique Grissi
int main (void){
    int ano, passagem;
    scanf("%d",&ano); //Recebe primeiro ano
    while(ano != 0){ //Condição de parada
        passagem = ano + 76; //Calcula quando será  a passagem
        printf("%d",passagem); 
        scanf("%d",&ano); //Recebe novo ano e tyesta no loop
    }
}