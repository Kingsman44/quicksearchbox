package com.google.android.apps.gsa.search.core.service;

import com.google.android.apps.gsa.search.core.state.p6872d.C86948bo;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.service.aj */
/* compiled from: PG */
public final /* synthetic */ class C86614aj implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C86626av f233996a;

    public /* synthetic */ C86614aj(C86626av avVar) {
        this.f233996a = avVar;
    }

    public final void run() {
        C86626av avVar = this.f233996a;
        if (!avVar.f234040r) {
            ((C86948bo) avVar.f234030h.mo27525b()).mo80599r(true);
            ((C86948bo) avVar.f234030h.mo27525b()).f234849g = false;
            C60870cx cxVar = avVar.f234041s;
            avVar.f234041s = avVar.f234026d.mo28208h("endKeepAliveForHandover", avVar.f234027e.mo79743a(C90120fr.f250789aB), new C86612ah(avVar));
            cxVar.cancel(false);
        }
    }
}
