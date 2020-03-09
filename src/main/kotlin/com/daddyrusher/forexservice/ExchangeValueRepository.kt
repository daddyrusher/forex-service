package com.daddyrusher.forexservice

import org.springframework.data.jpa.repository.JpaRepository

interface ExchangeValueRepository: JpaRepository<ExchangeValue, Long> {
    fun findByFromAndTo(from: String, to: String): ExchangeValue
}