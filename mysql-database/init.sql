drop schema if exists valued_ones;
create schema valued_ones;
use valued_ones;

create table user(
    id int auto_increment primary key,
    username varchar(32),
    password varchar(32),
    role char(5),
    related_pay_account_id int
);

create table shop(
    id int auto_increment primary key,
    service_name varchar(128),
    service_description varchar(256),
    residue int,
    payment_receive_account_id int
);

create table pay(
    id int auto_increment primary key,
    username varchar(32),
    balance int
);

create table ordering(
    id int auto_increment primary key,
    buyer_id int,
    payment_id int,
    item_id int,
    amount int
);