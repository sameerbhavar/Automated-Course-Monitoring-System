


Admin Table
=============

create table admin
(
username varchar(20) primary key,
password varchar(15) not null
);


Faculty
============

create table faculty
(
facultyid int primary key auto_increment,
facultyname varchar(20) not null,
facultyaddress varchar(25),
mobile varchar(15),
email varchar(15) not null,
username varchar(20) not null,
password varchar(15)not null
);


Course
=========

create table course
(
courseid int primary key auto_increment,
coursename varchar(20) not null,
fee int  not null,
courseDescription varchar(50)
);

Batch
=======

create table batch
(
batchid int primary key auto_increment,
courseid int ,
facultyid int,
numberofStudents int,
batchatcstartdate date,
duration varchar(20),
foreign key(courseid) references course(courseid),
foreign key(facultyid) references faculty(facultyid)
);

CoursePlan
============

create table coursePlan
(
planid int primary key auto_increment,
batchid int,
daynumber int,
topic varchar(20),
status varchar(8),
foreign key(batchid) references batch(batchid)
);

Faculty
=========


insert into faculty(facultyname,facultyaddress,mobile,email,username,password) values('chander','kolkata','12346','chander@gmail.com','chander','123');
insert into faculty(facultyname,facultyaddress,mobile,email,username,password) values('swanand','nagpur','654123','swanand@gmail.com','swanand','123');
insert into faculty(facultyname,facultyaddress,mobile,email,username,password) values('Ankush','delhi','987456','ankush@gmail.com','ankush','123');
insert into faculty(facultyname,facultyaddress,mobile,email,username,password) values('venu','tamil','369852','venu@gmail.com','venu','123');
insert into faculty(facultyname,facultyaddress,mobile,email,username,password) values('ratan','M.P','852147','ratan@gmail.com','ratan','123');

+-----------+-------------+----------------+--------+-------------------+----------+----------+
| facultyid | facultyname | facultyaddress | mobile | email             | username | password |
+-----------+-------------+----------------+--------+-------------------+----------+----------+
|         1 | venu        | tamil          | 369852 | venu@gmail.com    | venu     | 123      |
|         2 | ratan       | M.P            | 852147 | ratan@gmail.com   | ratan    | 123      |
|         3 | chander     | kolkata        | 12346  | chander@gmail.com | chander  | 123      |
|         4 | swanand     | nagpur         | 654123 | swanand@gmail.com | swanand  | 123      |
|         5 | Ankush      | delhi          | 987456 | ankush@gmail.com  | ankush   | 123      |
+-----------+-------------+----------------+--------+-------------------+----------+----------+

Course
========

insert into course(coursename,fee,courseDescription) values('Java',50000,'full time course ');
insert into course(coursename,fee,courseDescription) values('Mern',30000,'full time course ');
insert into course(coursename,fee,courseDescription) values('Spring',20000,'full time course ');
insert into course(coursename,fee,courseDescription) values('DSA',30000,'full time course ');
insert into course(coursename,fee,courseDescription) values('React',10000,'full time course ');

+----------+------------+-------+-------------------+
| courseid | coursename | fee   | courseDescription |
+----------+------------+-------+-------------------+
|        1 | Java       | 50000 | full time course  |
|        2 | Mern       | 30000 | full time course  |
|        3 | Spring     | 20000 | full time course  |
|        4 | DSA        | 30000 | full time course  |
|        5 | React      | 10000 | full time course  |
+----------+------------+-------+-------------------+




Batch
=======

insert into batch(courseid,facultyid,numberofStudents,batchstartdate,duration) values(1,2,10,'2022/08/01','50-days');
insert into batch(courseid,facultyid,numberofStudents,batchstartdate,duration) values(2,1,20,'2022/07/01','50-days');
insert into batch(courseid,facultyid,numberofStudents,batchstartdate,duration) values(3,1,30,'2022/06/05','50-days');
insert into batch(courseid,facultyid,numberofStudents,batchstartdate,duration) values(4,3,25,'2022/07/15','50-days');
insert into batch(courseid,facultyid,numberofStudents,batchstartdate,duration) values(3,4,18,'2022/06/12','50-days');

+---------+----------+-----------+------------------+----------------+----------+
| batchid | courseid | facultyid | numberofStudents | batchstartdate | duration |
+---------+----------+-----------+------------------+----------------+----------+
|       1 |        1 |         2 |               10 | 2022-08-01     | 50-days  |
|       2 |        2 |         1 |               20 | 2022-07-01     | 50-days  |
|      10 |        3 |         1 |               30 | 2022-06-05     | 50-days  |
|      12 |        4 |         3 |               25 | 2022-07-15     | 50-days  |
|      13 |        3 |         4 |               18 | 2022-06-12     | 50-days  |
+---------+----------+-----------+------------------+----------------+----------+


CoursePlan
============

insert into coursePlan(batchid,daynumber,topic,status) values(2,1,'introduction to Mern','complete');
insert into coursePlan(batchid,daynumber,topic,status) values(10,3,'work on  spring','incomplete');
insert into coursePlan(batchid,daynumber,topic,status) values(2,2,'es6','complete');
insert into coursePlan(batchid,daynumber,topic,status) values(12,6,'jdbc','incomplete');
insert into coursePlan(batchid,daynumber,topic,status) values(13,2,'recursion','incomplete');

+--------+---------+-----------+----------------------+------------+
| planid | batchid | daynumber | topic                | status     |
+--------+---------+-----------+----------------------+------------+
|      1 |       2 |         1 | introduction to Mern | complete   |
|      6 |       1 |         6 | jdbc                 | incomplete |
|      8 |      10 |         3 | work on  spring      | incomplete |
|      9 |       2 |         2 | es6                  | complete   |
|     10 |      12 |         6 | jdbc                 | incomplete |
|     11 |      13 |         2 | recursion            | incomplete |
+--------+---------+-----------+----------------------+------------+
