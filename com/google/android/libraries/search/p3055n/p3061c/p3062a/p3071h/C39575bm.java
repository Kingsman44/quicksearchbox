package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import com.google.android.libraries.assistant.soda.C19243af;
import com.google.android.libraries.assistant.soda.C19347o;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p3055n.p3056a.C39241a;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39390af;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5218j.C67018i;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.C67055jj;
import com.google.speech.p5218j.C67056jk;
import com.google.speech.p5218j.C67087ko;

/* renamed from: com.google.android.libraries.search.n.c.a.h.bm */
/* compiled from: PG */
final class C39575bm implements C19347o {

    /* renamed from: a */
    final /* synthetic */ C39580br f104159a;

    public C39575bm(C39580br brVar) {
        this.f104159a = brVar;
    }

    /* renamed from: t */
    public final void mo23782t(C67087ko koVar) {
        C39580br brVar = this.f104159a;
        if ((koVar.f182368a & 1) != 0) {
            C59104x b = C39580br.f104168a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
            ((C59052c) ((C59052c) b).mo56372aa(53784)).mo56386p("hotwordEvent");
            if (koVar.f182369b == null) {
                C67050je jeVar = C67050je.f182262f;
            }
            brVar.mo41912j(C37176a.f97283id);
            C46459k.m82829b(brVar.f104176i.mo51512b(new C39553ar(brVar, koVar), brVar.f104174g), "errro handle hotwortd deteceted event", new Object[0]);
        }
        if ((koVar.f182368a & 524288) != 0) {
            C67056jk jkVar = koVar.f182380m;
            if (jkVar == null) {
                jkVar = C67056jk.f182276e;
            }
            C59104x b2 = C39580br.f104168a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
            ((C59052c) ((C59052c) b2).mo56372aa(53781)).mo56386p("Hotword timeout event!");
            int a = C67055jj.m97418a(jkVar.f182280c);
            if (a == 0 || a == 1) {
                brVar.mo41912j(C37176a.f97284ie);
                C46459k.m82829b(brVar.f104176i.mo51512b(new C39544ai(brVar, jkVar), brVar.f104174g), "Failed to handle onHotwordTimeout.", new Object[0]);
            } else {
                C59104x b3 = C39580br.f104168a.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
                ((C59052c) ((C59052c) b3).mo56372aa(53782)).mo56386p("Not DEFAULT_DSP timeout event. Call the onHotwordTimeout callback.");
                C39390af afVar = brVar.f104189v;
                afVar.getClass();
                afVar.mo41803c(jkVar);
            }
        }
        C62940bt r1 = C62942bv.checkIsLite(C67018i.f182180b);
        koVar.mo58887l(r1);
        if (koVar.f169962ag.mo58857o(r1.f169971d)) {
            C59104x b4 = C39580br.f104168a.mo56224b();
            b4.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
            ((C59052c) ((C59052c) b4).mo56372aa(53783)).mo56386p("Received AudioAdapterDisconnectSignal");
            C46459k.m82829b(brVar.f104176i.mo51511a(new C39546ak(brVar), brVar.f104174g), "Failed to send the AudioAdapterDisconnectSignal.", new Object[0]);
        }
        if (this.f104159a.f104172e.mo56113h() && ((C39241a) this.f104159a.f104172e.mo56107c()).mo41745d() && ((C39241a) this.f104159a.f104172e.mo56107c()).mo41746e() && this.f104159a.f104177j.get() == C39579bq.STARTED) {
            C39580br brVar2 = this.f104159a;
            C60870cx cxVar = brVar2.f104185r;
            C39572bj bjVar = new C39572bj(this, koVar);
            brVar2.f104185r = C60922j.m93045h(cxVar, C47810es.m84966f(bjVar), brVar2.f104174g);
            C46459k.m82829b(this.f104159a.f104185r, "Failed to push SodaEvent to ArtModelService!", new Object[0]);
        }
    }

    /* renamed from: u */
    public final /* synthetic */ void mo23783u() {
    }

    /* renamed from: v */
    public final void mo23784v(C19243af afVar) {
        C59104x b = C39580br.f104168a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
        ((C59052c) ((C59052c) b).mo56372aa(53730)).mo56389s("SodaStopReason %s", afVar.name());
        if (this.f104159a.f104172e.mo56113h() && ((C39241a) this.f104159a.f104172e.mo56107c()).mo41745d() && ((C39241a) this.f104159a.f104172e.mo56107c()).mo41746e() && this.f104159a.f104177j.get() == C39579bq.STARTED) {
            C39580br brVar = this.f104159a;
            C60870cx cxVar = brVar.f104185r;
            C39573bk bkVar = new C39573bk(this);
            brVar.f104185r = C60922j.m93045h(cxVar, C47810es.m84966f(bkVar), brVar.f104174g);
            C46459k.m82829b(this.f104159a.f104185r, "Failed to disconnect from ArtModelService!", new Object[0]);
        }
        C39574bl blVar = new C39574bl(this, afVar);
        C46459k.m82829b(C60856cj.m92904m(C47810es.m84978r(blVar), this.f104159a.f104174g), "Failed to handle soda stop response.", new Object[0]);
    }
}
