package org.example.infrastructure.output

import org.example.entities.ExternalHardDisk
import org.example.entities.HardDisk
import org.example.entities.InternalHardDisk

// Реализация вывода данных
class ConsoleDataOutput : DataOutput {
    override fun displayHighCapacityDisks(disks: List<HardDisk>) {
        val highCapacityDisks = disks.filter { it.isHighCapacity() }

        println("\n=== Диски ёмкостью более 200 ГБ ===")
        if (highCapacityDisks.isEmpty()) {
            println("Диски не найдены")
        } else {
            highCapacityDisks.forEach { disk ->
                println("- ${disk.getDescription()}")
            }
        }

        // Дополнительная статистика
        println("\n=== Статистика ===")
        println("Всего дисков: ${disks.size}")
        println("Высокоёмких дисков (>200 ГБ): ${highCapacityDisks.size}")

        val externalCount = disks.count { it is ExternalHardDisk }
        val internalCount = disks.count { it is InternalHardDisk }
        println("Внешних дисков: $externalCount")
        println("Внутренних дисков: $internalCount")
    }
}