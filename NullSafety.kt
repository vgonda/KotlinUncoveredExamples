package com.victoriagonda.kotlinuncoveredexamples

class NullSafety {

  fun safeCallNonNul() {
    val maybeString: String? = "Hello"
    maybeString?.length
  }

  fun safeCallNull() {
    val maybeString: String? = getString()
    maybeString?.length
  }

  fun bangBang() {
    val maybeString: String? = getString()
    maybeString!!.length // NPE!
  }

  fun nullSafeScoping(): Int? {
    val maybeString: String? = getString()

    return maybeString?.let {
      // it == maybeString
      it.length
    }
  }

  fun elvisOperator(): Int {
    val maybeString: String? = getString()
    return maybeString?.length ?: 0
  }

  fun getString(): String? {
    return null
  }
}
