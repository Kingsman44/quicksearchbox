package com.google.android.libraries.assistant.p1363c.p1398g.p1441n.p1443b;

import com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17377g;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17477am;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.c.g.n.b.g */
/* compiled from: PG */
public final /* synthetic */ class C17557g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17565o f50611a;

    /* renamed from: b */
    public final /* synthetic */ C17477am f50612b;

    public /* synthetic */ C17557g(C17565o oVar, C17477am amVar) {
        this.f50611a = oVar;
        this.f50612b = amVar;
    }

    public final void run() {
        C17565o oVar = this.f50611a;
        C17477am amVar = this.f50612b;
        C59104x b = C17565o.f50627a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TTS.OnDevice");
        ((C59052c) ((C59052c) b).mo56372aa(42788)).mo56389s("On-device TTS synthesis cancelled for sessionToken %s. Shutting down TTS engine.", C17377g.m34655c(amVar));
        ((C17564n) oVar.f50632f.mo6453a()).mo23394a(amVar);
    }
}
