# Project Assessment Rubric

**Project:** ParkPal (Campus Parking Management)
**Section:** C2A
**Course:** Object Oriented Programming

## Grading Breakdown

### 1. Class Diagram Completeness (25%)
**Score:** 5/5
**Notes:** Complete UML diagram provided via Figma, now available as uml.png. The diagram clearly shows the system architecture with proper UML notation including User, ParkPal (main system), ParkingSpot, Vehicle, ManualInput, and RealTimeDatabase classes. All classes display attributes with types and access modifiers, methods with return types, and clear composition/association relationships. System shows thoughtful design with real-time database integration and manual input mechanisms for parking management.

### 2. Java Program - OOP Concepts (50%)
**Score:** 4/5
**Notes:** Good implementation of 3 out of 4 OOP concepts:
- **Encapsulation**: Proper use of private fields in User (email, role, idNumber) and ParkingSpot (spotId, isOccupied) classes with appropriate getters and setters
- **Inheritance**: ManualUpdater and SensorUpdater (implied from code) extend abstract ParkingStatusUpdater class
- **Polymorphism**: ParkingStatusUpdater abstract class with updateStatus() method implemented differently in ManualUpdater (and presumably SensorUpdater). Polymorphic usage when creating updaters in claimSpot() and releaseSpot() methods
- **Abstraction**: ParkingStatusUpdater abstract class provides template for different update strategies
- **Note**: While the code demonstrates solid OOP principles, the implementation is relatively simple with limited class hierarchy depth. The User class could benefit from more encapsulation features, and there's no clear inheritance hierarchy for users (student/staff types are just strings rather than separate classes).

### 3. Git Usage & Collaboration (15%)
**Score:** 4/5
**Notes:** Good collaboration with 27 total commits from 2 contributors. Work distribution: FrankElyy (15 commits), MikiBihon15 (11 commits). Shows consistent teamwork with relatively balanced contributions. Could benefit from more granular commits to demonstrate iterative development.

### 4. Base Grade (10%)
**Score:** 5/5

---

## Final Grade: 88/100

*Assessment generated based on project analysis.*
