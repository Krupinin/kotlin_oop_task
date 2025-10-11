package org.example.services

import org.example.entities.ExternalHardDisk
import org.example.entities.HardDisk
import org.example.entities.InternalHardDisk

// Сервис для работы с дисками (бизнес-логика)
class DiskService {
    fun filterHighCapacityDisks(disks: List<HardDisk>): List<HardDisk> {
        return disks.filter { it.isHighCapacity() }
    }

    fun getDiskStatistics(disks: List<HardDisk>): Map<String, Any> {
        return mapOf(
            "total" to disks.size,
            "highCapacity" to disks.count { it.isHighCapacity() },
            "external" to disks.count { it is ExternalHardDisk },
            "internal" to disks.count { it is InternalHardDisk }
        )
    }
}