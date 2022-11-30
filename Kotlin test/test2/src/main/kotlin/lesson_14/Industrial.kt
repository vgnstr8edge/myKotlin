package lesson_14

class Industrial(
    name: String,
    speed: Int,
    val numberOfMiners: Int,

) : Spaceship(name, speed, unmanned = true) {

    fun launchScanningDrones() {
        println("$name: запуск дронов")
    }

    override fun runSystemDiagnostic() {
        super.runSystemDiagnostic()
        println("$name: запущена диагностика дронов и майнеров")
    }

}