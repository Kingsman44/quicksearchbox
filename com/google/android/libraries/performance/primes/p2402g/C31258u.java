package com.google.android.libraries.performance.primes.p2402g;

import p5535j.p5536a.p5562i.p5568b.p5569a.C71301ec;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71303ee;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71304ef;

/* renamed from: com.google.android.libraries.performance.primes.g.u */
/* compiled from: PG */
public abstract class C31258u {

    /* renamed from: a */
    private final C71304ef f84205a;

    public C31258u(C71304ef efVar) {
        this.f84205a = efVar;
    }

    /* renamed from: a */
    public abstract long mo36973a(String str);

    /* renamed from: b */
    public abstract C71304ef mo36974b(Long l);

    /* renamed from: c */
    public abstract boolean mo36975c();

    /* renamed from: d */
    public final C71304ef mo36977d() {
        C71301ec ecVar = (C71301ec) mo36978e((Long) null).toBuilder();
        ecVar.copyOnWrite();
        C71304ef efVar = (C71304ef) ecVar.instance;
        efVar.f190407a |= 2;
        efVar.f190408b = -1;
        return (C71304ef) ecVar.build();
    }

    /* renamed from: e */
    public final C71304ef mo36978e(Long l) {
        C71304ef efVar = this.f84205a;
        int a = C71303ee.m103955a(efVar.f190409c);
        if (a == 0 || a != 5) {
            return efVar;
        }
        if (l == null || l.longValue() == this.f84205a.f190408b) {
            return this.f84205a;
        }
        C71301ec ecVar = (C71301ec) C71304ef.f190405d.createBuilder();
        int a2 = C71303ee.m103955a(this.f84205a.f190409c);
        if (a2 == 0) {
            a2 = 1;
        }
        ecVar.copyOnWrite();
        C71304ef efVar2 = (C71304ef) ecVar.instance;
        efVar2.f190409c = a2 - 1;
        efVar2.f190407a |= 4;
        long longValue = l.longValue();
        ecVar.copyOnWrite();
        C71304ef efVar3 = (C71304ef) ecVar.instance;
        efVar3.f190407a |= 2;
        efVar3.f190408b = longValue;
        return (C71304ef) ecVar.build();
    }
}
