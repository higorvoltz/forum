create table usuario(
    id bigint not null auto_increment,
    nome varchar(100) not null,
    email varchar(100) not null,
    primary key(id)
);

insert into usuario values(1, "Higor Amorim", "higor137785@gmail.com");