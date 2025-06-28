# 🍿 Java Inheritance — The Netflix Way

Welcome to the binge-worthy Java project that brings Object-Oriented Programming (OOP) to life — Netflix-style!

This project demonstrates different types of **inheritance in Java**, including:

- ✅ Single Inheritance  
- ✅ Multilevel Inheritance  
- ✅ Hierarchical Inheritance  
- ❌ Multiple/Hybrid Inheritance (and why Java says NO)

---

## 🧠 What You'll Learn

- How Java classes can extend other classes to reuse code
- How inheritance enables different account types to share base functionality
- Why Java avoids multiple inheritance with classes — and how interfaces step in instead

---

## 📁 Code Structure

All examples are inside `Main.java` with Netflix-themed class names:

| Inheritance Type      | Example Class(es)                       | Description |
|-----------------------|-----------------------------------------|-------------|
| Single Inheritance    | `NetflixAccount → PremiumAccount`       | One parent, one child |
| Multilevel Inheritance| `NetflixAccount → Premium → UltraPremium`| Inherits step-by-step |
| Hierarchical          | `NetflixAccount → KidsAccount`, `GuestAccount` | One parent, multiple children |
| Multiple/Hybrid (❌)   | `HybridAccount` *(commented out)*        | Shown as **not allowed** in Java |

---

## 🛠️ Run the Code

Compile and run with:

```bash
javac Main.java
java Main
