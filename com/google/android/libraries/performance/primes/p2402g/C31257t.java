package com.google.android.libraries.performance.primes.p2402g;

import com.google.android.libraries.p1730f.C21370a;
import java.util.Random;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71303ee;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71304ef;

/* renamed from: com.google.android.libraries.performance.primes.g.t */
/* compiled from: PG */
public final class C31257t {

    /* renamed from: a */
    static final C31258u f84201a = new C31255r(C71304ef.f190405d, true);

    /* renamed from: b */
    private final Random f84202b;

    /* renamed from: c */
    private final C21370a f84203c;

    /* renamed from: d */
    private final C31238a f84204d;

    public C31257t(Random random, C31238a aVar, C21370a aVar2) {
        this.f84202b = random;
        this.f84203c = aVar2;
        this.f84204d = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C31258u mo36976a(C71304ef efVar) {
        int a = C71303ee.m103955a(efVar.f190409c);
        boolean z = true;
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            if (efVar.f190408b != 1000) {
                z = false;
            }
            return new C31255r(efVar, z);
        } else if (i == 3) {
            if (this.f84202b.nextDouble() * 1000.0d >= ((double) efVar.f190408b)) {
                z = false;
            }
            return new C31255r(efVar, z);
        } else if (i == 4) {
            return new C31256s(efVar, this.f84202b, this.f84204d, this.f84203c);
        } else {
            if (i == 5) {
                efVar = C71304ef.f190405d;
            }
            return new C31255r(efVar, true);
        }
    }
}
