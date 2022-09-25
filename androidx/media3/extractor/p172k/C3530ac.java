package androidx.media3.extractor.p172k;

import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2609ah;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3627q;

/* renamed from: androidx.media3.extractor.k.ac */
/* compiled from: PG */
final class C3530ac {

    /* renamed from: a */
    public final C2609ah f11033a = new C2609ah(0);

    /* renamed from: b */
    public final C2604ac f11034b = new C2604ac();

    /* renamed from: c */
    public boolean f11035c;

    /* renamed from: d */
    public boolean f11036d;

    /* renamed from: e */
    public boolean f11037e;

    /* renamed from: f */
    public long f11038f = -9223372036854775807L;

    /* renamed from: g */
    public long f11039g = -9223372036854775807L;

    /* renamed from: h */
    public long f11040h = -9223372036854775807L;

    /* renamed from: a */
    public static long m10194a(C2604ac acVar) {
        C2604ac acVar2 = acVar;
        int i = acVar2.f7235b;
        if (acVar2.f7236c - i < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        acVar2.mo6155w(bArr, 0, 9);
        acVar2.mo6131A(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = (long) b;
                    long j2 = (long) b2;
                    long j3 = (j & 3) << 28;
                    return ((((long) bArr[1]) & 255) << 20) | j3 | (((56 & j) >> 3) << 30) | (((j2 & 248) >> 3) << 15) | ((j2 & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((248 & ((long) b3)) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: c */
    public static final int m10195c(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: b */
    public final void mo7453b(C3327ab abVar) {
        C2604ac acVar = this.f11034b;
        byte[] bArr = C2612ak.f7254f;
        int length = bArr.length;
        acVar.mo6157y(bArr, 0);
        this.f11035c = true;
        ((C3627q) abVar).f11568e = 0;
    }
}
