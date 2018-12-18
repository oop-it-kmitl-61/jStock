
# jStock
&nbsp;&nbsp;&nbsp; Caring for a shop will be easier from now on. **jStock**, a java project for Object-Oriented Programming 2018, will help you to manage your both storefront and warehouse.

### ✏️ Functional Specification
 - Sale products.
 - Add/Edit product (This function is only for store owners or managers).
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
			productName: "submarine",
			productPrice: 1000,
			productAmount: 3,
			productBrand: "",
			productType: ""
		}]

	// Transactions structure
	[{
		transactionID: "000000000",
		date: {
			day: "18",
			month: "12",
			year: "2018"
		},
		time: "23:59:59", total: 2000,
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
 - Without config (mongod must run on `localhost:27017`).
 
`cd jStock`

`java -jar jStock.jar`

- With config. Run with java IDE such as [NetBeans](https://netbeans.org/), [Eclipse](https://www.eclipse.org/downloads/), [IntelliJ](https://www.jetbrains.com/idea/).

## 📖  How to use
*Open jStock.*
![loading](https://user-images.githubusercontent.com/32861458/50114203-8c9ce600-0276-11e9-85f5-3cea8bf639ea.png)

*For the first time you need to create new stock.*
![create stock](https://user-images.githubusercontent.com/32861458/50114507-3d0aea00-0277-11e9-83d3-153f7fc51e72.png)

*Welcome page will append when stock created successful.*
![welcome](https://user-images.githubusercontent.com/32861458/50114630-94a95580-0277-11e9-90c3-e0743ca98863.png)

*For the next time the program will direct to sale page.*
![sale1](https://user-images.githubusercontent.com/32861458/50114714-d0441f80-0277-11e9-8e7e-fe8ee1a10be6.png)

*Now stock is empty, so you need to add product to stock by click at "Edit Stock" button, but this function is only for store owners or managers who have a password.*

![password](https://user-images.githubusercontent.com/32861458/50114967-a3dcd300-0278-11e9-8a77-8e2e55e5d729.png)

*After you insert the correct password and click Continue the program will direct to edit page and then click Add Product to go to Add Product page.*
![edit1](https://user-images.githubusercontent.com/32861458/50115041-d8508f00-0278-11e9-9c41-62996d91c731.png)

*You need to complete the product informations. Next step is click the Add Product button.*
![add](https://user-images.githubusercontent.com/32861458/50115142-1ea5ee00-0279-11e9-8df5-a4f422ce3cd8.png)

*After clicking the button the program will show this dialog to confirm to add product. You need to check the information is correctly and click Add button to add product to stock.*
![add check](https://user-images.githubusercontent.com/32861458/50115357-b1df2380-0279-11e9-9319-2e2194915db5.png)

*After the previous step the program will back to edit page and you product has shown in table. If nothing happen you can click refresh button below the table to refresh data.*
![edit2](https://user-images.githubusercontent.com/32861458/50115519-36ca3d00-027a-11e9-8a9a-9023fc1d4b76.png)

*This is example of alert. If product amount is less than 5 the cell will change colour to yellow. And if product is out the cell will change colour to red.*
![edit3](https://user-images.githubusercontent.com/32861458/50115719-d5569e00-027a-11e9-839a-3ade198acc9a.png)

*You can also edit or delete product by clicking at the edit icon in Edit column.*
![edit product](https://user-images.githubusercontent.com/32861458/50115920-5c0b7b00-027b-11e9-926b-b7e47e5e112c.png)

*If you want to delete the program will show this dialog to confirm.*
![delete product confirm](https://user-images.githubusercontent.com/32861458/50116060-b0aef600-027b-11e9-881e-7d21ad4a9454.png)

*After you delete the product will disappear from the stock.*
![edit4](https://user-images.githubusercontent.com/32861458/50116159-f966af00-027b-11e9-866a-07abe0037946.png)

*The product that you add from Edit page is link to Sale page.*
![sale2](https://user-images.githubusercontent.com/32861458/50116274-4c406680-027c-11e9-963c-89ff43da21c9.png)

*You can search product by typing the product's name even the product's ID in Search field.*
![search1](https://user-images.githubusercontent.com/32861458/50116366-84e04000-027c-11e9-9efb-d18fc65a9ea6.png)
![search2](https://user-images.githubusercontent.com/32861458/50116367-84e04000-027c-11e9-9343-b913a3ac3a48.png)

*To sale the products you need to click the Add button of the product that you want to sale and then click Sale button to go to summary page.*
![sold](https://user-images.githubusercontent.com/32861458/50130367-d950e300-02af-11e9-89bc-3169776a96b8.png)

*After clicking Sale button the program will show this dialog to confirm to sale.*
![recipe](https://user-images.githubusercontent.com/32861458/50130368-d950e300-02af-11e9-884e-15409617011a.png)

*If products have not enough when you click sale the program will show this dialog and can't sale products.*
![out of stock](https://user-images.githubusercontent.com/32861458/50116884-12705f80-027e-11e9-99ff-1155b39d0d29.png)

*When you sale successful the program will back to Sale page and product amount has reduced.*
![sale3](https://user-images.githubusercontent.com/32861458/50117028-68450780-027e-11e9-9598-b958abb5ac89.png)

*To check profits you need to click Dashboard button the program will direct to report by day. The report show total income, total orders, products amount(piece) and ranking of product best seller by day, mount or year.*
![dashboard](https://user-images.githubusercontent.com/32861458/50130226-22ecfe00-02af-11e9-9764-e592cede6573.png)

*You can also change store name and password by click at Setting button (this function require password like Edit page).*
![enter image description here](https://user-images.githubusercontent.com/32861458/50117173-ca057180-027e-11e9-9433-5cb89d9ca1e0.png)

*To quit the program you just click at the Quit button the program will show this dialog to confirm to quit.*
![quit](https://user-images.githubusercontent.com/32861458/50117307-32545300-027f-11e9-9642-9fdb20d0d4df.png)

## 👩‍💻  Author  👨‍💻
|  |StudentID|Name|Surname|GitHub|
|:-:|--|--|--|--|
|![](https://avatars3.githubusercontent.com/u/32861458?s=150&v=4)|60070073|Passawit|Riewthong|[@dekdew](https://github.com/dekdew)|
|![](https://avatars2.githubusercontent.com/u/32717103?s=150&v=4)|60070076|Mareena|Nuramun|[@skefolksy](https://github.com/skefolksy)|
|![](https://avatars3.githubusercontent.com/u/32724812?s=150&v=4)|60070114|Apisit|Wetmaha|[@Apisit60070114](https://github.com/Apisit60070114)|

## 👩‍🏫 Supervisor
|![](https://avatars3.githubusercontent.com/u/25024858?s=150&v=4)|Asst.prof. Thanisa Numnonda, Ph.D.|
|--|--|

---
06016317 OBJECT-ORIENTED PROGRAMMING

Faculty of Information Technology

King Mongkut's Institute of Technology Ladkrabang
