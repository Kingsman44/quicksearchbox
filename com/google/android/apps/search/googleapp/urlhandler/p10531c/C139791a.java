package com.google.android.apps.search.googleapp.urlhandler.p10531c;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.c.a */
/* compiled from: PG */
public final /* synthetic */ class C139791a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f379936a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f379937b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f379938c;

    public /* synthetic */ C139791a(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f379936a = cxVar;
        this.f379937b = cxVar2;
        this.f379938c = cxVar3;
    }

    public final Object call() {
        C60870cx cxVar = this.f379936a;
        C60870cx cxVar2 = this.f379937b;
        C60870cx cxVar3 = this.f379938c;
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) C60856cj.m92909r(cxVar2)).booleanValue();
        boolean booleanValue3 = ((Boolean) C60856cj.m92909r(cxVar3)).booleanValue();
        boolean z = true;
        if (!booleanValue && (booleanValue2 || booleanValue3)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
