package com.google.android.apps.search.assistant.verticals.ambient.p9930k.p9931a;

import com.google.android.apps.search.assistant.verticals.ambient.p9930k.C130883x;
import com.google.assistant.p4016z.C53738w;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.k.a.b */
/* compiled from: PG */
public final /* synthetic */ class C130841b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C130857r f358097a;

    /* renamed from: b */
    public final /* synthetic */ C53738w f358098b;

    /* renamed from: c */
    public final /* synthetic */ C130883x f358099c;

    public /* synthetic */ C130841b(C130857r rVar, C53738w wVar, C130883x xVar) {
        this.f358097a = rVar;
        this.f358098b = wVar;
        this.f358099c = xVar;
    }

    public final Object apply(Object obj) {
        C130857r rVar = this.f358097a;
        C53738w wVar = this.f358098b;
        C130883x xVar = this.f358099c;
        return (C58485gu) Collection.EL.stream((C58485gu) obj).map(new C130853n(wVar, xVar)).filter(new C130854o(rVar, xVar)).collect(C58370cn.f155946a);
    }
}
