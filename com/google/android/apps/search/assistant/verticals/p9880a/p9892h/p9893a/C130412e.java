package com.google.android.apps.search.assistant.verticals.p9880a.p9892h.p9893a;

import com.google.android.apps.search.assistant.verticals.p9880a.p9883b.C130332g;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.h.a.e */
/* compiled from: PG */
public final /* synthetic */ class C130412e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f357363a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f357364b;

    public /* synthetic */ C130412e(C60870cx cxVar, C60870cx cxVar2) {
        this.f357363a = cxVar;
        this.f357364b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f357363a;
        return (C58485gu) Collection.EL.stream((C58485gu) C60856cj.m92909r(this.f357364b)).filter(new C130408a((C130332g) C60856cj.m92909r(cxVar))).collect(C58370cn.f155946a);
    }
}
