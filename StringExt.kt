package com.victoriagonda.kotlinuncoveredexamples

// StringExt.kt
fun String?.isEmpty(): Boolean {
  return this == null || this.length == 0
}

class Extensions {
  fun checkBlank() {
    "hello".isEmpty() // false
    "".isEmpty()      // true

    val hello: String? = null
    hello.isEmpty()  // true

    null.isEmpty()
  }
}

