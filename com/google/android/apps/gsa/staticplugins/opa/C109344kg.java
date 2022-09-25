package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.util.p7159c.C90890ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.kg */
/* compiled from: PG */
final class C109344kg extends C90890ax {

    /* renamed from: a */
    final /* synthetic */ C109346ki f304571a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109344kg(C109346ki kiVar) {
        super("Delayed pseudo playback started");
        this.f304571a = kiVar;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C59104x b = C109346ki.f304572a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OfflineOpaManager");
        ((C59052c) ((C59052c) b).mo56372aa(22861)).mo56386p("on pseudo TTS playback started.");
        this.f304571a.mo19965fM(new C87684al(C88244um.TTS_PLAYBACK_STARTED).mo81964a());
        return C118826c.f331422a;
    }
}
