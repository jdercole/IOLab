
package iolab;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jenna
 */
public class StartUp {

    public static void main(String[] args) throws Exception {
        
        File data = new File("src" + File.separatorChar + "contactList.txt");
        FileService service = new FileService();
        List<String> fileString = service.readFile(data);
        String[] lastName1 = fileString.get(0).split(" ");
        String[] zipCode1 = fileString.get(2).split(" ");
        String[] lastName2 = fileString.get(3).split(" ");
        String[] zipCode2 = fileString.get(5).split(" ");
        String[] lastName3 = fileString.get(6).split(" ");
        String[] zipCode3 = fileString.get(8).split(" ");
        System.out.println(lastName1[1]);
        System.out.println(zipCode1[2]);
        System.out.println(lastName2[1]);
        System.out.println(zipCode2[2]);
        System.out.println(lastName3[1]);
        System.out.println(zipCode3[2]);
        
        List<String> newRecord1 = new ArrayList<>();
        newRecord1.add("Joe Jones");
        newRecord1.add("123 Main St");
        newRecord1.add("Delafield, WI 53018");
        
        List<String> newRecord2 = new ArrayList<>();
        newRecord2.add("Samuel Smith");
        newRecord2.add("1455 Williams St");
        newRecord2.add("Madison, WI 54213");
        
        service.writeFile(data, newRecord1, true);
        service.writeFile(data, newRecord2, true);
        System.out.println(service.readFile(data));
    }
}
