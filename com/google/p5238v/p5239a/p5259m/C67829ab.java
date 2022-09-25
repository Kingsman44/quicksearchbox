package com.google.p5238v.p5239a.p5259m;

import java.util.Arrays;

/* renamed from: com.google.v.a.m.ab */
/* compiled from: PG */
public final class C67829ab {

    /* renamed from: a */
    final long[] f183924a;

    /* renamed from: b */
    final long[] f183925b;

    /* renamed from: c */
    final long[] f183926c;

    public C67829ab() {
        this(new long[10], new long[10], new long[10]);
    }

    public C67829ab(long[] jArr, long[] jArr2, long[] jArr3) {
        this.f183924a = jArr;
        this.f183925b = jArr2;
        this.f183926c = jArr3;
    }

    /* renamed from: b */
    static void m97979b(C67829ab abVar, C67828aa aaVar) {
        C67848au.m98029b(abVar.f183924a, aaVar.f183922a.f183924a, aaVar.f183923b);
        long[] jArr = abVar.f183925b;
        C67829ab abVar2 = aaVar.f183922a;
        C67848au.m98029b(jArr, abVar2.f183925b, abVar2.f183926c);
        C67848au.m98029b(abVar.f183926c, aaVar.f183922a.f183926c, aaVar.f183923b);
    }

    /* renamed from: a */
    public final byte[] mo59992a() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        C67848au.m98028a(jArr, this.f183926c);
        C67848au.m98029b(jArr2, this.f183924a, jArr);
        C67848au.m98029b(jArr3, this.f183925b, jArr);
        byte[] k = C67848au.m98038k(jArr3);
        k[31] = (byte) ((C67831ad.m97982a(jArr2) << 7) ^ k[31]);
        return k;
    }

    public C67829ab(C67828aa aaVar) {
        this();
        m97979b(this, aaVar);
    }

    public C67829ab(C67829ab abVar) {
        this.f183924a = Arrays.copyOf(abVar.f183924a, 10);
        this.f183925b = Arrays.copyOf(abVar.f183925b, 10);
        this.f183926c = Arrays.copyOf(abVar.f183926c, 10);
    }
}
