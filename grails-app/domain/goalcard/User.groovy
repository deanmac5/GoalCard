package goalcard

class User {

    String username
    String email


    static hasMany = [goals: Goal]

    static constraints = {
        username unique: true
        email email: true, blank: false
    }
}
