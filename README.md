# ⚡ DSA-Solutions-Java  
> **My Journey to  Master Algorithms & Data Structures**

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![LeetCode](https://img.shields.io/badge/LeetCode-FFA116?style=for-the-badge&logo=LeetCode&logoColor=black)
![Data_Structures](https://img.shields.io/badge/Data_Structures-007ACC?style=for-the-badge&logo=databricks&logoColor=white)

This repository isn't just code—it's a structured roadmap of my technical growth. From basic arrays to complex dynamic programming, I document every pattern I learn.

---

### 📚 Learning Roadmap & Patterns
I focus on **Patterns**, not just problems. Here is what I am currently mastering:

| Pattern | Logic / Intuition | Problems Solved |
| :--- | :--- | :--- |
| **Two Pointers** | Reducing $O(n^2)$ to $O(n)$ using two indices. | [Two Sum](./Leetcode/twosum.java), [Valid Palindrome](./Leetcode/vaildpalindrome.java) |
| **Prefix Logic** | Precomputing values for $O(1)$ range queries. | [Reverse Prefix](./Leetcode/reversestringprefix.java) |
| **Math & Logic** | Handling overflows and number theory. | [Reverse Integer](./Leetcode/reverseinteger.java), [Palindrome Number](./Leetcode/palindromenumber.java) |

---

### ⏱️ Complexity Cheat Sheet (Java)
*Quick reference for my 4th Sem "Analysis of Algorithms" Prep:*

| Data Structure | Access | Search | Insertion | Deletion |
| :--- | :--- | :--- | :--- | :--- |
| **Array** | $O(1)$ | $O(n)$ | $O(n)$ | $O(n)$ |
| **ArrayList** | $O(1)$ | $O(n)$ | $O(1)$* | $O(n)$ |
| **HashMap** | $N/A$ | $O(1)$ | $O(1)$ | $O(1)$ |

---

### 🛠️ How to Use This Repo
1. **Browse by Folder:** Check the [Leetcode](./Leetcode) folder for specific problem types.
2. **Review Complexity:** Every solution includes a `// Time & Space Complexity` comment at the top.
3. **Run Locally:** ```bash
   javac Leetcode/twosum.java
   java Leetcode.twosum
