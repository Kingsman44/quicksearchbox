package com.google.android.apps.gsa.staticplugins.fedass.trainingcache.p7957c;

import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.trainingcache.c.q */
/* compiled from: PG */
final class C101194q implements C22868d {

    /* renamed from: a */
    private final String f282450a;

    public C101194q(String str) {
        this.f282450a = str;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = C101196s.f282451a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "TrainingCacheConnection");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(19864)).mo56389s("%s: failed", this.f282450a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        Void voidR = (Void) obj;
        C59104x b = C101196s.f282451a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainingCacheConnection");
        ((C59052c) ((C59052c) b).mo56372aa(19865)).mo56389s("%s: success", this.f282450a);
    }
}
