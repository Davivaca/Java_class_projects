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

