package p5589m;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: m.ab */
/* compiled from: PG */
public final class C71824ab {
    /* renamed from: a */
    public static final void m105127a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* renamed from: b */
    public static final boolean m105128b(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        C69664n.m101061g(bArr, "a");
        C69664n.m101061g(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }
}
