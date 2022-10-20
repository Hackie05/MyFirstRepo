//My First Demo in GitHub
class Demo{
      void print(){
           System.out.println("GitHub \nNew World");
      }
      void printName(String name){
           System.out.println("Your name is : " + name);
      }
      public static void main(String arg[]){

             //Functions use(Long way)
             
             System.out.println(print());

             Scanner sc = new Scanner(System.in);
             System.out.println("Enter your name");
             String name = sc.next();
             System.out.println(printName(name));
      }
}
