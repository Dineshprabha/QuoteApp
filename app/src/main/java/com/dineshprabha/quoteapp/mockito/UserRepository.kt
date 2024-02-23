package com.dineshprabha.quoteapp.mockito

class UserRepository {

    val users = listOf<User>(
        User(1, "Jhon", "john@gmail.com", "john123"),
        User(2, "Ganesh", "ganesh@gmail.com", "ganesh123"),
        User(3, "Raj", "raj@gmail.com", "raj123")
    )

    fun loginUser(email:String, password:String) : LOGIN_STATUS{
        val users = users.filter { user -> user.email == email }
        return if (users.size == 1){
            if (users[0].password ==password){
                LOGIN_STATUS.SUCCESS
            }else{
                LOGIN_STATUS.INVALID_PASSWORD
            }
        }
        else{
            LOGIN_STATUS.INVALID_USER
        }
    }
}