# Online Grades

## Project Progress

###1: Project Setup
-Created Spring Boot project
-Configured Gradle
-Connected Project to Github

###2: Environment Setup
-Verified app runs locally

###3: Flyway Migration
- Created Flyway migration folder
- Added V1 migration to create users table
- Verified migration runs on startup

- - What is up with it?

@Entity

Tells Spring: this class is a database table

@Table(name = "users")

Links this class to the users table

Must match your Flyway SQL exactly

@Id

Marks the primary key

@GeneratedValue

Database auto-generates the ID

@Column

Defines rules like:

nullable = false

unique = true


###: Repository Layer
- Created UserRepository
- Extended JpaRepository for database access
- Added findByUsername method
