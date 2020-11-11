package main.kotlin

fun main(){

    val args: Array<Any> =  arrayOf("pos", "\tMat.Number", "\tDescription", "\tPrice", "Quantity") // creates an Array of args type any
    println("\n--------------------------------------------------------")
    for (i in args) {
        print("$i\t")   // prints the head of the product list
    }
    retrieveInformation(addInformation()) // calling a method retrieveInformarion by passing another method as parameter
    print("Total:")
    print("\t\t\t\t\t\t\t\t\t${totalPrice(addInformation())}") // calls a method totalPrice having another method as parameter and finally prints the result of it.
    print("\t${totalQuantity(addInformation())}") //calls a method totalQuantity having another method(addInformation) as parameter and finally prints the result of it.
    print("\n--------------------------------------------------------")
}

fun addInformation(): Array<Array<Any?>> {// adds a list of product information, in the form of 2 dimensional array
    return arrayOf(
            arrayOf(1, "\t3453", "\t Zahnstange 1x10", 1.89, 3),
            arrayOf(2, "\t3431", "\t zahnstange 1x4", 0.98, 11),
            arrayOf(3, "\t2364", "\t kreuzverbinder", 0.05, 50),
            arrayOf(4, "\t4532", "\t winde \t\t\t", 14.67, 2),
            arrayOf(5, "\t3487", "\t kugelzahnrad\t", 5.56, 20),
    )
}

fun retrieveInformation(information: Array<Array<Any?>>){
    println("\n--------------------------------------------------------")
    for (i in information) {// iterates i rows in the information list
        for (j in i) { // iterates j elements in the i (row)
            print("$j \t")// prints each element
        }
        println()
    }
    println("--------------------------------------------------------")

}

fun totalPrice(information: Array<Array<Any?>>): Double { //returns the total price of all items in the product list
    var priceTotal=0.0
    for (i in 0 until 5) {
        for (j in 0 until 4) {
            if (j==3){
                priceTotal =priceTotal.plus(information[i][j].toString().toDouble())
            }else continue
        }
    }
    return priceTotal
}


fun totalQuantity(information: Array<Array<Any?>>): Int { // returns the the total number of items in the product list
    var quantityTot=0
    for (i in 0 until 5) {
        for (j in 0 until 5) {
            if (j==4){
                quantityTot = quantityTot.plus(information[i][j].toString().toInt())
            }else continue
        }
    }
    return quantityTot
}