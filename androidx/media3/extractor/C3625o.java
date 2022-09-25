package androidx.media3.extractor;

import androidx.media3.common.p136b.C2612ak;
import java.util.Arrays;

/* renamed from: androidx.media3.extractor.o */
/* compiled from: PG */
public final class C3625o implements C3364bb {

    /* renamed from: a */
    public final int f11551a;

    /* renamed from: b */
    public final int[] f11552b;

    /* renamed from: c */
    public final long[] f11553c;

    /* renamed from: d */
    public final long[] f11554d;

    /* renamed from: e */
    public final long[] f11555e;

    /* renamed from: f */
    private final long f11556f;

    public C3625o(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f11552b = iArr;
        this.f11553c = jArr;
        this.f11554d = jArr2;
        this.f11555e = jArr3;
        int length = iArr.length;
        this.f11551a = length;
        if (length > 0) {
            int i = length - 1;
            this.f11556f = jArr2[i] + jArr3[i];
            return;
        }
        this.f11556f = 0;
    }

    /* renamed from: b */
    public final C3351az mo7324b(long j) {
        int d = mo7632d(j);
        C3365bc bcVar = new C3365bc(this.f11555e[d], this.f11553c[d]);
        if (bcVar.f10174b >= j || d == this.f11551a - 1) {
            return new C3351az(bcVar, bcVar);
        }
        int i = d + 1;
        return new C3351az(bcVar, new C3365bc(this.f11555e[i], this.f11553c[i]));
    }

    /* renamed from: d */
    public final int mo7632d(long j) {
        return C2612ak.m6973aw(this.f11555e, j, true);
    }

    /* renamed from: r */
    public final long mo7325r() {
        return this.f11556f;
    }

    /* renamed from: t */
    public final boolean mo7326t() {
        return true;
    }

    public final String toString() {
        int i = this.f11551a;
        String arrays = Arrays.toString(this.f11552b);
        String arrays2 = Arrays.toString(this.f11553c);
        String arrays3 = Arrays.toString(this.f11555e);
        String arrays4 = Arrays.toString(this.f11554d);
        return "ChunkIndex(length=" + i + ", sizes=" + arrays + ", offsets=" + arrays2 + ", timeUs=" + arrays3 + ", durationsUs=" + arrays4 + ")";
    }
}
