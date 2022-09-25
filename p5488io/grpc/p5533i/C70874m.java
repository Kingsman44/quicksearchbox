package p5488io.grpc.p5533i;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.i.m */
/* compiled from: PG */
final class C70874m extends ConcurrentLinkedQueue implements Executor {

    /* renamed from: a */
    public static final Object f189055a = new Object();

    /* renamed from: c */
    private static final Logger f189056c = Logger.getLogger(C70874m.class.getName());

    /* renamed from: b */
    public volatile Object f189057b;

    /* renamed from: a */
    public static void m103754a(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            f189056c.logp(Level.WARNING, "io.grpc.stub.ClientCalls$ThreadlessExecutor", "runQuietly", "Runnable threw exception", th);
        }
    }

    /* renamed from: b */
    public static void m103755b() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
    }

    public final void execute(Runnable runnable) {
        add(runnable);
        Object obj = this.f189057b;
        if (obj != f189055a) {
            LockSupport.unpark((Thread) obj);
        } else if (remove(runnable) && C70876o.f189061a) {
            throw new RejectedExecutionException();
        }
    }
}
