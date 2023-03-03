
create table  faculty\n
(
facultyid int primary key ,                                                                                                                                             facultyname varchar(12),
facultyaddress varchar(12),
mobile  varchar(15) unique,
email   varchar(12)unique,
username  varchar(12)unique,
password varchar(12)unique
);

create table  batch
(
batchid int primary key ,
courseid int ,
 facultyId int,
numberofStudents  int,
batchstartDate  DATE,
duration   varchar(12),
foreign key (courseid) references Course(courseid ),
foreign key ( facultyId) references faculty( facultyId)

);
     
create table  CoursPlan
(

planid int primary key ,
 batchid   int,
daynumber  int,
topic varchar(255),
status varchar(255),
foreign key ( batchid ) references   batch( batchid )

);
