package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.speech.p5218j.C67056jk;

/* renamed from: com.google.android.libraries.search.n.c.a.h.at */
/* compiled from: PG */
public final /* synthetic */ class C39555at implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39580br f104133a;

    /* renamed from: b */
    public final /* synthetic */ C67056jk f104134b;

    public /* synthetic */ C39555at(C39580br brVar, C67056jk jkVar) {
        this.f104133a = brVar;
        this.f104134b = jkVar;
    }

    public final C60870cx apply(Object obj) {
        C39580br brVar = this.f104133a;
        C67056jk jkVar = this.f104134b;
        Exception exc = (Exception) obj;
        C59104x c = C39580br.f104168a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
        ((C59052c) ((C59052c) c).mo56372aa(53745)).mo56389s("Exception happen when we call waitForSodaStoppedAfterTimeout! Stack trace %s", exc.getMessage());
        C59104x d = C39580br.f104168a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(exc)).mo56372aa(53746)).mo56386p("waitForSodaStoppedAfterTimeout Exception! Try to stop soda and notify the caller.");
        C60870cx h = brVar.mo41910h("waitForSodaStoppedAfterTimeout Exception");
        C39549an anVar = new C39549an(brVar, jkVar);
        return C60922j.m93045h(h, C47810es.m84966f(anVar), brVar.f104174g);
    }
}
