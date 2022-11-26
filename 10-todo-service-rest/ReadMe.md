Application Functionality : delete a resource based on id

HTTP METHOD : DELETE
URI : http://localhost:8080/users/vinodh/todos/2

Spring Boot
----------------------------------------------------------------------------------------------------------------
Application Functionality : create a new resource

HTTP METHOD : POST ( NOT IDEMPOTENT )
URI : http://localhost:8080/users/vinodh/todos

Request Body : 
{
  "username": "vinodh",
  "description": "Learn to swim",
  "done": false
}

Spring Boot ( Response ) 

Status Code : 201 ---> CREATED
location : URI  ( Response Header )


-------------------------------------------------------------------------------------------------------
Application Functionality : Get particular 'todo' with id

HTTP METHOD : GET ( IDEMPOTENT )
URI :  http://localhost:8080/users/vinodh/todos/1

Spring Boot Rest :

@GetMapping ( path = "/users/{username}/todos/{id}" )




----------------------------------------------------------------------------------------------------------------

Application Functionality : Get all todo's 

HTTP METHOD : GET (IDEMPOTENT)
URI : http://localhost:8080/users/vinodh/todos


Spring Boot 

@GetMapping ( path = "URI" )

@GetMapping ( path = "/users/{username}/todos" )

{username} --- > URI Template  eg : vinodh , samarth , chushruth

URI template value should be binded to method parameter
@PathVariable

-------------------------------------------------------------------------------------------