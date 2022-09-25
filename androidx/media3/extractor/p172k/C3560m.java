package androidx.media3.extractor.p172k;

import java.util.Arrays;

/* renamed from: androidx.media3.extractor.k.m */
/* compiled from: PG */
final class C3560m {

    /* renamed from: a */
    public static final byte[] f11217a = {0, 0, 1};

    /* renamed from: b */
    public boolean f11218b;

    /* renamed from: c */
    public int f11219c;

    /* renamed from: d */
    public int f11220d;

    /* renamed from: e */
    public int f11221e;

    /* renamed from: f */
    public byte[] f11222f = new byte[128];

    /* renamed from: a */
    public final void mo7472a(byte[] bArr, int i, int i2) {
        if (this.f11218b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f11222f;
            int length = bArr2.length;
            int i4 = this.f11220d + i3;
            if (length < i4) {
                this.f11222f = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f11222f, this.f11220d, i3);
            this.f11220d += i3;
        }
    }

    /* renamed from: b */
    public final void mo7473b() {
        this.f11218b = false;
        this.f11220d = 0;
        this.f11219c = 0;
    }
}
