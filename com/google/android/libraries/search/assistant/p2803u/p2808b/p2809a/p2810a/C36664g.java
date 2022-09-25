package com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.p2810a;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.assistant.u.b.a.a.g */
/* compiled from: PG */
public final /* synthetic */ class C36664g implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f95538a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f95539b;

    public /* synthetic */ C36664g(C60870cx cxVar, C60870cx cxVar2) {
        this.f95538a = cxVar;
        this.f95539b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f95538a;
        C60870cx cxVar2 = this.f95539b;
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar)).booleanValue();
        int intValue = ((Integer) C60856cj.m92909r(cxVar2)).intValue();
        boolean z = false;
        if (!booleanValue && intValue <= 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
