# Hello, Welcome to my CoolBeans README☕☕

# 📚 Table of Contents
### About the Project
### Features
### Getting Started
### Folder Structure
### Code Examples
### Images
### Markdown Reference
### Contributing

# About the Project

## Cool Beans Coffee is a Java console-based Point-of-Sale (POS) system for a custom coffee shop.

## Customize drinks

### Choose flavors and milk types

### Add pastries

### Add extra toppings

### Receive a nicely formatted printed receipt

### Have receipts automatically saved in a /receipts/ folder
# OOP Concepts Used
## Inheritance

## Used when:

### Coffee class

### Drink class

### Side class

# Inherited from the parent class Items

### Items is an abstract class, requiring subclasses to implement their own calculatePrice() method.

# Polymorphism

## Order stores:

## List<Items> items
## This allows Coffee, Drink, or Side objects to be handled the same way.

Encapsulation

Fields like:

private String name;


are hidden and accessed only through getters and methods like addAddOn().

File I/O

Receipt.save() writes a receipt file using:

FileWriter writer


Saved inside a /receipts folder.

Lists & Streams

Add-on totals use Streams:

addOns.stream().mapToDouble(AddOn::getPrice).sum();

# 🎯 Features
### ✔ Coffee Customization

### Size (small, medium, large)

### Milk: oat, almond, coconut, whole

# Flavors

## Iced options

## Add-ons (foam, syrup, whipped cream)

# ✔ Additional Drinks

### Matcha

### Hot Chocolate

# Optional add-ons

### ✔ Pastries

### Croissants

### Muffins

### Cookies

# ✔ Receipt Generation

### Automatically saved to /receipts/

### Timestamped
### Centered text formatting
## Folder Structure
![Folders:classes.jpg](../../Capstone%201/Screenshot/Folders%3Aclasses.jpg)
CoolBeansCoffee/
│
├── AddOn.java
├── Coffee.java
├── CoolBeansCoffee.java
├── Drink.java
├── Items.java
├── Order.java
├── OrderScreen.java
├── Receipt.java
├── Side.java
│
└── receipts/
└── <timestamp>.txt
## Screenshots
![CBC receipt.jpg](../../Capstone%201/Screenshot/CBC%20receipt.jpg)

## UML Diagram
![img.png](img.png)

## My Favorite code for this cafe is 


# Conclusion 
Made by Sherman Turner-Robinson
Thanks for stopping by my shop! ☕ :)
If you have ideas to make Cool Beans Coffee even tastier, feel free to share.
