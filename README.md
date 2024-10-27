## Structure
eco-taxi-backend-trip-service/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── TripService/
│   │   │               ├── TripServiceApplication.java
│   │   │               ├── model/
│   │   │               │   ├── PremiumTrip.java
│   │   │               │   ├── StandardTrip.java
│   │   │               │   └── Trip.java
│   │   │               ├── repository/
│   │   │               │   ├── Repository.java
│   │   │               │   └── TripRepository.java
│   │   │               ├── service/
│   │   │               │   └── TripActions.java
│   │   │               ├── controller/
│   │   │               │   └── TripController.java
│   │   │               └── factory/
│   │   │                   ├── TripFactory.java
│   │   │                   └── TripCreator.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── tripservice/
├── HELP.md
├── mvnw
├── mvnw.cmd
└── pom.xml
