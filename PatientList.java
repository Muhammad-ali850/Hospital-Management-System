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

    public void sortByName(){
        if (head == null || head.next == null) {
            System.out.println("Not enough patients to sort.");
            return;
        }
        
        Patient current, index;
        String tempName, tempDis;
        int tempId, tempAge;
        
        for (current = head; current.next != null; current = current.next) {
            for (index = head; index.next != null; index = index.next) {
                if (index.name.compareToIgnoreCase(index.next.name) > 0) {
                    // Swap patient details
                    tempId = index.id;
                    tempName = index.name;
                    tempAge = index.age;
                    tempDis = index.disease;
                    
                    index.id = index.next.id;
                    index.name = index.next.name;
                    index.age = index.next.age;
                    index.disease = index.next.disease;
                    
                    index.next.id = tempId;
                    index.next.name = tempName;
                    index.next.age = tempAge;
                    index.next.disease = tempDis;
                }
            }
        }
        System.out.println("Patients sorted by name successfully!");
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
