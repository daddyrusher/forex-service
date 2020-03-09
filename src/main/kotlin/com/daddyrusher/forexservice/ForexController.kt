package com.daddyrusher.forexservice

import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ForexController(private val env: Environment, private val repository: ExchangeValueRepository) {
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    fun retrieveExchangeValue(@PathVariable from: String, @PathVariable to: String): ExchangeValue {
        val exchangeValue = repository.findByFromAndTo(from, to)
        exchangeValue.port = env.getProperty("local.server.port")?.toInt() ?: 8080

        return exchangeValue
    }
}