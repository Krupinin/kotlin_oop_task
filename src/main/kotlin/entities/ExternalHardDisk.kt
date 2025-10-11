package org.example.entities

import org.example.interfaces.ProtectionFeature

// Класс внешнего диска
class ExternalHardDisk(
    name: String,
    capacityGB: Int,
    override val hasDropProtection: Boolean
) : HardDisk(name, capacityGB), ProtectionFeature {

    override fun getDescription(): String {
        val protectionStatus = if (hasDropProtection) "с защитой от падения" else "без защиты от падения"
        return "Внешний диск '$name' ($capacityGB ГБ) $protectionStatus"
    }
}
