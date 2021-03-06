
  
![logo](https://user-images.githubusercontent.com/32861458/50169860-0be6f400-0321-11e9-87cb-474add549e96.png)
---
&nbsp;&nbsp;&nbsp; Inventory management system for all types of stores.
With a variety of functions. Caring for a shop will be easier from now on. **jStock**, a java project for Object-Oriented Programming 2018, will help you to manage your both storefront and warehouse.

### ✏️ Functional Specification
 - Sale products.
 - Add/Edit product (only for store owners or managers).
 - Transactions record.
 - Sales Analysis.

### 🗄 Database structure
	// User structure
		{
			name: "jStock",
			password: "pcNf4sPc",
			products: 44,
			transactions: 112,
		}
	
	// Stock structure
		[{
			productID: "00000",
			productName: "Submarine",
			productPrice: 1000,
			productAmount: 3,
			productBrand: "China",
			productType: "vehicle"
		}]

	// Transactions structure
		[{
			transactionID: "000000000",
			date: {
				day: "18",
				month: "12",
				year: "2018"
			},
			sDate: "18/12/2012",
			time: "23:59:59",
			total: 2000,
			products: [{
				productID: "00000",
				productName: "submarine",
				productPrice: 1000,
				quantity: 2,
				amount:2000
			}
		}]

## 📍 Getting Started
### 🛠 Prerequisites
 1. [JDK 11](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html) 
 2. [MongoDB](https://www.mongodb.com/download-center/community)

### ⚙️ Configuration (optional)
 - Database Host in this [file](/src/config/Config.java). Replace YOUR_HOST to your host.
 
`private final String HOST = "YOUR_HOST";`

 - Database Port in this [file](/src/config/Config.java). Replace YOUR_PORT to your port.
 
`private final int PORT = YOUR_PORT;`

## 🏃 Running the project
 1. Clone this repository.
 
`git clone https://github.com/oop-it-kmitl-61/jStock.git`

 2. Run project.
 - Without config (mongodb must run on `localhost:27017`).
 
`cd jStock`

`java -jar jStock.jar`

- With config. Run with java IDE such as [NetBeans](https://netbeans.org/), [Eclipse](https://www.eclipse.org/downloads/), [IntelliJ](https://www.jetbrains.com/idea/).

## 📖  How to use
*Open jStock.*
![loading](https://user-images.githubusercontent.com/32861458/50114203-8c9ce600-0276-11e9-85f5-3cea8bf639ea.png)

*For the first time you need to create new stock.*
![create stock](https://user-images.githubusercontent.com/32861458/50142150-eedc0200-02db-11e9-8b8f-9110c3ffed73.png)

*Welcome page will show up when stock created successful.*
![welcome](https://user-images.githubusercontent.com/32861458/50142236-2fd41680-02dc-11e9-946e-0f9af6bb1fd4.png)

*For the next time of use, the program will direct to sale page.*
![sale1](https://user-images.githubusercontent.com/32861458/50140973-e635fc80-02d8-11e9-97ac-c7c2988902e2.png)

*Now stock is empty, so you need to add product to stock by click at "Edit Stock" button, but this function is only for store owners or managers who have a password.*

![password](https://user-images.githubusercontent.com/32861458/50114967-a3dcd300-0278-11e9-8a77-8e2e55e5d729.png)

*After you insert the correct password and click Continue the program will direct to edit page and then click Add Product to go to Add Product page.*
![edit1](https://user-images.githubusercontent.com/32861458/50140974-e6ce9300-02d8-11e9-8be4-5138be382468.png)

*You need to complete the product informations. Next step is click the Add Product button.*
![add](https://user-images.githubusercontent.com/32861458/50140975-e6ce9300-02d8-11e9-9881-286655a19ef2.png)

*After clicking the button, the program will show this dialog to confirm adding product. You need to check if the information is correctly and click Add button to add product to stock.*
![add check](https://user-images.githubusercontent.com/32861458/50115357-b1df2380-0279-11e9-9319-2e2194915db5.png)

*After the previous step the program will back to edit page and your product will be shown in table. If nothing happen, you can click refresh button below the table to refresh data.*
![edit2](https://user-images.githubusercontent.com/32861458/50141519-47120480-02da-11e9-9392-a9bec95fc657.png)

*This is example of alert. If product amount is less than 5, the cell will change colour to yellow. And if product is out, the cell will change colour to red.*
![edit3](https://user-images.githubusercontent.com/32861458/50140976-e7672980-02d8-11e9-9278-8dcd87cea8bb.png)

*You can also edit or delete product by clicking at the edit icon in Edit column.*
![edit product](https://user-images.githubusercontent.com/32861458/50140977-e7672980-02d8-11e9-8af5-5886d73efc54.png)

*If you want to delete a product, the program will show this dialog to confirm.*
![delete product confirm](https://user-images.githubusercontent.com/32861458/50140978-e7672980-02d8-11e9-8490-c26ee644ac5f.png)

*After you confirm the deletion, the product will disappear from the stock.*
![edit4](https://user-images.githubusercontent.com/32861458/50141373-e71b5e00-02d9-11e9-9ea5-99de41f049cc.png)

*The product that you add from Edit page is link to Sale page.*
![sale2](https://user-images.githubusercontent.com/32861458/50140979-e7ffc000-02d8-11e9-90f8-53b21c599b70.png)

*You can search product by typing the product's name even the product's ID in Search field.*
![search1](https://user-images.githubusercontent.com/32861458/50141466-1fbb3780-02da-11e9-921c-9404d2027244.png)
![search2](https://user-images.githubusercontent.com/32861458/50141467-1fbb3780-02da-11e9-82a6-fe20bcbb72df.png)

*To sale the products you need to click the Add button of the product that you want to sale and then click Sale button to go to summary page.*
![sold](https://user-images.githubusercontent.com/32861458/50159769-1053e280-030a-11e9-8c37-d747a7a98e3f.png)

*After clicking Sale button the program will show this dialog to confirm to sale.*
![reciept](https://user-images.githubusercontent.com/32861458/50159771-10ec7900-030a-11e9-9573-7bd2a4b72cf3.png)

*If there are not enough product, the program will show this dialog and can't sale products when you click sale.*
![out of stock](https://user-images.githubusercontent.com/32861458/50116884-12705f80-027e-11e9-99ff-1155b39d0d29.png)

*When you successfully selling, the program will back to Sale page and product amount will be reduced.*
![sale3](https://user-images.githubusercontent.com/32861458/50140982-e9c98380-02d8-11e9-9559-da5b2e49061a.png)

*You can see all of transactions by clicking at Transactions button then the program will direct to transactions page.*
![transactions page](https://user-images.githubusercontent.com/32861458/50159773-10ec7900-030a-11e9-882b-2e739f0281cf.png)

*To view more detail of transaction you need to click at view button in View column the program will show this transaction's information dialog.*

![view transaction](https://user-images.githubusercontent.com/32861458/50159775-11850f80-030a-11e9-90f9-c7932b0f4e94.png)

*To check profits you need to click Dashboard button, the program will direct to report by day. The report show total income, total orders, products amount(piece) and ranking of product best seller by day, mount or year.*
![dashboard](https://user-images.githubusercontent.com/32861458/50140987-ea621a00-02d8-11e9-9f4f-c6e6d8f0b229.png)

*You can also change store name and password by click at Setting button (this function require password like Edit page).*
![enter image description here](https://user-images.githubusercontent.com/32861458/50140988-ea621a00-02d8-11e9-96df-b7c6db13dcab.png)

*To quit the program you just click at the Quit button the program will show this dialog to confirm to quit.*
![quit](https://user-images.githubusercontent.com/32861458/50117307-32545300-027f-11e9-9642-9fdb20d0d4df.png)

## 👩‍💻  Author  👨‍💻
|![](https://avatars3.githubusercontent.com/u/32861458?s=150&v=4)|![](https://avatars2.githubusercontent.com/u/32717103?s=150&v=4)|![](https://avatars3.githubusercontent.com/u/32724812?s=150&v=4)|
|:-:|:-:|:-:|
|60070073|60070076|60070114|
|Passawit|Mareena|Apisit|
|Riewthong|Nuramun|Wetmaha|
|[@dekdew](https://github.com/dekdew)|[@skefolksy](https://github.com/skefolksy)|[@Apisit60070114](https://github.com/Apisit60070114)|

## 👩‍🏫 Supervisor
|![](https://avatars3.githubusercontent.com/u/25024858?s=150&v=4)|
|:-:|
|Asst.prof. Thanisa Numnonda, Ph.D.|

---
06016317 OBJECT-ORIENTED PROGRAMMING

Faculty of Information Technology

King Mongkut's Institute of Technology Ladkrabang
