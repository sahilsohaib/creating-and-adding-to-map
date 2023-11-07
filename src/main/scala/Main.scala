object MapExample {
  def main(args: Array[String]): Unit = {
    // Create an empty mutable Map
    val studentGrades = scala.collection.mutable.Map[String, Int]()

    // Add key-value pairs to the map
    studentGrades("Alice") = 95
    studentGrades("Bob") = 88
    studentGrades("Charlie") = 75

    // Display the contents of the map
    println("Student Grades:")
    for ((name, grade) <- studentGrades) {
      println(s"$name: $grade")
    }

    // Add more key-value pairs
    studentGrades("David") = 90
    studentGrades("Eve") = 82

    // Display the updated map
    println("\nUpdated Student Grades:")
    for ((name, grade) <- studentGrades) {
      println(s"$name: $grade")
    }
  }
}
