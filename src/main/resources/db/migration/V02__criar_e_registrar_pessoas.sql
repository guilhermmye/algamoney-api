CREATE TABLE pessoa(
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	ativo BOOLEAN NOT NULL,
	logradouro VARCHAR(50),
	numero VARCHAR(10),
	complemento VARCHAR(50),
	bairro VARCHAR(50),
	cep VARCHAR(8),
	cidade VARCHAR(50),
	estado VARCHAR(50)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome,ativo,logradouro,numero,complemento,bairro,cep,cidade,estado) values ('Guilherme',true,'samambaia','102','viver melhor','301','71811117','samambaia','Brasilia - DF');
INSERT INTO pessoa (nome,ativo,logradouro,numero,complemento,bairro,cep,cidade,estado) values ('Alex',true,'samambaia','102','viver melhor','301','71811117','samambaia','Brasilia - DF');
INSERT INTO pessoa (nome,ativo,logradouro,numero,complemento,bairro,cep,cidade,estado) values ('Alisson',true,'samambaia','102','viver melhor','301','71811117','samambaia','Brasilia - DF');
INSERT INTO pessoa (nome,ativo,logradouro,numero,complemento,bairro,cep,cidade,estado) values ('Maxuel',true,'samambaia','102','viver melhor','301','71811117','samambaia','Brasilia - DF');
INSERT INTO pessoa (nome,ativo,logradouro,numero,complemento,bairro,cep,cidade,estado) values ('Leonardo',true,'samambaia','102','viver melhor','301','71811117','samambaia','Brasilia - DF');
INSERT INTO pessoa (nome,ativo) values ('Mario',true);
INSERT INTO pessoa (nome,ativo) values ('Rafaella',true);
INSERT INTO pessoa (nome,ativo) values ('Lana',true);
INSERT INTO pessoa (nome,ativo) values ('Junior',true);
INSERT INTO pessoa (nome,ativo) values ('Douglas',true);