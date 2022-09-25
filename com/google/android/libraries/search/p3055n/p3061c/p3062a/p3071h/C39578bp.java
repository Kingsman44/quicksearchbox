package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39392ah;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39394aj;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39395ak;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39638t;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39640v;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.n.c.a.h.bp */
/* compiled from: PG */
final class C39578bp implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C39602u f104162a;

    /* renamed from: b */
    final /* synthetic */ C39580br f104163b;

    public C39578bp(C39580br brVar, C39602u uVar) {
        this.f104163b = brVar;
        this.f104162a = uVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C39580br.f104168a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(53732)).mo56386p("Hotword audio capture start failed.");
        C39394aj c2 = C39395ak.m68799c();
        C39638t tVar = new C39638t();
        tVar.mo41807b(C39392ah.AUDIO_START_ERROR);
        tVar.f104350a = C58837ba.m90858g(th.getMessage());
        ((C39640v) c2).f104354a = C58833ax.m90834k(tVar.mo41806a());
        ((C2164c) this.f104163b.f104184q.mo56107c()).mo5437b(c2.mo41810a());
        C39580br brVar = this.f104163b;
        brVar.f104184q = C58836b.f156633a;
        C46459k.m82829b(brVar.f104176i.mo51512b(new C39576bn(this), brVar.f104174g), "Failed to handle audio start error", new Object[0]);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        this.f104163b.f104177j.set(C39579bq.STARTED);
        C59104x b = C39580br.f104168a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
        ((C59052c) ((C59052c) b).mo56372aa(53733)).mo56386p("Hotword audio capture started.");
        C39394aj c = C39395ak.m68799c();
        c.mo41811b(true);
        ((C2164c) this.f104163b.f104184q.mo56107c()).mo5437b(c.mo41810a());
        this.f104163b.f104184q = C58836b.f156633a;
        C60870cx cxVar = ((C39586e) this.f104162a).f104209b;
        C60845bz n = C47810es.m84974n(new C39577bo(this));
        C60856cj.m92911t(cxVar, C47810es.m84974n(n), this.f104163b.f104174g);
    }
}
