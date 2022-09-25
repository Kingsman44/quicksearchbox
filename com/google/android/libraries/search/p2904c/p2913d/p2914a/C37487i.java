package com.google.android.libraries.search.p2904c.p2913d.p2914a;

import com.google.android.libraries.search.p2904c.C37344ai;
import com.google.android.libraries.search.p2904c.C37348am;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.search.c.d.a.i */
/* compiled from: PG */
final class C37487i implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C37488j f99520a;

    public C37487i(C37488j jVar) {
        this.f99520a = jVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C37488j.f99521a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ALT.AFCSession");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(52691)).mo56386p("#audio# Failed to get ReleaseAudioFocusStatus future.");
        this.f99520a.f99528h.mo5437b(C37846as.m66796b(C37344ai.FAILED_GETTING_STATUS_FUTURE));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f99520a.f99528h.mo5437b((C37348am) obj);
    }
}
