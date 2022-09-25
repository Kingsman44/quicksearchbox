package org.p5623b.p5624a;

import java.util.Arrays;

/* renamed from: org.b.a.as */
/* compiled from: PG */
public final class C72033as extends C72108u implements C72017ac {

    /* renamed from: a */
    private final char[] f191791a;

    public C72033as(char[] cArr) {
        this.f191791a = cArr;
    }

    /* renamed from: a */
    public final int mo63217a() {
        int length = this.f191791a.length;
        int a = C72090ch.m105544a(length + length);
        int length2 = this.f191791a.length;
        return a + 1 + length2 + length2;
    }

    /* renamed from: b */
    public final void mo63218b(C72106s sVar, boolean z) {
        int length = this.f191791a.length;
        if (z) {
            sVar.f191935a.write(30);
        }
        sVar.mo63304h(length + length);
        byte[] bArr = new byte[8];
        int i = length & -4;
        int i2 = 0;
        while (i2 < i) {
            char[] cArr = this.f191791a;
            char c = cArr[i2];
            char c2 = cArr[i2 + 1];
            char c3 = cArr[i2 + 2];
            char c4 = cArr[i2 + 3];
            i2 += 4;
            bArr[0] = (byte) (c >> 8);
            bArr[1] = (byte) c;
            bArr[2] = (byte) (c2 >> 8);
            bArr[3] = (byte) c2;
            bArr[4] = (byte) (c3 >> 8);
            bArr[5] = (byte) c3;
            bArr[6] = (byte) (c4 >> 8);
            bArr[7] = (byte) c4;
            sVar.f191935a.write(bArr, 0, 8);
        }
        if (i2 < length) {
            int i3 = 0;
            do {
                char c5 = this.f191791a[i2];
                i2++;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (c5 >> 8);
                i3 = i4 + 1;
                bArr[i4] = (byte) c5;
            } while (i2 < length);
            sVar.f191935a.write(bArr, 0, i3);
        }
    }

    /* renamed from: c */
    public final boolean mo63219c(C72108u uVar) {
        if (!(uVar instanceof C72033as)) {
            return false;
        }
        return Arrays.equals(this.f191791a, ((C72033as) uVar).f191791a);
    }

    /* renamed from: d */
    public final boolean mo63220d() {
        return false;
    }

    /* renamed from: e */
    public final String mo63226e() {
        return new String(this.f191791a);
    }

    public final int hashCode() {
        char[] cArr = this.f191791a;
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    public final String toString() {
        return mo63226e();
    }
}
