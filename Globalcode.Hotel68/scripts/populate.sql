CREATE TABLE ROOMTYPE (
		NAME VARCHAR(255) NOT NULL,
		DESCRIPTION VARCHAR(255)
	);
CREATE UNIQUE INDEX SQL120812032959520 ON ROOMTYPE (NAME ASC);
ALTER TABLE ROOMTYPE ADD CONSTRAINT SQL120812032959520 PRIMARY KEY (NAME);
ALTER TABLE ROOMTYPE ADD CONSTRAINT SQL120812033109980 CHECK ((name in ('MASTER', 'SUPER', 'LUXO')));

insert into ROOMTYPE (name, description) values (	'LUXO'	,	'Super + TV cabo e ar condicionado'	);
insert into ROOMTYPE (name, description) values (	'MASTER'	,	'Luxo + hidro e mini-escritório'	);
insert into ROOMTYPE (name, description) values (	'SUPER'	,	'Frigobar e ventilador de teto'	);



alter table ROOM ADD FOREIGN KEY (type) REFERENCES roomtype(name);