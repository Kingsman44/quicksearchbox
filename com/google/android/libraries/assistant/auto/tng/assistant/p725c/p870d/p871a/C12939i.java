package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p870d.p871a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.C12154a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.p757b.C12171c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.p757b.C12174f;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.speech.p5224k.p5225a.C67187ae;
import com.google.speech.p5224k.p5225a.C67190ah;
import p5535j.p5536a.p5543b.C70967n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.d.a.i */
/* compiled from: PG */
public final /* synthetic */ class C12939i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C12940j f40270a;

    /* renamed from: b */
    public final /* synthetic */ String f40271b;

    public /* synthetic */ C12939i(C12940j jVar, String str) {
        this.f40270a = jVar;
        this.f40271b = str;
    }

    public final C60870cx apply(Object obj) {
        C12940j jVar = this.f40270a;
        String str = this.f40271b;
        String str2 = (String) obj;
        C67187ae aeVar = (C67187ae) C67190ah.f182619q.createBuilder();
        aeVar.copyOnWrite();
        C67190ah ahVar = (C67190ah) aeVar.instance;
        str.getClass();
        ahVar.f182622a |= 1;
        ahVar.f182625d = str;
        aeVar.copyOnWrite();
        C67190ah ahVar2 = (C67190ah) aeVar.instance;
        str2.getClass();
        ahVar2.f182622a |= 8192;
        ahVar2.f182632k = str2;
        C67190ah ahVar3 = (C67190ah) aeVar.build();
        C12154a aVar = jVar.f40274c;
        C12171c cVar = (C12171c) C12174f.f38872d.createBuilder();
        cVar.copyOnWrite();
        C12174f fVar = (C12174f) cVar.instance;
        ahVar3.getClass();
        fVar.f38875b = ahVar3;
        fVar.f38874a |= 1;
        cVar.copyOnWrite();
        C12174f fVar2 = (C12174f) cVar.instance;
        fVar2.f38876c = 2;
        fVar2.f38874a = 2 | fVar2.f38874a;
        return aVar.mo20461b((C12174f) cVar.build(), C70967n.DATA_SUBSCRIPTION).mo20381a();
    }
}
