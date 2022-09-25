package com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1023e;

import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13702o;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13703p;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13704q;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13705r;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13706s;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13707t;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1018d.p1021c.p1022a.C13669b;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1018d.p1021c.p1022a.C13675h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.UUID;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.c.e.a */
/* compiled from: PG */
public final /* synthetic */ class C13682a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C13684c f41752a;

    public /* synthetic */ C13682a(C13684c cVar) {
        this.f41752a = cVar;
    }

    public final void run() {
        C13684c cVar = this.f41752a;
        C58976aa aaVar = C58975e.f156826a;
        if (cVar.f41757d.mo26871c() - cVar.f41759f < 60000) {
            C13669b bVar = cVar.f41761h;
            bVar.getClass();
            C13703p pVar = cVar.f41755b;
            C13675h hVar = bVar.f41721a;
            if (pVar == null) {
                C59104x c = C13675h.f41736a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "AapUniAssistUpstream");
                ((C59052c) ((C59052c) c).mo56372aa(44942)).mo56386p("Ignoring null UnifiedAutoAssistantRequest.");
                return;
            }
            C13704q qVar = (C13704q) C13705r.f41801c.createBuilder();
            if ((pVar.f41795a & 1) == 0) {
                C13702o oVar = (C13702o) pVar.toBuilder();
                String uuid = UUID.randomUUID().toString();
                oVar.copyOnWrite();
                C13703p pVar2 = (C13703p) oVar.instance;
                uuid.getClass();
                pVar2.f41795a |= 1;
                pVar2.f41798d = uuid;
                pVar = (C13703p) oVar.build();
            }
            qVar.copyOnWrite();
            C13705r rVar = (C13705r) qVar.instance;
            pVar.getClass();
            rVar.f41804b = pVar;
            rVar.f41803a = 1;
            hVar.mo21212b(((C13705r) qVar.build()).toByteArray());
            return;
        }
        C59104x d = C13684c.f41754a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "UAARequestCompleter");
        ((C59052c) ((C59052c) d).mo56372aa(44951)).mo56389s("#onSchedule: removing sessionId %s for timeout.", cVar.f41755b.f41799e);
        C13706s sVar = (C13706s) C13707t.f41806h.createBuilder();
        sVar.copyOnWrite();
        ((C13707t) sVar.instance).f41814g = 4;
        String str = cVar.f41755b.f41799e;
        sVar.copyOnWrite();
        C13707t tVar = (C13707t) sVar.instance;
        str.getClass();
        tVar.f41808a |= 2;
        tVar.f41812e = str;
        cVar.mo21219b((C13707t) sVar.build());
    }
}
