package AlocacaoDinamica.ex2;

public class MainLista1 {
    public static void main(String[] args) {
        NoLista lista=new NoLista();
        lista.dado=1;
        lista.prox=null;


        NoLista novo= new NoLista();
        novo.dado=2;
        novo.prox=null;
        lista.prox=novo;

        //exercício 1
        NoLista novo2=new NoLista();
        novo2.dado=3;
        novo2.prox=null;
        novo.prox=novo2;
        //exercício 2
        lista=novo2;
        //exercício 3
        NoLista aux= lista;
        while(aux!=null){
            System.out.println(aux.dado);
            aux=aux.prox;
        }
    }
}
