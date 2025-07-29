Here’s your SOLID.md content for the Single Responsibility Principle (SRP)—just copy and paste it into the file:

⸻


# SOLID Principles in Java 🚀

## 🔹 S — Single Responsibility Principle (SRP)

**Definition:**
> A class should have one and only one reason to change.

This means every class should focus on a **single job** or **responsibility**. Mixing multiple roles makes a class hard to maintain, test, and scale.

---

### ❌ Violating SRP

```java
public class Invoice {
    public void calculateTotal() {
        // Calculate the invoice total
    }

    public void printInvoice() {
        // Print the invoice
    }

    public void saveToDatabase() {
        // Save to DB
    }
}

Problem:
The class is doing:
	•	Business logic (calculateTotal)
	•	Presentation logic (printInvoice)
	•	Persistence (saveToDatabase)

If printing logic changes, the class must change — even though it has nothing to do with calculation or DB.

⸻

✅ Following SRP

public class Invoice {
    public void calculateTotal() {
        // Calculate the invoice total
    }
}

public class InvoicePrinter {
    public void print(Invoice invoice) {
        // Print the invoice
    }
}

public class InvoiceRepository {
    public void save(Invoice invoice) {
        // Save to DB
    }
}

Benefit:
Each class now has only one reason to change:
	•	Business rule change → Invoice
	•	Printing format → InvoicePrinter
	•	DB logic → InvoiceRepository

⸻

📌 Key Takeaway:

Keep your classes focused.
If it feels like a class is “doing too much,” it probably is.

⸻

Next:
🔜 [O — Open/Closed Principle → Coming soon].

---

---

## 🔓 Open/Closed Principle (OCP)

**Definition:**  
A class should be **open for extension**, but **closed for modification**.

### 🔥 Why it matters:
- Reduces risk of breaking existing code
- Encourages clean abstractions
- Makes codebase more maintainable and scalable

### ❌ Anti-pattern:
Using `if-else` or `switch` statements based on type

```java
// Bad Example
class NotificationService {
    public void send(String type) {
        if (type.equals("EMAIL")) { /* send email */ }
        else if (type.equals("SMS")) { /* send sms */ }
    }
}

✅ Solution:

Use interfaces or abstract classes to allow behavior extension.

// Good Example using OCP
interface Notifier { void send(); }

class EmailNotifier implements Notifier {
    public void send() { /* send email */ }
}

class NotificationService {
    public void notifyUser(Notifier notifier) {
        notifier.send();
    }
}

📦 Real-world Analogy:

A plug point is closed (you don’t change the wall),
but open to new devices like fans, chargers, or TVs — extension without modification.


