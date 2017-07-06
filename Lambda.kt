package com.victoriagonda.kotlinuncoveredexamples

class Lambda {
  fun firstNSquares(n: Int): Array<Int>
      = Array(n, { i -> i * i })

  // firstNSquares(3)
  // -> [0, 1, 4]

  fun firstNSquares2(n: Int): Array<Int>
      = Array(n, { i -> square(i + 1) })

  // firstNSquares(3)
  // -> [1, 4, 9]

  private fun square(i: Int): Int {
    return i * i
  }

  inline fun beforeAndAfterInline(
      startString: String,
      function: (string: String) -> String
  ) {
    print("Before: $startString")
    val after = function(startString)
    print("After: $after")
  }

  fun exampleInline() {
    beforeAndAfterInline("hello", { string -> string + " world" })
  }

  // Output
  //  “Before: hello"
  //  “After: hello world"

  fun calling() {
    beforeAndAfterInline("hello", { string -> string + " world" })
    beforeAndAfterInline("hello", { it + " world"})
    beforeAndAfterInline("hello") { it + " world"}
  }

  fun beforeAndAfter(
      startString: String,
      function: (string: String) -> String
  ) {
    print("Before: $startString")
    val after = function(startString)
    print("After: $after")
  }

  fun example() {
    beforeAndAfter("hello", { string -> string + " world" })
  }

  // Output
  //  “Before: hello"
  //  “After: hello world"
}
