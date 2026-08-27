# Java 2D Array Task

A collection of Java programs demonstrating common two-dimensional array operations — matrix addition, display, multiplication, and triangular matrix detection.

## 📋 Programs

### 1. Matrix Addition — `twodimensionalarrayaddition.java`
Reads two matrices of the same size and prints their element-wise sum.

**Input:** number of rows, number of columns, elements of matrix 1, elements of matrix 2
**Output:** the resulting sum matrix (element by element)

### 2. Matrix Display — `twodimensionalarraydisplay.java`
Reads a matrix and prints all its elements.

**Input:** number of rows, number of columns, matrix elements
**Output:** each element of the matrix

### 3. Matrix Multiplication — `twodimensionalarraymultiplication.java`
Reads two matrices and multiplies them (if valid), printing the resultant matrix.

**Input:** rows/columns of matrix A, rows/columns of matrix B, elements of both matrices
**Output:** the resultant matrix, or an error if `columns of A ≠ rows of B`

### 4. Triangular Matrix Check — `twodimensionalarraytrianglematrix.java`
Reads a square `n x n` matrix and determines whether it's:
- **Right angled** — all elements above the main diagonal are zero
- **Left angled** — all elements below the main diagonal are zero
- **No angled** — neither condition holds

**Input:** `n`, followed by the `n x n` matrix elements
**Output:** `"Right angled matrix"`, `"Left angled matrix"`, or `"No angled matrix"`

## 🛠️ Tech Stack
- Java
- Uses `java.util.Scanner` for console input

## ▶️ How to Run

```bash
# Compile
javac twodimensionalarray/<ClassName>.java

# Run
java twodimensionalarray.<ClassName>
```

Replace `<ClassName>` with one of:
- `twodimensionalarrayaddition`
- `twodimensionalarraydisplay`
- `twodimensionalarraymultiplication`
- `twodimensionalarraytrianglematrix`

## 👤 Author
**Shiju Antony CS**
- GitHub: [@Shiju-Antony-C-S](https://github.com/Shiju-Antony-C-S)
- LinkedIn: [shiju-antony-c-s](https://www.linkedin.com/in/shiju-antony-c-s/)
