package com.google.android.libraries.assistant.pcp.p1555f.p1556a;

import com.google.android.libraries.assistant.pcp.p1546d.C18579g;
import com.google.android.libraries.assistant.pcp.p1557g.C18718c;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3803ag.p3809c.C49019dl;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.f.a.s */
/* compiled from: PG */
public final /* synthetic */ class C18696s implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C18700w f52746a;

    /* renamed from: b */
    public final /* synthetic */ C49019dl f52747b;

    /* renamed from: c */
    public final /* synthetic */ C18579g f52748c;

    /* renamed from: d */
    public final /* synthetic */ Optional f52749d;

    /* renamed from: e */
    public final /* synthetic */ C18718c f52750e;

    public /* synthetic */ C18696s(C18700w wVar, C49019dl dlVar, C18579g gVar, Optional optional, C18718c cVar) {
        this.f52746a = wVar;
        this.f52747b = dlVar;
        this.f52748c = gVar;
        this.f52749d = optional;
        this.f52750e = cVar;
    }

    public final C60870cx apply(Object obj) {
        C18700w wVar = this.f52746a;
        C49019dl dlVar = this.f52747b;
        C18579g gVar = this.f52748c;
        Optional optional = this.f52749d;
        C18718c cVar = this.f52750e;
        C58528ij d = C18700w.m36127d((C58528ij) ((C58495hd) obj).getOrDefault(gVar, C58733pz.f156496a), optional);
        return C47633f.m84733g(wVar.mo24112e(dlVar, d, cVar)).mo51516i(new C18698u(wVar, d, optional), wVar.f52764e).mo51515h(C18699v.f52758a, wVar.f52764e);
    }
}
