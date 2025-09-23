# Java_class_projects

## First Chapter

### O básico

## Second Chapter 

### Herança e Polimorfismo

```
public class Manager extends Employe{ // Primeira linha o que faz? Ela pega o código do Employee e herda ele para o Manager
    private String login;

    private String password;

    private double comission;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }    
}
```
Esse é o exemplo mais comum do uso de extends, no entanto a seguir vamos ver o exemplo para não permitir que qualquer um crie uma subclasse de nossa classe

```
public sealed abstract class Employe permits Manager { // CLASSE ORIGINAL AGORA UTILIZANDO SEALED E PERMITS PARA PERMITIR AGORA APENAS UA CLASSE ESPECÍFICA PARA SER SUA "FILHA"
    private String code;

    private String name;

    private String adress;

    private int age;

    private double salary;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public int getAge() {
        return age;
    }
    public void setAdress(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

```
```
public non-sealed class Manager extends Employe{ // CLASSE FILHA PODENDO AGORA HERDAR CARACTERÍSTICAS DA CLASSE MÃE
    private String login;

    private String password;

    private double comission;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }
}
```
### Herança e Polimorfismo Continuação
Esse é o código inicial que fiz durante a aula onde agora também tenho outra classe que é o Salesman
```
public class App {
    public static void main(String[] args) throws Exception {
        printEmploye(new Manager()); // Criando variável filha de Employe
        printEmploye(new Salesman());
    }
    public static void printEmploye(Employe employe) {

        if (employe instanceof Manager){ // INSTANCEOF VERIFICA SE O OBJETO É UMA INSTANCIA DE DETERIMINADA CLASSE
        employe.setName("João");
        ((Manager)employe).setLogin("joão");
        ((Manager)employe).setPassword("123456");
        
        System.out.printf("====%s=====\n",employe.getClass().getCanonicalName());
        System.out.println(employe.getName());
        System.out.println(((Manager)employe).getLogin()); // ((Manager)employe) Substitui o employe sozinho
        System.out.println(((Manager)employe).getPassword());

        }
        System.out.println("=========");
    }
}
```
Contudo há uma forma de simplificar o código tirando a necessidade de utilizar "((Manager)employe)" toda hora
```
    public static void printEmploye(Employe employe) {

        if (employe instanceof Manager manager){ // COLOCANDO O MANAGER NO FINAL TIRA A NECESSIDADE DE UTILIZAR O ((Manager)employe)
        employe.setName("João");
        manager.setLogin("joão"); // AGORA POSSO UTILIZAR SÓ O MANAGER
        ((Manager)employe).setPassword("123456");
        
        System.out.printf("====%s=====\n",employe.getClass().getCanonicalName());
        System.out.println(employe.getName());
        System.out.println(((Manager)employe).getLogin()); // ((Manager)employe) Substitui o employe sozinho
        System.out.println(((Manager)employe).getPassword());

        }
        System.out.println("=========");
    }
```
Importante salientar que RECORD não pode herdar nada de classes pois obviamente ele recebe apenas métodos estáticos, os quais não podem ser passados por herança

Utilizando o Instanceof no código
Exemplo:
```
System.out.printl(Salesman instanceof Employe);
```
A saída será "True" pois o instanceof está refernciando que o Salesman é apenas uma instania de Employe o que é correto
