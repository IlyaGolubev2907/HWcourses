package Homework6_1;

public class Patient {
    String plan;
    Doctor doctor;

    public Patient(String plan) {
        this.plan = plan;
    }

    public void assignDoctor() {
        if (plan.equals("1")) {
            doctor = new Surgeon();
        } else if (plan.equals("2")) {
            doctor = new Dentist();
        } else {
            doctor = new Therapist();
        }
    }

    public void assignPlan() {
        if (doctor != null) {
            doctor.startTreatment();
        } else {
            System.out.println("Доктор не назначен");
        }
    }
}
