package com.google.android.libraries.performance.primes.metrics.p2410e;

import android.os.Process;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71225bh;

/* renamed from: com.google.android.libraries.performance.primes.metrics.e.w */
/* compiled from: PG */
public final /* synthetic */ class C31437w implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C31409ac f84643a;

    public /* synthetic */ C31437w(C31409ac acVar) {
        this.f84643a = acVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C31409ac acVar = this.f84643a;
        if (!acVar.f84574f.mo37025e()) {
            return C60856cj.m92898g();
        }
        boolean z = true;
        C71225bh b = acVar.f84575g.mo37113b(1, Process.myPid(), (String) null, (String) null);
        long c = acVar.f84572d.mo26871c();
        if (c <= 0) {
            z = false;
        }
        C58838bb.m90868c(z);
        b.getClass();
        return C60856cj.m92900i(new C31425k(c, b));
    }
}
