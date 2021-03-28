import java.util.Stack;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt(); 

    for (int i = 0; i < input; i++) {
      confection(sc);
    }
  }
  private static void confection(Scanner sc){
    
    Stack<Integer> mount = new Stack<Integer>();  
    Stack<Integer> branch = new Stack<Integer>();
    int cars = sc.nextInt(); 

    for (int i = 0; i < cars; i++) {
      mount.push(sc.nextInt()); 
    }
    int i = 0;
    
    while (i < cars) {
      if (!mount.empty() && mount.peek() == i+1) {
        mount.pop();
        i++;
      } else if (!branch.empty() && branch.peek() == i+1) {
        branch.pop();
        i++;
      } else if (!mount.empty()) {
        branch.push(mount.pop());
      } else {
        System.out.println('N');
        return;
      }
    }
    System.out.println('Y');

  }  
}