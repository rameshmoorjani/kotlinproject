import kotlinx.coroutines.*

fun main() {
    val numTasks = 100_000
    val startTime = System.currentTimeMillis()

    runWithJavaThreads(numTasks)
    val javaThreadsTime = System.currentTimeMillis() - startTime

    runWithKotlinCoroutines(numTasks)
    val kotlinCoroutinesTime = System.currentTimeMillis() - startTime - javaThreadsTime

    println("Java Threads Time: $javaThreadsTime ms")
    println("Kotlin Coroutines Time: $kotlinCoroutinesTime ms")
}

fun runWithJavaThreads(numTasks: Int) {
    val threads = List(numTasks) {
        Thread {
            Thread.sleep(1)
        }
    }
    threads.forEach { it.start() }
    threads.forEach { it.join() }
}

fun runWithKotlinCoroutines(numTasks: Int) = runBlocking {
    val jobs = List(numTasks) {
        launch {
            delay(1)
        }
    }
    jobs.forEach { it.join() }
}
