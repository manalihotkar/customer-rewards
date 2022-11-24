====Assignment and Instructions:=====
A retailer offers a rewards program to its customers, awarding points based on each recorded purchase.
A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every
dollar spent over $50 in each transaction
(e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points).
Given a record of every transaction during a three month period, calculate the reward points earned for
each customer per month and total.

In memory H2 database used to persist data.
Default customer added as below on Application startup
		INSERT INTO CUSTOMER(CUSTOMER_ID,CUSTOMER_NAME, CUSTOMER_EMAIL) values (1,'Customer1', 'a@xyz.com');
		INSERT INTO CUSTOMER(CUSTOMER_ID,CUSTOMER_NAME, CUSTOMER_EMAIL) values (2,'Customer2', 'b@xyz.com');
		INSERT INTO CUSTOMER(CUSTOMER_ID,CUSTOMER_NAME, CUSTOMER_EMAIL) values (3,'Customer3', 'c@xyz.com');
		
Default Orders added as below:
		INSERT INTO ORDER(ORDER_ID,CUSTOMER_ID,ORDER_DATE,ORDER_AMOUNT) VALUES (10001,1,'2022-04-12',120);
		INSERT INTO ORDER(ORDER_ID,CUSTOMER_ID,ORDER_DATE,ORDER_AMOUNT) VALUES (10002,1,'2022-04-01',85);
		INSERT INTO ORDER(ORDER_ID,CUSTOMER_ID,ORDER_DATE,ORDER_AMOUNT) VALUES (10003,1,'2022-03-04',160);
		INSERT INTO ORDER(ORDER_ID,CUSTOMER_ID,ORDER_DATE,ORDER_AMOUNT) VALUES (10004,1,'2022-03-01',90);
		INSERT INTO ORDER(ORDER_ID,CUSTOMER_ID,ORDER_DATE,ORDER_AMOUNT) VALUES (10005,1,'2022-02-04',120);
		INSERT INTO ORDER(ORDER_ID,CUSTOMER_ID,ORDER_DATE,ORDER_AMOUNT) VALUES (10006,1,'2021-02-05',165);
		INSERT INTO ORDER(ORDER_ID,CUSTOMER_ID,ORDER_DATE,ORDER_AMOUNT) VALUES (10007,2,'2022-04-05',113);
		INSERT INTO ORDER(ORDER_ID,CUSTOMER_ID,ORDER_DATE,ORDER_AMOUNT) VALUES (10008,2,'2022-03-27',80);
		INSERT INTO ORDER(ORDER_ID,CUSTOMER_ID,ORDER_DATE,ORDER_AMOUNT) VALUES (10009,2,'2022-03-04',102);
		INSERT INTO ORDER(ORDER_ID,CUSTOMER_ID,ORDER_DATE,ORDER_AMOUNT) VALUES (10010,2,'2022-03-01',210);
		INSERT INTO ORDER(ORDER_ID,CUSTOMER_ID,ORDER_DATE,ORDER_AMOUNT) VALUES (10011,2,'2022-02-27',130);
		INSERT INTO ORDER(ORDER_ID,CUSTOMER_ID,ORDER_DATE,ORDER_AMOUNT) VALUES (10012,2,'2022-04-15',88);
		INSERT INTO ORDER(ORDER_ID,CUSTOMER_ID,ORDER_DATE,ORDER_AMOUNT) VALUES (10013,3,'2022-04-05',102);
		INSERT INTO ORDER(ORDER_ID,CUSTOMER_ID,ORDER_DATE,ORDER_AMOUNT) VALUES (10014,3,'2022-03-27',84);
		INSERT INTO ORDER(ORDER_ID,CUSTOMER_ID,ORDER_DATE,ORDER_AMOUNT) VALUES (10015,3,'2022-03-04',200);
		INSERT INTO ORDER(ORDER_ID,CUSTOMER_ID,ORDER_DATE,ORDER_AMOUNT) VALUES (10016,3,'2022-03-01',103);
		INSERT INTO ORDER(ORDER_ID,CUSTOMER_ID,ORDER_DATE,ORDER_AMOUNT) VALUES (10017,3,'2022-03-27',500);
		INSERT INTO ORDER(ORDER_ID,CUSTOMER_ID,ORDER_DATE,ORDER_AMOUNT) VALUES (10018,3,'2022-04-20',585);
		INSERT INTO ORDER(ORDER_ID,CUSTOMER_ID,ORDER_DATE,ORDER_AMOUNT) VALUES (10019,3,'2022-03-14',102);
		
Endpoints exposed:
	Customer:
		Create Customer: POST - localhost:8080/retailer/v1/customer
			Request Body:
			{
			    "name": "abc",
			    "email": "am@gmail.com"
			}
			
		Update Customer: PUT - localhost:8080/retailer/v1/customer/1
			Request Body:
			{
			    "name": "abc",
			    "email": "am@gmail.com"
			}
		
		Get Customer: GET - localhost:8080/retailer/v1/customer/1
		
	Order:
		Create Order: POST - localhost:8080/retailer/v1/customer/10/order
			Request Body:
			{
			    "orderPrice": 120
			    
			}
		
	Reward:
		Get Reward of Customer for each month: GET - localhost:8080/retailer/v1/customer/1/reward
		Get Reward of Customer for particular month: GET - localhost:8080/retailer/v1/customer/1/reward/yearmonth/202204
		
		