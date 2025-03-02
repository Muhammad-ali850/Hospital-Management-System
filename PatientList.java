class Patient { //Patient (Node) class
    int id;
    String name;
    int age;
    String disease;
    Patient next;

    public Patient(int id, String name, int age, String disease) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.next = null;
    }
}

class PatientList { //Linked list
    private Patient head;

    public void addPatient(int id, String name, int age, String disease) {
        Patient newPatient = new Patient(id, name, age, disease);
        if (head == null) {
            head = newPatient;
        } else {
            Patient temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newPatient;
        }
        System.out.println("Patient added successfully!");
    }

    public void searchPatient(String name) { //Linear Search
        Patient temp = head;
        while (temp != null) {
            if (temp.name.equals(name)) {
                System.out.println("Patient Found:\n ID: " + temp.id + ", Name: " + temp.name + ", Age: " + temp.age + ", Disease: " + temp.disease);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Patient with Name " + name + " not found.");
    }

    public void displayPatients() {
        if (head == null) {
            System.out.println("No patients found.");
            return;
        }
        Patient temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.id + ", Name: " + temp.name + ", Age: " + temp.age + ", Disease: " + temp.disease);
            temp = temp.next;
        }
    }
}
