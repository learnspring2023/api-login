select * from user_info
where id = 1
and password = 'pass1';

delete from user_info;
insert into user_info values (1,'User1','pass1');
insert into user_info values (2,'User3','pass2');
select * from user_info;


------SQL - UNRELATED TO LOGIN-----

Database: Collection of tables
Table: Data fromat with Colums and rows

1) create table
2) insert data
3) fetch data 
1)

CREATE TABLE students (
    ID SERIAL PRIMARY KEY,
    Name VARCHAR(100),
    Course VARCHAR(100)
);

2)
INSERT INTO students (ID, Name, Course) VALUES (1, 'John Doe', 'Fullstack');
INSERT INTO students (ID, Name, Course) VALUES (2, 'Jane Smith', 'Testing');


Table: Student  
ID | Name | Course  
===================   
1    Chetan	 Fullstack  
//1    Ram	 Fullstack    
2    Chitra	 Testing  
  

select * from student;  

drop table user_info;  

