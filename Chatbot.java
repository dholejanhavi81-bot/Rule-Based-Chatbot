import java.util.*;

public class Chatbot{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Simple Rule-Based Chatbot === ");
        System.out.println(" Type 'bye' to exit.");

        while (true) {
            System.out.print("You:");
            String userInput = sc.nextLine().toLowerCase();

            if(userInput.equals("hi") || userInput.equals("hello")){
                System.out.println("Bot: Hello, How are you?");
            }
            else if(userInput.equals("how are you")){
                System.out.println("Bot: I am fine, thank you for asking.");
            }
            else if(userInput.equals("help")){
                System.out.println("Bot: I respond to greetings and simple question.");
            }
            else if (userInput.equals("name")){
                System.out.println("Bot: My name is AI ChatBot");
            }
            else if(userInput.equals("weather")){
                System.out.println("Bot: I cannot check live wweather right now.");

            }
            else if(userInput.equals("thanks")){
                System.out.println("Bot: You're welcome!");
            }
            else if(userInput.equals("bye")){
                System.out.println("Bot: Goodbye!");
                break;
            }
            else{
                 System.out.println("Bot: Sorry i don't understand.");
            }
 
        }
        sc.close();  
    }
}