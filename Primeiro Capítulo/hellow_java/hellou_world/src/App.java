
public class App {
    public static void main(String[] args) throws Exception {
   
        var male = new Pessoa(); // Corrigido "Pessoa"

        male.setName("João");
        male.setAge(12);

        System.out.println("Male name: " + male.getName() + " Age: " + male.getAge());

        /* 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, informe seu nome");
        var nome = scanner.next();
        System.out.println("Informe sua idade");
        var idade = scanner.nextInt();
        if (idade >= 18) System.out.printf("Voce tem %s anos e pode dirigir", idade);// EAT THIS
        //AULA DE IF E ELSE
        */

        /* 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a number 1 to 3");
        var sorte = scanner.nextInt();
        switch (sorte){

            case 1:
                System.out.println("Won 1000 schwebells");
                break;
            case 2:
                System.out.println("Lost 1000 schwebells");
                break;
            case 3:
                System.out.println("Lost everything :()");
                break;
            default:
                System.out.println("Lost everything :(");
                //AULA DE CASE E BREAK          
        }
                */
                
    }
}
