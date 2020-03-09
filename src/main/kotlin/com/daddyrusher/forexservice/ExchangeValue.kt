package com.daddyrusher.forexservice

import java.math.BigDecimal
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class ExchangeValue {
    @Id
    var id: Long? = null
        private set

    @Column(name = "currency_from")
    var from: String? = null
        private set

    @Column(name = "currency_to")
    var to: String? = null
        private set
    var conversionMultiple: BigDecimal? = null
        private set
    var port = 0

    constructor() {}
    constructor(id: Long?, from: String?, to: String?, conversionMultiple: BigDecimal) : super() {
        this.id = id
        this.from = from
        this.to = to
        this.conversionMultiple = conversionMultiple
    }

}