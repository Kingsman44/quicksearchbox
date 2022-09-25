package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import androidx.p104d.p105a.C2169h;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.speech.p5218j.C67056jk;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.search.n.c.a.h.ai */
/* compiled from: PG */
public final /* synthetic */ class C39544ai implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C39580br f104114a;

    /* renamed from: b */
    public final /* synthetic */ C67056jk f104115b;

    public /* synthetic */ C39544ai(C39580br brVar, C67056jk jkVar) {
        this.f104114a = brVar;
        this.f104115b = jkVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C39580br brVar = this.f104114a;
        C67056jk jkVar = this.f104115b;
        C59104x b = C39580br.f104168a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
        ((C59052c) ((C59052c) b).mo56372aa(53747)).mo56386p("onHotwordTimeout inside sequencer");
        return C47633f.m84733g(C60856cj.m92908q(C2169h.m6027a(new C39556au(brVar)), 5, TimeUnit.SECONDS, brVar.f104173f)).mo51516i(new C39554as(brVar, jkVar), brVar.f104174g).mo51514f(Exception.class, new C39555at(brVar, jkVar), brVar.f104174g);
    }
}
