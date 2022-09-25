package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p736c.p737a;

import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2904c.C37418bw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.c.a.i */
/* compiled from: PG */
public final class C12046i implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C12048k f38593a;

    public C12046i(C12048k kVar) {
        this.f38593a = kVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C12048k.f38594a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AudioLstnSessFctry");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(44003)).mo56386p("Mic close failure");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C37418bw bwVar = (C37418bw) obj;
        C59104x b = C12048k.f38594a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AudioLstnSessFctry");
        ((C59052c) ((C59052c) b).mo56372aa(44004)).mo56386p("Mic close success");
        this.f38593a.f38597d.mo22352b(C37179a.f97457ac);
    }
}
