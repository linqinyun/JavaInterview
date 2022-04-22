select
*
from emp
order by deptno asc,sal desc;

select
d.dname,e.*
from emp e left join dept d on e.deptno=d.deptno
where e.deptno=30;

select
d.dname,e.*
from emp e,dept d
where e.deptno=d.deptno and e.deptno=30;

select
deptno,
max(sal) as maxSal,
min(sal) as minSal,
avg(sal) as avgSal
from emp
group by deptno;


select 
d.dname,e.*
from emp e,dept d
where e.deptno=d.deptno and (d.dname='RESEARCH' or d.dname='SALES');


select 
d.dname,count(*) num
from emp e,dept d
where e.deptno=d.deptno 
group by d.dname having num>3;

select
a.a_sal,b.b_sal,a.a_sal-b.b_sal
from
(select sal * 12 a_sal from emp where ename='MILLER') a,
(select sal * 12 b_sal from emp where ename='SMITH') b;



select * 
from emp
where mgr = (select empno from emp where ename='KING');

select e.*
from emp e, (select empno from emp where ename='KING') k
where e.mgr=k.empno;



select date_format(now(),"%Y%m%d");

select * from (
select emp.*, date_format(now(),"%Y")-date_format(hiredate,"%Y") yg
from emp
) d
order by d.yg desc;

select
a.a_avg-b.b_avg
from
(select avg(sal) a_avg from emp where job='MANAGER' or job='PRESIDENT') a,
(select avg(sal) b_avg from emp where job in ('CLERK','SALESMAN','ANALYST')) b;
