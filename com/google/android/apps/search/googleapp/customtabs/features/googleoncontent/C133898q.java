package com.google.android.apps.search.googleapp.customtabs.features.googleoncontent;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.q */
/* compiled from: PG */
public final /* synthetic */ class C133898q implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f364686a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f364687b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f364688c;

    public /* synthetic */ C133898q(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f364686a = cxVar;
        this.f364687b = cxVar2;
        this.f364688c = cxVar3;
    }

    public final Object call() {
        C60870cx cxVar = this.f364686a;
        C60870cx cxVar2 = this.f364687b;
        C60870cx cxVar3 = this.f364688c;
        String str = (String) C60856cj.m92909r(cxVar);
        String str2 = (String) C60856cj.m92909r(cxVar2);
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar3)).booleanValue();
        boolean z = false;
        if (str != null && str.equals(str2) && booleanValue) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
