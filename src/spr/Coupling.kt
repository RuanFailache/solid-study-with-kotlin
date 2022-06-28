package spr

class Student(
    name: String,
    enrolledAt: String,
    address: String
) {
    var name: String = name
        private set

    var enrolledAt: String = enrolledAt
        private set


    var address: String = address
        private set

    fun save() {
        val repository = StudentRepository()
        repository.save(this)
    }
}

class StudentRepository {
    fun save(student: Student) {
        // Save the student into the database
    }
}

// The coupling in this case is that the student class uses spr.StudentRepository to save a student
// in place of create his own save method

// In our code we must aim for loose coupling, to be able to use the same code for different components