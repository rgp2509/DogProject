
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DogDriver{

    public static void main(String[]args){
        try{
            File file = new File("dogs.txt");
            FileReader fileReader =new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            int count = Integer.parseInt(bufferedReader.readLine().trim());
            System.out.println("There are " + count + " entries");
            DogComponent [] dogPound = new DogComponent[count];
            double totalAge = 0.0;
            for (int i =0; i < count; i++) {
                line = bufferedReader.readLine();
                String [] elements = line.trim().split(" ");
                int dogCounter  = 1 + i;
                dogPound[i] = new DogComponent(dogCounter, elements[0], elements[1], elements[2], elements[3], elements[4]);
                totalAge += dogPound[i].getAge();

            }
            double averageAge =  totalAge / count;
            for (int i = 0; i < count; i++) {
                if (dogPound[i].getAge() < averageAge ) {
                    System.out.println(dogPound[i].toString() + "\n     I am young");
                }else {
                    System.out.println(dogPound[i].toString() + "\n     I am old");
                }
            }
            fileReader.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}