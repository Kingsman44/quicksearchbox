package com.google.ads.interactivemedia.p367v3.internal;

import android.util.Log;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ma */
/* compiled from: PG */
final class C7110ma implements C7108lz {

    /* renamed from: a */
    private final long[] f22897a;

    /* renamed from: b */
    private final long[] f22898b;

    /* renamed from: c */
    private final long f22899c;

    /* renamed from: d */
    private final long f22900d;

    private C7110ma(long[] jArr, long[] jArr2, long j, long j2) {
        this.f22897a = jArr;
        this.f22898b = jArr2;
        this.f22899c = j;
        this.f22900d = j2;
    }

    /* renamed from: f */
    public static C7110ma m21113f(long j, long j2, C7012ik ikVar, aee aee) {
        int i;
        long j3 = j;
        C7012ik ikVar2 = ikVar;
        aee aee2 = aee;
        aee2.mo14557k(10);
        int v = aee.mo14568v();
        if (v <= 0) {
            return null;
        }
        int i2 = ikVar2.f22428d;
        long N = aeu.m18496N((long) v, ((long) (i2 >= 32000 ? 1152 : 576)) * 1000000, (long) i2);
        int o = aee.mo14561o();
        int o2 = aee.mo14561o();
        int o3 = aee.mo14561o();
        aee2.mo14557k(2);
        long j4 = j2 + ((long) ikVar2.f22427c);
        long[] jArr = new long[o];
        long[] jArr2 = new long[o];
        int i3 = 0;
        long j5 = j2;
        while (i3 < o) {
            int i4 = o2;
            jArr[i3] = (((long) i3) * N) / ((long) o);
            long j6 = j4;
            jArr2[i3] = Math.max(j5, j6);
            if (o3 == 1) {
                i = aee.mo14560n();
            } else if (o3 == 2) {
                i = aee.mo14561o();
            } else if (o3 == 3) {
                i = aee.mo14564r();
            } else if (o3 != 4) {
                return null;
            } else {
                i = aee.mo14538B();
            }
            j5 += (long) (i * i4);
            i3++;
            j4 = j6;
            o2 = i4;
        }
        if (!(j3 == -1 || j3 == j5)) {
            StringBuilder sb = new StringBuilder(67);
            sb.append("VBRI data size mismatch: ");
            sb.append(j3);
            sb.append(", ");
            sb.append(j5);
            Log.w("VbriSeeker", sb.toString());
        }
        return new C7110ma(jArr, jArr2, N, j5);
    }

    /* renamed from: a */
    public final boolean mo16074a() {
        return true;
    }

    /* renamed from: b */
    public final C7068km mo16075b(long j) {
        int an = aeu.m18523an(this.f22897a, j, true);
        C7071kp kpVar = new C7071kp(this.f22897a[an], this.f22898b[an]);
        if (kpVar.f22630b < j) {
            long[] jArr = this.f22897a;
            if (an != jArr.length - 1) {
                int i = an + 1;
                return new C7068km(kpVar, new C7071kp(jArr[i], this.f22898b[i]));
            }
        }
        return new C7068km(kpVar, kpVar);
    }

    /* renamed from: c */
    public final long mo16076c() {
        return this.f22899c;
    }

    /* renamed from: d */
    public final long mo16129d(long j) {
        return this.f22897a[aeu.m18523an(this.f22898b, j, true)];
    }

    /* renamed from: e */
    public final long mo16130e() {
        return this.f22900d;
    }
}
