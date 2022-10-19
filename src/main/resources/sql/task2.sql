select *
from country c
where 400 < (select sum(Population)
             from city ct
             where c.CountryID = ct.CountryID);

select *
from country c
where 0 = (select count(1)
           from city ct
                    join building b on ct.CityID = b.CityID
           where ct.CountryID = c.CountryID);
