package com.google.android.libraries.performance.primes.p2402g;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58837ba;
import java.util.Random;
import org.chromium.net.PrivateKeyType;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71304ef;

/* renamed from: com.google.android.libraries.performance.primes.g.s */
/* compiled from: PG */
final class C31256s extends C31258u {

    /* renamed from: a */
    private final Random f84197a;

    /* renamed from: b */
    private final C21370a f84198b;

    /* renamed from: c */
    private final long f84199c;

    /* renamed from: d */
    private final C31238a f84200d;

    public C31256s(C71304ef efVar, Random random, C31238a aVar, C21370a aVar2) {
        super(efVar);
        this.f84197a = random;
        this.f84199c = efVar.f190408b;
        this.f84200d = aVar;
        this.f84198b = aVar2;
    }

    /* renamed from: a */
    public final long mo36973a(String str) {
        long j;
        double d;
        if (C58837ba.m90859h(str)) {
            j = this.f84199c;
        } else {
            C31238a aVar = this.f84200d;
            long c = this.f84198b.mo26871c() - aVar.f84154d;
            char c2 = 0;
            if (c >= 14400000) {
                long j2 = c / 14400000;
                long max = Math.max(j2, 15);
                for (int i = 0; i < 256; i++) {
                    short[] sArr = aVar.f84151a;
                    int i2 = (int) max;
                    int i3 = sArr[i] >> i2;
                    sArr[i] = (short) i3;
                    aVar.f84152b[i] = (short) (i3 >> i2);
                }
                aVar.f84154d += j2 * 14400000;
            }
            int hashCode = str.hashCode() * aVar.f84153c;
            if (!str.isEmpty()) {
                c2 = str.charAt(0);
            }
            int i4 = ((hashCode >>> 24) + c2) & PrivateKeyType.INVALID;
            int length = ((hashCode >>> 16) + str.length()) & PrivateKeyType.INVALID;
            int min = Math.min(aVar.f84151a[i4], aVar.f84152b[length]);
            int i5 = min + 1;
            short min2 = (short) Math.min(32767, i5);
            short[] sArr2 = aVar.f84151a;
            if (sArr2[i4] == min) {
                sArr2[i4] = min2;
            }
            short[] sArr3 = aVar.f84152b;
            if (sArr3[length] == min) {
                sArr3[length] = min2;
            }
            if (i5 < 50) {
                d = Math.sqrt((double) i5);
            } else {
                d = (double) i5;
            }
            double d2 = (double) this.f84199c;
            Double.isNaN(d2);
            j = (long) ((int) (d2 / d));
        }
        if (this.f84197a.nextDouble() * 1000.0d < ((double) j)) {
            return j;
        }
        return -1;
    }

    /* renamed from: b */
    public final C71304ef mo36974b(Long l) {
        if (mo36975c()) {
            return mo36978e(l);
        }
        return mo36977d();
    }

    /* renamed from: c */
    public final boolean mo36975c() {
        return this.f84199c > 0;
    }
}
