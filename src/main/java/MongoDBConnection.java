import com.mongodb.*;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Created by Clesio on 11/04/2016.
 */
public class MongoDBConnection {

    MongoClient client;
    DB database;
    DBCollection collection;



    // cria conexão com o banco de dados

    public MongoDBConnection (){
     try {
         client = new MongoClient(new ServerAddress("localhost", 27017));

         database = client.getDB("peopledb");

         collection = database.getCollection("person");
     }catch (UnknownHostException e){
         System.out.println("Não foi possivel conectar com o banco de dados");
     }
    }

    public void insert(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira o primeiro nome:");
        String firstName = scanner.nextLine();

        System.out.println("insira o ultimo nome:");
        String lastName = scanner.nextLine();

        System.out.println("insira a idade:");
        int idade = scanner.nextInt();
        collection.insert(new BasicDBObject("firstName", firstName)
                 .append("lastName", lastName)
                 .append("idade",idade));
    }


    public void remove(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira o primeiro nome de quem gostaria de remover:");
        String firstName = scanner.nextLine();

        collection.remove(new BasicDBObject("firstName",firstName));
    }


    public void search(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira o primeiro nome de quem gostaria de encontrar");
        String firstName = scanner.nextLine();
        System.out.println(collection.find(new BasicDBObject("firstName", firstName)));
    }
}
