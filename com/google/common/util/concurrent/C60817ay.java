package com.google.common.util.concurrent;

import com.google.common.base.C58819aj;
import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58838bb;
import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.common.util.concurrent.ay */
/* compiled from: PG */
public final class C60817ay {

    /* renamed from: a */
    public static final Logger f164883a = Logger.getLogger(C60817ay.class.getName());

    /* renamed from: b */
    public final C60802aj f164884b = new C60802aj();

    /* renamed from: c */
    public final C60838bs f164885c;

    /* renamed from: d */
    private final AtomicReference f164886d = new AtomicReference(C60814av.OPEN);

    public C60817ay(C60800ah ahVar, Executor executor) {
        ahVar.getClass();
        C60915eb ebVar = new C60915eb((C60930r) new C60794ab(this, ahVar));
        executor.execute(ebVar);
        this.f164885c = ebVar;
    }

    /* renamed from: a */
    public static C60810ar m92814a(C60817ay ayVar, C60817ay ayVar2) {
        return new C60810ar(ayVar, ayVar2);
    }

    /* renamed from: b */
    public static C60811as m92815b(Iterable iterable) {
        return new C60811as(false, iterable);
    }

    /* renamed from: l */
    public static void m92817l(Closeable closeable, Executor executor) {
        if (closeable != null) {
            try {
                executor.execute(new C60937y(closeable));
            } catch (RejectedExecutionException e) {
                RejectedExecutionException rejectedExecutionException = e;
                Logger logger = f164883a;
                if (logger.isLoggable(Level.WARNING)) {
                    logger.logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture", "closeQuietly", String.format("while submitting close to %s; will close inline", new Object[]{executor}), rejectedExecutionException);
                }
                m92817l(closeable, C60826bg.f164896a);
            }
        }
    }

    /* renamed from: o */
    public static C60801ai m92818o() {
        return new C60797ae();
    }

    /* renamed from: p */
    private final C60817ay m92819p(C60838bs bsVar) {
        C60817ay ayVar = new C60817ay(bsVar);
        mo57277i(ayVar.f164884b);
        return ayVar;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        if (((C60814av) this.f164886d.get()).equals(C60814av.OPEN)) {
            f164883a.logp(Level.SEVERE, "com.google.common.util.concurrent.ClosingFuture", "finalize", "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            mo57275g();
        }
    }

    /* renamed from: g */
    public final C60838bs mo57275g() {
        if (C60935w.m93076a(this.f164886d, C60814av.OPEN, C60814av.WILL_CLOSE)) {
            f164883a.logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "finishToFuture", "will close {0}", this);
            this.f164885c.mo4106b(new C60799ag(this), C60826bg.f164896a);
        } else {
            int ordinal = ((C60814av) this.f164886d.get()).ordinal();
            if (ordinal == 0) {
                throw new AssertionError();
            } else if (ordinal == 1) {
                throw new IllegalStateException("Cannot call finishToFuture() after deriving another step");
            } else if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
                throw new IllegalStateException("Cannot call finishToFuture() twice");
            } else if (ordinal == 5) {
                throw new IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
            }
        }
        return this.f164885c;
    }

    /* renamed from: h */
    public final C60870cx mo57276h() {
        return C60856cj.m92901j(C60922j.m93044g(this.f164885c, new C58819aj((Object) null), C60826bg.f164896a));
    }

    /* renamed from: i */
    public final void mo57277i(C60802aj ajVar) {
        mo57278j(C60814av.OPEN, C60814av.SUBSUMED);
        ajVar.mo57261b(this.f164884b, C60826bg.f164896a);
    }

    /* renamed from: j */
    public final void mo57278j(C60814av avVar, C60814av avVar2) {
        C58838bb.m90890y(C60935w.m93076a(this.f164886d, avVar, avVar2), "Expected state to be %s, but it was %s", avVar, avVar2);
    }

    /* renamed from: k */
    public final void mo57279k() {
        f164883a.logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "close", "closing {0}", this);
        this.f164884b.close();
    }

    /* renamed from: n */
    public final boolean mo57281n(boolean z) {
        f164883a.logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "cancel", "cancelling {0}", this);
        boolean cancel = this.f164885c.cancel(z);
        if (cancel) {
            mo57279k();
        }
        return cancel;
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("state", this.f164886d.get());
        b.mo56101a().f156625b = this.f164885c;
        return b.toString();
    }

    @Deprecated
    /* renamed from: d */
    public static C60817ay m92816d(C60870cx cxVar, Executor executor) {
        executor.getClass();
        C60817ay ayVar = new C60817ay(C60856cj.m92901j(cxVar));
        C60856cj.m92911t(cxVar, new C60938z(ayVar, executor), C60826bg.f164896a);
        return ayVar;
    }

    /* renamed from: c */
    public final C60817ay mo57271c(Class cls, C60804al alVar, Executor executor) {
        alVar.getClass();
        return m92819p((C60838bs) C60846c.m92879h(this.f164885c, cls, new C60798af(this, alVar), executor));
    }

    /* renamed from: e */
    public final C60817ay mo57272e(C60804al alVar, Executor executor) {
        alVar.getClass();
        return m92819p((C60838bs) C60922j.m93045h(this.f164885c, new C60795ac(this, alVar), executor));
    }

    /* renamed from: f */
    public final C60817ay mo57273f(C60801ai aiVar, Executor executor) {
        aiVar.getClass();
        return m92819p((C60838bs) C60922j.m93045h(this.f164885c, new C60796ad(this, aiVar), executor));
    }

    public C60817ay(C60803ak akVar, Executor executor) {
        akVar.getClass();
        C60915eb ebVar = new C60915eb((Callable) new C60793aa(this, akVar));
        executor.execute(ebVar);
        this.f164885c = ebVar;
    }

    /* renamed from: m */
    public final void mo57280m(C60816ax axVar, Executor executor) {
        axVar.getClass();
        if (!C60935w.m93076a(this.f164886d, C60814av.OPEN, C60814av.WILL_CREATE_VALUE_AND_CLOSER)) {
            int ordinal = ((C60814av) this.f164886d.get()).ordinal();
            if (ordinal == 1) {
                throw new IllegalStateException("Cannot call finishToValueAndCloser() after deriving another step");
            } else if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
                throw new IllegalStateException("Cannot call finishToValueAndCloser() after calling finishToFuture()");
            } else if (ordinal != 5) {
                throw new AssertionError(this.f164886d);
            } else {
                throw new IllegalStateException("Cannot call finishToValueAndCloser() twice");
            }
        } else {
            this.f164885c.mo4106b(new C60936x(this, axVar), executor);
        }
    }

    public C60817ay(C60870cx cxVar) {
        this.f164885c = C60838bs.m92859i(cxVar);
    }
}
