# 📐 Object-Oriented Geometry Module (Java)

This project implements fundamental Object-Oriented Programming (OOP) concepts in Java—such as **Inheritance**, **Method Overriding**, **Encapsulation**, and **Polymorphism**—to manage and calculate properties for 2D shapes and 3D spatial solids.

---

## 💻 Core OOP Concepts Applied

| Concept | Implementation in Code |
| :--- | :--- |
| **Inheritance** | Class inheritance hierarchy: `BentukGeometri` ➔ `Lingkaran` ➔ `Tabung` |
| **Overriding** | Custom implementation of `cetakAtribut()` in each subclass |
| **Polymorphism** | Processing multiple shape types using a parent array `BentukGeometri[]` |
| **Encapsulation** | Field protection using `private`/`protected` access modifiers with getters and setters |

---

## 🗂️ Class Hierarchy

```
BentukGeometri (Superclass)
 ├── BujurSangkar (Subclass)
 └── Lingkaran (Subclass)
      └── Tabung (Multilevel Subclass)
```

### Class Responsibilities:
1. **`BentukGeometri`**: Parent class holding the common property `warnaDasar`.
2. **`BujurSangkar`**: Extends `BentukGeometri` to calculate square area based on `panjangSisi`.
3. **`Lingkaran`**: Extends `BentukGeometri` to calculate circle area based on radius `r`.
4. **`Tabung`**: Subclass of `Lingkaran` calculating cylinder volume using base area and `tinggiTabung`.
5. **`AplikasiUtama`**: Main driver class providing an interactive terminal user interface.

---

## 🚀 How to Run the Application

1. **Compile all Java source files:**
   ```bash
   javac BentukGeometri.java BujurSangkar.java Lingkaran.java Tabung.java AplikasiUtama.java
   ```

2. **Run the main class:**
   ```bash
   java AplikasiUtama
   ```

---

## 📑 Interactive Terminal Options

* **Option [1]**: Input dimensions & calculate Square area.
* **Option [2]**: Input dimensions & calculate Circle area.
* **Option [3]**: Input dimensions & calculate Cylinder volume.
* **Option [4]**: Run Polymorphism test demonstration.
* **Option [5]**: Exit program.