package com.bumptech.glide.p287f;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.p293a.C5673ap;
import com.bumptech.glide.p287f.p288a.C5571m;
import com.bumptech.glide.p287f.p288a.C5572n;
import com.bumptech.glide.p287f.p289b.C5582f;
import com.bumptech.glide.p291h.C5632s;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.bumptech.glide.f.h */
/* compiled from: PG */
public final class C5591h implements C5587d, C5592i {

    /* renamed from: a */
    private final int f16884a;

    /* renamed from: b */
    private final int f16885b;

    /* renamed from: c */
    private Object f16886c;

    /* renamed from: d */
    private C5588e f16887d;

    /* renamed from: e */
    private boolean f16888e;

    /* renamed from: f */
    private boolean f16889f;

    /* renamed from: g */
    private boolean f16890g;

    /* renamed from: h */
    private C5673ap f16891h;

    public C5591h(int i, int i2) {
        this.f16884a = i;
        this.f16885b = i2;
    }

    /* renamed from: i */
    private final synchronized Object m14501i(Long l) {
        if (!isDone()) {
            C5632s.m14616i();
        }
        if (this.f16888e) {
            throw new CancellationException();
        } else if (this.f16890g) {
            throw new ExecutionException(this.f16891h);
        } else if (this.f16889f) {
            return this.f16886c;
        } else {
            if (l == null) {
                wait(0);
            } else if (l.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l.longValue() + currentTimeMillis;
                while (!isDone() && currentTimeMillis < longValue) {
                    wait(longValue - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            } else if (this.f16890g) {
                throw new ExecutionException(this.f16891h);
            } else if (this.f16888e) {
                throw new CancellationException();
            } else if (this.f16889f) {
                return this.f16886c;
            } else {
                throw new TimeoutException();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo11859a(Drawable drawable) {
    }

    /* renamed from: a */
    public final synchronized boolean mo11905a(C5673ap apVar, Object obj, C5572n nVar, boolean z) {
        this.f16890g = true;
        this.f16891h = apVar;
        notifyAll();
        return false;
    }

    /* renamed from: b */
    public final synchronized boolean mo11906b(Object obj, Object obj2, C5572n nVar, C5637a aVar, boolean z) {
        this.f16889f = true;
        this.f16886c = obj;
        notifyAll();
        return false;
    }

    /* renamed from: c */
    public final synchronized void mo11861c(Object obj, C5582f fVar) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r1 == null) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        r1.mo12015c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isDone()     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x000a
            monitor-exit(r2)     // Catch:{ all -> 0x001f }
            r3 = 0
            return r3
        L_0x000a:
            r0 = 1
            r2.f16888e = r0     // Catch:{ all -> 0x001f }
            r2.notifyAll()     // Catch:{ all -> 0x001f }
            r1 = 0
            if (r3 == 0) goto L_0x0018
            com.bumptech.glide.f.e r3 = r2.f16887d     // Catch:{ all -> 0x001f }
            r2.f16887d = r1     // Catch:{ all -> 0x001f }
            r1 = r3
        L_0x0018:
            monitor-exit(r2)     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x001e
            r1.mo12015c()
        L_0x001e:
            return r0
        L_0x001f:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p287f.C5591h.cancel(boolean):boolean");
    }

    /* renamed from: d */
    public final synchronized C5588e mo11990d() {
        return this.f16887d;
    }

    /* renamed from: e */
    public final void mo11995e(C5571m mVar) {
        mVar.mo12006g(this.f16884a, this.f16885b);
    }

    /* renamed from: f */
    public final void mo11991f(Drawable drawable) {
    }

    /* renamed from: fB */
    public final void mo11992fB(Drawable drawable) {
    }

    /* renamed from: g */
    public final void mo11996g(C5571m mVar) {
    }

    public final Object get() {
        try {
            return m14501i((Long) null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: h */
    public final synchronized void mo11993h(C5588e eVar) {
        this.f16887d = eVar;
    }

    public final synchronized boolean isCancelled() {
        return this.f16888e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean isDone() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f16888e     // Catch:{ all -> 0x0014 }
            if (r0 != 0) goto L_0x0011
            boolean r0 = r1.f16889f     // Catch:{ all -> 0x0014 }
            if (r0 != 0) goto L_0x0011
            boolean r0 = r1.f16890g     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x000e
            goto L_0x0011
        L_0x000e:
            monitor-exit(r1)
            r0 = 0
            return r0
        L_0x0011:
            monitor-exit(r1)
            r0 = 1
            return r0
        L_0x0014:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p287f.C5591h.isDone():boolean");
    }

    /* renamed from: p */
    public final void mo11881p() {
    }

    /* renamed from: q */
    public final void mo11882q() {
    }

    /* renamed from: r */
    public final void mo11883r() {
    }

    public final String toString() {
        C5588e eVar;
        String str;
        String concat = String.valueOf(super.toString()).concat("[status=");
        synchronized (this) {
            eVar = null;
            if (this.f16888e) {
                str = "CANCELLED";
            } else if (this.f16890g) {
                str = "FAILURE";
            } else if (this.f16889f) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                eVar = this.f16887d;
            }
        }
        if (eVar != null) {
            String obj = eVar.toString();
            return concat + str + ", request=[" + obj + "]]";
        }
        return concat + str + "]";
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return m14501i(Long.valueOf(timeUnit.toMillis(j)));
    }
}
