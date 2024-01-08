package com.zulal.codementor;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myRecyclerView;
    RecyclerViewAdapter myAdapter;

    List<ProgrammingLanguage.Languages> languages1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        languages1 = new ArrayList<>();
        languages1.add(new ProgrammingLanguage.Languages("Python", "What is Python? \n\n" +
                "Python is a high-level, general-purpose, interpreted object-oriented programming language. Similar to PERL, Python is a programming language popular among experienced C++ and Java programmers." +
                "\n" +
                "Working in Python, users can interpret statements in several operating systems, including UNIX-based systems, Mac OS, MS-DOS, OS/2 and various versions of Microsoft Windows 10 and Windows 11.", "Learning Method \n\n\n\n",
                "WHAT WE LEARN ABOUT PYTHON ?\n\n" +
                        "Basic Syntax:\n" +
                        "\n" +
                        "Variables and Data Types\n" +
                        "Operators\n" +
                        "Conditional Statements (if, else, elif)\n" +
                        "Loops (for, while)\n" +
                        "\n"+
                        "Basic Data Structures:\n" +
                        "\n" +
                        "Lists, Tuples, Sets, Dictionaries\n" +
                        "String manipulations\n" +
                        "\n"+
                        "Functions:\n" +
                        "\n" +
                        "Function definition and invocation\n" +
                        "Parameters and Arguments\n" +
                        "Return values\n" +
                        "\n"+
                        "File Handling:\n" +
                        "\n" +
                        "Opening, reading, writing, and closing files\n" +
                        "\n"+
                        "Modules and Libraries:\n" +
                        "\n" +
                        "Importing modules\n" +
                        "Exploring popular libraries (e.g., math, random, datetime)\n" +
                        "\n"+
                        "Exception Handling:\n" +
                        "\n" +
                        "Using try, except, finally blocks\n" +
                        "\n"+
                        "Object-Oriented Programming (OOP):\n" +
                        "\n" +
                        "Class definition\n" +
                        "Creating and using objects\n" +
                        "Inheritance\n" +
                        "\n"+
                        "Decorators and Advanced Topics:\n" +
                        "\n" +
                        "Function decorators\n" +
                        "Generators\n" +
                        "Iterators\n", R.drawable.python));

        languages1.add(new ProgrammingLanguage.Languages("Java", "What is Java? \n\n" +
                "Java is a high-level, object-oriented programming language that was developed by Sun Microsystems in the mid-1990s. It is designed to be platform-independent, meaning that Java programs can run on any device that has a Java Virtual Machine (JVM) installed. The \"Write Once, Run Anywhere\" (WORA) principle is a key feature of Java.", "Learning Method", "WHAT WE LEARN ABOUT JAVA?\n\n" +
                "Syntax and Basic Structure:\n" +
                "\n" +
                "Understanding the basic syntax of Java, including variables, data types, and operators.\n" +
                "Learning how to declare and use classes and methods.\n\n" +
                "Object-Oriented Programming (OOP):\n" +
                "\n" +
                "Grasping the principles of OOP, such as encapsulation, inheritance, polymorphism, and abstraction.\n" +
                "Creating and using objects in Java.\n\n" +
                "Control Flow Statements:\n" +
                "\n" +
                "Working with conditional statements (if, else if, else) and switch statements.\n" +
                "Understanding looping constructs (for, while, do-while).\n\n" +
                "Data Structures:\n" +
                "\n" +
                "Learning about arrays and collections (Lists, Sets, Maps).\n" +
                "Exploring how to manipulate and traverse data structures.\n\n" +
                "Exception Handling:\n" +
                "\n" +
                "Understanding how to handle exceptions and errors in Java using try, catch, finally blocks.\n" +
                "Creating custom exceptions.\n\n" +
                "File I/O:\n" +
                "\n" +
                "Reading from and writing to files using Java I/O classes.\n\n" +
                "Multithreading:\n" +
                "\n" +
                "Exploring concurrent programming with multithreading.\n" +
                "Synchronization and coordination between threads.\n\n" +
                "Networking:\n" +
                "\n" +
                "Understanding basic networking concepts in Java.\n" +
                "Working with sockets for communication.\n\n" +
                "Database Connectivity:\n" +
                "\n" +
                "Connecting to databases using JDBC (Java Database Connectivity).\n" +
                "Executing SQL queries and managing database connections.\n\n" +
                "GUI Programming:\n" +
                "\n" +
                "Creating graphical user interfaces using Swing or JavaFX.\n" +
                "Event-driven programming in GUI applications.\n\n" +
                "Memory Management:\n" +
                "\n" +
                "Understanding Java's automatic memory management using garbage collection.\n" +
                "Managing memory resources effectively.\n\n" +
                "Build Tools and IDEs:\n" +
                "\n" +
                "Working with popular Java IDEs like Eclipse, IntelliJ IDEA, or NetBeans.\n" +
                "Basics of build tools like Maven or Gradle.\n\n" +
                "Version Control:\n" +
                "\n" +
                "Basic usage of version control systems like Git for managing source code.\n\n" +
                "Testing:\n" +
                "\n" +
                "Writing and running unit tests using JUnit or TestNG.\n" +
                "Understanding the importance of testing in the software development process.\n\n" +
                "Deployment:\n" +
                "\n" +
                "Packaging and deploying Java applications.\n" +
                "Understanding executable JAR files and WAR files for web applications.\n\n" +
                "Security:\n" +
                "\n" +
                "Basics of Java security features.\n" +
                "Best practices for writing secure Java code.\n", R.drawable.indir));

        languages1.add(new ProgrammingLanguage.Languages("JavaScript", "What is Javascript? \n\n" +
                "JavaScript is a high-level, versatile programming language primarily known for its use in web development. It is commonly used to create dynamic and interactive content on websites. JavaScript can run on a user's web browser, allowing for client-side scripting, as well as on servers, enabling server-side scripting. This versatility makes it a crucial component in modern web development.", "Learning Method",
                "WHAT WE LEARN ABOUT JAVASCRİPT ? \n\n"+
                        "Basic Syntax: Understanding the basic syntax of JavaScript, including variables, data types, and operators, is fundamental. This forms the foundation for writing JavaScript code.\n" +
                        "\n" +
                        "Control Flow: JavaScript includes control flow statements like if, else, while, and for to control the execution of code based on conditions and loops.\n" +
                        "\n" +
                        "Functions: Functions in JavaScript allow you to group code into reusable blocks. You can define functions, pass parameters, and return values.\n" +
                        "\n" +
                        "Objects and Arrays: JavaScript is an object-oriented language. You'll learn about creating objects and arrays to organize and store data.\n" +
                        "\n" +
                        "DOM Manipulation: The Document Object Model (DOM) represents the structure of HTML documents in a tree-like structure. JavaScript allows you to manipulate the DOM, changing the content, structure, and style of a web page dynamically.\n" +
                        "\n" +
                        "Events: JavaScript enables interaction with users through events. You can respond to user actions like clicks, keypresses, and mouse movements.\n" +
                        "\n" +
                        "Asynchronous JavaScript: Understanding asynchronous programming is crucial. This includes concepts like callbacks, promises, and async/await, which are essential for dealing with tasks such as fetching data from a server.\n" +
                        "\n" +
                        "AJAX and Fetch API: You'll learn about making asynchronous requests to servers using technologies like AJAX (Asynchronous JavaScript and XML) or the modern Fetch API to retrieve or send data.\n" +
                        "\n" +
                        "ES6 and Beyond: JavaScript has evolved over the years, introducing new features and syntax enhancements. ES6 (ECMAScript 2015) and subsequent versions brought features like arrow functions, destructuring, template literals, and more.\n" +
                        "\n" +
                        "Error Handling: Dealing with errors is an important part of programming. You'll learn about try-catch blocks and handling exceptions in JavaScript.\n" +
                        "\n" +
                        "Closures and Scope: Understanding how scope works in JavaScript, including lexical scoping and closures, is important for writing efficient and bug-free code.\n" +
                        "\n" +
                        "Modules: JavaScript supports modular programming. You'll learn how to organize your code into reusable and maintainable modules.\n" +
                        "\n" +
                        "Promises and Asynchronous Programming: JavaScript uses promises to handle asynchronous operations, making it easier to manage and reason about asynchronous code.\n" +
                        "\n" +
                        "Frameworks and Libraries: Depending on your focus, you might also learn about popular JavaScript libraries and frameworks like React, Angular, or Vue.js for building dynamic and interactive user interfaces.\n" +
                        "\n", R.drawable.javascript));

        languages1.add(new ProgrammingLanguage.Languages("C++", "What is C++? \n" +
                "\n" +
                "C++ is a general-purpose programming language that was developed as an extension of the C programming language. It was created by Bjarne Stroustrup at Bell Labs in the early 1980s. C++ includes features from both low-level languages (like C) and high-level languages, providing a powerful and flexible programming environment.", "Learning Method",
                "WHAT WE LEARN ABOUT C++? \n\n"+
                        "Basic Syntax:\n" +
                        "\n" +
                        "Variables and Data Types: Integers, floating-point numbers, characters, and more.\n\n" +
                        "Operators:\n\n" +
                        "Arithmetic, relational, logical, bitwise, etc.\n" +
                        "Control Flow: If statements, loops (for, while, do-while), switch statements.\n\n" +
                        "Functions:\n" +
                        "\n" +
                        "Declaration and definition of functions.\n" +
                        "Parameters and return types.\n" +
                        "Function overloading.\n\n" +
                        "Object-Oriented Programming (OOP):\n" +
                        "\n" +
                        "Classes and Objects.\n" +
                        "Constructors and Destructors.\n" +
                        "Inheritance and Polymorphism.\n" +
                        "Encapsulation and Abstraction.\n\n" +
                        "Pointers and Memory Management:\n" +
                        "\n" +
                        "Pointers and references.\n" +
                        "Dynamic memory allocation and deallocation (new and delete operators).\n" +
                        "Smart pointers (shared_ptr, unique_ptr) for safer memory management.\n\n" +
                        "Standard Template Library (STL):\n" +
                        "\n" +
                        "Containers: Vectors, lists, queues, stacks, etc.\n" +
                        "Algorithms: Sort, find, transform, etc.\n" +
                        "Iterators and iterators-based algorithms.\n\n" +
                        "Templates and Generic Programming:\n" +
                        "\n" +
                        "Function templates and class templates.\n" +
                        "Template specialization.\n\n" +
                        "File I/O:\n" +
                        "\n" +
                        "Reading from and writing to files.\n\n" +
                        "Exception Handling:\n" +
                        "\n" +
                        "try, catch, throw statements for handling exceptions.\n\n" +
                        "Concurrency:\n" +
                        "\n" +
                        "Basics of multithreading and synchronization.\n" +
                        "C++11 and later features like std::thread and std::mutex.\n\n" +
                        "Advanced Topics:\n" +
                        "\n" +
                        "Lambda expressions.\n" +
                        "Move semantics and rvalue references.\n" +
                        "C++11, C++14, C++17, C++20 features (depending on the version used).\n\n" +
                        "Development Tools and Practices:\n" +
                        "\n" +
                        "Compilation and linking.\n" +
                        "Debugging techniques.\n" +
                        "Use of Integrated Development Environments (IDEs).\n\n" +
                        "Practical Application:\n" +
                        "\n" +
                        "Writing programs and projects to reinforce learning.\n" +
                        "Solving coding problems and challenges.\n\n" +
                        "Best Practices:\n" +
                        "\n" +
                        "Writing efficient and maintainable code.\n" +
                        "Code organization and style conventions.", R.drawable.cplus));

        languages1.add(new ProgrammingLanguage.Languages("C#", "What is C# ? \n" +
                "\n" +
                "C# (pronounced \"C sharp\") is a modern, object-oriented programming language developed by Microsoft as part of the .NET initiative. It was first introduced in 2000 and has since become one of the primary languages for building Windows applications and web services on the Microsoft .NET framework", "Learning Method",
                "WHAT WE LEARN ABOUT C#?\n\n"+
                        "Basic Syntax: Understand the basic syntax of C#, including variables, data types, operators, and control flow structures like loops and conditional statements.\n" +
                        "\n" +
                        "Object-Oriented Programming (OOP): Learn the principles of OOP, such as classes, objects, inheritance, encapsulation, and polymorphism.\n" +
                        "\n" +
                        ".NET Framework: Explore the .NET framework and its various components. Learn about the Common Language Runtime (CLR) and the Base Class Library (BCL), which provides a rich set of classes for common tasks.\n" +
                        "\n" +
                        "C# Data Types and Variables: Understand the different data types in C# (integers, floating-point numbers, strings, etc.) and how to declare and use variables.\n" +
                        "\n" +
                        "Methods and Functions: Learn how to define and use methods and functions in C# for code modularity and reusability.\n" +
                        "\n" +
                        "Exception Handling: Understand how to handle exceptions and errors in C# using try-catch blocks.\n" +
                        "\n" +
                        "Collections: Explore different collection types in C# such as arrays, lists, dictionaries, and understand how to manipulate and iterate through them.\n" +
                        "\n" +
                        "LINQ (Language Integrated Query): Learn about LINQ, a powerful feature in C# that allows querying data directly within the language.\n" +
                        "\n" +
                        "Asynchronous Programming: Understand asynchronous programming using async and await keywords, which is crucial for handling asynchronous tasks efficiently.\n" +
                        "\n" +
                        "File I/O: Learn how to read from and write to files using C#.\n" +
                        "\n" +
                        "Database Connectivity: Explore database connectivity in C# using technologies like ADO.NET or Entity Framework.\n" +
                        "\n" +
                        "Graphical User Interface (GUI) Programming: If you are developing desktop applications, you'll likely learn about creating graphical user interfaces using Windows Forms or WPF.\n" +
                        "\n" +
                        "Web Development with ASP.NET: Explore web development using C# with ASP.NET for building web applications.\n" +
                        "\n" +
                        "Unit Testing: Understand the basics of unit testing in C# to ensure the reliability of your code.\n" +
                        "\n" +
                        "Version Control: Learn how to use version control systems like Git to manage your codebase.\n" +
                        "\n" +
                        "Integrated Development Environment (IDE): Familiarize yourself with an IDE like Visual Studio for writing, debugging, and managing your C# projects.\n" +
                        "\n" +
                        "Best Practices and Design Patterns: Learn coding best practices and common design patterns to write clean, efficient, and maintainable code.\n" +
                        "\n" +
                        "Deployment: Understand how to package and deploy C# applications."
                , R.drawable.csharp));

        myRecyclerView = findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this, languages1); //RecyclerViewAdapter sınıfından bir (myAdapter) oluştu olş listesi bu adaptöre atanır.

        myRecyclerView.setLayoutManager(new GridLayoutManager(this, 1)); //sütun düzen

        myRecyclerView.setAdapter(myAdapter);
    }
}
