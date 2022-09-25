package com.google.p4449cd.p4456g.p4457a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57996c;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.cd.g.a.f */
/* compiled from: PG */
public abstract class C57980f implements C57996c {

    /* renamed from: a */
    private final C57974a f155042a;

    /* renamed from: b */
    public final C57979e f155043b = new C57979e(this);

    /* renamed from: c */
    public final AtomicBoolean f155044c = new AtomicBoolean(true);

    protected C57980f(C57974a aVar) {
        this.f155042a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo54581a();

    /* renamed from: c */
    public final void mo54583c(Object obj) {
        if (this.f155044c.get()) {
            this.f155042a.mo20337c(obj);
        }
    }

    /* renamed from: d */
    public final void mo54584d(boolean z) {
        if (mo54586f()) {
            this.f155042a.mo20339gQ(z);
            this.f155043b.mo57356n(C118826c.f331422a);
        }
    }

    /* renamed from: e */
    public final void mo54585e(Throwable th) {
        if (mo54586f()) {
            try {
                this.f155042a.mo20340gR(th);
            } finally {
                this.f155043b.mo57357o(th);
            }
        }
    }

    /* renamed from: f */
    public final boolean mo54586f() {
        return this.f155044c.getAndSet(false);
    }

    /* renamed from: g */
    public final void mo21018g() {
        if (mo54586f()) {
            mo54581a();
            this.f155043b.mo57356n(C118826c.f331422a);
        }
    }
}
