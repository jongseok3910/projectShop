/**********************userinfo insert************************/
insert into userinfo(userid,password,name,email) values('jong1','1111','박종석1','jong1@korea.com');
insert into userinfo(userid,password,name,email) values('jong2','2222','박종석2','jong2@korea.com');
insert into userinfo(userid,password,name,email) values('jong3','3333','박종석3','jong3@korea.com');

/**********************product insert************************/
insert into product values(product_p_no_SEQ.nextval, '당근', 6000, 'carrot.jpg','기타 상세 정보 등...', 0);
insert into product values(product_p_no_SEQ.nextval, '양파', 2600, 'yangpa.jpg','기타 상세 정보 등...', 0);
insert into product values(product_p_no_SEQ.nextval, '마늘', 1500, 'garlic.jpg','기타 상세 정보 등...', 0);
insert into product values(product_p_no_SEQ.nextval, '감자', 7000, 'gamja.jpg','기타 상세 정보 등...', 0);

--userinfo select 1개
select userid,password,name,email from userinfo where userid='guard1';
--userinfo select 여러개 
select userid,password,name,email from userinfo;

--product select 1개
select p_no,p_name,p_price,p_image,p_desc,p_click_count from product where p_no=1;
--product select 여러개 
select p_no,p_name,p_price,p_image,p_desc,p_click_count from product;