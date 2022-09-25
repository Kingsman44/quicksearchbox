package com.google.android.libraries.performance.primes.metrics.p2413g;

import com.google.android.libraries.performance.primes.metrics.p2404b.C31301d;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31302e;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31310m;
import com.google.common.p4522b.C58485gu;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71305eg;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71306eh;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71307ei;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej;

/* renamed from: com.google.android.libraries.performance.primes.metrics.g.n */
/* compiled from: PG */
public final /* synthetic */ class C31473n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C31475p f84757a;

    public /* synthetic */ C31473n(C31475p pVar) {
        this.f84757a = pVar;
    }

    public final void run() {
        C31475p pVar = this.f84757a;
        long f = pVar.f84759a.mo26874f();
        long j = pVar.f84765g;
        C58485gu g = pVar.f84760b.mo37158g();
        long j2 = j - pVar.f84764f;
        boolean z = false;
        if (j2 >= 0) {
            if (j2 > ((long) ((Integer) g.get(0)).intValue())) {
                C31310m mVar = pVar.f84762d;
                C31301d j3 = C31302e.m58363j();
                C71307ei eiVar = (C71307ei) C71308ej.f190415x.createBuilder();
                C71305eg egVar = (C71305eg) C71306eh.f190410c.createBuilder();
                egVar.copyOnWrite();
                C71306eh ehVar = (C71306eh) egVar.instance;
                ehVar.f190412a = 2;
                ehVar.f190413b = Long.valueOf(j2);
                C71306eh ehVar2 = (C71306eh) egVar.build();
                eiVar.copyOnWrite();
                C71308ej ejVar = (C71308ej) eiVar.instance;
                ehVar2.getClass();
                ejVar.f190430o = ehVar2;
                ejVar.f190416a |= 1048576;
                j3.mo37004e((C71308ej) eiVar.build());
                mVar.mo37023b(j3.mo37000a());
                pVar.f84763e = 0;
            }
            pVar.mo37172a(new C31474o(pVar), pVar.f84760b.mo37157f());
            return;
        }
        int intValue = ((Integer) g.get(pVar.f84763e)).intValue();
        long j4 = f - pVar.f84764f;
        if (j4 > ((long) intValue)) {
            C58485gu g2 = pVar.f84760b.mo37158g();
            if (pVar.f84763e != g2.size() && j4 > ((long) ((Integer) g2.get(pVar.f84763e)).intValue())) {
                while (pVar.f84763e != g2.size() && j4 > ((long) ((Integer) g2.get(pVar.f84763e)).intValue())) {
                    pVar.f84763e++;
                    z = true;
                }
                if (z) {
                    C31310m mVar2 = pVar.f84762d;
                    C31301d j5 = C31302e.m58363j();
                    C71307ei eiVar2 = (C71307ei) C71308ej.f190415x.createBuilder();
                    C71305eg egVar2 = (C71305eg) C71306eh.f190410c.createBuilder();
                    egVar2.copyOnWrite();
                    C71306eh ehVar3 = (C71306eh) egVar2.instance;
                    ehVar3.f190412a = 1;
                    ehVar3.f190413b = Long.valueOf(j4);
                    C71306eh ehVar4 = (C71306eh) egVar2.build();
                    eiVar2.copyOnWrite();
                    C71308ej ejVar2 = (C71308ej) eiVar2.instance;
                    ehVar4.getClass();
                    ejVar2.f190430o = ehVar4;
                    ejVar2.f190416a |= 1048576;
                    j5.mo37004e((C71308ej) eiVar2.build());
                    mVar2.mo37023b(j5.mo37000a());
                }
            }
        }
        pVar.mo37172a(new C31473n(pVar), pVar.f84760b.mo37155e());
    }
}
