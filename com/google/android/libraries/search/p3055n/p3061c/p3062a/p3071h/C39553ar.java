package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import com.google.android.libraries.search.p2904c.C37461cj;
import com.google.android.libraries.search.p2904c.C37462ck;
import com.google.android.libraries.search.p2904c.C37466co;
import com.google.android.libraries.search.p2904c.C37467cp;
import com.google.android.libraries.search.p2904c.C37502di;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39390af;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.C67072k;
import com.google.speech.p5218j.C67087ko;

/* renamed from: com.google.android.libraries.search.n.c.a.h.ar */
/* compiled from: PG */
public final /* synthetic */ class C39553ar implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C39580br f104129a;

    /* renamed from: b */
    public final /* synthetic */ C67087ko f104130b;

    public /* synthetic */ C39553ar(C39580br brVar, C67087ko koVar) {
        this.f104129a = brVar;
        this.f104130b = koVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        Object obj;
        Object obj2;
        C39580br brVar = this.f104129a;
        C67087ko koVar = this.f104130b;
        C59104x b = C39580br.f104168a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
        ((C59052c) ((C59052c) b).mo56372aa(53740)).mo56386p("Hotword detected with Soda! Inside sequencer.");
        if (brVar.f104177j.get() != C39579bq.STARTED) {
            C59104x c = C39580br.f104168a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
            ((C59052c) ((C59052c) c).mo56372aa(53743)).mo56386p("Soda stopped when handling the Hotword detected event!");
            brVar.mo41914l(C58836b.f156633a, 10);
        }
        if (brVar.mo41913k()) {
            C67050je jeVar = koVar.f182369b;
            if (jeVar == null) {
                jeVar = C67050je.f182262f;
            }
            C39605x xVar = (C39605x) brVar.f104187t.mo56107c();
            ((C59052c) ((C59052c) C39605x.f104254a.mo56224b()).mo56372aa(53721)).mo56386p("stopPushingAudio and handover.");
            return C60922j.m93045h(C60856cj.m92904m(C47810es.m84978r(new C39598q(xVar)), xVar.f104258e), C47810es.m84966f(new C39563ba(brVar, jeVar)), brVar.f104174g);
        }
        C62940bt r2 = C62942bv.checkIsLite(C67072k.f182319e);
        koVar.mo58887l(r2);
        if (!koVar.f169962ag.mo58857o(r2.f169971d)) {
            brVar.mo41914l(C58836b.f156633a, 11);
            C59104x c2 = C39580br.f104168a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
            ((C59052c) ((C59052c) c2).mo56372aa(53742)).mo56386p("No AudioAdapterExtension!!!");
            return C60866ct.f164955a;
        }
        C62940bt r22 = C62942bv.checkIsLite(C67072k.f182319e);
        koVar.mo58887l(r22);
        Object l = koVar.f169962ag.mo58854l(r22.f169971d);
        if (l == null) {
            obj = r22.f169969b;
        } else {
            obj = r22.mo58889c(l);
        }
        if (((C67072k) obj).f182323c == null) {
            C37502di diVar = C37502di.f99561c;
        }
        C37461cj cjVar = (C37461cj) C37462ck.f99442c.createBuilder();
        C37466co coVar = (C37466co) C37467cp.f99458c.createBuilder();
        C62940bt r4 = C62942bv.checkIsLite(C67072k.f182319e);
        koVar.mo58887l(r4);
        Object l2 = koVar.f169962ag.mo58854l(r4.f169971d);
        if (l2 == null) {
            obj2 = r4.f169969b;
        } else {
            obj2 = r4.mo58889c(l2);
        }
        C37502di diVar2 = ((C67072k) obj2).f182323c;
        if (diVar2 == null) {
            diVar2 = C37502di.f99561c;
        }
        coVar.copyOnWrite();
        C37467cp cpVar = (C37467cp) coVar.instance;
        diVar2.getClass();
        cpVar.f99461b = diVar2;
        cpVar.f99460a = 6;
        cjVar.copyOnWrite();
        C37462ck ckVar = (C37462ck) cjVar.instance;
        C37467cp cpVar2 = (C37467cp) coVar.build();
        cpVar2.getClass();
        ckVar.f99445b = cpVar2;
        ckVar.f99444a |= 1;
        C37462ck ckVar2 = (C37462ck) cjVar.build();
        C39390af afVar = brVar.f104189v;
        afVar.getClass();
        C67050je jeVar2 = koVar.f182369b;
        if (jeVar2 == null) {
            jeVar2 = C67050je.f182262f;
        }
        afVar.mo41802b(brVar.mo41911i(jeVar2, ckVar2));
        return C60866ct.f164955a;
    }
}
