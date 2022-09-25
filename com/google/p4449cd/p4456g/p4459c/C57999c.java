package com.google.p4449cd.p4456g.p4459c;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58839bc;
import com.google.common.util.concurrent.C60873d;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57996c;

/* renamed from: com.google.cd.g.c.c */
/* compiled from: PG */
final class C57999c extends C60873d implements C57974a {

    /* renamed from: a */
    private final Object f155073a = new Object();

    /* renamed from: b */
    private final C58839bc f155074b;

    /* renamed from: c */
    private C57996c f155075c;

    public C57999c(C58839bc bcVar) {
        this.f155074b = bcVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46268a() {
        synchronized (this.f155073a) {
            C57996c cVar = this.f155075c;
            if (cVar != null) {
                cVar.mo21018g();
            }
        }
    }

    /* renamed from: c */
    public final void mo20337c(Object obj) {
        if (this.f155074b.mo5941a(obj)) {
            mo57356n(C58833ax.m90834k(obj));
        }
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
        synchronized (this.f155073a) {
            if (this.value instanceof C60873d.C60875b) {
                cVar.mo21018g();
            } else {
                this.f155075c = cVar;
            }
        }
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        mo57356n(C58836b.f156633a);
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        mo57357o(th);
    }
}
