package com.google.android.apps.gsa.staticplugins.bisto.p7479ae.p7480a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.a.e */
/* compiled from: PG */
final class C95042e implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C95043f f265895a;

    public C95042e(C95043f fVar) {
        this.f265895a = fVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59052c cVar = (C59052c) C95043f.f265896a.mo56225c();
        cVar.mo56378ag(C58975e.f156826a, this.f265895a.f265898c);
        ((C59052c) ((C59052c) cVar.mo56382g(th)).mo56372aa(18093)).mo56386p("Failed to process audio data.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        int length = ((byte[]) obj).length;
        int i = this.f265895a.f265900e;
        if (i < 38400 && i + length >= 38400) {
            C59052c cVar = (C59052c) C95043f.f265896a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, this.f265895a.f265898c);
            ((C59052c) cVar.mo56372aa(18094)).mo56387q("Backlog decoded (%sB)", this.f265895a.f265900e);
        }
        this.f265895a.f265900e += length;
    }
}
