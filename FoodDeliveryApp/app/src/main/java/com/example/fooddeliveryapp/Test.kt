package com.example.fooddeliveryapp

data class Test(
     val url : String,
     val name : String ,
     val quote : String
     )

//val user1 = Test("www","Aman","Hi")
//
//val user2 = Test("www","Amana","Hi")
//
//val user3 = Test("www","Amrrana","Hi")
//
//val userList  = listOf<Test>(user1, user2, user3)

val userList2 = listOf<Test>(
    Test("www","Aman","Hi"),
    Test("www","Amana","Hi"),
    Test("www","Amrrana","Hi")
)