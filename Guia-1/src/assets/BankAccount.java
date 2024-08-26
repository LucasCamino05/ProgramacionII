package assets;
/*
2. Modele el objeto que representa la cuenta de un banco, con identificador,
nombre y balance. Considere los getters, setters y constructores necesarios.
Luego, realizar los siguientes métodos:

a. El metodo crédito que representa un depósito de dinero en la
cuenta. Este metodo debe devolver el balance luego de la operación.

b. El metodo débito que representa una sustracción de dinero de la
cuenta. Este metodo debe devolver el balance luego de la operación. Si
el dinero en la cuenta no es suficiente para cubrir la sustracción, se
debe imprimir por pantalla un aviso sin permitir dicha sustracción.

c. Un metodo que imprima por pantalla las características del objeto.
En el main, realice las siguientes operaciones:

    1. Inicialice una cuenta con un monto inicial de 15000.
    2. Realice una operación de crédito de 2500.
    3. Realice una operación de compra de 1500.
    4. Realice una operación de compra de 30000.
    5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea correcto.

 */
public class BankAccount {
    // Attributes
    private String nombre;
    private double balance;

    //Constructor vacio
    public BankAccount() {
        this.nombre = null;
        this.balance = 0;
    }

    // Constructor lleno
    public BankAccount(String nombre, double balance) {
        this.nombre = nombre;
        this.balance = balance;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Methods

    public void getCredito(double credito){
        this.balance += credito;
        setBalance(this.balance);
    }
    public boolean getDebito(double debito){
        this.balance -= debito;
        if(this.balance<0){
            this.balance += debito;
            return false;
        }
        else{
            return true;
        }
    }
    public String mostrarBalance(){
        return ("Su balance es de: $"+this.balance);
    }
}
