package com.google.android.apps.gsa.staticplugins.accl.performers.p7342c;

import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.c.ab */
/* compiled from: PG */
public final /* synthetic */ class C92927ab implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C92931af f259246a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f259247b;

    /* renamed from: c */
    public final /* synthetic */ C92930ae f259248c;

    public /* synthetic */ C92927ab(C92931af afVar, C60870cx cxVar, C92930ae aeVar) {
        this.f259246a = afVar;
        this.f259247b = cxVar;
        this.f259248c = aeVar;
    }

    public final void run() {
        C92931af afVar = this.f259246a;
        C60870cx cxVar = this.f259247b;
        C92930ae aeVar = this.f259248c;
        if (C90877ak.m148478l(cxVar)) {
            afVar.f259255b.execute(new C92926aa(afVar, aeVar));
        }
    }
}
