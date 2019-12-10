Step 1: import as a maven project.
Step 2: run CardvalidationApplication
step 3: Open Postman or any other Rest Client
step 4: URL is http://localhost:8080/card/cardvalidation (Get Mapping)
step 5: requestBody is {
                       	"cardNumber":[
                       		{"number":"123456"},
                       		{"number": "0123456789123456"},
                       		{"number":"scd223445432cf543"},
                       		{"number":""}
                       		]
                       }