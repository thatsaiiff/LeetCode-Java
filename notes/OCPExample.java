package notes;

/**
 * ✅ Open/Closed Principle (OCP)
 * A class should be open for extension, but closed for modification.
 */

interface Notifier {
    void send();
}

class EmailNotifier implements Notifier {
    public void send() {
        System.out.println("📧 Sending Email Notification");
    }
}

class SMSNotifier implements Notifier {
    public void send() {
        System.out.println("📱 Sending SMS Notification");
    }
}

class NotificationService {
    public void notifyUser(Notifier notifier) {
        notifier.send(); // Works for any future Notifier
    }
}

public class OCPExample {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        service.notifyUser(new EmailNotifier());
        service.notifyUser(new SMSNotifier());

        // Tomorrow we can add WhatsAppNotifier or PushNotifier without modifying NotificationService
    }
}