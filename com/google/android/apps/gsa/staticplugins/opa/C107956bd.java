package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.util.C113854ci;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bd */
/* compiled from: PG */
public final /* synthetic */ class C107956bd implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C109040fj f300390a;

    /* renamed from: b */
    public final /* synthetic */ int f300391b;

    public /* synthetic */ C107956bd(C109040fj fjVar, int i) {
        this.f300390a = fjVar;
        this.f300391b = i;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C109040fj fjVar = this.f300390a;
        int i = this.f300391b;
        if (!((Boolean) obj).booleanValue()) {
            fjVar.mo97541n();
            fjVar.mo97427O();
            ((C113854ci) fjVar.f303252aL.mo27525b()).mo100700a(16, C89849ae.OPA_ANDROID_STARTUP_WARMER_WELCOME_INPUT_CREATE_FAILED);
            return;
        }
        fjVar.f303386cr = true;
        ((C113854ci) fjVar.f303252aL.mo27525b()).mo100700a(16, C89849ae.OPA_ANDROID_STARTUP_WARMER_WELCOME_INPUT_CREATE_DONE);
        if (fjVar.f303455t.mo79746e(C90014bt.f247162bu) && i == 7) {
            fjVar.f303444i.mo95152c((int) fjVar.f303455t.mo79743a(C90014bt.f247163bv));
        }
    }
}
