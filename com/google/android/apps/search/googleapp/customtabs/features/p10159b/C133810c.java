package com.google.android.apps.search.googleapp.customtabs.features.p10159b;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.b.c */
/* compiled from: PG */
public final /* synthetic */ class C133810c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f364467a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f364468b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f364469c;

    public /* synthetic */ C133810c(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f364467a = cxVar;
        this.f364468b = cxVar2;
        this.f364469c = cxVar3;
    }

    public final Object call() {
        C60870cx cxVar = this.f364467a;
        C60870cx cxVar2 = this.f364468b;
        C60870cx cxVar3 = this.f364469c;
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
