select c.name
from country c
         inner join city ct
                    on c.countryid = ct.countryid
group by c.name
having sum(ct.population) > 400;



select c.name
from country c
except
select c.name
from country c
         inner join city ct
                    on c.countryid = ct.countryid
         inner join building b
                    on ct.cityid = b.cityid
where c.countryid = ct.countryid;
