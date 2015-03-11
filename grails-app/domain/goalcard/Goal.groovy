package goalcard

class Goal {

    String name
    String description
    Date created = new Date()

    static belongsTo = [user: User]

    static constraints = {
        name blank: false
        description blank: false

    }
}
