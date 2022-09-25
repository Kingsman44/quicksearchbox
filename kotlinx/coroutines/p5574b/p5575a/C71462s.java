package kotlinx.coroutines.p5574b.p5575a;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71600ba;

/* renamed from: kotlinx.coroutines.b.a.s */
/* compiled from: PG */
public final class C71462s extends CancellationException {
    public C71462s() {
        super("Child of the scoped flow was cancelled");
    }

    public final Throwable fillInStackTrace() {
        if (C71600ba.f191036a) {
            return super.fillInStackTrace();
        }
        setStackTrace((StackTraceElement[]) ((Object[]) new StackTraceElement[0]));
        return this;
    }
}
