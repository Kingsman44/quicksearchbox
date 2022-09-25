package com.google.android.libraries.performance.primes.metrics.p2415i;

import com.google.android.libraries.performance.primes.metrics.p2404b.C31295a;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31301d;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31302e;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31310m;
import com.google.android.libraries.performance.primes.p2402g.C31241d;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej;

/* renamed from: com.google.android.libraries.performance.primes.metrics.i.o */
/* compiled from: PG */
public final /* synthetic */ class C31522o implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C31524q f84876a;

    /* renamed from: b */
    public final /* synthetic */ String f84877b;

    /* renamed from: c */
    public final /* synthetic */ long f84878c;

    /* renamed from: d */
    public final /* synthetic */ C71308ej f84879d;

    /* renamed from: e */
    public final /* synthetic */ C71207aq f84880e;

    public /* synthetic */ C31522o(C31524q qVar, String str, long j, C71308ej ejVar, C71207aq aqVar) {
        this.f84876a = qVar;
        this.f84877b = str;
        this.f84878c = j;
        this.f84879d = ejVar;
        this.f84880e = aqVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C31524q qVar = this.f84876a;
        String str = this.f84877b;
        long j = this.f84878c;
        C71308ej ejVar = this.f84879d;
        C71207aq aqVar = this.f84880e;
        if (!((C31241d) qVar.f84889e.mo6453a()).mo36965a()) {
            return C60866ct.f164955a;
        }
        C58833ax d = ((C31519l) qVar.f84888d.mo27525b()).mo37202d();
        if (d.mo56113h() && !((C31511d) d.mo56107c()).mo37208a()) {
            return C60866ct.f164955a;
        }
        C31310m mVar = qVar.f84886b;
        C31301d j2 = C31302e.m58363j();
        j2.mo37002c(true);
        C31295a aVar = (C31295a) j2;
        aVar.f84272e = Long.valueOf(j);
        j2.mo37004e(ejVar);
        aVar.f84268a = str;
        aVar.f84270c = aqVar;
        return mVar.mo37023b(j2.mo37000a());
    }
}
