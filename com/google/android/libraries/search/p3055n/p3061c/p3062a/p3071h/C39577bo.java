package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39390af;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39392ah;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39638t;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.search.n.c.a.h.bo */
/* compiled from: PG */
final class C39577bo implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C39578bp f104161a;

    public C39577bo(C39578bp bpVar) {
        this.f104161a = bpVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C39580br brVar = this.f104161a.f104163b;
        C39638t tVar = new C39638t();
        if ("END_OF_DATA Received before stop called!".equals(th.getMessage())) {
            C59104x d = C39580br.f104168a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(53779)).mo56386p("END_OF_DATA Received before stop called!");
            tVar.mo41807b(C39392ah.AUDIO_END_ERROR);
        } else {
            C59104x c = C39580br.f104168a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(53778)).mo56386p("Audio capture failure!");
            tVar.mo41807b(C39392ah.AUDIO_PUSH_ERROR);
        }
        C39390af afVar = brVar.f104189v;
        afVar.getClass();
        tVar.f104350a = C58837ba.m90858g(th.getMessage());
        afVar.mo41801a(tVar.mo41806a());
        C46459k.m82829b(brVar.f104176i.mo51512b(new C39561az(brVar), brVar.f104174g), "Failed to handle audio push error", new Object[0]);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C59104x b = C39580br.f104168a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
        ((C59052c) ((C59052c) b).mo56372aa(53731)).mo56386p("Soda audio push completed.");
    }
}
