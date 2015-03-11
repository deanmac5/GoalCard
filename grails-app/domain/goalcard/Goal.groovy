package goalcard

class Goal {

    String name
    String description

    static belongsTo = [user: User]

    static constraints = {
    }
}
