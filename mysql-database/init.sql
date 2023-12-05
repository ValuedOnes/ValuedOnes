drop schema if exists test;
create schema test;
use test;

create table db1(
    id int primary key
);
insert into db1 values (1);

create table db2(
    name varchar(20) primary key
);