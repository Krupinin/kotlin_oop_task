package org.example

import org.example.application.DiskManagerApp
import org.example.infrastructure.input.ConsoleDataInput
import org.example.infrastructure.output.ConsoleDataOutput

// Точка входа в программу
fun main() {
    val app = DiskManagerApp(
        dataInput = ConsoleDataInput(),
        dataOutput = ConsoleDataOutput(),
    )
    app.run()
}
