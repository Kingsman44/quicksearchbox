package com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9126a.p9129c;

import com.google.android.apps.search.assistant.platform.p9005b.p9036b.C119935d;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120511h;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32873s;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p3055n.C39378c;
import com.google.android.libraries.search.p3055n.C39654ch;
import com.google.android.libraries.search.p3055n.C39655ci;
import com.google.android.libraries.search.p3055n.C39673d;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.speech.p5218j.C66964g;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.C67172q;
import com.google.speech.p5218j.C67175t;

/* renamed from: com.google.android.apps.search.assistant.platform.f.m.a.c.l */
/* compiled from: PG */
public final /* synthetic */ class C120872l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C120844ak f336080a;

    /* renamed from: b */
    public final /* synthetic */ C120511h f336081b;

    public /* synthetic */ C120872l(C120844ak akVar, C120511h hVar) {
        this.f336080a = akVar;
        this.f336081b = hVar;
    }

    public final C60870cx apply(Object obj) {
        C120844ak akVar = this.f336080a;
        C120511h hVar = this.f336081b;
        Void voidR = (Void) obj;
        C39654ch chVar = (C39654ch) C39655ci.f104377j.createBuilder();
        C66964g gVar = C66964g.DEFAULT_ONESHOT;
        chVar.copyOnWrite();
        C39655ci ciVar = (C39655ci) chVar.instance;
        ciVar.f104386g = gVar.f182026k;
        ciVar.f104380a |= 32;
        C39378c cVar = (C39378c) C39673d.f104428c.createBuilder();
        C67172q qVar = (C67172q) C67175t.f182588e.createBuilder();
        int b = hVar.mo104768a().mo104781b();
        qVar.copyOnWrite();
        C67175t tVar = (C67175t) qVar.instance;
        tVar.f182590a |= 2;
        tVar.f182592c = b;
        int a = hVar.mo104768a().mo104780a();
        qVar.copyOnWrite();
        C67175t tVar2 = (C67175t) qVar.instance;
        tVar2.f182590a |= 4;
        tVar2.f182593d = a;
        C67175t tVar3 = (C67175t) qVar.build();
        cVar.copyOnWrite();
        C39673d dVar = (C39673d) cVar.instance;
        tVar3.getClass();
        dVar.f104431b = tVar3;
        dVar.f104430a |= 1;
        C39673d dVar2 = (C39673d) cVar.build();
        chVar.copyOnWrite();
        C39655ci ciVar2 = (C39655ci) chVar.instance;
        dVar2.getClass();
        ciVar2.f104383d = dVar2;
        ciVar2.f104380a |= 4;
        if (!akVar.f336025g.f335685e && !hVar.mo104772d().isEmpty()) {
            akVar.f336020b.f336064b.mo19974a(C37176a.f97178ge);
            C67050je jeVar = (C67050je) hVar.mo104772d().get();
            chVar.copyOnWrite();
            C39655ci ciVar3 = (C39655ci) chVar.instance;
            jeVar.getClass();
            ciVar3.f104384e = jeVar;
            ciVar3.f104380a |= 8;
        }
        C119935d dVar3 = akVar.f336022d;
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C32873s sVar = C32873s.f88105a;
        ajVar.copyOnWrite();
        C32796ar arVar = (C32796ar) ajVar.instance;
        sVar.getClass();
        arVar.f87976b = sVar;
        arVar.f87975a = 6;
        return C47633f.m84733g(C47633f.m84733g(dVar3.mo104562a((C32796ar) ajVar.build(), false)).mo51515h(new C120879s(chVar), akVar.f336026h).mo51513e(Exception.class, C120880t.f336092a, akVar.f336026h)).mo51516i(new C120834aa(akVar, chVar), akVar.f336026h).mo51516i(new C120835ab(akVar, chVar), akVar.f336026h).mo51516i(new C120836ac(akVar), akVar.f336026h).mo51515h(new C120837ad(chVar), akVar.f336026h);
    }
}
