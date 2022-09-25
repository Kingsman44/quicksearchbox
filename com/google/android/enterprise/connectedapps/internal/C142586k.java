package com.google.android.enterprise.connectedapps.internal;

import com.google.android.enterprise.connectedapps.C142546af;
import com.google.android.enterprise.connectedapps.p10715b.C142562c;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;

/* renamed from: com.google.android.enterprise.connectedapps.internal.k */
/* compiled from: PG */
public final class C142586k implements C142585j {

    /* renamed from: a */
    private final C142546af f386894a;

    /* renamed from: b */
    private final Object f386895b;

    public C142586k(C142546af afVar, Object obj) {
        this.f386894a = afVar;
        this.f386895b = obj;
    }

    /* renamed from: a */
    public final void mo117213a(Throwable th) {
        if (th instanceof C142562c) {
            C142546af afVar = this.f386894a;
            ((C142568e) afVar).f386859a.mo57356n(this.f386895b);
            return;
        }
        ((C142568e) this.f386894a).f386859a.mo57357o(th);
    }

    /* renamed from: b */
    public final void mo117214b(Object obj) {
        ((C142568e) this.f386894a).f386859a.mo57356n(obj);
    }
}
