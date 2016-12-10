
package learningfactory;

import com.rajeshpatkar.AStack;

/**
 *
 * @author rajeshpatkar
 */
public class LearningFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Learning Factory");
        AStack s1 = new AStack();
        AClient(s1);
    }
    
    public static void AClient(AStack s){
        s.push(10);
        s.pop();
    }
    
}
