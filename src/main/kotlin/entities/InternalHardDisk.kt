package org.example.entities

import org.example.interfaces.SizeFeature

// Класс внутреннего диска
class InternalHardDisk(
    name: String,
    capacityGB: Int,
    override val size: String
) : HardDisk(name, capacityGB), SizeFeature {

    init {
        require(size == "2.5\"" || size == "3.5\"") { "Размер должен быть 2.5\" или 3.5\"" }
    }

    override fun getDescription(): String {
        return "Внутренний диск '$name' ($capacityGB ГБ) размер $size"
    }
}
