package com.google.android.libraries.assistant.pcp.p1555f.p1556a;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3803ag.p3809c.C49019dl;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.p4750c.C62950b;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.f.a.m */
/* compiled from: PG */
public final /* synthetic */ class C18690m implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C18700w f52733a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f52734b;

    /* renamed from: c */
    public final /* synthetic */ C58495hd f52735c;

    /* renamed from: d */
    public final /* synthetic */ Optional f52736d;

    public /* synthetic */ C18690m(C18700w wVar, C58485gu guVar, C58495hd hdVar, Optional optional) {
        this.f52733a = wVar;
        this.f52734b = guVar;
        this.f52735c = hdVar;
        this.f52736d = optional;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C18700w wVar = this.f52733a;
        C58485gu guVar = this.f52734b;
        C58495hd hdVar = this.f52735c;
        Optional optional = this.f52736d;
        C58480gp e = C58485gu.m89837e();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            e.mo55395g((C49019dl) C60856cj.m92909r((C60870cx) guVar.get(i)));
        }
        C58485gu f = e.mo55394f();
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(f).map(new C18683f(wVar, hdVar, optional)).collect(C58370cn.f155946a);
        return C47638k.m84750a(guVar2).mo51521b(new C18684g(wVar, guVar2, f, wVar.f52765f.mo24077a(hdVar.keySet(), C62950b.m95471b(wVar.f52763d))), wVar.f52764e);
    }
}
