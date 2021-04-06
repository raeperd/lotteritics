package io.github.raeperd.lotteristics

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LotteristicsApplication

fun main(args: Array<String>) {
    runApplication<LotteristicsApplication>(*args)
}
