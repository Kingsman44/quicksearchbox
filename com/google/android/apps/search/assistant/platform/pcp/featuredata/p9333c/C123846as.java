package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.c.as */
/* compiled from: PG */
public final /* synthetic */ class C123846as implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f342118a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f342119b;

    public /* synthetic */ C123846as(C60870cx cxVar, C60870cx cxVar2) {
        this.f342118a = cxVar;
        this.f342119b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f342118a;
        C60870cx cxVar2 = this.f342119b;
        boolean anyMatch = Collection.EL.stream((List) C60856cj.m92909r(cxVar)).anyMatch(C123844aq.f342116a);
        boolean anyMatch2 = Collection.EL.stream((List) C60856cj.m92909r(cxVar2)).anyMatch(C123845ar.f342117a);
        boolean z = true;
        if (!anyMatch && !anyMatch2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
