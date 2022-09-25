package com.google.android.apps.gsa.staticplugins.microdetection.p8041c;

import com.google.android.apps.gsa.speech.microdetection.p7303a.p7305b.C92491c;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7305b.C92494f;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7305b.C92495g;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118475aj;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.c.z */
/* compiled from: PG */
public final class C102830z {

    /* renamed from: a */
    private static final C59071e f287137a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.microdetection.c.z");

    /* renamed from: b */
    private final C68214a f287138b;

    public C102830z(C68214a aVar) {
        this.f287138b = aVar;
    }

    /* renamed from: a */
    public final void mo93475a(int i) {
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328821a |= 8;
        agVar.f328825e = true;
        afVar.copyOnWrite();
        C118472ag agVar2 = (C118472ag) afVar.instance;
        agVar2.f328824d = 1;
        agVar2.f328821a |= 4;
        C118475aj ajVar = (C118475aj) C118476ak.f328838a.createBuilder();
        C62940bt btVar = C92495g.f258128a;
        C92491c cVar = (C92491c) C92494f.f258122e.createBuilder();
        cVar.copyOnWrite();
        C92494f fVar = (C92494f) cVar.instance;
        fVar.f258126c = i - 1;
        fVar.f258124a |= 2;
        ajVar.mo58885m(btVar, (C92494f) cVar.build());
        afVar.copyOnWrite();
        C118472ag agVar3 = (C118472ag) afVar.instance;
        C118476ak akVar = (C118476ak) ajVar.build();
        akVar.getClass();
        agVar3.f328827g = akVar;
        agVar3.f328821a |= 32;
        C59104x b = f287137a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ModelDownloadTrigger");
        ((C59052c) ((C59052c) b).mo56372aa(21258)).mo56386p("Schedule model download");
        ((C118561t) this.f287138b.mo27525b()).mo103754e(C118522by.UPDATE_HOTWORD_MODELS, (C118472ag) afVar.build());
    }
}
