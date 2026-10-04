public class Greeter {

   /* Tasks
    Step 1: Fix the solution
    Either working locally or using the online editor, you should find the following code:


    String getGreeting() {
        return "Goodbye, Mars!";
    }

    The objective is to modify the provided code so it produces the text "Hello, World!" instead of "Goodbye, Mars!".
  */

    String getGreeting () {
        return "Hello World";
    }

   public static void main(String[] args) {
        Greeter myGreeter = new Greeter();
        System.out.println(myGreeter.getGreeting());
   }

}