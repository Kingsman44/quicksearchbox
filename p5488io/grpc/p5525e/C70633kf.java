package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.e.kf */
/* compiled from: PG */
public final class C70633kf implements Executor, Runnable {

    /* renamed from: b */
    private static final Logger f188283b;

    /* renamed from: c */
    private static final C70630kc f188284c;

    /* renamed from: a */
    public volatile int f188285a = 0;

    /* renamed from: d */
    private final Executor f188286d;

    /* renamed from: e */
    private final Queue f188287e = new ConcurrentLinkedQueue();

    static {
        C70630kc kcVar;
        Class<C70633kf> cls = C70633kf.class;
        f188283b = Logger.getLogger(cls.getName());
        try {
            kcVar = new C70631kd(AtomicIntegerFieldUpdater.newUpdater(cls, "a"));
        } catch (Throwable th) {
            f188283b.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "getAtomicHelper", "FieldUpdaterAtomicHelper failed", th);
            kcVar = new C70632ke();
        }
        f188284c = kcVar;
    }

    public C70633kf(Executor executor) {
        C58838bb.m90866a(executor, "'executor' must not be null.");
        this.f188286d = executor;
    }

    /* renamed from: a */
    private final void m103234a(Runnable runnable) {
        if (f188284c.mo62377a(this)) {
            try {
                this.f188286d.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f188287e.remove(runnable);
                }
                f188284c.mo62378b(this);
                throw th;
            }
        }
    }

    public final void execute(Runnable runnable) {
        Queue queue = this.f188287e;
        C58838bb.m90866a(runnable, "'r' must not be null.");
        queue.add(runnable);
        m103234a(runnable);
    }

    public final void run() {
        Runnable runnable;
        try {
            Executor executor = this.f188286d;
            while (executor == this.f188286d && (runnable = (Runnable) this.f188287e.poll()) != null) {
                runnable.run();
            }
            f188284c.mo62378b(this);
            if (!this.f188287e.isEmpty()) {
                m103234a((Runnable) null);
            }
        } catch (RuntimeException e) {
            Logger logger = f188283b;
            Level level = Level.SEVERE;
            logger.logp(level, "io.grpc.internal.SerializingExecutor", "run", "Exception while executing runnable " + runnable, e);
        } catch (Throwable th) {
            f188284c.mo62378b(this);
            throw th;
        }
    }
}
