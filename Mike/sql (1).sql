
create database mike;


use mike;


CREATE TABLE endereco(
idEndereco  int AUTO_INCREMENT not null,
logradouro 	varchar(90) not null,
CEP varchar(8) not null,
bairro varchar(60) not null,
cidade varchar(60) not null,
estado varchar(60) not null,
numero varchar(5) not null,
complemento varchar(300),
primary key(idEndereco)
);

CREATE TABLE fornecedor(
idFornecedor int AUTO_INCREMENT not null ,
nomeFornecedor varchar(100) not null,
idEndereco int not null,
primary key(idFornecedor),
FOREIGN KEY (idEndereco) REFERENCES endereco(idEndereco)
);

CREATE TABLE cliente(
cpfCliente varchar(11) not null,
nomeCliente varchar(60) not null,
sexoCliente char(1) not null,
emailCliente varchar(200) not null,
idEndereco int not null,
primary key(cpfCliente),
FOREIGN KEY (idEndereco) REFERENCES endereco(idEndereco)
);

CREATE TABLE categoria(
idCategoria int AUTO_INCREMENT not null,
nomeCategoria varchar(60) not null,
primary key(idCategoria)
);

CREATE TABLE produto(
idProduto int AUTO_INCREMENT not null,
nomeProduto varchar(60) not null,
precoProduto decimal(14,2) not null,
qtdProduto int not null,
idFornecedor int not null,
idCategoria int not null,
primary key(idProduto),
FOREIGN KEY (idFornecedor) REFERENCES fornecedor(idFornecedor),
FOREIGN KEY (idCategoria) REFERENCES categoria(idCategoria)

);

CREATE TABLE venda(
idVenda int AUTO_INCREMENT not null,
valorVenda 	numeric(14,2)not null,
statusVenda char(1) not null,
cpfCliente 	char(11) not null,
primary key(idVenda),
FOREIGN KEY (cpfCliente) REFERENCES cliente(cpfCliente)
);


CREATE TABLE venda_descricao(
idVenda int not null,
idProduto int not null,
dtVenda datetime not null,	
PRIMARY KEY(idVenda, idProduto, dtVenda)
FOREIGN KEY (idVenda) REFERENCES cliente(idVenda),
FOREIGN KEY (idProduto) REFERENCES cliente(idProduto)

);