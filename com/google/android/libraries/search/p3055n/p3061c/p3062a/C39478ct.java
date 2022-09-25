package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.android.libraries.assistant.soda.C19243af;
import com.google.android.libraries.search.p3055n.C39260aj;
import com.google.android.libraries.search.p3055n.C39264an;
import com.google.android.libraries.search.p3055n.C39356be;
import com.google.android.libraries.search.p3055n.C39357bf;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3064b.C39419h;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3073j.C39628b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.C67056jk;
import com.google.speech.p5218j.C67087ko;

/* renamed from: com.google.android.libraries.search.n.c.a.ct */
/* compiled from: PG */
final class C39478ct implements C39390af {

    /* renamed from: a */
    final /* synthetic */ C39264an f103936a;

    /* renamed from: b */
    final /* synthetic */ C39479cu f103937b;

    public C39478ct(C39479cu cuVar, C39264an anVar) {
        this.f103937b = cuVar;
        this.f103936a = anVar;
    }

    /* renamed from: a */
    public final void mo41801a(C39393ai aiVar) {
        C59104x d = C39479cu.f103938a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) d).mo56372aa(53552)).mo56354G("#onError. Error code: %s, error message: %s", aiVar.mo41808a(), aiVar.mo41809b());
        C59104x b = C39479cu.f103938a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) b).mo56372aa(53553)).mo56386p("Handling error for the external hotword verification.");
        this.f103937b.mo41853n(C39628b.m69078c(aiVar), "#onError");
    }

    /* renamed from: b */
    public final void mo41802b(C67087ko koVar) {
        Object obj;
        C59104x b = C39479cu.f103938a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) b).mo56372aa(53554)).mo56386p("#onHotwordDetected");
        C39628b.m69080e(koVar);
        C39357bf bfVar = ((C39419h) this.f103937b.f103939A.mo56107c()).mo41825a().f104599c;
        if (bfVar == null) {
            bfVar = C39357bf.f103644d;
        }
        C39356be a = C39356be.m68761a(bfVar.f103647b);
        if (a == null) {
            a = C39356be.DEFAULT_PERSONAL;
        }
        if (a != C39356be.EXTERNAL || !this.f103936a.f103431c || C39479cu.m68890p(koVar)) {
            C59104x b2 = C39479cu.f103938a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
            ((C59052c) ((C59052c) b2).mo56372aa(53556)).mo56386p("Handle the hotword detected event for external hotword verification.");
            this.f103937b.mo41853n(koVar, "#Hotword detected. Speaker id not enforce or verified.");
            return;
        }
        C59104x d = C39479cu.f103938a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) d).mo56372aa(53555)).mo56386p("Speaker id not verified, send the hotword rejected event to Triggering API.");
        C39479cu cuVar = this.f103937b;
        C62940bt r1 = C62942bv.checkIsLite(C39260aj.f103415g);
        koVar.mo58887l(r1);
        Object l = koVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        C67050je jeVar = ((C39260aj) obj).f103420d;
        if (jeVar == null) {
            jeVar = C67050je.f182262f;
        }
        cuVar.mo41853n(C39628b.m69076a(jeVar, ((C39396al) this.f103937b.f103940B.mo56107c()).mo41817d()), "#Speaker id not verified.");
    }

    /* renamed from: c */
    public final void mo41803c(C67056jk jkVar) {
        C59104x b = C39479cu.f103938a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) b).mo56372aa(53557)).mo56386p("Handle the HotwordTimeoutEvent for external hotword verification.");
        C39628b.m69079d(jkVar);
        C39479cu cuVar = this.f103937b;
        cuVar.mo41853n(C39628b.m69077b(jkVar, ((C39396al) cuVar.f103940B.mo56107c()).mo41817d()), "#HotwordTimeout");
    }

    /* renamed from: d */
    public final void mo41804d() {
        C59104x c = C39479cu.f103938a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) c).mo56372aa(53558)).mo56386p("Received onSodaAudioAdapterDisconnect for external DSP hotword verification!");
    }

    /* renamed from: e */
    public final void mo41805e(C19243af afVar) {
        C59104x b = C39479cu.f103938a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) b).mo56372aa(53559)).mo56389s("#onSodaStop %s", afVar.name());
    }
}
