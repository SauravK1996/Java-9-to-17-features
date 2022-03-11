# Java 9 to 17 features
## Java 9
### _Collections_
Collections got a couple of new helper methods, to easily construct Lists, Sets and Maps.
### _Streams_
Streams got a couple of additions, in the form of takeWhile, dropWhile, iterate methods.
### _Interface_
private methods can be added to interfaces in Java
### _<> Diamond operator_
- introduced as a new features in Java 7
- problem with this is we can use it in normal classes but not with annonymous inner classes
- So, Java 9 improved the use of diamond operator and allows us to use the diamond operator with annonymous inner classes

### _Try with resources_
- introduced in Java 7 that helps to close resources automatically after being used
- it has limitation that requires resources to declare locally within its block
- but with Java 9 we are allowed to declare outside the try with resources block

### _Jshell_
Finally, Java got a shell where we can try out simple commands and get immediate results.

### _Module_
A module is a collection of code, data, and resources. It is a set of related packages and types (classes, abstract classes, interfaces, and more) with code, data files, and some static resources. For example, the module descriptor module-info. java is one of the resources in a Java 9 module.

## Java 10
### _var_
The var keyword was introduced in Java 10. Type inference is used in var keyword in which it detects automatically the datatype of a variable based on the surrounding context.

## Java 11
### _String methods_
String got some of new methods like isBlank, strip, lines.

### _Collections to array_
Now from Java 11, we can easily convert collections to a specific type array with its toArray() method.

### _Not Predicate static method_
- A static not method has been added to the Predicate interface. We can use it to negate the existing predicate, much like the negate method.
- We can use this with method reference.

### var Support
- Support for using local variable syntax (var keyword) in lambda parameters was added in Java 11.
- We can use this feature to apply modifiers to our local variable, like defining a type annotation.

## Java 14 
### _Helpful NPE_
- In practice, we often see or write code that chain methods in Java. But when this code throws a NullPointerException, it can become difficult to know from where the exception originates.
- From Java 14, a detailed NullPointerException message by describing the null variable, alongside the method, filename, and line number.

## Java 15
### _TextBlocks/Multiline Stirngs_
- Text blocks start with a """ (three double-quote marks) followed by optional whitespaces and a newline.
- When using text blocks, we can indent our code properly.
- Inside text blocks, double-quotes don't have to be escaped. We could even use three double-quotes again in our text block by escaping one of them.

## Java 16
### _Pattern matching of instanceof_
With pattern matching with instanceof we can reduce the boilerplate code of typecasting.

### Java 17
### _Sealed classes/interfaces_
- With the sealed modifier, you can declare a class as a sealed class. 
- A *sealed* class can provide a *permits* clause that lists the classes that extend it directly. If a class doesn’t appear in this list, it isn’t allowed to extend the sealed class.
- There are three types of classes that can extend a sealed class: __final, non-sealed, and sealed__. 
- You are probably used to working with *final* classes, which prevent any other class from extending them further. 
- The *non-sealed* classes are quite interesting: When a derived class is declared as non-sealed, it can be further extended by any other class; in other words, this part of the hierarchy is open to extension.

