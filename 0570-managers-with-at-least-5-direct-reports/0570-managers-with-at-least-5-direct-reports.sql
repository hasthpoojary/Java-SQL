# Write your MySQL query statement below
select e.name from employee e join employee e1 on e.id = e1.managerid group by e.id, e.name having count(e1.id) >= 5;