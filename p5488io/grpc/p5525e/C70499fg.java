package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import com.google.common.base.C58887cx;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.e.fg */
/* compiled from: PG */
public final class C70499fg implements Runnable {

    /* renamed from: a */
    private static final Logger f187880a = Logger.getLogger(C70499fg.class.getName());

    /* renamed from: b */
    private final Runnable f187881b;

    public C70499fg(Runnable runnable) {
        C58838bb.m90866a(runnable, "task");
        this.f187881b = runnable;
    }

    public final String toString() {
        return "LogExceptionRunnable(" + this.f187881b + ")";
    }

    public final void run() {
        try {
            this.f187881b.run();
        } catch (Throwable th) {
            Logger logger = f187880a;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder("Exception while executing runnable ");
            Runnable runnable = this.f187881b;
            sb.append(runnable);
            logger.logp(level, "io.grpc.internal.LogExceptionRunnable", "run", "Exception while executing runnable ".concat(runnable.toString()), th);
            C58887cx.m90980g(th);
            throw new AssertionError(th);
        }
    }
}
