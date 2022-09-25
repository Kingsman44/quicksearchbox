package p5488io.grpc.p5525e;

import com.google.common.base.C58872ci;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.e.eb */
/* compiled from: PG */
public final class C70467eb {

    /* renamed from: f */
    private static final Logger f187812f = Logger.getLogger(C70467eb.class.getName());

    /* renamed from: a */
    public final long f187813a;

    /* renamed from: b */
    public final C58872ci f187814b;

    /* renamed from: c */
    public Map f187815c;

    /* renamed from: d */
    public boolean f187816d;

    /* renamed from: e */
    public Throwable f187817e;

    /* renamed from: a */
    public static void m102898a(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            f187812f.logp(Level.SEVERE, "io.grpc.internal.Http2Ping", "doExecute", "Failed to execute PingCallback", th);
        }
    }
}
