package com.google.android.apps.gsa.staticplugins.opa.util;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.bs */
/* compiled from: PG */
public final /* synthetic */ class C113803bs implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f315174a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f315175b;

    public /* synthetic */ C113803bs(C60870cx cxVar, C60870cx cxVar2) {
        this.f315174a = cxVar;
        this.f315175b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f315174a;
        C60870cx cxVar2 = this.f315175b;
        boolean z = false;
        if (((Boolean) C60856cj.m92909r(cxVar)).booleanValue() && ((Boolean) C60856cj.m92909r(cxVar2)).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
