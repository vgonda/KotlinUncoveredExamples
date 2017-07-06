package com.victoriagonda.kotlinuncoveredexamples

class User(
    val firstName: String,
    var lastName: String?
)

data class DataUser(
    val firstName: String = "Victoria",
    var lastName: String?
) {
 fun exampleCopy() {
  val user = DataUser(firstName = "Victoria", lastName = "Gonda")

  val user1 = user.copy()
  // User(firstName=Victoria, lastName=Gonda)
  val user2 = user.copy(firstName = "Tori")
  // User(firstName=Tori, lastName=Gonda)
  val user3 = user.copy(lastName = null)
  // User(firstName=Victoria, lastName=null)
  val user4 = user.copy(firstName = "Josh", lastName = "Kovach")
  // User(firstName=Josh, lastName=Kovach)
 }
}
