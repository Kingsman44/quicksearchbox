package com.google.android.apps.gsa.staticplugins.chime;

import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.n */
/* compiled from: PG */
final class C97732n implements C22868d {

    /* renamed from: a */
    final /* synthetic */ String f272884a;

    public C97732n(String str) {
        this.f272884a = str;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x d = C97733o.f272885a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ChimeNotiEventHandler");
        ((C59052c) ((C59052c) d).mo56372aa(18956)).mo56389s("Failed to recorded chime actions: %s", this.f272884a);
    }

    /* renamed from: gm */
    public final void mo17702gm(Object obj) {
        C59104x b = C97733o.f272885a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ChimeNotiEventHandler");
        ((C59052c) ((C59052c) b).mo56372aa(18957)).mo56389s("Successfully recorded chime actions: %s", this.f272884a);
    }
}
