package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p760a.p761a.C12182h;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12867k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3917i.p3918a.C51536li;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.Iterator;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.o */
/* compiled from: PG */
public final /* synthetic */ class C12848o implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C12855v f40090a;

    /* renamed from: b */
    public final /* synthetic */ C12182h f40091b;

    public /* synthetic */ C12848o(C12855v vVar, C12182h hVar) {
        this.f40090a = vVar;
        this.f40091b = hVar;
    }

    public final C60870cx apply(Object obj) {
        C12855v vVar = this.f40090a;
        C12182h hVar = this.f40091b;
        C12867k kVar = (C12867k) obj;
        C58976aa aaVar = C58975e.f156826a;
        C12844k kVar2 = vVar.f40102c;
        if (hVar.mo20475a().f136684d.isEmpty()) {
            return C60856cj.m92900i(C12867k.f40128d);
        }
        C52091ex exVar = hVar.mo20475a().f136685e;
        if (exVar == null) {
            exVar = C52091ex.f136710b;
        }
        Iterator it = exVar.f136712a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C52232kc kcVar = (C52232kc) it.next();
            if ("asst.request.logging.params".equals(kcVar.f137065b)) {
                C52230ka kaVar = kcVar.f137066c;
                if (kaVar == null) {
                    kaVar = C52230ka.f137057d;
                }
                if ("assistant.api.params.RequestLoggingParams".equals(kaVar.f137060b)) {
                    try {
                        C52230ka kaVar2 = kcVar.f137066c;
                        if (kaVar2 == null) {
                            kaVar2 = C52230ka.f137057d;
                        }
                        C51536li liVar = (C51536li) C62942bv.parseFrom((C62942bv) C51536li.f134316k, kaVar2.f137061c);
                        if ((liVar.f134318a & 2) != 0) {
                            kVar2.f40084h = Optional.m71637of(liVar.f134320c);
                        }
                    } catch (C62974ct e) {
                        C59104x d = C12844k.f40077a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "ConvDeltaStreamProc");
                        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(44510)).mo56386p("Failed to parse request logging param and get event id.");
                    }
                }
            }
        }
        C12835b bVar = new C12835b(kVar2, hVar);
        return C60856cj.m92905n(C47810es.m84965e(bVar), kVar2.f40080d);
    }
}
