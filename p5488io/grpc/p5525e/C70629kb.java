package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.e.kb */
/* compiled from: PG */
final class C70629kb implements Executor {

    /* renamed from: a */
    private static final Logger f188279a = Logger.getLogger(C70629kb.class.getName());

    /* renamed from: b */
    private boolean f188280b;

    /* renamed from: c */
    private ArrayDeque f188281c;

    /* renamed from: a */
    private final void m103227a() {
        while (true) {
            Runnable runnable = (Runnable) this.f188281c.poll();
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    Logger logger = f188279a;
                    Level level = Level.SEVERE;
                    new StringBuilder("Exception while executing runnable ").append(runnable);
                    logger.logp(level, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "completeQueuedTasks", "Exception while executing runnable ".concat(runnable.toString()), th);
                }
            } else {
                return;
            }
        }
    }

    public final void execute(Runnable runnable) {
        C58838bb.m90866a(runnable, "'task' must not be null.");
        if (!this.f188280b) {
            this.f188280b = true;
            try {
                runnable.run();
                if (this.f188281c != null) {
                    m103227a();
                }
                this.f188280b = false;
            } catch (Throwable th) {
                if (this.f188281c != null) {
                    m103227a();
                }
                this.f188280b = false;
                throw th;
            }
        } else {
            if (this.f188281c == null) {
                this.f188281c = new ArrayDeque(4);
            }
            this.f188281c.add(runnable);
        }
    }
}
