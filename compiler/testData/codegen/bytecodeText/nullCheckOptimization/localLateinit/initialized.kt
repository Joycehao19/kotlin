// IGNORE_BACKEND: JVM_IR
// TODO KT-36813 Support code generated by JVM_IR in redundant null check optimization
fun test() {
    lateinit var z: String
    run {
        z = ""
    }
    println(z)
}

// 0 IFNULL
// 0 IFNONNULL
