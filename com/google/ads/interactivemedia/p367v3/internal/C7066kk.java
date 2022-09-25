package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.kk */
/* compiled from: PG */
public final class C7066kk implements C7070ko {

    /* renamed from: a */
    private final long[] f22620a;

    /* renamed from: b */
    private final long[] f22621b;

    /* renamed from: c */
    private final long f22622c;

    /* renamed from: d */
    private final boolean f22623d;

    public C7066kk(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        ary.m19462o(length == length2);
        boolean z = length2 > 0;
        this.f22623d = z;
        if (!z || jArr2[0] <= 0) {
            this.f22620a = jArr;
            this.f22621b = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.f22620a = jArr3;
            long[] jArr4 = new long[i];
            this.f22621b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.f22622c = j;
    }

    /* renamed from: a */
    public final boolean mo16074a() {
        return this.f22623d;
    }

    /* renamed from: b */
    public final C7068km mo16075b(long j) {
        if (!this.f22623d) {
            C7071kp kpVar = C7071kp.f22629a;
            return new C7068km(kpVar, kpVar);
        }
        int an = aeu.m18523an(this.f22621b, j, true);
        C7071kp kpVar2 = new C7071kp(this.f22621b[an], this.f22620a[an]);
        if (kpVar2.f22630b != j) {
            long[] jArr = this.f22621b;
            if (an != jArr.length - 1) {
                int i = an + 1;
                return new C7068km(kpVar2, new C7071kp(jArr[i], this.f22620a[i]));
            }
        }
        return new C7068km(kpVar2, kpVar2);
    }

    /* renamed from: c */
    public final long mo16076c() {
        return this.f22622c;
    }
}
