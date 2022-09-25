package com.google.android.libraries.performance.primes.metrics.p2416j;

import com.google.android.libraries.performance.primes.metrics.p2404b.C31295a;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31301d;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31302e;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31310m;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71251cg;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71307ei;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej;

/* renamed from: com.google.android.libraries.performance.primes.metrics.j.y */
/* compiled from: PG */
public final /* synthetic */ class C31557y implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C31531ab f84969a;

    /* renamed from: b */
    public final /* synthetic */ C71251cg f84970b;

    /* renamed from: c */
    public final /* synthetic */ C71207aq f84971c;

    public /* synthetic */ C31557y(C31531ab abVar, C71251cg cgVar, C71207aq aqVar) {
        this.f84969a = abVar;
        this.f84970b = cgVar;
        this.f84971c = aqVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C31531ab abVar = this.f84969a;
        C71251cg cgVar = this.f84970b;
        C71207aq aqVar = this.f84971c;
        long a = abVar.f84910a.mo37022a(C31531ab.m58782e(cgVar));
        if (a == -1) {
            return C60866ct.f164955a;
        }
        if (!((C31547o) abVar.f84911b.mo27525b()).mo36980b()) {
            return C60866ct.f164955a;
        }
        if (abVar.f84914e.mo36968c()) {
            return C60866ct.f164955a;
        }
        abVar.f84914e.mo36967b();
        C71307ei eiVar = (C71307ei) C71308ej.f190415x.createBuilder();
        eiVar.copyOnWrite();
        C71308ej ejVar = (C71308ej) eiVar.instance;
        ejVar.f190427l = cgVar;
        ejVar.f190416a |= 4096;
        C31310m mVar = abVar.f84910a;
        C31301d j = C31302e.m58363j();
        j.mo37004e((C71308ej) eiVar.build());
        Long valueOf = Long.valueOf(a);
        C31295a aVar = (C31295a) j;
        aVar.f84272e = valueOf;
        aVar.f84270c = aqVar;
        return mVar.mo37023b(j.mo37000a());
    }
}
