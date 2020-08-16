import com.rsk.Providers

fun main(args : Array<String>) {
    val providers = Providers()
    val details = providers.getAllProvidersEx("Random")

    details.forEach(::println)

    details.forEach { println(it) }

    details.forEach {
            details -> println("${details.providerName}, ${details.name}")
    }

//    getAllProviders {
//            key, value -> println(" --- \t$key: $value")
//    }
}

fun getAllProviders(fn : (String, String) -> Unit) {
    val allProviders = Providers.getProviders()
    val it = allProviders.iterator()

    while (it.hasNext()) {
        val provider = it.next()
        println(provider.name)
        provider.forEach { key, value -> fn(key.toString(), value.toString()) }
    }
}

fun listAllProvidersInstance() {
    val providers = Providers()
    val allProviders = providers.getProviders()
    val it = allProviders.iterator()

    while (it.hasNext()) {
        val provider = it.next()
        println(provider.name)
        provider.forEach { key, value -> println("\t$key: $value") }
    }
}