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