package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import com.google.android.libraries.assistant.soda.Soda;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5218j.C66984gt;
import com.google.speech.p5218j.C66985gu;
import com.google.speech.p5218j.C66998hg;
import com.google.speech.p5218j.C66999hh;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.n.c.a.h.be */
/* compiled from: PG */
public final /* synthetic */ class C39567be implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C39580br f104149a;

    public /* synthetic */ C39567be(C39580br brVar) {
        this.f104149a = brVar;
    }

    public final Object apply(Object obj) {
        C39580br brVar = this.f104149a;
        C66999hh hhVar = (C66999hh) obj;
        C59104x b = C39580br.f104168a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
        ((C59052c) ((C59052c) b).mo56372aa(53764)).mo56386p("Initialize soda");
        Duration duration = brVar.f104181n;
        C66985gu guVar = hhVar.f182131c;
        if (guVar == null) {
            guVar = C66985gu.f182075h;
        }
        if (duration.compareTo(Duration.ofMillis((long) guVar.f182080d)) <= 0) {
            return ((Soda) brVar.f104186s.mo56107c()).mo24329f(hhVar);
        }
        C59104x b2 = C39580br.f104168a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
        C59052c cVar = (C59052c) ((C59052c) b2).mo56372aa(53765);
        C66985gu guVar2 = hhVar.f182131c;
        if (guVar2 == null) {
            guVar2 = C66985gu.f182075h;
        }
        cVar.mo56394x("Overriding preamble length in millis from %d to %d", guVar2.f182080d, brVar.f104181n.toMillis());
        C66985gu guVar3 = hhVar.f182131c;
        if (guVar3 == null) {
            guVar3 = C66985gu.f182075h;
        }
        C66984gt gtVar = (C66984gt) guVar3.toBuilder();
        long millis = brVar.f104181n.toMillis();
        int i = (int) millis;
        if (millis == ((long) i)) {
            gtVar.copyOnWrite();
            C66985gu guVar4 = (C66985gu) gtVar.instance;
            guVar4.f182077a |= 2;
            guVar4.f182080d = i;
            C66985gu guVar5 = (C66985gu) gtVar.build();
            C66998hg hgVar = (C66998hg) hhVar.toBuilder();
            hgVar.copyOnWrite();
            C66999hh hhVar2 = (C66999hh) hgVar.instance;
            guVar5.getClass();
            hhVar2.f182131c = guVar5;
            hhVar2.f182129a |= 2;
            return ((Soda) brVar.f104186s.mo56107c()).mo24329f((C66999hh) hgVar.build());
        }
        throw new ArithmeticException();
    }
}
