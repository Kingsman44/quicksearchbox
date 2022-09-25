package p5488io.grpc.p5525e;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import p5488io.grpc.C70286co;

/* renamed from: io.grpc.e.hd */
/* compiled from: PG */
final class C70550hd extends WeakReference {

    /* renamed from: a */
    public static final /* synthetic */ int f188055a = 0;

    /* renamed from: b */
    private static final boolean f188056b = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

    /* renamed from: c */
    private static final RuntimeException f188057c;

    /* renamed from: d */
    private final ReferenceQueue f188058d;

    /* renamed from: e */
    private final ConcurrentMap f188059e;

    /* renamed from: f */
    private final String f188060f;

    /* renamed from: g */
    private final Reference f188061g;

    /* renamed from: h */
    private final AtomicBoolean f188062h = new AtomicBoolean();

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        f188057c = runtimeException;
    }

    public C70550hd(C70551he heVar, C70286co coVar, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(heVar, referenceQueue);
        RuntimeException runtimeException;
        if (f188056b) {
            runtimeException = new RuntimeException("ManagedChannel allocation site");
        } else {
            runtimeException = f188057c;
        }
        this.f188061g = new SoftReference(runtimeException);
        this.f188060f = coVar.toString();
        this.f188058d = referenceQueue;
        this.f188059e = concurrentMap;
        concurrentMap.put(this, this);
        m103048b(referenceQueue);
    }

    /* renamed from: b */
    static void m103048b(ReferenceQueue referenceQueue) {
        while (true) {
            C70550hd hdVar = (C70550hd) referenceQueue.poll();
            if (hdVar != null) {
                RuntimeException runtimeException = (RuntimeException) hdVar.f188061g.get();
                hdVar.m103049c();
                if (!hdVar.f188062h.get()) {
                    Level level = Level.SEVERE;
                    if (C70551he.f188063b.isLoggable(level)) {
                        LogRecord logRecord = new LogRecord(level, "*~*~*~ Channel {0} was not shutdown properly!!! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.");
                        logRecord.setLoggerName(C70551he.f188063b.getName());
                        logRecord.setParameters(new Object[]{hdVar.f188060f});
                        logRecord.setThrown(runtimeException);
                        C70551he.f188063b.log(logRecord);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    private final void m103049c() {
        super.clear();
        this.f188059e.remove(this);
        this.f188061g.clear();
    }

    /* renamed from: a */
    public final void mo62295a() {
        if (!this.f188062h.getAndSet(true)) {
            clear();
        }
    }

    public final void clear() {
        m103049c();
        m103048b(this.f188058d);
    }
}
