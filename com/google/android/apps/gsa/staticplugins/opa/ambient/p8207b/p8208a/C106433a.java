package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a;

import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a.C106448an;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a.C106449ao;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8210b.C106490d;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106529c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106531e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106532f;
import com.google.android.libraries.assistant.pcp.p1573k.p1574a.C18869co;
import com.google.android.libraries.assistant.pcp.p1573k.p1574a.C18870cp;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3886c.p3887a.C50685u;
import com.google.assistant.p3886c.p3887a.C50686v;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C106433a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C106493e f296885a;

    /* renamed from: b */
    public final /* synthetic */ C106532f f296886b;

    public /* synthetic */ C106433a(C106493e eVar, C106532f fVar) {
        this.f296885a = eVar;
        this.f296886b = fVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C106493e eVar = this.f296885a;
        C106532f fVar = this.f296886b;
        Boolean bool = (Boolean) obj;
        if (eVar.f296998d.mo79746e(C90017bw.f247918ag)) {
            C106529c a = C106529c.m177304a(fVar.f297081b);
            if (a == null) {
                a = C106529c.UNSPECIFIED;
            }
            if (a.equals(C106529c.CONNECTED) && bool.booleanValue()) {
                C18870cp cpVar = (C18870cp) eVar.f297004j;
                C60856cj.m92911t(C71663i.m104688a(C71803m.m105042c(cpVar.f53129a, (C69585o) null, (C71424ay) null, new C18869co(cpVar, (C69577g) null), 3)), C47810es.m84974n(new C106491c(eVar, fVar)), eVar.f296997c);
            }
        }
        if (eVar.f296998d.mo79746e(C90017bw.f247973bi)) {
            C106490d dVar = (C106490d) eVar.f296996b;
            String F = dVar.f296986d.mo79659F();
            if (F == null) {
                cxVar = C60856cj.m92899h(new Exception("User not signed in."));
            } else {
                C106449ao aoVar = dVar.f296989g;
                if (aoVar.f296927b.mo77179q()) {
                    C58976aa aaVar = C58975e.f156826a;
                    C60922j.m93045h(aoVar.f296928c.mo98817a(), C47810es.m84966f(new C106448an(aoVar)), C60826bg.f164896a);
                } else {
                    C58976aa aaVar2 = C58975e.f156826a;
                }
                C50685u uVar = (C50685u) C50686v.f131861f.createBuilder();
                C106529c a2 = C106529c.m177304a(fVar.f297081b);
                if (a2 == null) {
                    a2 = C106529c.UNSPECIFIED;
                }
                uVar.copyOnWrite();
                C50686v vVar = (C50686v) uVar.instance;
                vVar.f131866d = a2.f297070d;
                vVar.f131863a |= 4;
                C106531e a3 = C106531e.m177306a(fVar.f297082c);
                if (a3 == null) {
                    a3 = C106531e.UNKNOWN;
                }
                uVar.copyOnWrite();
                C50686v vVar2 = (C50686v) uVar.instance;
                vVar2.f131865c = a3.f297077e;
                vVar2.f131863a |= 2;
                C63042fg i = C62953e.m95484i(dVar.f296987e.mo26870b());
                uVar.copyOnWrite();
                C50686v vVar3 = (C50686v) uVar.instance;
                i.getClass();
                vVar3.f131864b = i;
                vVar3.f131863a |= 1;
                C50686v vVar4 = (C50686v) uVar.build();
                C65768az a4 = dVar.f296985c.a("type.googleapis.com/com.google.android.apps.gsa.staticplugins.opa.ambient.core.proto.ConnectionLog", vVar4.toByteString());
                C59104x b = C106490d.f296983a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "ConnLogsGellerCtrl");
                C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(23093);
                C106531e a5 = C106531e.m177306a(vVar4.f131865c);
                if (a5 == null) {
                    a5 = C106531e.UNKNOWN;
                }
                String name = a5.name();
                C106529c a6 = C106529c.m177304a(vVar4.f131866d);
                if (a6 == null) {
                    a6 = C106529c.UNSPECIFIED;
                }
                String name2 = a6.name();
                C63042fg fgVar = vVar4.f131864b;
                if (fgVar == null) {
                    fgVar = C63042fg.f170152c;
                }
                cVar.mo56359L("Enqueue background periodic task and save headphone connection log to geller: type: %s, state: %s, time: %d", name, name2, Long.valueOf(fgVar.f170154a));
                cxVar = dVar.f296984b.d(F, C65753ak.SMARTSPACE_HEADPHONE_LOGS, a4, false);
            }
            C60856cj.m92911t(cxVar, C47810es.m84974n(eVar.f297000f), eVar.f296997c);
        }
        return C47633f.m84733g(C60856cj.m92900i(fVar));
    }
}
