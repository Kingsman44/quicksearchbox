package com.google.common.util.concurrent;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58471gg;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4522b.C58800sl;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import p3186j$.util.Objects;

/* renamed from: com.google.common.util.concurrent.m */
/* compiled from: PG */
abstract class C60925m extends C60929q {

    /* renamed from: c */
    private static final Logger f165039c = Logger.getLogger(C60925m.class.getName());

    /* renamed from: a */
    public C58471gg f165040a;

    /* renamed from: d */
    private final boolean f165041d;

    /* renamed from: e */
    private final boolean f165042e;

    public C60925m(C58471gg ggVar, boolean z, boolean z2) {
        super(ggVar.size());
        ggVar.getClass();
        this.f165040a = ggVar;
        this.f165041d = z;
        this.f165042e = z2;
    }

    /* renamed from: u */
    private static void m93051u(Throwable th) {
        f165039c.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    /* renamed from: v */
    private static boolean m93052v(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46268a() {
        C58471gg ggVar = this.f165040a;
        boolean z = true;
        mo57286s(1);
        boolean isCancelled = isCancelled();
        if (ggVar == null) {
            z = false;
        }
        if (z && isCancelled) {
            boolean q = mo57359q();
            C58800sl lA = ggVar.iterator();
            while (lA.hasNext()) {
                ((Future) lA.next()).cancel(q);
            }
        }
    }

    /* renamed from: f */
    public abstract void mo57284f(int i, Object obj);

    /* renamed from: g */
    public final void mo57423g(int i, Future future) {
        try {
            mo57284f(i, C60856cj.m92909r(future));
        } catch (ExecutionException e) {
            m93050t(e.getCause());
        } catch (Error | RuntimeException e2) {
            m93050t(e2);
        }
    }

    /* renamed from: h */
    public final void mo57424h(C58471gg ggVar) {
        int a = C60929q.f165046b.mo57426a(this);
        int i = 0;
        C58838bb.m90884s(a >= 0, "Less than 0 remaining futures");
        if (a == 0) {
            if (ggVar != null) {
                C58800sl lA = ggVar.iterator();
                while (lA.hasNext()) {
                    Future future = (Future) lA.next();
                    if (!future.isCancelled()) {
                        mo57423g(i, future);
                    }
                    i++;
                }
            }
            this.seenExceptions = null;
            mo57285i();
            mo57286s(2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: hT */
    public final String mo45912hT() {
        C58471gg ggVar = this.f165040a;
        if (ggVar == null) {
            return super.mo45912hT();
        }
        new StringBuilder("futures=").append(ggVar);
        return "futures=".concat(ggVar.toString());
    }

    /* renamed from: i */
    public abstract void mo57285i();

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo57425r() {
        Objects.requireNonNull(this.f165040a);
        if (this.f165040a.isEmpty()) {
            mo57285i();
        } else if (this.f165041d) {
            C58800sl lA = this.f165040a.iterator();
            int i = 0;
            while (lA.hasNext()) {
                C60870cx cxVar = (C60870cx) lA.next();
                cxVar.mo4106b(new C60923k(this, cxVar, i), C60826bg.f164896a);
                i++;
            }
        } else {
            C60924l lVar = new C60924l(this, this.f165042e ? this.f165040a : null);
            C58800sl lA2 = this.f165040a.iterator();
            while (lA2.hasNext()) {
                ((C60870cx) lA2.next()).mo4106b(lVar, C60826bg.f164896a);
            }
        }
    }

    /* renamed from: s */
    public void mo57286s(int i) {
        throw null;
    }

    /* renamed from: e */
    public final void mo57422e(Set set) {
        set.getClass();
        if (!isCancelled()) {
            m93052v(set, (Throwable) Objects.requireNonNull(mo57252k()));
        }
    }

    /* renamed from: t */
    private final void m93050t(Throwable th) {
        th.getClass();
        if (this.f165041d && !mo57357o(th)) {
            Set set = this.seenExceptions;
            if (set == null) {
                Set k = C58758qx.m90653k();
                mo57422e(k);
                C60929q.f165046b.mo57427b(this, k);
                set = (Set) Objects.requireNonNull(this.seenExceptions);
            }
            if (m93052v(set, th)) {
                m93051u(th);
                return;
            }
        }
        if (th instanceof Error) {
            m93051u(th);
        }
    }
}
