package com.google.android.apps.gsa.staticplugins.opa.p8470t;

import com.google.android.apps.search.assistant.platform.p9141h.p9148c.C121016b;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.search.assistant.p2704m.C34807b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.t.o */
/* compiled from: PG */
public final /* synthetic */ class C110953o implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C110956r f309079a;

    /* renamed from: b */
    public final /* synthetic */ int f309080b;

    public /* synthetic */ C110953o(C110956r rVar, int i) {
        this.f309079a = rVar;
        this.f309080b = i;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C34807b bVar;
        C110956r rVar = this.f309079a;
        int i = this.f309080b;
        C121016b bVar2 = (C121016b) ((C68214a) rVar.f309092e.get()).mo27525b();
        if (i == 1) {
            bVar = C34807b.ELIGIBLE_PREBUILT;
        } else if (i == 2) {
            bVar = C34807b.ELIGIBLE_FOR_UPGRADE;
        } else if (i == 3) {
            bVar = C34807b.ELIGIBLE_UPGRADING;
        } else if (i == 4) {
            bVar = C34807b.ELIGIBLE_UPGRADED;
        } else if (i != 5) {
            bVar = C34807b.NOT_ELIGIBLE;
        } else {
            bVar = C34807b.ELIGIBLE_UPGRADED_BYPASS;
        }
        return bVar2.mo98954a(bVar);
    }
}
