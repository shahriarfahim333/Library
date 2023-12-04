import java.util.Scanner
var scan= Scanner(System.`in`)
fun main(args: Array<String>) {
    println("\n********************************")
    println("********** WELCOME TO **********")
    println("** SageMindForge Book Library **")
    println("********************************\n")

    println("What can we do for you?")
    println("1. Searching for books.")
    println("2. Adding books.")
    println("3. Borrowing books.")
    println("4. Returning books.\n")

    print("Enter serial number to choose an option: ")
    var choise = scan.nextInt()

    if(choise == 1) {
        searchBook()
    }else if(choise == 2) {
        addBook()
    }

}

fun searchBook() {
    println("1. Search by the author's name.")
    println("2. Search by publishing year.")
    print("Enter serial number to choose an option: ")
    var choise = scan.nextInt()

    if(choise == 1) {
        authorSearch()
    }else if(choise == 2) {
        yearSearch()
    }
}

fun authorSearch() {
    print("Enter Author Name: ")
    var searchAuthor = readln()
    if(searchAuthor.equals("")) {

    }
}


fun yearSearch() {

}

fun borrowing() {

}


fun addBook() {

    print("Enter Book Title: ")
    var newB_Title:String = readln()

    print("Enter Author Name: ")
    var newB_Author = readln()

    print("Enter Publication Year: ")
    var newB_PYear = scan.nextInt()

    println("Thank you for adding a new book.\n")

    var newBook = Library(6,newB_Title, newB_Author, newB_PYear)
    println("New list is:")
    newBook.updateBookList()
}


