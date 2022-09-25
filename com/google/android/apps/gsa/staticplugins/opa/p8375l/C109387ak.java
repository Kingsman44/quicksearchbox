package com.google.android.apps.gsa.staticplugins.opa.p8375l;

import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.assistant.p4008y.p4009a.C53606o;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.ak */
/* compiled from: PG */
final class C109387ak implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C109388al f304668a;

    public C109387ak(C109388al alVar) {
        this.f304668a = alVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x d = C109388al.f304669a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ChalkboardCorpusListen");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(23926)).mo56386p("Geller Chalkboard response fetching failed");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C109388al alVar = this.f304668a;
        alVar.f304670b.mo28211k(alVar.f304671c.mo97814a((C53606o) obj), "Storing Chalkboard prefetch response to proto datastore", new C109386aj());
    }
}
