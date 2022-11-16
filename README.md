# sakila-CRUD
CRUD operations using  Advanced JAVA, Struts2, Spring, Hibernate and Ext JS on Eclipse IDE

**OBJECTIVE:**

This project is used to train for developing web applications using advanced topics frameworks such as JSP/Servlets, Struts, Spring and Hibernate.

**PREREQUISITES:**
1. Eclipse with Web Application development project (2019+)
2. MySQL Database (Latest version)
3. Sakila schema in MySQL database
4. Tomcat 8.5+

**STEPS FOLLOWED FOR THE PROJECT BUILDING :**

1. Frontend UI Creation using EXTJS framework.
     a. Create a Form with text fields,date fields and combobox. Add a search button and a reset button. 
         
         Refer to the below mentioned specification for the Form Fields:-
              - Movie Name - Text Field
              - Director Name - Text Field
              - Release Year - Date Field
              - Language - Combobox
     b. Create a grid with the following fields:
     
          i. Title
          ii. Description
          iii. Release Year
          iv. Language
          v. Director Name
          vi. Rating
          vii. Special Features
          
    c. Create a model for the grid and a static store to display the data onto the grid.
    <img width="801" alt="image" src="https://user-images.githubusercontent.com/77729425/202121700-beae6387-bf0f-4874-979d-2bf99c42dc26.png">


 2. DB Connection and Data Fetching using JDBC
 
          i. Setup the servlet classes to get the grid data and handle Add, Edit and Delete requests
          ii. Create AJAX calls to your servlet. You will need to create different functions for handling different AJAX requests
          iii. Create a separate class file for database connection establishment using JDBC
          iv. Create a model class of the database table. The class variables need to be private
          v. The null values need to be handled and Release Year format should be YYYY
          vi. Return the data response from servlet to ExtJS UI in JSON format
   
 3. Struts Application
    
          i. Prepare the struts.xml 
          ii. Prepare the filter and filter mapping for your struts file inside the web.xml file
          iii. Implement MVC framework action layer. The struts action file should be used instead of the previously implemented servlet file for handling the api calls.
          iv. Convert the entire API handling from servlet to struts framework.
          v. You may create multiple action files or a single action file with multiple methods. Ideally a single JS UI should have a single action file.

 4. Spring Application
 
         i. Prepare the applicationContext.xml
         ii. code should follow the below mentioned flow: UI -> Action -> Manager -> Dao
         iii. The model Package should contain all the POJOs and DTOs.
         iv. The Dao Package would contain the DAO Interface and the DAOImpl Package would contain the implementation of the DAO Interface.
         v. Similar to DAO the Manager and ManagerImpl Package would follow the same steps.
    
  5. Hibernate Application
        
         i. Prepare the applicationContext.xml.
         ii. The project structure should look as shown in the below image. Note that the hbm.cfg.xml file should be present inside of the src folder.
         
 
 The Project structure can be described as follow:
<img width="209" alt="image" src="https://user-images.githubusercontent.com/77729425/202128740-2b60feae-453a-4fd0-9563-bba08ff13645.png">
