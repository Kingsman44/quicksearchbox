package com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9126a.p9129c;

import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120511h;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p3055n.C39658cl;
import com.google.android.libraries.search.p3055n.C39659cm;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5218j.C67087ko;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.platform.f.m.a.c.n */
/* compiled from: PG */
public final /* synthetic */ class C120874n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C120844ak f336083a;

    /* renamed from: b */
    public final /* synthetic */ C120511h f336084b;

    public /* synthetic */ C120874n(C120844ak akVar, C120511h hVar) {
        this.f336083a = akVar;
        this.f336084b = hVar;
    }

    public final C60870cx apply(Object obj) {
        Object obj2;
        C120844ak akVar = this.f336083a;
        C120511h hVar = this.f336084b;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return akVar.mo104942b("Missing soda start response.");
        }
        akVar.f336020b.f336064b.mo19974a(C37176a.f97119fY);
        C67087ko koVar = (C67087ko) axVar.mo56107c();
        C62940bt r2 = C62942bv.checkIsLite(C39659cm.f104398f);
        koVar.mo58887l(r2);
        Object l = koVar.f169962ag.mo58854l(r2.f169971d);
        if (l == null) {
            obj2 = r2.f169969b;
        } else {
            obj2 = r2.mo58889c(l);
        }
        C39658cl a = C39658cl.m69121a(((C39659cm) obj2).f104401b);
        if (a == null) {
            a = C39658cl.DEFAULT_UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 1) {
            C59104x b = C120844ak.f336019a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceAsr");
            ((C59052c) ((C59052c) b).mo56372aa(35614)).mo56386p("#handleStartResponse : Soda start request succeeded. Pushing audio requests to SODA.");
            C120864d dVar = new C120864d(hVar.mo104768a(), akVar.f336029k);
            Objects.requireNonNull(dVar);
            C60870cx c = hVar.mo104770c(new C120839af(dVar));
            C120840ag agVar = new C120840ag(dVar);
            return C60922j.m93045h(c, C47810es.m84966f(agVar), akVar.f336026h);
        } else if (ordinal == 2) {
            return akVar.mo104942b("Compatibility check failed.");
        } else {
            if (ordinal != 3) {
                return akVar.mo104942b("Error initializing Soda.");
            }
            return akVar.mo104942b("Soda internal failure.");
        }
    }
}
