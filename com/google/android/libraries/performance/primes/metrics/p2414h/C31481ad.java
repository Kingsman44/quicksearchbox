package com.google.android.libraries.performance.primes.metrics.p2414h;

import p5535j.p5536a.p5562i.p5568b.p5569a.C71256cl;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71257cm;

/* renamed from: com.google.android.libraries.performance.primes.metrics.h.ad */
/* compiled from: PG */
public final class C31481ad {
    /* renamed from: a */
    public static C71257cm m58696a(C71257cm cmVar, long j) {
        C71256cl clVar = (C71256cl) cmVar.toBuilder();
        C71257cm cmVar2 = (C71257cm) clVar.instance;
        if ((cmVar2.f190246a & 2) != 0) {
            long j2 = cmVar2.f190248c;
            clVar.copyOnWrite();
            C71257cm cmVar3 = (C71257cm) clVar.instance;
            cmVar3.f190246a |= 2;
            cmVar3.f190248c = j2 - j;
        }
        C71257cm cmVar4 = (C71257cm) clVar.instance;
        if ((cmVar4.f190246a & 4) != 0) {
            long j3 = cmVar4.f190249d;
            clVar.copyOnWrite();
            C71257cm cmVar5 = (C71257cm) clVar.instance;
            cmVar5.f190246a |= 4;
            cmVar5.f190249d = j3 - j;
        }
        C71257cm cmVar6 = (C71257cm) clVar.instance;
        if ((cmVar6.f190246a & 8) != 0) {
            long j4 = cmVar6.f190250e;
            clVar.copyOnWrite();
            C71257cm cmVar7 = (C71257cm) clVar.instance;
            cmVar7.f190246a |= 8;
            cmVar7.f190250e = j4 - j;
        }
        return (C71257cm) clVar.build();
    }
}
