package com.google.p5238v.p5239a.p5260n;

import com.google.p5238v.p5239a.p5259m.C67849av;
import java.util.Arrays;

/* renamed from: com.google.v.a.n.a */
/* compiled from: PG */
public final class C67898a {

    /* renamed from: a */
    public final byte[] f184076a;

    private C67898a(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.f184076a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    /* renamed from: a */
    public static C67898a m98152a(byte[] bArr) {
        if (bArr != null) {
            return new C67898a(bArr, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    /* renamed from: b */
    public final byte[] mo60031b() {
        byte[] bArr = this.f184076a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C67898a)) {
            return false;
        }
        return Arrays.equals(((C67898a) obj).f184076a, this.f184076a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f184076a);
    }

    public final String toString() {
        String a = C67849av.m98040a(this.f184076a);
        return "Bytes(" + a + ")";
    }
}
