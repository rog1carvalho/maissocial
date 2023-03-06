  create table jovens(
      id bigint not null auto_increment,
      nome varchar (100) not null,
      email varchar (100) not null unique,
      idade varchar (2) not null,
      curso varchar (100) not null,
      rua varchar (100) not null,
      bairro varchar (100) not null,
      cep varchar (9) not null,
      complemento varchar (100),
      numero varchar (20),
      uf char (2) not null,
      cidade varchar (100) not null,

      primary key (id)
  );