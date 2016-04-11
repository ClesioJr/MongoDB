import java.util.Scanner;


/**
 * Created by Clesio on 11/04/2016.
 */
public class  MongoDBHelloWorld {

    public static void main (String[] args){

        Scanner option = new Scanner(System.in);
        boolean open = true;
        MongoDBConnection person = new MongoDBConnection(); //Cria uma instancia do mongoDB

        System.out.println("Qual a proxima operação ? \n 1.inserir \n 2.remover \n 3.buscar \n 4.sair");

        while (open){

            switch (option.nextInt()) {

                case 1:
                    person.insert();
                    System.out.println("\n Qual a proxima operação ? \n 1.inserir \n 2.remover \n 3.buscar \n 4.sair");
                    break;

                case 2:
                    person.remove();
                    System.out.println("\n Qual a proxima operação ? \n 1.inserir \n 2.remover \n 3.buscar \n 4.sair");
                    break;

                case 3:
                    person.search();
                    System.out.println("\n Qual a proxima operação ? \n 1.inserir \n 2.remover \n 3.buscar \n 4.sair");
                    break;

                case 4:
                    System.out.println("Orbigado pelo teste e tenha um bom dia!");
                    open = false;
                    break;

                default:
                    System.out.println("Favor escolher uma opção valida!");
                    System.out.println("\n 1.inserir \n 2.remover \n 3.buscar \n 4.sair");
                    break;
            }
        }
    }
}
