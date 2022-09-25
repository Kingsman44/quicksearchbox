package com.google.android.libraries.performance.primes.metrics.p2410e;

import com.google.common.base.C58819aj;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.performance.primes.metrics.e.aa */
/* compiled from: PG */
public final /* synthetic */ class C31407aa implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C31409ac f84566a;

    /* renamed from: b */
    public final /* synthetic */ String f84567b;

    public /* synthetic */ C31407aa(C31409ac acVar, String str) {
        this.f84566a = acVar;
        this.f84567b = str;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C31409ac acVar = this.f84566a;
        String str = this.f84567b;
        if (!acVar.f84574f.mo37025e()) {
            return C60866ct.f164955a;
        }
        if (acVar.f84577i.size() >= 10) {
            return C60856cj.m92898g();
        }
        C60870cx g = acVar.mo37111g();
        C60870cx cxVar = (C60870cx) acVar.f84577i.put(str, g);
        if (!(cxVar == null || g == cxVar)) {
            cxVar.cancel(true);
        }
        return C60922j.m93044g(g, new C58819aj((Object) null), C60826bg.f164896a);
    }
}
