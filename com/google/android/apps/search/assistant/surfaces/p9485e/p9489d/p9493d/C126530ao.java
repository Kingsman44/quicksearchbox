package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9493d;

import com.google.android.apps.search.assistant.libraries.p8956c.p8958b.C119258a;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9488c.C126433b;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9488c.C126434c;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9488c.C126436e;
import com.google.android.libraries.assistant.p1533o.C18445ah;
import com.google.android.libraries.assistant.p1533o.C18446ai;
import com.google.android.libraries.assistant.p1533o.C18447aj;
import com.google.android.libraries.assistant.p1533o.C18448ak;
import com.google.android.libraries.assistant.p1533o.C18449al;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C60418pm;
import com.google.common.p4552o.C60420po;
import com.google.common.p4552o.C60421pp;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67442ak;
import com.google.speech.recognizer.p5233a.C67468p;
import p3186j$.time.Duration;
import p3186j$.time.temporal.ChronoUnit;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;
import p5535j.p5536a.p5545c.p5548c.C70972a;
import p5535j.p5536a.p5545c.p5548c.C71140b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.d.ao */
/* compiled from: PG */
final class C126530ao extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C69648ae f348455a;

    /* renamed from: b */
    final /* synthetic */ C67438ag f348456b;

    /* renamed from: c */
    final /* synthetic */ Optional f348457c;

    /* renamed from: d */
    final /* synthetic */ C126534as f348458d;

    /* renamed from: e */
    final /* synthetic */ C126436e f348459e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126530ao(C69648ae aeVar, C67438ag agVar, Optional optional, C126534as asVar, C126436e eVar) {
        super(1);
        this.f348455a = aeVar;
        this.f348456b = agVar;
        this.f348457c = optional;
        this.f348458d = asVar;
        this.f348459e = eVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        C18448ak akVar;
        C18445ah ahVar = (C18445ah) obj;
        C69664n.m101061g(ahVar, "$this$speechRecognitionData");
        String str = (String) ((Optional) this.f348455a.f186027a).get();
        ahVar.copyOnWrite();
        C18449al alVar = C18449al.f52359c;
        str.getClass();
        ((C18449al) ahVar.instance).f52361a = str;
        C67438ag agVar = this.f348456b;
        Optional optional = this.f348457c;
        boolean z = this.f348458d.f348476a;
        C18446ai aiVar = (C18446ai) C18448ak.f52353e.createBuilder();
        C67442ak akVar2 = agVar.f183263f;
        if (akVar2 == null) {
            akVar2 = C67442ak.f183276i;
        }
        if (z && (agVar.f183258a & 4096) != 0) {
            akVar = C119258a.m197954a(aiVar, Duration.ofMillis(agVar.f183266i), optional, C18447aj.S3_TRUE_EOQ);
        } else if (akVar2.f183281d.size() <= 0 || (((C67468p) akVar2.f183281d.get(0)).f183366a & 8192) == 0) {
            ((C59052c) ((C59052c) C119258a.f332585a.mo56224b()).mo56372aa(34378)).mo56386p("Missing speech end time in RecognitionEvent, falling back to returning stream end time.");
            akVar = C119258a.m197954a(aiVar, Duration.m71141of(akVar2.f183280c, ChronoUnit.MICROS), optional, C18447aj.S3_ENDPOINTER_FALLBACK);
        } else {
            akVar = C119258a.m197954a(aiVar, Duration.m71141of((long) ((C67468p) akVar2.f183281d.get(0)).f183370e, ChronoUnit.MICROS), optional, C18447aj.S3_NATIVE);
        }
        ahVar.copyOnWrite();
        C18449al alVar2 = (C18449al) ahVar.instance;
        akVar.getClass();
        alVar2.f52362b = akVar;
        C126436e eVar = this.f348459e;
        C18448ak akVar3 = alVar2.f52362b;
        if (akVar3 == null) {
            akVar3 = C18448ak.f52353e;
        }
        Function function = C126434c.f348212a;
        C37252a i = C37176a.f96841aL.mo40815i(C62722b.OK);
        C62940bt btVar = C71140b.f189776d;
        C70972a aVar = (C70972a) C71140b.f189775c.createBuilder();
        C60418pm pmVar = (C60418pm) C60421pp.f163510e.createBuilder();
        long j = akVar3.f52356b;
        pmVar.copyOnWrite();
        C60421pp ppVar = (C60421pp) pmVar.instance;
        ppVar.f163512a |= 1;
        ppVar.f163513b = j;
        Function function2 = C126434c.f348212a;
        C18447aj a = C18447aj.m35924a(akVar3.f52357c);
        if (a == null) {
            a = C18447aj.UNRECOGNIZED;
        }
        C60420po a2 = ((C126433b) function2).apply(a);
        pmVar.copyOnWrite();
        C60421pp ppVar2 = (C60421pp) pmVar.instance;
        ppVar2.f163514c = a2.f163509l;
        ppVar2.f163512a |= 2;
        if ((akVar3.f52355a & 1) != 0) {
            long j2 = akVar3.f52358d;
            pmVar.copyOnWrite();
            C60421pp ppVar3 = (C60421pp) pmVar.instance;
            ppVar3.f163512a |= 4;
            ppVar3.f163515d = j2;
        }
        C60421pp ppVar4 = (C60421pp) pmVar.build();
        aVar.copyOnWrite();
        C71140b bVar = (C71140b) aVar.instance;
        ppVar4.getClass();
        bVar.f189779b = ppVar4;
        bVar.f189778a |= 4;
        C37253b bVar2 = (C37253b) i;
        bVar2.mo40792p(btVar, (C71140b) aVar.build());
        bVar2.mo40791o(Duration.ofMillis(akVar3.f52358d).toNanos());
        eVar.mo107613e(i);
        return C69788q.f186170a;
    }
}
