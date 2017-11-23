--delete from USERS;
CREATE SCHEMA IF NOT EXISTS MYTEST;
create table if not exists users (
	id int(15) not null,
	name varchar(50) not null,
	age int(15) not null
);
commit;
INSERT INTO USERS VALUES(1,  'admin',1);
--delete from AUTHORITIES;
--INSERT INTO AUTHORITIES VALUES(1, 'ROLE_ADMIN','admin');