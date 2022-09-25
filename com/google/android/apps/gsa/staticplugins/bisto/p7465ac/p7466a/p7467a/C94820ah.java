package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.ah */
/* compiled from: PG */
public final /* synthetic */ class C94820ah implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C94821ai f265136a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f265137b;

    public /* synthetic */ C94820ah(C94821ai aiVar, C60870cx cxVar) {
        this.f265136a = aiVar;
        this.f265137b = cxVar;
    }

    public final void run() {
        C94821ai aiVar = this.f265136a;
        C94841p pVar = (C94841p) C60856cj.m92910s(this.f265137b);
        if (pVar != C94841p.ERROR_NOT_SPECIFIED) {
            if (!aiVar.mo88639h(pVar) && aiVar.f265140b != null) {
                aiVar.f265140b.mo88660f(new C94851z(pVar));
            }
            aiVar.mo88634c();
        }
    }
}
