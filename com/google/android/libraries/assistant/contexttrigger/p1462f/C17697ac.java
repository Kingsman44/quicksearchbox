package com.google.android.libraries.assistant.contexttrigger.p1462f;

import com.google.android.libraries.assistant.contexttrigger.C17658d;
import com.google.android.libraries.assistant.contexttrigger.C17740h;
import com.google.android.libraries.assistant.contexttrigger.C17784j;
import com.google.android.libraries.search.assistant.proactive.p2776h.C36314g;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3803ag.p3807b.p3808a.C48900b;
import com.google.assistant.p3803ag.p3807b.p3808a.C48914p;
import com.google.assistant.p3803ag.p3807b.p3808a.C48915q;
import com.google.assistant.p3803ag.p3807b.p3808a.C48917s;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.f.ac */
/* compiled from: PG */
public final class C17697ac implements C17784j {

    /* renamed from: a */
    private final C17784j f50883a;

    /* renamed from: b */
    private final C17740h f50884b;

    /* renamed from: c */
    private final C36314g f50885c;

    /* renamed from: d */
    private final C17658d f50886d;

    public C17697ac(C17658d dVar, C17784j jVar, C17740h hVar, C36314g gVar) {
        this.f50886d = dVar;
        this.f50883a = jVar;
        this.f50884b = hVar;
        this.f50885c = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo23442a(C48915q qVar) {
        C36314g gVar = this.f50885c;
        C48919u uVar = qVar.f126577b;
        if (uVar == null) {
            uVar = C48919u.f126586g;
        }
        C48900b a = C48900b.m85301a(uVar.f126589b);
        if (a == null) {
            a = C48900b.UNSPECIFIED;
        }
        String name = a.name();
        C48919u uVar2 = qVar.f126577b;
        if (uVar2 == null) {
            uVar2 = C48919u.f126586g;
        }
        String str = uVar2.f126593f;
        String a2 = C36314g.m64795a(C48952az.f126657c);
        C58976aa aaVar = C58975e.f156826a;
        gVar.mo40100b(name, str, a2, 2);
        C17658d dVar = this.f50886d;
        C48919u uVar3 = qVar.f126577b;
        if (uVar3 == null) {
            uVar3 = C48919u.f126586g;
        }
        C48900b a3 = C48900b.m85301a(uVar3.f126589b);
        if (a3 == null) {
            a3 = C48900b.UNSPECIFIED;
        }
        if (dVar.mo23421a(a3)) {
            return ((C17730t) this.f50884b).mo23452a(qVar, true);
        }
        return this.f50883a.mo23442a(qVar);
    }

    /* renamed from: b */
    public final C60870cx mo23443b(C48917s sVar) {
        C36314g gVar = this.f50885c;
        C48919u uVar = sVar.f126581b;
        if (uVar == null) {
            uVar = C48919u.f126586g;
        }
        C48900b a = C48900b.m85301a(uVar.f126589b);
        if (a == null) {
            a = C48900b.UNSPECIFIED;
        }
        String name = a.name();
        C48919u uVar2 = sVar.f126581b;
        if (uVar2 == null) {
            uVar2 = C48919u.f126586g;
        }
        String str = uVar2.f126593f;
        C48952az azVar = sVar.f126582c;
        if (azVar == null) {
            azVar = C48952az.f126657c;
        }
        String a2 = C36314g.m64795a(azVar);
        C58976aa aaVar = C58975e.f156826a;
        gVar.mo40100b(name, str, a2, 3);
        C17658d dVar = this.f50886d;
        C48919u uVar3 = sVar.f126581b;
        if (uVar3 == null) {
            uVar3 = C48919u.f126586g;
        }
        C48900b a3 = C48900b.m85301a(uVar3.f126589b);
        if (a3 == null) {
            a3 = C48900b.UNSPECIFIED;
        }
        if (!dVar.mo23421a(a3)) {
            return this.f50883a.mo23443b(sVar);
        }
        try {
            C17740h hVar = this.f50884b;
            C48919u uVar4 = sVar.f126581b;
            if (uVar4 == null) {
                uVar4 = C48919u.f126586g;
            }
            C48900b a4 = C48900b.m85301a(uVar4.f126589b);
            if (a4 == null) {
                a4 = C48900b.UNSPECIFIED;
            }
            if (a4 == C48900b.UNSPECIFIED) {
                C59104x c = C17730t.f50938a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "CtfManager");
                ((C59052c) ((C59052c) c).mo56372aa(47021)).mo56386p("Client id is not set.");
                return C60866ct.f164955a;
            } else if (uVar4.f126591d.isEmpty()) {
                C59104x c2 = C17730t.f50938a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "CtfManager");
                ((C59052c) ((C59052c) c2).mo56372aa(47020)).mo56386p("Trigger id is not set.");
                return C60866ct.f164955a;
            } else if ((uVar4.f126588a & 8) != 0) {
                C48900b a5 = C48900b.m85301a(uVar4.f126589b);
                if (a5 == null) {
                    a5 = C48900b.UNSPECIFIED;
                }
                a5.name();
                String str2 = uVar4.f126591d;
                C48914p pVar = (C48914p) C48915q.f126574c.createBuilder();
                pVar.copyOnWrite();
                C48915q qVar = (C48915q) pVar.instance;
                uVar4.getClass();
                qVar.f126577b = uVar4;
                qVar.f126576a |= 1;
                return C47633f.m84733g(((C17730t) hVar).mo23452a((C48915q) pVar.build(), true)).mo51516i(new C17724n((C17730t) hVar, sVar), ((C17730t) hVar).f50945h).mo51516i(new C17725o((C17730t) hVar), ((C17730t) hVar).f50945h).mo51516i(new C17726p((C17730t) hVar), ((C17730t) hVar).f50945h).mo51515h(new C17727q((C17730t) hVar, uVar4), ((C17730t) hVar).f50945h);
            } else {
                C59104x c3 = C17730t.f50938a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "CtfManager");
                ((C59052c) ((C59052c) c3).mo56372aa(47019)).mo56386p("Attribution id is not set.");
                return C60866ct.f164955a;
            }
        } catch (Exception e) {
            return C60856cj.m92899h(e);
        }
    }
}
