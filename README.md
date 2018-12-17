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
 - Database Host in this [file](/config/Config.java). Replace YOUR_HOST to your host.
`private final String HOST = "YOUR_HOST";`
 - Database Port in this [file](/config/Config.java). Replace YOUR_PORT to your port.
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

## 👩‍💻  Author  👨‍💻
- 60070073 : Passawit Riewthong
- 60070076 : Mareena Nuramun
- 60070114 : Apisit Wetmaha

## 👩‍🏫 Supervisor
- Asst.prof. Thanisa Numnonda, Ph.D.

---
06016317 OBJECT-ORIENTED PROGRAMMING

Faculty of Information Technology

King Mongkut's Institute of Technology Ladkrabang
