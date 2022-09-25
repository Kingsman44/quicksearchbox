package com.google.p4715m.p4716a.p4717a.p4718a;

import com.google.p4656j.p4657a.C61722f;
import java.math.BigInteger;

/* renamed from: com.google.m.a.a.a.e */
/* compiled from: PG */
final class C62652e {

    /* renamed from: a */
    public final BigInteger f169154a;

    /* renamed from: b */
    public final BigInteger f169155b;

    public C62652e(C61722f fVar) {
        BigInteger a = m94893a(fVar.f166751b);
        this.f169154a = a;
        BigInteger a2 = m94893a(fVar.f166752c);
        this.f169155b = a2;
        C62656i.m94896c(a2.compareTo(a) >= 0, "Bad serial number range: firstSerialNumber is larger than lastSerialNumber.");
    }

    /* renamed from: a */
    private static BigInteger m94893a(long j) {
        BigInteger valueOf = BigInteger.valueOf(Long.MAX_VALUE & j);
        return j < 0 ? valueOf.setBit(63) : valueOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C62652e) {
            C62652e eVar = (C62652e) obj;
            return this.f169154a.equals(eVar.f169154a) && this.f169155b.equals(eVar.f169155b);
        }
    }

    public final int hashCode() {
        return (this.f169154a.hashCode() * 31) + this.f169155b.hashCode();
    }
}
