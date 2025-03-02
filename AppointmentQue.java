class AppointmentQue { //Queue
    private Patient front, rear;

    public void addAppointment(int id, String name, int age, String disease) {
        Patient newPatient = new Patient(id, name, age, disease);
        if (rear == null) {
            front = rear = newPatient;
        } else {
            rear.next = newPatient;
            rear = newPatient;
        }
        System.out.println("Appointment added successfully!");
    }

    public void processAppointment() {
        if (front == null) {
            System.out.println("No appointments to process.");
            return;
        }
        System.out.println("Processing appointment of " + front.name);
        front = front.next;
        if (front == null) {
            rear = null;
        }
    }
}