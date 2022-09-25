package androidx.media3.extractor.p172k;

import androidx.media3.common.p136b.C2601a;
import java.util.Arrays;

/* renamed from: androidx.media3.extractor.k.x */
/* compiled from: PG */
final class C3571x {

    /* renamed from: a */
    public boolean f11358a;

    /* renamed from: b */
    public byte[] f11359b;

    /* renamed from: c */
    public int f11360c;

    /* renamed from: d */
    private final int f11361d;

    /* renamed from: e */
    private boolean f11362e;

    public C3571x(int i) {
        this.f11361d = i;
        byte[] bArr = new byte[131];
        this.f11359b = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public final void mo7480a(byte[] bArr, int i, int i2) {
        if (this.f11362e) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f11359b;
            int length = bArr2.length;
            int i4 = this.f11360c + i3;
            if (length < i4) {
                this.f11359b = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f11359b, this.f11360c, i3);
            this.f11360c += i3;
        }
    }

    /* renamed from: b */
    public final void mo7481b() {
        this.f11362e = false;
        this.f11358a = false;
    }

    /* renamed from: c */
    public final void mo7482c(int i) {
        boolean z = true;
        C2601a.m6832d(!this.f11362e);
        if (i != this.f11361d) {
            z = false;
        }
        this.f11362e = z;
        if (z) {
            this.f11360c = 3;
            this.f11358a = false;
        }
    }

    /* renamed from: d */
    public final boolean mo7483d(int i) {
        if (!this.f11362e) {
            return false;
        }
        this.f11360c -= i;
        this.f11362e = false;
        this.f11358a = true;
        return true;
    }
}
