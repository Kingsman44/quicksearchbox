package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.x */
/* compiled from: PG */
public final /* synthetic */ class C100198x implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C100125ad f280228a;

    public /* synthetic */ C100198x(C100125ad adVar) {
        this.f280228a = adVar;
    }

    public final Object apply(Object obj) {
        C100125ad adVar = this.f280228a;
        Boolean bool = (Boolean) obj;
        if (!bool.booleanValue()) {
            synchronized (adVar.f279970f) {
                int i = adVar.f279976l.get();
                int a = adVar.f279983s.mo91776a();
                if (i == 0 && a == 0) {
                    adVar.mo91767m();
                }
            }
        } else if (!adVar.f279978n.getAndSet(true)) {
            if (adVar.f279969e.mo26871c() - C100125ad.f279966b < adVar.f279980p) {
                adVar.f279978n.set(false);
            } else {
                adVar.f279977m.mo28212l("maybeStartFileCleanup", new C100199y(adVar));
            }
        }
        return bool;
    }
}
