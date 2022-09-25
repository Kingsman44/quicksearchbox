package com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1018d.p1021c.p1022a;

import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13702o;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13703p;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13704q;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13705r;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13706s;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13707t;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13708u;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1018d.p1019a.C13660a;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1023e.C13684c;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1023e.C13685d;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1023e.C13688g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import java.util.UUID;
import java.util.concurrent.Executor;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.c.d.c.a.h */
/* compiled from: PG */
public final class C13675h implements C13708u {

    /* renamed from: a */
    public static final C59071e f41736a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.j.c.d.c.a.h");

    /* renamed from: b */
    public final C13660a f41737b;

    /* renamed from: c */
    private final C13688g f41738c;

    /* renamed from: d */
    private final Executor f41739d;

    public C13675h(C13660a aVar, C13688g gVar, Executor executor) {
        this.f41737b = aVar;
        this.f41738c = gVar;
        this.f41739d = new C60904dr(executor);
    }

    /* renamed from: a */
    public final C60870cx mo21211a(C13703p pVar) {
        C58976aa aaVar = C58975e.f156826a;
        C13688g gVar = this.f41738c;
        C13702o oVar = (C13702o) pVar.toBuilder();
        if ((pVar.f41795a & 2) == 0) {
            String uuid = UUID.randomUUID().toString();
            oVar.copyOnWrite();
            C13703p pVar2 = (C13703p) oVar.instance;
            uuid.getClass();
            pVar2.f41795a |= 2;
            pVar2.f41799e = uuid;
        }
        C13703p pVar3 = (C13703p) oVar.build();
        C13684c a = gVar.mo21221a(pVar3.f41799e);
        if (a != null) {
            return a.f41756c;
        }
        C59104x b = C13688g.f41768a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "UAAReqResManager");
        ((C59052c) ((C59052c) b).mo56372aa(44954)).mo56386p("#createRequestCompleter");
        C21370a aVar = gVar.f41770c;
        C60888db dbVar = gVar.f41771d;
        C13669b bVar = gVar.f41772e;
        bVar.getClass();
        C13684c cVar = new C13684c(aVar, dbVar, bVar, new C13685d(gVar), pVar3);
        Map.EL.putIfAbsent(gVar.f41769b, pVar3.f41799e, cVar);
        return cVar.f41756c;
    }

    /* renamed from: b */
    public final void mo21212b(byte[] bArr) {
        C13674g gVar = new C13674g(this, bArr);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(gVar), this.f41739d), "Unexpected failure in #sendData", new Object[0]);
    }

    /* renamed from: c */
    public final void mo21213c(C13707t tVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (tVar == null) {
            C59104x c = f41736a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AapUniAssistUpstream");
            ((C59052c) ((C59052c) c).mo56372aa(44945)).mo56386p("Ignoring null UnifiedAutoAssistantResponse.");
            return;
        }
        C13704q qVar = (C13704q) C13705r.f41801c.createBuilder();
        if ((tVar.f41808a & 1) == 0) {
            C13706s sVar = (C13706s) tVar.toBuilder();
            String uuid = UUID.randomUUID().toString();
            sVar.copyOnWrite();
            C13707t tVar2 = (C13707t) sVar.instance;
            uuid.getClass();
            tVar2.f41808a |= 1;
            tVar2.f41811d = uuid;
            tVar = (C13707t) sVar.build();
        }
        qVar.copyOnWrite();
        C13705r rVar = (C13705r) qVar.instance;
        tVar.getClass();
        rVar.f41804b = tVar;
        rVar.f41803a = 2;
        mo21212b(((C13705r) qVar.build()).toByteArray());
    }
}
