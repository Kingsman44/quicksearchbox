package com.google.android.libraries.assistant.p1363c.p1398g.p1437l.p1438a;

import com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17377g;
import com.google.android.libraries.assistant.p1363c.p1398g.p1406e.p1407a.C17379a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17477am;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17507j;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17508k;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.c.g.l.a.a */
/* compiled from: PG */
public final /* synthetic */ class C17524a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17526c f50540a;

    /* renamed from: b */
    public final /* synthetic */ C17508k f50541b;

    /* renamed from: c */
    public final /* synthetic */ C17477am f50542c;

    /* renamed from: d */
    public final /* synthetic */ C17379a f50543d;

    public /* synthetic */ C17524a(C17526c cVar, C17508k kVar, C17477am amVar, C17379a aVar) {
        this.f50540a = cVar;
        this.f50541b = kVar;
        this.f50542c = amVar;
        this.f50543d = aVar;
    }

    public final void run() {
        C17526c cVar = this.f50540a;
        C17508k kVar = this.f50541b;
        C17477am amVar = this.f50542c;
        C17379a aVar = this.f50543d;
        C59104x b = C17526c.f50545a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TTS");
        ((C59052c) ((C59052c) b).mo56372aa(42760)).mo56359L("Session timeout after %s for clientInfo %s, sessionToken %s. Closing session.", C17526c.f50546b, C17377g.m34653a(kVar), C17377g.m34655c(amVar));
        cVar.close();
        C39141kp kpVar = (C39141kp) aVar.f50261a.mo27525b();
        int b2 = C17507j.m34793b(kVar.f50523a);
        String a = C17507j.m34792a(b2);
        if (b2 != 0) {
            ((C19567d) kpVar.f102943cU.mo6453a()).mo24822a(1, a);
            return;
        }
        throw null;
    }
}
