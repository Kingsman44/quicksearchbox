package com.google.android.apps.search.assistant.verticals.ambient.p9930k.p9931a;

import com.google.android.apps.search.assistant.verticals.ambient.p9930k.C130883x;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p4016z.C53723h;
import com.google.assistant.p4016z.C53738w;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.k.a.p */
/* compiled from: PG */
public final /* synthetic */ class C130855p implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C130857r f358118a;

    /* renamed from: b */
    public final /* synthetic */ C53723h f358119b;

    /* renamed from: c */
    public final /* synthetic */ C130883x f358120c;

    public /* synthetic */ C130855p(C130857r rVar, C53723h hVar, C130883x xVar) {
        this.f358118a = rVar;
        this.f358119b = hVar;
        this.f358120c = xVar;
    }

    public final C60870cx apply(Object obj) {
        C130857r rVar = this.f358118a;
        C53723h hVar = this.f358119b;
        C130883x xVar = this.f358120c;
        C60870cx e = C60856cj.m92896e((C58485gu) Collection.EL.stream(hVar.f141039a).map(C130848i.f358106a).filter(C130849j.f358107a).map(C130850k.f358108a).filter(new C130851l(rVar, xVar)).map(new C130852m(rVar, (C53738w) obj, xVar)).collect(C58370cn.f155946a));
        C130847h hVar2 = C130847h.f358105a;
        return C60922j.m93044g(e, C47810es.m84963c(hVar2), rVar.f358125b);
    }
}
