drop schema if exists test;
create schema test;
use test;

create table db1(
    id int primary key
);

create table db2(
    name varchar(20) primary key
);
insert into db2 values ('test'), ('测试');