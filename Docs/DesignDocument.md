# Design Document

**Authors**: Daniel Bansch and Jason Buoni

## 1 Design Considerations

### 1.1 Assumptions

1. The application will be run only on Android smartphones.
	- The Android smartphones will have at least an API 19 our higher
2. The application will support only one user, and does not need to be distributed. 
3. Users of the application will understand the English language.


### 1.2 Constraints

1. Application has to run on Android.
2. Application has to be able to save user related data in some sort of way.
3. Applicaiton has to support API level 19, at a minimum.


### 1.3 System Environment
The application will run on Android smartphones that have at least an API level of 19 (Kit Kat). Android smartphones that have higher API levels can also be used to run
the application. The application will store data in an SQLite database packaged with the application.

## 2 Architectural Design

*The architecture provides the high-level design view of a system and provides a basis for more detailed design work. These subsections describe the top-level components of the system you are building and their relationships.*

### 2.1 Component Diagram

The Component Diagram is shown in the following image.  The four user interfaces of the application are shown on the left hand side.  They connect to the android Activity components of the application.  The Activities all connect to the Model component through the DAOI interface.  The Model connects to the GroceryListDB sqlite database through JDBC.

The changes to made to the component diagram in version 2 include adding the AddNewItem UI and Activity and adding interface symbols to the diagram.

###[Component Diagram](https://github.gatech.edu/gt-omscs-se-2016fall/6300Fall16Team47/blob/master/Images/v2_ComponentDiagram.png)
![alt text](https://github.gatech.edu/gt-omscs-se-2016fall/6300Fall16Team47/blob/master/Images/v2_ComponentDiagram.png "Component Diagram")

### 2.2 Deployment Diagram

A Deployment Diagram is not necessary for this application.  There is only one node, the android device, which runs the application and the sqlite database. 

## 3 Low-Level Design

### 3.1 Class Diagram

The UML class diagram of the system is shown in the following image.  The diagram was modified from the original file (team.png) to make the application android specific.  This included adding activity classes and adapter classes.  A DatabaseContract class was added so that changes to the database such as to table names only have to be made in one class.  

###[Class Diagram](https://github.gatech.edu/gt-omscs-se-2016fall/6300Fall16Team47/blob/master/Images/v3_team.png)
![alt text](https://github.gatech.edu/gt-omscs-se-2016fall/6300Fall16Team47/blob/master/Images/v3_team.png "Class Diagram")

### 3.2 Other Diagrams 

**NOTE** These diagrams are currently all in progress, and are not yet fine tuned. They will be more or less, "living documents" and the project progresses. 

###[Sequence Diagram](https://github.gatech.edu/gt-omscs-se-2016fall/6300Fall16Team47/blob/master/Docs/Diagrams/GLM_Sequence.pdf)
![alt text](https://github.gatech.edu/gt-omscs-se-2016fall/6300Fall16Team47/blob/master/Images/GLM_Sequence.png "Sequence Diagram")

The Sequence diagram covers some of the basic functions of the GLM application, including adding a list, and adding an item to that list. 



## 4 User Interface Design
The four GUI screens that make up the application are shown in the following image.  The first screen shows the "My Lists" page, which contains all of the user's grocery lists.  The user can add a list, delete lists, open a list to view or edit from this activity.  The second screen shows the list management screen where the user can check and uncheck item and delete or add items.  The third screen shows the search items page.  Here, the user can search for an item to add it to the list or create a new item.  The fourth screen shows the page where a user can add an item by item type to a list.

###[GUI Design](https://github.gatech.edu/gt-omscs-se-2016fall/6300Fall16Team47/blob/master/Images/FullGUI.PNG)
![alt text](https://github.gatech.edu/gt-omscs-se-2016fall/6300Fall16Team47/blob/master/Images/FullGUI.PNG "GUI Design")

