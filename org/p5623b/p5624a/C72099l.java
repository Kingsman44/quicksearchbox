package org.p5623b.p5624a;

import java.math.BigInteger;
import java.util.Arrays;
import org.p5623b.p5629b.C72123b;
import org.p5623b.p5629b.C72129d;

/* renamed from: org.b.a.l */
/* compiled from: PG */
public final class C72099l extends C72108u {

    /* renamed from: a */
    public final byte[] f191927a;

    /* renamed from: b */
    private final int f191928b;

    public C72099l(long j) {
        this.f191927a = BigInteger.valueOf(j).toByteArray();
        this.f191928b = 0;
    }

    /* renamed from: e */
    static int m105580e(byte[] bArr) {
        int length = bArr.length - 1;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (bArr[i] != (bArr[i2] >> 7)) {
                break;
            }
            i = i2;
        }
        return i;
    }

    /* renamed from: j */
    public static C72099l m105581j(Object obj) {
        if (obj == null || (obj instanceof C72099l)) {
            return (C72099l) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C72099l) m105626q((byte[]) obj);
            } catch (Exception e) {
                throw new IllegalArgumentException("encoding error in getInstance: ".concat(String.valueOf(e.toString())));
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
        }
    }

    /* renamed from: l */
    static boolean m105582l(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            return length != 1 && bArr[0] == (bArr[1] >> 7) && !C72129d.m105662a();
        }
        return true;
    }

    /* renamed from: a */
    public final int mo63217a() {
        return C72090ch.m105544a(this.f191927a.length) + 1 + this.f191927a.length;
    }

    /* renamed from: b */
    public final void mo63218b(C72106s sVar, boolean z) {
        sVar.mo63301e(z, 2, this.f191927a);
    }

    /* renamed from: c */
    public final boolean mo63219c(C72108u uVar) {
        if (!(uVar instanceof C72099l)) {
            return false;
        }
        return Arrays.equals(this.f191927a, ((C72099l) uVar).f191927a);
    }

    /* renamed from: d */
    public final boolean mo63220d() {
        return false;
    }

    public final int hashCode() {
        return C72123b.m105659a(this.f191927a);
    }

    /* renamed from: i */
    public final BigInteger mo63287i() {
        return new BigInteger(this.f191927a);
    }

    /* renamed from: k */
    public final boolean mo63288k(BigInteger bigInteger) {
        if (bigInteger == null) {
            return false;
        }
        byte[] bArr = this.f191927a;
        int i = this.f191928b;
        int length = bArr.length;
        int max = Math.max(i, length - 4);
        byte b = bArr[max];
        while (true) {
            max++;
            if (max >= length) {
                break;
            }
            b = (b << 8) | (bArr[max] & 255);
        }
        if (b != bigInteger.intValue() || !mo63287i().equals(bigInteger)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return mo63287i().toString();
    }

    public C72099l(byte[] bArr) {
        if (!m105582l(bArr)) {
            this.f191927a = bArr;
            this.f191928b = m105580e(bArr);
            return;
        }
        throw new IllegalArgumentException("malformed integer");
    }
}
