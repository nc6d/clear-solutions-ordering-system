CREATE TABLE country
(
    CountryID int primary key,
    Name      varchar(200)

);

CREATE TABLE city
(
    CityID     int primary key,
    CountryID  int,
    Name       varchar(200),
    Population int,
    foreign key (CountryID) references country (CountryID)
);
CREATE TABLE building
(
    BuildingID int primary key,
    CityID     int,
    Name       varchar(200),
    Floors     int,
    foreign key (CityID) references city (CityID)

);

insert into country (CountryID, Name)
values (1, 'Ukraine');
insert into country (CountryID, Name)
values (2, 'Poland');
insert into country (CountryID, Name)
values (3, 'Germany');

insert into city (CityID, CountryID, Name, Population)
values (1, 1, 'Kyiv', 300);
insert into city (CityID, CountryID, Name, Population)
values (2, 1, 'Kharkiv', 300);

insert into city (CityID, CountryID, Name, Population)
values (3, 2, 'Warsaw', 200);
insert into city (CityID, CountryID, Name, Population)
values (4, 2, 'Krakow', 200);

insert into city (CityID, CountryID, Name, Population)
values (5, 3, 'Berlin', 100);
insert into city (CityID, CountryID, Name, Population)
values (6, 3, 'Munich', 500);

insert into building (BuildingID, CityID, Name, Floors)
values (1, 5, 'BerlinB', 4);


