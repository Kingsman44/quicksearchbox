package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8260d;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.d.l */
/* compiled from: PG */
public final /* synthetic */ class C107001l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C106989ao f298009a;

    /* renamed from: b */
    public final /* synthetic */ Set f298010b;

    /* renamed from: c */
    public final /* synthetic */ C106596h f298011c;

    public /* synthetic */ C107001l(C106989ao aoVar, Set set, C106596h hVar) {
        this.f298009a = aoVar;
        this.f298010b = set;
        this.f298011c = hVar;
    }

    public final C60870cx apply(Object obj) {
        C106989ao aoVar = this.f298009a;
        return C47638k.m84750a((Iterable) Collection.EL.stream(this.f298010b).map(new C107008s(aoVar, this.f298011c, (C58485gu) obj)).collect(C58370cn.f155946a)).mo51520a(C107009t.f298024a, aoVar.f297983f);
    }
}
