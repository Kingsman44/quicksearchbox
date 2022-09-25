package com.google.android.libraries.performance.primes.metrics.p2414h;

import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71258cn;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71261cq;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr;

/* renamed from: com.google.android.libraries.performance.primes.metrics.h.t */
/* compiled from: PG */
public final /* synthetic */ class C31501t implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C31505x f84830a;

    /* renamed from: b */
    public final /* synthetic */ C71258cn f84831b;

    /* renamed from: c */
    public final /* synthetic */ String f84832c;

    public /* synthetic */ C31501t(C31505x xVar, C71258cn cnVar, String str) {
        this.f84830a = xVar;
        this.f84831b = cnVar;
        this.f84832c = str;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        int a;
        C31505x xVar = this.f84830a;
        C71258cn cnVar = this.f84831b;
        String str = this.f84832c;
        if (!xVar.f84841b.mo37024d((String) null)) {
            return C60866ct.f164955a;
        }
        C71262cr crVar = (C71262cr) cnVar.instance;
        int i = crVar.f190272r;
        int a2 = C71261cq.m103948a(i);
        if (((a2 != 0 && a2 == 3) || ((a = C71261cq.m103948a(i)) != 0 && a == 2)) && (crVar.f190255a & 16) == 0) {
            return C60866ct.f164955a;
        }
        C31486f fVar = (C31486f) xVar.f84842c.mo27525b();
        C31502u uVar = (C31502u) fVar.mo37175c().mo56109e(C31502u.f84833a);
        C60870cx i2 = C60856cj.m92900i(C58836b.f156633a);
        C60870cx a3 = ((C31500s) fVar.mo37176d().mo56109e(C31503v.f84834a)).mo37199a();
        return C60856cj.m92893b(i2, a3).mo57335b(new C31504w(xVar, cnVar, i2, a3, str), C60826bg.f164896a);
    }
}
