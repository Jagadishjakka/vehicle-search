# vehicle-search

Hello User.

Please use the below URL's to perform the operations via postman(chrome plugin)


List All Vehicles:
http://localhost:8081/vehicles

Search Vehicle by Id:
http://localhost:8081/search/{id}

Add a Vehicle:
http://localhost:8081/add
JSON:
{
        "vehicleId": 3,
        "vehicleType": "Truck",
        "vehicleYear": 2011,
        "vehicleMake": "Totota",
        "vehicleModel": "happy",
        "vehicleFuel": "Gas",
        "vehicleMiles": 1000
    }
	
Edit a Vehicle:
http://localhost:8081/edit	
JSON:
{
        "vehicleId": 3,
        "vehicleType": "Truck",
        "vehicleYear": 2011,
        "vehicleMake": "Totota",
        "vehicleModel": "happy",
        "vehicleFuel": "Gas",
        "vehicleMiles": 1000
    }
	
Delete a Vehicle:
http://localhost:8081/delete	
JSON:
 {
        "vehicleId": 2,
        "vehicleType": "Truck",
        "vehicleYear": 2011,
        "vehicleMake": "Honda",
        "vehicleModel": "ThunderBird",
        "vehicleFuel": "Gas",
        "vehicleMiles": 1000
    }
	
Note: I have used Oracle database since I have that installed in my local. If you wish to use the same add the ojdbc jar in the class path.	
