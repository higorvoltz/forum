create table curso(
    id bigint not null auto_increment,
    nome varchar(50) not null,
    categoria varchar(100) not null,
    primary key(id)
);

insert into curso values(1, "Kotlin", "Programação");