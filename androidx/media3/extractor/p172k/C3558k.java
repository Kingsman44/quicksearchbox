package androidx.media3.extractor.p172k;

import java.util.Arrays;

/* renamed from: androidx.media3.extractor.k.k */
/* compiled from: PG */
final class C3558k {

    /* renamed from: a */
    public static final byte[] f11195a = {0, 0, 1};

    /* renamed from: b */
    public boolean f11196b;

    /* renamed from: c */
    public int f11197c;

    /* renamed from: d */
    public int f11198d;

    /* renamed from: e */
    public byte[] f11199e = new byte[128];

    /* renamed from: a */
    public final void mo7471a(byte[] bArr, int i, int i2) {
        if (this.f11196b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f11199e;
            int length = bArr2.length;
            int i4 = this.f11197c + i3;
            if (length < i4) {
                this.f11199e = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f11199e, this.f11197c, i3);
            this.f11197c += i3;
        }
    }
}
