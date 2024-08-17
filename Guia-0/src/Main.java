import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Integer;
/*

1. Realizar un programa Java que realice lo siguiente: declarar una variable
numN de tipo int, una variable numA de tipo double y una variable numC de
tipo char y asigna a cada una un valor. A continuación muestra por pantalla:
El valor de cada variable, la suma de numN + numA, la diferencia de numA -
numN, el valor numérico correspondiente al carácter que contiene la
variable numC

 */

public class Main {
    public static void Ejercicio_Uno() {
        int numN = 20;
        double numA = 300;
        char numC = 'C';
        System.out.println("el valor de numN es: "+numN);
        System.out.println("el valor de numA es: "+numA);
        System.out.println("el valor de numC es: "+numC);
        System.out.println("el valor de numN + numA es: "+ (numN + numA ));
        System.out.println("el valor de numA - numN es: " + (numA - numN));
        System.out.println("el valor de numC es: " + (int) numC);
    }

/*
2. Realizar un programa Java que realice lo siguiente: declarar dos variables
numX y numY de tipo int, dos variables numN y numM de tipo double y
asigna a cada una un valor. A continuación mostrar por pantalla una serie
de operaciones entre ellas.
*/

    public static void Ejercicio_Dos(Scanner entrada){
        System.out.print("Ingrese un Numero: ");
        int numX = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese un Numero: ");
        int numY = entrada.nextInt();
        entrada.nextLine();

        double numN = 5;
        double numM = 10;

        System.out.println("Suma X + N " + (numX+numN));
        System.out.println("Suma X - N " + (numX-numN));
        System.out.println("Suma Y + M " + (numY+numM));
        System.out.println("Suma Y - M " + (numY-numM));
    }

/*
3. Realizar un programa Java que declare una variable entera N y se le asigne
un valor elegido por el usuario. A continuación escribe las instrucciones para
que el programa realice lo siguiente: incrementar N en 77, reducir su valor a 3,
duplicar su valor.
*/

    public static void Ejercicio_Tres(Scanner entrada){
        System.out.print("Ingrese un Numero: ");
        int N = entrada.nextInt();
        entrada.nextLine();

        int incremento = N + 77;
        System.out.println("El valor N es: "+N);
        N = 3;
        System.out.println("El valor N es: "+N);
        N *= 2;
        System.out.println("El incremento es: "+incremento);
        System.out.println("El Doble del valor es: "+N);
    }

/*
4. Realizar un programa Java que declare cuatro variables enteras A, B, C y D
y se le asigne un valor a cada una. A continuación realiza las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome el
valor de D, D tome el valor de B.
*/

    public static void Ejercicio_Cuatro(){
        int A = 5;
        int B = 6;
        int C = 7;
        int D = 8;
        System.out.println("Valores previos al cambio");
        System.out.println("Valor A: "+A);
        System.out.println("Valor B: "+B);
        System.out.println("Valor C: "+C);
        System.out.println("Valor D: "+D);

        int auxiliar = A;

        A = D;
        D = B;
        B = C;
        C = auxiliar;

        System.out.println("Valores previos al cambio.");
        System.out.println("Valor A: "+A);
        System.out.println("Valor B: "+B);
        System.out.println("Valor C: "+C);
        System.out.println("Valor D: "+D);
    }

/*
5. Realizar un programa Java que declare una variable A de tipo entero,
y le asigne un valor. A continuación mostrar un mensaje indicando si A
es par o impar.
*/

    public static void Ejercicio_Cinco(Scanner entrada){
        System.out.print("Ingrese un Numero de tipo entero: ");
        int valor = entrada.nextInt();
        entrada.nextLine();

        String resultado;

        if(valor % 2 == 1){
            resultado = "Impar";
        }
        else{
            resultado = "Par";
        }

        System.out.println(resultado);
    }

/*
6. Realizar un programa Java que declare una variable B de tipo entero y
asignarle un valor elegido por el usuario. A continuación mostrar un
mensaje indicando si el valor de B es positivo o negativo.
*/

    public static void Ejercicio_Seis(Scanner entrada){
        System.out.print("Ingrese un Numero: ");
        int B = entrada.nextInt();
        entrada.nextLine();

        if(B>0){
            System.out.println("Es mayor que cero");
        } else if (B<0) {
            System.out.println("Es negativo");
        }else{
            System.out.println("Es cero");
        }
    }

/*
7. Realizar un programa Java que encuentre el valor ASCII de un carácter.
Para ello, vamos a pedir un String al usuario y leer solo el primer carácter,
esto lo lograremos con: char caracter = scanner.next().charAt(0);
*/

    public static void Ejercicio_Siete(Scanner entrada){
        System.out.print("Ingrese una palabra: ");
        char caracter = entrada.next().charAt(0);

        /*
        Porque este casteo esta bien y el otro que hice dice que estoy encapsulando de forma innecesaria?
        Character caracter = entrada.next().charAt(0);

        int valorASCII = caracter.charValue();
         */
        System.out.println("El valor ASCII de "+caracter+" es: "+ (int) caracter );
    }


    /*
    8. Realizar un programa Java que declare una variable C de tipo entero y le
    asigne un valor elegido por el usuario. A continuación mostrar un mensaje
    indicando si el valor de C es positivo o negativo, si es par o impar, si es
    múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que 100.
    */
    // public void nombrefuncion()
    public static void Ejercicio_Ocho(Scanner entrada){
        System.out.print("Ingrese un Numero: ");
        int C = entrada.nextInt();
        entrada.nextLine();

        if(C >= 0 ){
            System.out.println("Es Positivo o Cero");
        }
        else{
            System.out.println("Es Negativo");
        }
        if((C % 2) == 1){
            System.out.println("Es impar");
        }
        else{
            System.out.println("Es par");
        }
        if((C % 10) == 0){
            System.out.println("Es multiplo de 5 y 10");
        }
        else if ((C % 5) == 0) {
            System.out.println("Es multiplo de 5");
        }

        if(C > 100){
            System.out.println("Es mayor que 100");
        }
        else{
            System.out.println("Es menor que 100");
        }
    }

    /*
    9. Realizar un programa Java que lea un nombre y muestre por pantalla:
    “Buenos días, {NOMBRE}”.
     */
    public static void Ejercicio_Nueve(Scanner entrada){
        System.out.print("Ingrese un Nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("Buenos dias, "+nombre);
    }
    /*
    10. Realizar un programa que lee por teclado el valor del radio de una
    circunferencia, calcula y muestra por pantalla la longitud y el área de la
    circunferencia. Cálculo de longitud: 2 * PI * radio, cálculo de área: PI *
    radio^2. Para este ejercicio averiguar sobre la clase Math.
     */
    public static void Ejercicio_Diez(Scanner entrada){

        System.out.print("Ingrese el Radio: ");
        int radio = entrada.nextInt();
        entrada.nextLine();


        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio,2);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("El radio ingresado fue: "+df.format(radio)+" la longitud de arco es: "+ df.format(longitud)+" y su area es: "+df.format(area));
    }
    /*
    11. Realizar un programa que pase una velocidad en Km/h a m/s. La
    velocidad se lee por teclado. Cálculo: velocidadMS = velocidadKm * 1000 /
    3600;
     */
    public static void Ejercicio_Once(Scanner entrada){
        System.out.print("Ingrese la velocidad en km/h que desea convertir: ");
        double velocidadKmH = entrada.nextDouble();
        double velocidadMS = velocidadKmH * 1000 / 3600 ;
        DecimalFormat df = new DecimalFormat("0.000");

        System.out.println("La velocidad en metros por segundo es: " + df.format(velocidadMS));
    }
    /*
    12. Realizar un programa que lea la longitud de los catetos de un triángulo
    rectángulo y calcule la longitud de la hipotenusa según el teorema de
    Pitágoras
     */
    public static void Ejercicio_Doce(Scanner entrada){
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Ingrese el valor del cateto A: ");
        double A = entrada.nextDouble();
        entrada.nextLine();
        System.out.print("Ingrese el valor del cateto B: ");
        double B = entrada.nextDouble();
        entrada.nextLine();
        double Hipotenusa = Math.sqrt(Math.pow(A,2) + Math.pow(B,2));

        System.out.println("El valor de la hipotenusa es: "+df.format(Hipotenusa));
    }
    /*
    13. Realizar un programa que calcula el volumen de una esfera. El valor de
    radio se debe pedir por teclado. Cálculo: volumen = 4/3 * PI * radio^3
     */
    public static void Ejercicio_Trece(Scanner entrada){
        DecimalFormat df = new DecimalFormat("0.000");

        System.out.println("Ingrese el radio de la esfera: ");
        double radio = entrada.nextDouble();
        entrada.nextLine();
        double fraccion = (double) 4 / 3;

        double volume = (fraccion) * Math.PI * Math.pow(radio,3);

        System.out.println("El volumen de la esfera es: "+df.format(volume) + ", el radio dado fue: "+ radio);
    }
    /*
    14. Realizar un programa que lee un número de 3 cifras y muestra sus
    cifras por separado
     */
    public static void Ejercicio_Catorce(Scanner entrada){
        System.out.println("Ingrese un numero de tres o mas cifras: ");
        Integer numero = entrada.nextInt();
        if(numero >= 100){
            char[] numCadena = numero.toString().toCharArray();
            System.out.println("El numero es: ");
            for(char car: numCadena){
                System.out.println(car);
            }
            for(int i = 0; i < numCadena.length; i++){
                System.out.println(numCadena[i]);
            }
            int y = 0;
            while (y < numCadena.length){
                System.out.println(numCadena[y]);
                y++;
            }
        }
        else{
            System.out.println("Ingrese un numero mayor.");
        }
    }
    /*
    15. Realizar un programa que lea un número entero N de 5 cifras y muestre
    las cifras que ocupan posiciones impares.
     */
    public static void Ejercicio_Quince(Scanner entrada){
        System.out.println("Ingrese un numero de tres o mas cifras: ");
        Integer numero = entrada.nextInt();
        char[] numCadena = numero.toString().toCharArray();
        System.out.println("Los valores impares son: ");
        for(int i = 0; i<numCadena.length; i++){
            if(i % 2 == 1){
                System.out.println(numCadena[i]);
            }
        }
    }
    /*
    16. Realizar un programa que lea tres números enteros H, M, S que
    contienen hora, minutos y segundos respectivamente, y comprueba si la
    hora que indican es una hora válida
     */
    public static void Ejercicio_Dieciseis(Scanner entrada){
        System.out.println("Ingresa HORA-MINUTOS-SEGUNDOS");
        int H;
        do{
            System.out.println("Ingresame la hora bien.");
            H = entrada.nextInt();
            entrada.nextLine();
        }while(!((H >= 0) && (H < 24)));
        int M;
        do{
            System.out.println("Ingresame los minutos bien.");
            M = entrada.nextInt();
            entrada.nextLine();
        }while(!((M >= 0) && (M < 60)));

        int S;
        do {
            System.out.println("Ingresame los segundos bien.");
            S = entrada.nextInt();
            entrada.nextLine();
        }while(!((S > 0) && (S < 60)));
        System.out.println("Ingresaste esta hora. "+H+"h "+M+"m "+S+"s");
    }
    /*
    17. Realizar un programa Java que pida por teclado el nombre, edad y
    salario de una persona, y muestra el salario dependiendo de:
    ● Si es menor de 16 no tiene edad para trabajar
    ● Entre 19 y 50 años el salario es un 5 por ciento más
    ● Entre 51 y 60 años el salario es un 10 por ciento más
    ● Si es mayor de 60 el salario es un 15 por ciento más
     */
    public static void Ejercicio_Diecisiete(Scanner entrada){
        System.out.print("Ingresa tu Nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingresa tu Edad: ");
        int edad = entrada.nextInt();
        if((edad)>16){
            entrada.nextLine();
            System.out.print("Ingresa tu Salario: ");
            double salario = entrada.nextInt();
            entrada.nextLine();
            if(edad < 19){
                System.out.println(nombre + " Cobras: "+salario);
            } else if (edad < 51) {
                System.out.println(nombre + " Cobras: "+salario*1.05+" - 5% extra");
            } else if (edad < 61) {
                System.out.println(nombre + " Cobras: "+salario*1.1+" - 10% extra");
            }else{
                System.out.println(nombre + " Cobras: "+salario*1.15+" - 15% extra");
            }
        }
        else{
            System.out.println("Llama al 911");
            System.out.println("RUIDO SIRENAS YENDO");
        }
    }
    /*
    18. Crea un programa que pida al usuario su altura y su peso, y muestre por
    pantalla su índice de masa corporal y si se encuentra en un rango
    saludable.
     */
    public static void Ejercicio_Dieciocho(Scanner entrada){
        System.out.println("Ingresa tu nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese TU altura en metros >.>");
        float altura = entrada.nextFloat();

        System.out.println("Ingresa TU peso: ");
        float peso = entrada.nextFloat();
        double IMC = peso / Math.pow(altura,2);
        System.out.println("Vos, "+nombre+" tenes un IMC de "+IMC);
        if(IMC < 18.5){
            System.out.println("Empeza a comer.");
        } else if (IMC < 25) {
            System.out.println("Estas perfecto rey.");
        } else if (IMC < 30) {
            System.out.println("Estas un poco pasado, aflojale.");
        } else if (IMC < 35) {
            System.out.println("Corta con la torta.");
        } else if (IMC > 35) {
            System.out.println("El broche gastrico es una opcion buena.");
        }
    }
    /*
    19. Realizar un programa Java que calcule el promedio de un arreglo de
    números enteros. Realizar variantes con arreglos ya inicializados e ingreso
    por teclado. NO
     */
    public static void Ejercicio_Diecinueve(){
        int arregloNumeritos[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        double suma = 0;
        for(int i: arregloNumeritos){
            suma += i;
        }
        double promedio = suma / arregloNumeritos.length;
        System.out.println("El promedio es: "+promedio);
    }
    /*
    20. Realizar un programa Java que solicite un número al usuario y calcule la
    suma de todos los números naturales, hasta el número recibido inclusive
     */
    public static void Ejercicio_Veinte(Scanner entrada){
        int suma = 0;
        System.out.println("Hasta que numero te sumo flaco. QUE SEA ENTERO >.<");
        int numerito = entrada.nextInt();
        for(int i = numerito; i > 0; i--){
            suma += i;
        }
        System.out.println("La suma de todos los numeros naturales hasta tu numero es: "+suma);
    }
    /*
    21. Realizar un programa Java que lea 20 temperaturas correspondientes a
    un mes y calcule el maximo, el minimo y el promedio. Utilizar un array
    double.
     */
    public static void Ejercicio_Veintiuno(Scanner entrada){
        ArrayList<Integer> temperaturas = new ArrayList<Integer>();
        Integer valor;
        int sumatoria = 0;
        for(int i = 0; i < 20 ; i++){
            valor = entrada.nextInt();
            temperaturas.add(valor);
            sumatoria += valor;
        }
        int maximo = encontrarMax(temperaturas);
        int minimo = encontrarMin(temperaturas);
        System.out.println("El valor minimo es "+minimo+", el maximo "+maximo+" y el promedio es "+sumatoria / temperaturas.size());
    }
    public static int encontrarMin(ArrayList<Integer> array)
    {
        int min = array.getFirst();
        for(int i : array)
        {
            if(min > i)
            {
                min = i;
            }
        }
        return min;
    }

    public static int encontrarMax(ArrayList<Integer> array)
    {
        int max = array.getFirst();
        for(int i : array)
        {
            if(max < i)
            {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        Ejercicio_Uno();
        Ejercicio_Dos(entrada);
        Ejercicio_Tres(entrada);
        Ejercicio_Cuatro();
        Ejercicio_Cinco(entrada);
        Ejercicio_Seis(entrada);
        Ejercicio_Siete(entrada);
        Ejercicio_Ocho(entrada);
        Ejercicio_Nueve(entrada);
        Ejercicio_Diez(entrada);
        Ejercicio_Once(entrada);
        Ejercicio_Doce(entrada);
        Ejercicio_Trece(entrada);
        Ejercicio_Catorce(entrada);
        Ejercicio_Quince(entrada);
        Ejercicio_Dieciseis(entrada);
        Ejercicio_Diecisiete(entrada);
        Ejercicio_Dieciocho(entrada);
        Ejercicio_Diecinueve();
        Ejercicio_Veinte(entrada);
        Ejercicio_Veintiuno(entrada);
        entrada.close();
    }
}