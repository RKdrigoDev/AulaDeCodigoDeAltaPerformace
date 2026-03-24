package Main;

import pilhas.PilhaInt;

public class MainTeste {
    public static void main(String[] args) {
        PilhaInt pilha = new PilhaInt();
        pilha.init();
        pilha.push(11);
        pilha.push(22);
        pilha.push(32);
        pilha.push(44);
        pilha.push(51);
        pilha.push(71);
        pilha.push(67);
       if (pilha.isEmpty()){
           System.out.println("stack is empty");
       }
       else {
           System.out.println("valor do dado que estáno topo da pilha: "+pilha.top());
       }
        System.out.println("*** dados empilhados ***");
        pilha.esvaziar();
        if (pilha.isEmpty()){
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("Valor retirado: "+pilha.pop());
        }
    }
}
