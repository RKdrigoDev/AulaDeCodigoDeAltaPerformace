package pilhas;

public class PilhaInt {
    final int N=6;
    int topo;
    int dados[]= new int[N];
    public void init (){
        topo=0;
    }
    public boolean isEmpty(){
        return(topo==0);
    }
    public boolean isFull(){
        return(topo==N);
    }
    public void push(int elem){
        if(isFull()){
            System.out.println("Stack overflow");
        }
        else{
            dados[topo]= elem;
            topo++;
        }
    }
    public int pop(){

        topo--;
        return dados[topo];
    }
    public int top(){
        return dados[topo-1];
    }
    public void esvaziar(){
        while(!isEmpty()){
            System.out.println("\t"+pop());

        }
    }

}
