select * from ROOMTYPE;
insert into ROOMTYPE (id, name, description) values (10, 'kkk', 'description of mmm');

delete from ROOMTYPE;

select * from room;

insert into ROOM (id, name, type) values (10, 'QuartoZ', 'LUXO');
delete from room where id = 10;
