package androidx.media3.extractor.p172k;

import androidx.media3.common.p136b.C2609ah;
import androidx.media3.extractor.C3412h;
import androidx.media3.extractor.C3583m;

/* renamed from: androidx.media3.extractor.k.ab */
/* compiled from: PG */
final class C3529ab extends C3583m {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3529ab(C2609ah ahVar, long j, long j2) {
        super(new C3412h(), new C3528aa(ahVar), j, j + 1, 0, j2, 188, 1000);
        C2609ah ahVar2 = ahVar;
    }

    /* renamed from: g */
    public static int m10193g(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
