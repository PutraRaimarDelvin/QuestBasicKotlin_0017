package com.example.noactivity

fun nullSafety() {
// neverNull has String type
    var neverNull: String = "This can't be null"

// Throws a compiler error
// NeverNull = null

// nullable has nullable String type
    var nullable: String? = "You can keep a null here"

// This is OK
    nullable = null

// check for null in conditions
    if (neverNull == null) {
        println("interferredNonNull is Null")
    } else {
        println("interferredNonNull")
    }

// Safe call operator
    println(neverNull.length) // 18
    println(nullable?.length) // null

    // notNull doesn't accept null values
    fun strLength(notNull: String): Int {
        return notNull.length
    }
    println(strLength(neverNull))
}

fun main() {
    nullSafety()
}