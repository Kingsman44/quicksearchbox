package com.google.android.apps.gsa.staticplugins.opa.samson;

import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.assistant.p3861at.C50307sf;
import com.google.assistant.p3861at.act;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.a */
/* compiled from: PG */
final class C110010a implements C22868d {

    /* renamed from: a */
    final /* synthetic */ Runnable f306491a;

    /* renamed from: b */
    final /* synthetic */ C110042b f306492b;

    public C110010a(C110042b bVar, Runnable runnable) {
        this.f306492b = bVar;
        this.f306491a = runnable;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = C110042b.f306594a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ClientSuggHndl");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(25521)).mo56386p("Unable to get system settings");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        act act = (act) obj;
        if (act != null && (act.f128894a & 2) != 0) {
            C50307sf sfVar = act.f128897d;
            if (sfVar == null) {
                sfVar = C50307sf.f130929e;
            }
            boolean z = true;
            boolean z2 = sfVar.f130931a & true;
            C110042b bVar = this.f306492b;
            boolean z3 = bVar.f306604k;
            if (true != z2) {
                z = false;
            }
            bVar.f306604k = z;
            if (z3 != z2) {
                C110229k kVar = ((C110125e) this.f306491a).f306876a;
                kVar.f307149d = null;
                kVar.mo98490f();
            }
        }
    }
}
