package lesson_15

fun main() {
    val upsilonShuttle = Upsilon(50)

    upsilonShuttle.runDiagnostic()
    upsilonShuttle.prepareForTakeOff()
    upsilonShuttle.prepareForLanding()
    upsilonShuttle.startShooting()
    upsilonShuttle.reloadGuns()
}