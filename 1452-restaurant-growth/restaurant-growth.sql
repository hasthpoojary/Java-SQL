# Write your MySQL query statement below
with daily as (
    select visited_on, sum(amount) as amount
    from customer
    group by visited_on
)
select d1.visited_on, sum(d2.amount) as amount, round(sum(d2.amount) / 7, 2) as average_amount
from daily d1
join daily d2 on d2.visited_on between date_sub(d1.visited_on, interval 6 day) and d1.visited_on
group by d1.visited_on
having d1.visited_on >= date_add((select min(visited_on) from daily), interval 6 day)
order by d1.visited_on;