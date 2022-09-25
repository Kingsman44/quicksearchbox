package com.google.p5238v.p5239a;

import com.google.p5238v.p5239a.p5259m.C67849av;
import java.util.Arrays;

/* renamed from: com.google.v.a.ac */
/* compiled from: PG */
final class C67532ac implements Comparable {

    /* renamed from: a */
    private final byte[] f183449a;

    public C67532ac(byte[] bArr) {
        this.f183449a = Arrays.copyOf(bArr, bArr.length);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C67532ac acVar = (C67532ac) obj;
        int length = this.f183449a.length;
        int length2 = acVar.f183449a.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.f183449a;
            if (i >= bArr.length) {
                return 0;
            }
            byte b = bArr[i];
            byte b2 = acVar.f183449a[i];
            if (b != b2) {
                return b - b2;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C67532ac)) {
            return false;
        }
        return Arrays.equals(this.f183449a, ((C67532ac) obj).f183449a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f183449a);
    }

    public final String toString() {
        return C67849av.m98040a(this.f183449a);
    }
}
