import lesson_14.Industrial
import lesson_14.Scout
import lesson_14.Spaceship

fun main() {
    /*
    название, скорость, беспилотник  -  свойства
    варп режим, диагностика системы  - функции
    разведчик, индустриальный        -
     */

    // вызов методов класса на примере создания объекта ship1
    val ship1 = Spaceship("ship1", 500)
    ship1.runSystemDiagnostic()
    ship1.switchToWarpMode()
    println()

// теперь можно создавать экземпляры подклассов и использовать методы суперкласса (родительского - Spaceship)
    val scout1 = Scout("scout1", 750, 100, 1000) //вызвали подкласс и перечислили св-ва
    scout1.runSystemDiagnostic()
    scout1.switchToWarpMode()  //вызвал методы суперкласса

    scout1.runAfterburner()
    scout1.handleDataFromRadar() //вызвал методы самого подкласса

    println(scout1.unmanned)


    println()


    val industrial1 = Industrial("industrial1", 250, 8)
    industrial1.runSystemDiagnostic()
    industrial1.switchToWarpMode()

    industrial1.launchScanningDrones()

    println(industrial1.unmanned)



}