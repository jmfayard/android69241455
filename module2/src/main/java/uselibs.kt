package libs

import org.eclipse.jgit.api.Git
import javax.money.Monetary
import io.reactivex.Observable
import org.threeten.bp.Instant

fun threetenabp() {
    val instant = Instant.now()
}

fun jgit() {
    val jgit = Git.cloneRepository()
}

fun javamoney() {
    val usd = Monetary.getCurrency("USD")
}

fun rxjava() {
    val observable = Observable.fromArray(1, 2,3 ,4, 5)
}