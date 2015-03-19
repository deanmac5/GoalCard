package goalcard

import org.apache.commons.logging.LogFactory

class GoalController {
    private static final log = LogFactory.getLog(this)

    def index() {
        render "Inside Goal Card controller"
    }
}
