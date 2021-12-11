import mu.KotlinLogging
import java.util.*

private val logger = KotlinLogging.logger {}

fun main(args: Array<String>) {
    logger.debug("Hello, Logger! ${Date()}")
}
