
import main.kotlin.totalPrice
import main.kotlin.totalQuantity
import org.junit.jupiter.api.*

internal class FileProcessingTestKt{
    @Test
    fun testFileProcessing(){

        Assertions.assertEquals(23.15, totalPrice(arrayOf(
                arrayOf(1, "\t3453", "\t Zahnstange 1x10", 1.89, 3),
                arrayOf(2, "\t3431", "\t zahnstange 1x4", 0.98, 11),
                arrayOf(3, "\t2364", "\t kreuzverbinder", 0.05, 50),
                arrayOf(4, "\t4532", "\t winde \t\t\t", 14.67, 2),
                arrayOf(5, "\t3487", "\t kugelzahnrad\t", 5.56, 20),
        )))
        Assertions.assertEquals(86, totalQuantity(arrayOf(
                arrayOf(1, "\t3453", "\t Zahnstange 1x10", 1.89, 3),
                arrayOf(2, "\t3431", "\t zahnstange 1x4", 0.98, 11),
                arrayOf(3, "\t2364", "\t kreuzverbinder", 0.05, 50),
                arrayOf(4, "\t4532", "\t winde \t\t\t", 14.67, 2),
                arrayOf(5, "\t3487", "\t kugelzahnrad\t", 5.56, 20),
        )))
    }
}