# Mock Interview Answers
## What are the four principles of OOP
1. Encapsulation <br>
  
  
      Combine operations into a single unit. The goal is to stop access to the encapsulated code from code outside of the encapsulation.
  
  
2. Abstraction <br>
  
  
      To isolate the properties that are important to the user and hide the more complicated parts that the user doesn't necessarily need interact with.
  
  
3. Inheritance<br>
   
   
   You can create child classes from parent classes. The child classes are able to implement any properties from their parent class
   
   
4. Polymorphism <br>
    
    
    One expression may denote multiple opperations, includeing overiding methods, and overloading constructors.
    
   <br>
    
    
    
   ## What is the Java String Pool
   
   
   The String pool is a storage area within the Java heap. The string pool keeps track of what strings have been created. It checks for variables that have called the same string twice or more, and if
   it has it will then point both variables to the same string instead of creating anoter string. This is done to save decrease memory overhead. 
