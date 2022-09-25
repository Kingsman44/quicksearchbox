package com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.p2810a;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.assistant.u.b.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C36658a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f95524a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f95525b;

    public /* synthetic */ C36658a(C60870cx cxVar, C60870cx cxVar2) {
        this.f95524a = cxVar;
        this.f95525b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f95524a;
        C60870cx cxVar2 = this.f95525b;
        int intValue = ((Integer) C60856cj.m92909r(cxVar)).intValue();
        int intValue2 = ((Integer) C60856cj.m92909r(cxVar2)).intValue();
        boolean z = false;
        if (intValue <= 0 && intValue2 == 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
