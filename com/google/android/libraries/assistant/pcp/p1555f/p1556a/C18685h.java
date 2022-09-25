package com.google.android.libraries.assistant.pcp.p1555f.p1556a;

import com.google.android.libraries.assistant.pcp.p1557g.C18718c;
import com.google.android.libraries.assistant.pcp.p1583o.C19032i;
import com.google.android.libraries.assistant.pcp.p1583o.C19033j;
import com.google.android.libraries.assistant.pcp.p1583o.C19034k;
import com.google.android.libraries.assistant.pcp.p1583o.C19035l;
import com.google.android.libraries.assistant.pcp.p1583o.C19036m;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.assistant.pcp.f.a.h */
/* compiled from: PG */
public final /* synthetic */ class C18685h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C18700w f52725a;

    /* renamed from: b */
    public final /* synthetic */ C58495hd f52726b;

    /* renamed from: c */
    public final /* synthetic */ C18718c f52727c;

    /* renamed from: d */
    public final /* synthetic */ Optional f52728d;

    public /* synthetic */ C18685h(C18700w wVar, C58495hd hdVar, C18718c cVar, Optional optional) {
        this.f52725a = wVar;
        this.f52726b = hdVar;
        this.f52727c = cVar;
        this.f52728d = optional;
    }

    public final C60870cx apply(Object obj) {
        C18700w wVar = this.f52725a;
        C58495hd hdVar = this.f52726b;
        C18718c cVar = this.f52727c;
        Optional optional = this.f52728d;
        List list = (List) obj;
        C58495hd hdVar2 = (C58495hd) Stream.CC.concat(Collection.EL.stream(hdVar.entrySet()), Collection.EL.stream(((C58495hd) Collection.EL.stream(list).map(C19032i.f53418a).filter(new C19033j(hdVar)).collect(C58370cn.m89403c(C19034k.f53420a, C19035l.f53421a, C19036m.f53422a))).entrySet())).collect(C58370cn.m89403c(C19034k.f53420a, C19035l.f53421a, C19036m.f53422a));
        C58485gu guVar = (C58485gu) Collection.EL.stream(list).map(new C18679b(wVar, hdVar2, cVar)).collect(C58370cn.f155946a);
        return C47638k.m84750a(guVar).mo51521b(new C18690m(wVar, guVar, hdVar2, optional), wVar.f52764e);
    }
}
