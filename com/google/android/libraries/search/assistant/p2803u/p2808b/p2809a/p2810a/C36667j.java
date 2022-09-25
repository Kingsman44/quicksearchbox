package com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.p2810a;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.assistant.u.b.a.a.j */
/* compiled from: PG */
public final /* synthetic */ class C36667j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f95544a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f95545b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f95546c;

    public /* synthetic */ C36667j(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f95544a = cxVar;
        this.f95545b = cxVar2;
        this.f95546c = cxVar3;
    }

    public final Object call() {
        C60870cx cxVar = this.f95544a;
        C60870cx cxVar2 = this.f95545b;
        C60870cx cxVar3 = this.f95546c;
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) C60856cj.m92909r(cxVar2)).booleanValue();
        int intValue = ((Integer) C60856cj.m92909r(cxVar3)).intValue();
        boolean z = false;
        if (!booleanValue && !booleanValue2 && intValue <= 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
