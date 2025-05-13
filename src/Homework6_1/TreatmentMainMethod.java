package Homework6_1;

import java.util.Scanner;

public class TreatmentMainMethod {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите код плана лечения: ");
        String plan = scanner.nextLine();

        Patient patient = new Patient(plan);
        patient.assignDoctor();
        patient.assignPlan();

        scanner.close();
    }
}
