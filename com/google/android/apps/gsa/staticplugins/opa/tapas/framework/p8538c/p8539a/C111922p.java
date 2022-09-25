package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.p8539a;

import java.util.List;
import p3186j$.time.Duration;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.a.p */
/* compiled from: PG */
public final /* synthetic */ class C111922p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C111890ab f310950a;

    public /* synthetic */ C111922p(C111890ab abVar) {
        this.f310950a = abVar;
    }

    public final void run() {
        C111890ab abVar = this.f310950a;
        C111915i iVar = abVar.f310912e;
        Duration minus = abVar.mo99292c().minus(C111890ab.f310910c);
        for (List list : iVar.f310943a.values()) {
            synchronized (list) {
                Collection.EL.removeIf(list, new C111912f(minus));
            }
        }
        Collection.EL.removeIf(iVar.f310943a.entrySet(), C111913g.f310942a);
    }
}
