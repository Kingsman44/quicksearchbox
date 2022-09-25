package com.google.android.libraries.search.assistant.proactive;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119748c;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119788aj;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119789ak;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119811bf;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119812bg;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119817bl;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119818bm;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119826bu;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119828bw;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119829bx;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119851cs;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32881e;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.p2871b.p2872a.p2881i.C37197a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.search.assistant.proactive.be */
/* compiled from: PG */
public final /* synthetic */ class C36237be implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C36240bh f94648a;

    /* renamed from: b */
    public final /* synthetic */ C119851cs f94649b;

    public /* synthetic */ C36237be(C36240bh bhVar, C119851cs csVar) {
        this.f94648a = bhVar;
        this.f94649b = csVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C36240bh bhVar = this.f94648a;
        C119851cs csVar = this.f94649b;
        if (bhVar.f94661k == null) {
            C119788aj ajVar = (C119788aj) C119789ak.f333656k.createBuilder();
            C119817bl blVar = (C119817bl) C119818bm.f333734b.createBuilder();
            blVar.mo104528a(bhVar.f94654d.mo104474b());
            ajVar.copyOnWrite();
            C119789ak akVar = (C119789ak) ajVar.instance;
            C119818bm bmVar = (C119818bm) blVar.build();
            bmVar.getClass();
            akVar.f333665h = bmVar;
            akVar.f333658a |= 32;
            C119811bf bfVar = (C119811bf) C119812bg.f333724c.createBuilder();
            C32881e eVar = bhVar.f94663m;
            eVar.getClass();
            C32849cq b = eVar.mo38265b();
            bfVar.copyOnWrite();
            C119812bg bgVar = (C119812bg) bfVar.instance;
            b.getClass();
            bgVar.f333727b = b;
            bgVar.f333726a |= 1;
            ajVar.copyOnWrite();
            C119789ak akVar2 = (C119789ak) ajVar.instance;
            C119812bg bgVar2 = (C119812bg) bfVar.build();
            bgVar2.getClass();
            akVar2.f333660c = bgVar2;
            akVar2.f333658a |= 1;
            C119826bu buVar = (C119826bu) C119829bx.f333757f.createBuilder();
            buVar.mo104535a(C119828bw.ON_DEVICE);
            ajVar.copyOnWrite();
            C119789ak akVar3 = (C119789ak) ajVar.instance;
            C119829bx bxVar = (C119829bx) buVar.build();
            bxVar.getClass();
            akVar3.f333664g = bxVar;
            akVar3.f333658a |= 16;
            bhVar.f94661k = bhVar.f94664n.mo104511a((C119789ak) ajVar.build(), new C36239bg(bhVar), bhVar.f94656f);
        }
        bhVar.f94653c.mo19974a(C37197a.f98673i);
        C119748c cVar = bhVar.f94661k;
        cVar.getClass();
        C60870cx a = cVar.mo104498a(csVar);
        C59104x b2 = C36240bh.f94651a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "NTF.TorusConvMgr");
        ((C59052c) ((C59052c) b2).mo56372aa(52258)).mo56386p("#Log interactions");
        return C60922j.m93045h(a, C47810es.m84966f(new C36229ay(bhVar)), bhVar.f94656f);
    }
}
