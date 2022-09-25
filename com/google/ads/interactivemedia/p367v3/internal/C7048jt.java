package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.jt */
/* compiled from: PG */
public final class C7048jt implements C7070ko {

    /* renamed from: a */
    public final int f22566a;

    /* renamed from: b */
    public final int[] f22567b;

    /* renamed from: c */
    public final long[] f22568c;

    /* renamed from: d */
    public final long[] f22569d;

    /* renamed from: e */
    public final long[] f22570e;

    /* renamed from: f */
    private final long f22571f;

    public C7048jt(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f22567b = iArr;
        this.f22568c = jArr;
        this.f22569d = jArr2;
        this.f22570e = jArr3;
        int length = iArr.length;
        this.f22566a = length;
        if (length > 0) {
            int i = length - 1;
            this.f22571f = jArr2[i] + jArr3[i];
            return;
        }
        this.f22571f = 0;
    }

    /* renamed from: a */
    public final boolean mo16074a() {
        return true;
    }

    /* renamed from: b */
    public final C7068km mo16075b(long j) {
        int d = mo16086d(j);
        C7071kp kpVar = new C7071kp(this.f22570e[d], this.f22568c[d]);
        if (kpVar.f22630b >= j || d == this.f22566a - 1) {
            return new C7068km(kpVar, kpVar);
        }
        int i = d + 1;
        return new C7068km(kpVar, new C7071kp(this.f22570e[i], this.f22568c[i]));
    }

    /* renamed from: c */
    public final long mo16076c() {
        return this.f22571f;
    }

    /* renamed from: d */
    public final int mo16086d(long j) {
        return aeu.m18523an(this.f22570e, j, true);
    }

    public final String toString() {
        int i = this.f22566a;
        String arrays = Arrays.toString(this.f22567b);
        String arrays2 = Arrays.toString(this.f22568c);
        String arrays3 = Arrays.toString(this.f22570e);
        String arrays4 = Arrays.toString(this.f22569d);
        int length = String.valueOf(arrays).length();
        int length2 = String.valueOf(arrays2).length();
        StringBuilder sb = new StringBuilder(length + 71 + length2 + String.valueOf(arrays3).length() + String.valueOf(arrays4).length());
        sb.append("ChunkIndex(length=");
        sb.append(i);
        sb.append(", sizes=");
        sb.append(arrays);
        sb.append(", offsets=");
        sb.append(arrays2);
        sb.append(", timeUs=");
        sb.append(arrays3);
        sb.append(", durationsUs=");
        sb.append(arrays4);
        sb.append(")");
        return sb.toString();
    }
}
