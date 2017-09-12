Abstract Factory Design Pattern

Author - Pavithra Vinay (sole contributor)

About this Project:

This project is a combination of Animal Race and Animal Farm.

This is to demonstrate Abstract Factory design pattern, I have followed below approach to achieve this:
1. Create an Interface called “IRacer”.
2. Create concrete classes “Racer”, “ReverseRacerWithFood” and “MulticolorRacer” that implement “IRacer”
3. Create another interface called “IFarm”.
4. Create a concrete class called “HumanSocietyCenter” that implements “IFarm"
5. Create an Abstract class called “AbstractFactory.java” to get factories for “IRacer” and “IFarm” objects.
6. Create Factory class “RacerFactory” extending AbstractFactory to generate an object of concrete class - This is a singleton class.
7. Create Factory class “FarmFactory” extending AbstractFactory to generate an object of concrete class - This is a singleton class..
8. Create a Factory generator/producer class “FactoryProducer” to get factory by passing an information such as Racer and farm.
9. Create “AbstractFactoryPatternDemo” class - Use the FactoryProducer to get AbstractFactory in order to get factory of concrete classes by passing an information such as Factory type and farm.

This assignment has below classes and interfaces(Interface name starts with an ‘I’).

Classes reused from Strategy Design Pattern assignment:
1. “Animal” - Plain Old Java Object
2. “Food” - Plain Old Java Object
3. “IRacer”- is an interface that has a method displayAllAnimals().
4. “RacerDecorator” - is an abstract class that implements IRacer, constructor of this class takes a parameter of type IRacer. It has an abstract method displayAllAnimals()
5. “SongRacerDecorator” - is a concrete class that extends RacerDecorator class, hence implements displayAllAnimals() method which in turn calls playsong() method that takes a parameter of type IRacer.
6. “Racer” - This class has different methods to make animals race (plain racer).
7. “ReverseRacerWithFood” - This class has methods to make animals race in reverse direction and it displays a food panel.
8. “MultiColorRacer” - This class has methods to make racer change color dynamically.
9. “Context” - This class has executeStrategy() method. The Strategy object changes the executing algorithm of the context object.
10.”StrategyPatternDemo” - client class to demonstrate different strategies available for animal racing. I am creating an object of type ‘Context’ to demonstrate MultiColor Race strategy. 

Classes reused from animalFarm v1.5 assignment:
“IAnimal”, “Mammal”, “Bird”, “Dog”, “Cat”, “Chicken”, “Sparrow”, “Dalmatian”, “Poodle” and “HumanSocietyCenter” 


Newly created classes for Abstract Factory assignment:
1. ”AbstractFactory” - To get factory for “IRacer” objects
2. “RacerFactory” - To generate an object of concrete class “Racer” or “ReverseRacerWithFood” or “MulticolorRacer”
3. “FarmFactory” - To generate an object of concrete class “HumanSocietyCenter”.
3. “FactoryProducer” - To get a factory by passing an information such as Racer or farm.


To run this program:
1. Open source code in Eclipse or any IDE of your choice(Either import or create a new Java project and copy source code into that).
2. Go to “AbstractFactoryPatternDemo” class and execute it. 
	(/* Make sure to comment one of the code blocks(block1/block2) while executing the other  
	  * For instance, To work with Farm factory, comment code block 1 and uncomment code block 2
	  * To work with Racer factory, comment code block 2 and uncomment code block 1.
	/*)
3. Depending on the chosen factory, a window will be launched either to demonstrate animal race or animal farm.
4. In case of Animal Race, Click on animals of your choice to start racing. (You can pick more than 2 animals at once to race)
5. In case of Animal farm, a list of animals will be displayed with its details. Click on Add New Animal button to add a new animal and a new status report will be generated with updated count. 


Development Environment:
1. Mac OS X,  You might have to change image paths if you are using windows (just replace ‘/‘ with ’\\’).
2. Eclipse version - Mars.1 Release (4.5.1)
3. Java Version - 1.8.0_92




