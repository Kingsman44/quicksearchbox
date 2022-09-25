package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58887cx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.jd */
/* compiled from: PG */
final class C116809jd implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C22869e f324100a;

    public C116809jd(C22869e eVar) {
        this.f324100a = eVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C58887cx.m90979f(th, Error.class);
        C59104x d = C116811jf.f324102a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "S_VoiceSearchState");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(32387)).mo56386p("previous VoiceSearch completed with exception");
        this.f324100a.run();
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        C59071e eVar = C116811jf.f324102a;
        C58976aa aaVar = C58975e.f156826a;
        this.f324100a.run();
    }
}
