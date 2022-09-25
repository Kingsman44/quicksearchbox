package com.google.android.apps.gsa.staticplugins.accl.p7337g;

import com.google.android.apps.gsa.search.core.p6519al.p6711dl.C85386a;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88351yl;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88352ym;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88353yn;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.g.d */
/* compiled from: PG */
final class C92841d implements C85386a {

    /* renamed from: a */
    final /* synthetic */ C92842e f259037a;

    public C92841d(C92842e eVar) {
        this.f259037a = eVar;
    }

    /* renamed from: a */
    public final void mo77892a() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: b */
    public final void mo77893b(String str) {
        C88352ym ymVar = (C88352ym) C88353yn.f238937e.createBuilder();
        ymVar.copyOnWrite();
        C88353yn ynVar = (C88353yn) ymVar.instance;
        str.getClass();
        ynVar.f238939a |= 2;
        ynVar.f238941c = str;
        C87684al alVar = new C87684al(C88244um.TTS_TIMEPOINT_EVENT);
        alVar.mo81965b(C88351yl.f238936a, (C88353yn) ymVar.build());
        C90877ak.m148481o(this.f259037a.f259042e.mo77886a(alVar.mo81964a()), "SSTtsAudioRequest", "Service event sent, received: %b", "Failed to send service event to active client.");
    }
}
