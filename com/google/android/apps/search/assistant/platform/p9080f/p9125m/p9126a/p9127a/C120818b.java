package com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9126a.p9127a;

import com.google.android.apps.gsa.binaries.satin.app.asu;
import com.google.android.apps.gsa.binaries.satin.app.asw;
import com.google.android.apps.search.assistant.platform.p9080f.p9125m.C120816a;
import com.google.android.apps.search.assistant.platform.p9080f.p9125m.C120887b;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.p2577a.C33447g;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4450a.C57934a;
import com.google.p4449cd.p4462i.C58048g;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.search.assistant.platform.f.m.a.a.b */
/* compiled from: PG */
public final class C120818b implements C120887b {

    /* renamed from: a */
    private volatile C120819c f335980a;

    /* renamed from: b */
    private final asu f335981b;

    /* renamed from: c */
    private final C58048g f335982c;

    /* renamed from: d */
    private final C33447g f335983d;

    public C120818b(asu asu, C58048g gVar, C33447g gVar2) {
        this.f335981b = asu;
        this.f335982c = gVar;
        this.f335983d = gVar2;
    }

    /* renamed from: b */
    public final C60870cx mo104701b(C120816a aVar) {
        C58976aa aaVar = C58975e.f156826a;
        C58838bb.m90884s(this.f335980a == null, "SpeechRecognizer is already running");
        this.f335981b.f203988e = this.f335982c.mo54628a("On device component graph");
        asu asu = this.f335981b;
        aVar.getClass();
        asu.f203989f = aVar;
        C68225k.m98529a(asu.f203988e, C57934a.class);
        C68225k.m98529a(asu.f203989f, C120816a.class);
        this.f335980a = new asw(asu.f203984a, asu.f203985b, asu.f203986c, asu.f203987d, asu.f203988e, asu.f203989f);
        C60870cx gq = this.f335980a.d.mo60297gq();
        this.f335983d.mo38849b(new C120817a(gq));
        return gq;
    }
}
