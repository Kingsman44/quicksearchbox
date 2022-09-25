package com.google.android.apps.gsa.staticplugins.accl.p7337g;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.g.c */
/* compiled from: PG */
public final /* synthetic */ class C92840c implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C92842e f259036a;

    public /* synthetic */ C92840c(C92842e eVar) {
        this.f259036a = eVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C92842e eVar = this.f259036a;
        Exception exc = (Exception) obj;
        C59104x c = C92842e.f259038a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SSTtsAudioRequest");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(13470)).mo56386p("TTS playback failed");
        if ((exc instanceof CancellationException) && eVar.f259041d.mo77891e()) {
            eVar.f259041d.mo77890d();
        }
    }
}
