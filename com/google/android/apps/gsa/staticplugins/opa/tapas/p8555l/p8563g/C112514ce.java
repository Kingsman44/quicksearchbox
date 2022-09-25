package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.ce */
/* compiled from: PG */
public final /* synthetic */ class C112514ce implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C112518ci f312057a;

    public /* synthetic */ C112514ce(C112518ci ciVar) {
        this.f312057a = ciVar;
    }

    public final void run() {
        C112518ci ciVar = this.f312057a;
        C60870cx cxVar = ciVar.f312064d;
        if (cxVar != null) {
            cxVar.cancel(true);
            ciVar.f312064d = null;
        }
        ciVar.f312065e = 0;
    }
}
