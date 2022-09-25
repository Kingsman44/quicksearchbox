package com.google.p4449cd.p4462i;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60919g;
import com.google.p4449cd.p4451b.C57938a;
import com.google.p4449cd.p4453d.C57957c;
import com.google.p4449cd.p4453d.C57958d;
import com.google.p4449cd.p4454e.C57969i;
import com.google.p4449cd.p4460h.p4461a.C58013ai;
import com.google.p4449cd.p4460h.p4461a.C58026m;
import com.google.p4449cd.p4460h.p4461a.C58027n;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.cd.i.a */
/* compiled from: PG */
public final class C58042a extends C60919g implements C60888db {

    /* renamed from: a */
    private static final ThreadLocal f155170a = new ThreadLocal();

    /* renamed from: b */
    private final C60888db f155171b;

    /* renamed from: c */
    private final C57957c f155172c;

    /* renamed from: d */
    private final C57938a f155173d;

    /* renamed from: e */
    private final C57969i f155174e;

    /* renamed from: f */
    private final long f155175f;

    public C58042a(C60888db dbVar, C57957c cVar, C57938a aVar, C57969i iVar, long j) {
        this.f155171b = dbVar;
        this.f155172c = cVar;
        this.f155173d = aVar;
        this.f155174e = iVar;
        this.f155175f = j;
    }

    /* renamed from: h */
    private final C57958d m88797h(Class cls) {
        C57958d a = C58013ai.m88768a(cls, this.f155172c, this.f155173d, this.f155175f);
        this.f155174e.mo54575e(a);
        return a;
    }

    /* renamed from: a */
    public final C60870cx mo19398a(Runnable runnable) {
        ThreadLocal threadLocal = f155170a;
        threadLocal.set(runnable.getClass());
        try {
            C60870cx a = super.submit(runnable);
            threadLocal.remove();
            return a;
        } catch (Throwable th) {
            f155170a.remove();
            throw th;
        }
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f155171b.awaitTermination(j, timeUnit);
    }

    /* renamed from: b */
    public final C60870cx mo19399b(Callable callable) {
        ThreadLocal threadLocal = f155170a;
        threadLocal.set(callable.getClass());
        try {
            C60870cx b = super.submit(callable);
            threadLocal.remove();
            return b;
        } catch (Throwable th) {
            f155170a.remove();
            throw th;
        }
    }

    /* renamed from: c */
    public final C60870cx mo19400c(Runnable runnable, Object obj) {
        ThreadLocal threadLocal = f155170a;
        threadLocal.set(runnable.getClass());
        try {
            C60870cx c = super.submit(runnable, obj);
            threadLocal.remove();
            return c;
        } catch (Throwable th) {
            f155170a.remove();
            throw th;
        }
    }

    /* renamed from: d */
    public final C60872cz schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f155171b.mo29164d(new C58027n(m88797h(runnable.getClass()), this.f155174e, runnable), j, timeUnit);
    }

    /* renamed from: e */
    public final C60872cz schedule(Callable callable, long j, TimeUnit timeUnit) {
        return this.f155171b.mo29165e(new C58026m(m88797h(callable.getClass()), this.f155174e, callable), j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        ThreadLocal threadLocal = f155170a;
        Class<?> cls = (Class) threadLocal.get();
        threadLocal.remove();
        if (cls == null) {
            cls = runnable.getClass();
        }
        C57958d a = C58013ai.m88768a(cls, this.f155172c, this.f155173d, this.f155175f);
        this.f155174e.mo54575e(a);
        this.f155171b.execute(new C58027n(a, this.f155174e, runnable));
    }

    /* renamed from: f */
    public final C60872cz mo29166f(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public final C60872cz mo29167g(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final boolean isShutdown() {
        return this.f155171b.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f155171b.isTerminated();
    }

    public final /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void shutdown() {
        this.f155171b.shutdown();
    }

    public final List shutdownNow() {
        return this.f155171b.shutdownNow();
    }

    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        return submit(runnable);
    }

    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return submit(runnable, obj);
    }

    public final /* bridge */ /* synthetic */ Future submit(Callable callable) {
        return submit(callable);
    }
}
