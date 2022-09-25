package com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9126a.p9129c;

import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120510g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.assistant.platform.f.m.a.c.ah */
/* compiled from: PG */
final class C120841ah implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C120844ak f336016a;

    public C120841ah(C120844ak akVar) {
        this.f336016a = akVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x b = C120844ak.f336019a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceAsr");
        ((C59052c) ((C59052c) b).mo56372aa(35613)).mo56386p("Wait for utterance shutdown hooks to close audio.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        this.f336016a.f336028j.mo104948e(C120510g.RECOGNIZER_DONE);
    }
}
