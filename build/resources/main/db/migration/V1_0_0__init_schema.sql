create table if not exists users
(
    id varchar(20) not null primary key,
    name varchar(50) not null,
    email varchar(50) not null,
    age int not null,
    weight float not null,
    height int not null,
    goal int not null
);