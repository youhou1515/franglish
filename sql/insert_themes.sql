



use franglishdeveloppement;

create table THEMES (
id int(3),
theme varchar(150)
);



insert into franglishdeveloppement.THEMES values (1, 'La ville');
insert into THEMES values (2, 'La campagne');
insert into THEMES values (3, 'L''être humain');
insert into THEMES values (4, 'La nourriture');
insert into THEMES values (5, 'Le transport');
insert into THEMES values (6, 'La politique');
insert into THEMES values (7, 'La musique');
insert into THEMES values (8, 'La technologie');
insert into THEMES values (9, 'L''informatique');
insert into THEMES values (10, 'Les langues');

use franglishdeveloppement;
select * from THEMES;

