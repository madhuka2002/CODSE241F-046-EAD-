# Enterprise Application Development 1 - Course Work

Welcome to the **Q-EXAMZ** project! This document provides a detailed guide on how to set up and run the project.

---

## Project Description

**Q-EXAMZ** is an enterprise application designed to provide an online quiz platform tailored for the education sector. It simplifies quiz creation, management, and reporting, offering distinct roles for administrators, lecturers, and students. 

### Key Features

#### **Admin**
- **User Management**: Add, update, delete, and manage user roles (Admin, Student).
- **Quiz Management**: Create and manage quizzes.
- **Dashboard**: Provides an overview of system activities.
- **Reporting**: Generate detailed reports on quiz results and user lists.

#### **Lecturer**
- **Quiz Creation**: Create quizzes for students.
- **Dashboard**: Access insights and manage quizzes.
- **Reporting**: Generate reports for quiz results of all students.

#### **Student**
- **Quiz Participation**: Enter a unique quiz code to attempt a quiz (only once per quiz).
- **Result Generation**: Generate a result sheet at the end of the quiz.

---

## Prerequisites

Before you begin, ensure you have the following installed on your system:

1. **XAMPP**
   - Used to run Apache and MySQL servers.
   - [Download XAMPP](https://www.apachefriends.org/download.html)
2. **NetBeans IDE**
   - Required to open and run the project.
   - [Download NetBeans](https://netbeans.apache.org/download/)

---

## Steps to Set Up and Run

### 1. Start XAMPP and Set Up the Database

1. Open **XAMPP** and start the following services:
   - **Apache**
   - **MySQL**

2. Open your browser and go to **phpMyAdmin** by navigating to:
   ```
   http://localhost/phpmyadmin
   ```

3. Import the `oes.sql` file into phpMyAdmin:
   - Click on the **"Import"** tab in phpMyAdmin.
   - Click **"Choose File"** and select the `onlineexam01.sql` file from your project directory.
   - Click **"Go"** to import the database.

### 2. Open the Project in NetBeans

1. Open **NetBeans IDE**.
2. Click on **File > Open Project**.
3. Navigate to the **Q-EXAMZ** folder and select it.
4. Once the project is loaded, ensure all dependencies are properly resolved.

### 3. Clean, Build, and Run the Project

1. In NetBeans, right-click on the project in the **Projects** tab.
2. Select **"Clean and Build"** to clean and compile the project.
3. After building, right-click the project again and select **"Run"** to start the application.

---

### Login Credentials
Use the following credentials to log in based on the role:

**Admin Role**

Username: admin

Password: admin123

**Student Role**

Username: student1

Password: student123

---

## Troubleshooting

- **Issue:** Unable to access phpMyAdmin.
  - **Solution:** Ensure XAMPP's Apache and MySQL services are running.

- **Issue:** Errors while importing the `onlineexam01.sql` file.
  - **Solution:** Check if the file is valid and the database is empty before importing.

- **Issue:** NetBeans shows build errors.
  - **Solution:** Ensure all dependencies and libraries are correctly configured in the project.
