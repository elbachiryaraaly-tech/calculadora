public class Calculadora {

    // =====================
    // OPERACIONES - ALUMNO 1
    // =====================

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    // =====================
    // OPERACIONES - ALUMNO 2
    // =====================

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Error: No se puede dividir entre cero");
        }
        return a / b;
    }

    // =====================
    // MENÚ PRINCIPAL
    // =====================

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("=== CALCULADORA ===");
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nElige una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + calc.sumar((int)num1, (int)num2));
                break;
            case 2:
                System.out.println("Resultado: " + calc.restar((int)num1, (int)num2));
                break;
            case 3:
                System.out.println("Resultado: " + calc.multiplicar((int)num1, (int)num2));
                break;
            case 4:
                System.out.println("Resultado: " + calc.dividir(num1, num2));
                break;
            default:
                System.out.println("Opción no válida");
        }

        scanner.close();
    }
}