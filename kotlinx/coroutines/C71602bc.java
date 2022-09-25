package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.bc */
/* compiled from: PG */
public final class C71602bc extends C71624by implements Runnable {
    private static volatile Thread _thread;

    /* renamed from: c */
    public static final C71602bc f191039c;
    private static volatile int debugStatus;

    /* renamed from: h */
    private static final long f191040h;

    static {
        Long l;
        C71602bc bcVar = new C71602bc();
        f191039c = bcVar;
        bcVar.mo62846n(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f191040h = timeUnit.toNanos(l.longValue());
    }

    private C71602bc() {
    }

    /* renamed from: u */
    private final synchronized Thread m104529u() {
        Thread thread = _thread;
        if (thread != null) {
            return thread;
        }
        Thread thread2 = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
        _thread = thread2;
        thread2.setDaemon(true);
        thread2.start();
        return thread2;
    }

    /* renamed from: v */
    private final synchronized void m104530v() {
        if (m104532x()) {
            debugStatus = 3;
            this.f191063e.mo62678c((Object) null);
            this.f191064f.mo62678c((Object) null);
            notifyAll();
        }
    }

    /* renamed from: w */
    private final synchronized boolean m104531w() {
        if (m104532x()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* renamed from: x */
    private static final boolean m104532x() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* renamed from: y */
    private static final void m104533y() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Thread mo62820c() {
        Thread thread = _thread;
        return thread == null ? m104529u() : thread;
    }

    /* renamed from: g */
    public final C71615bp mo62769g(long j, Runnable runnable, C69585o oVar) {
        C69664n.m101061g(oVar, "context");
        long a = C71628ca.m104601a(j);
        if (a >= 4611686018427387903L) {
            return C71672dh.f191129a;
        }
        long nanoTime = System.nanoTime();
        C71621bv bvVar = new C71621bv(a + nanoTime, runnable);
        mo62859r(nanoTime, bvVar);
        return bvVar;
    }

    /* renamed from: h */
    public final void mo62821h(Runnable runnable) {
        C69664n.m101061g(runnable, "task");
        if (debugStatus == 4) {
            m104533y();
        }
        super.mo62821h(runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo62822i(long j, C71622bw bwVar) {
        m104533y();
    }

    /* renamed from: j */
    public final void mo62823j() {
        debugStatus = 4;
        super.mo62823j();
    }

    public final void run() {
        ThreadLocal threadLocal = C71687dw.f191139a;
        C71687dw.f191139a.set(this);
        try {
            if (!m104531w()) {
                _thread = null;
                m104530v();
                if (!mo62860s()) {
                    mo62820c();
                    return;
                }
                return;
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long k = mo62843k();
                if (k == Long.MAX_VALUE) {
                    long nanoTime = System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = f191040h + nanoTime;
                    }
                    k = j - nanoTime;
                    if (k <= 0) {
                        _thread = null;
                        m104530v();
                        if (!mo62860s()) {
                            mo62820c();
                            return;
                        }
                        return;
                    } else if (k >= Long.MAX_VALUE) {
                        k = Long.MAX_VALUE;
                    }
                } else {
                    j = Long.MAX_VALUE;
                }
                if (k > 0) {
                    if (m104532x()) {
                        _thread = null;
                        m104530v();
                        if (!mo62860s()) {
                            mo62820c();
                            return;
                        }
                        return;
                    }
                    LockSupport.parkNanos(this, k);
                }
            }
        } catch (Throwable th) {
            _thread = null;
            m104530v();
            if (!mo62860s()) {
                mo62820c();
            }
            throw th;
        }
    }
}
