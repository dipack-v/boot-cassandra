//CREATE KEYSPACE mykeyspace WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 1 };
//use mykeyspace;
CREATE TABLE CONTAINER(containerNumber text PRIMARY KEY, type text, size int);
