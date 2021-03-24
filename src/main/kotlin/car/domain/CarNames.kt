package car.domain

data class CarNames(private val names: List<CarName>) : List<CarName> by names {
    constructor(names: Array<String>) : this(names.map(::CarName))
}