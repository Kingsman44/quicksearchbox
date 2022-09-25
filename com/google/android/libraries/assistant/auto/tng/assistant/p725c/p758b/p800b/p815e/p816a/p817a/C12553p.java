package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p815e.p816a.p817a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.C12154a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.p757b.C12171c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.p757b.C12174f;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p815e.C12581c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.speech.p5224k.p5225a.C67187ae;
import com.google.speech.p5224k.p5225a.C67190ah;
import p5535j.p5536a.p5543b.C70967n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.e.a.a.p */
/* compiled from: PG */
public final /* synthetic */ class C12553p implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C12581c f39487a;

    /* renamed from: b */
    public final /* synthetic */ C12154a f39488b;

    public /* synthetic */ C12553p(C12581c cVar, C12154a aVar) {
        this.f39487a = cVar;
        this.f39488b = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C12581c cVar = this.f39487a;
        C12154a aVar = this.f39488b;
        String str = cVar.mo20650c().f48070d;
        C67187ae aeVar = (C67187ae) C67190ah.f182619q.createBuilder();
        aeVar.copyOnWrite();
        C67190ah ahVar = (C67190ah) aeVar.instance;
        str.getClass();
        ahVar.f182622a |= 1;
        ahVar.f182625d = str;
        String str2 = cVar.mo20650c().f48071e;
        aeVar.copyOnWrite();
        C67190ah ahVar2 = (C67190ah) aeVar.instance;
        str2.getClass();
        ahVar2.f182622a |= 8192;
        ahVar2.f182632k = str2;
        C67190ah ahVar3 = (C67190ah) aeVar.build();
        cVar.mo20648a();
        C12171c cVar2 = (C12171c) C12174f.f38872d.createBuilder();
        cVar2.copyOnWrite();
        C12174f fVar = (C12174f) cVar2.instance;
        ahVar3.getClass();
        fVar.f38875b = ahVar3;
        fVar.f38874a |= 1;
        cVar2.copyOnWrite();
        C12174f fVar2 = (C12174f) cVar2.instance;
        fVar2.f38876c = 2;
        fVar2.f38874a = 2 | fVar2.f38874a;
        return aVar.mo20461b((C12174f) cVar2.build(), C70967n.SUGGESTION).mo20381a();
    }
}
