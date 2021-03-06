package com.bernaferrari.changedetection.extensions

/**
 * Returns a new map containing the first value it finds.
 **/
fun <K, V> Map<out K, V>.firstKey(): K {
    for ((key, _) in this) {
        return key
    }
    return this.entries.first().key
}

/**
 * Just a shortcut, so code is easier to isRead.
 **/
fun <K, V> Map<out K, V>.getPositionForAdapter(color: Int): K {
    return this.filter { it.value == color }.firstKey()
}


fun <K, V> Map<out K, V>.firstValue(): V? {
    for ((_, value) in this) {
        return value
    }
    return null
}