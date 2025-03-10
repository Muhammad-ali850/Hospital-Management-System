import java.util.Scanner;

public class HospitalManagementSys {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        PatientList patientList = new PatientList();
        AppointmentQue appointmentQueue = new AppointmentQue();

        while (true) {
            System.out.println("\nHospital Management System\n");
            System.out.println("1- Add Patient"); //permanent record of patients
            System.out.println("2- Display Patients");
            System.out.println("3- Search Patient");
            System.out.println("4- Sort Patients by Name"); //Bubble Sort
            System.out.println("5- Add Appointment"); //temporary scheduling
            System.out.println("6- Process Appointment");
            System.out.println("7- Exit");
            System.out.print("Enter your choice: ");
            
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    int id = s.nextInt();
                    System.out.print("Enter full Name (without space): ");
                    String name = s.next();
                    System.out.print("Enter Age: ");
                    int age = s.nextInt();
                    System.out.print("Enter Disease: ");
                    String disease = s.next();

                    patientList.addPatient(id, name, age, disease);
                    break;
                case 2:
                    patientList.displayPatients();
                    break;
                case 3:
                    System.out.print("Enter Patient Name to search: ");
                    String name2 = s.next();
                    patientList.searchPatient(name2);
                    break;
                case 4:
                    patientList.sortByName();
                    break;
                case 5:
                    System.out.print("Enter Patient ID: ");
                    int id2 = s.nextInt();
                    System.out.print("Enter Name: ");
                    String name3 = s.next();
                    System.out.print("Enter Age: ");
                    int age2 = s.nextInt();
                    System.out.print("Enter Disease: ");
                    String disease2 = s.next();

                    appointmentQueue.addAppointment(id2, name3, age2, disease2);
                    break;
                case 6:
                    appointmentQueue.processAppointment();
                    break;
                case 7:
                    System.out.println("Exiting system....");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}