package androidx.media3.common.p136b;

import java.nio.charset.Charset;
import org.chromium.net.PrivateKeyType;

/* renamed from: androidx.media3.common.b.ab */
/* compiled from: PG */
public final class C2603ab {

    /* renamed from: a */
    public byte[] f7230a;

    /* renamed from: b */
    public int f7231b;

    /* renamed from: c */
    public int f7232c;

    /* renamed from: d */
    private int f7233d;

    public C2603ab() {
        this.f7230a = C2612ak.f7254f;
    }

    public C2603ab(byte[] bArr, int i) {
        this.f7230a = bArr;
        this.f7233d = i;
    }

    /* renamed from: a */
    public final int mo6116a() {
        return ((this.f7233d - this.f7231b) * 8) - this.f7232c;
    }

    /* renamed from: b */
    public final int mo6117b() {
        C2601a.m6832d(this.f7232c == 0);
        return this.f7231b;
    }

    /* renamed from: c */
    public final int mo6118c() {
        return (this.f7231b * 8) + this.f7232c;
    }

    /* renamed from: d */
    public final int mo6119d(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f7232c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f7232c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f7232c = i4;
            byte[] bArr = this.f7230a;
            int i5 = this.f7231b;
            this.f7231b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f7230a;
        int i6 = this.f7231b;
        int i7 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f7232c = 0;
            this.f7231b = i6 + 1;
        }
        mo6121f();
        return i7;
    }

    /* renamed from: e */
    public final String mo6120e(int i, Charset charset) {
        byte[] bArr = new byte[i];
        mo6130o(bArr, i);
        return new String(bArr, charset);
    }

    /* renamed from: f */
    public final void mo6121f() {
        int i;
        int i2 = this.f7231b;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.f7233d) || (i2 == i && this.f7232c == 0))) {
            z = true;
        }
        C2601a.m6832d(z);
    }

    /* renamed from: g */
    public final void mo6122g() {
        if (this.f7232c != 0) {
            this.f7232c = 0;
            this.f7231b++;
            mo6121f();
        }
    }

    /* renamed from: h */
    public final void mo6123h(byte[] bArr, int i) {
        this.f7230a = bArr;
        this.f7231b = 0;
        this.f7232c = 0;
        this.f7233d = i;
    }

    /* renamed from: i */
    public final void mo6124i(int i) {
        int i2 = i / 8;
        this.f7231b = i2;
        this.f7232c = i - (i2 * 8);
        mo6121f();
    }

    /* renamed from: j */
    public final void mo6125j() {
        int i = this.f7232c + 1;
        this.f7232c = i;
        if (i == 8) {
            this.f7232c = 0;
            this.f7231b++;
        }
        mo6121f();
    }

    /* renamed from: k */
    public final void mo6126k(int i) {
        int i2 = i / 8;
        int i3 = this.f7231b + i2;
        this.f7231b = i3;
        int i4 = this.f7232c + (i - (i2 * 8));
        this.f7232c = i4;
        if (i4 > 7) {
            this.f7231b = i3 + 1;
            this.f7232c = i4 - 8;
        }
        mo6121f();
    }

    /* renamed from: l */
    public final void mo6127l(int i) {
        C2601a.m6832d(this.f7232c == 0);
        this.f7231b += i;
        mo6121f();
    }

    /* renamed from: m */
    public final boolean mo6128m() {
        boolean z = (this.f7230a[this.f7231b] & (128 >> this.f7232c)) != 0;
        mo6125j();
        return z;
    }

    /* renamed from: n */
    public final void mo6129n(byte[] bArr, int i) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.f7230a;
            int i4 = this.f7231b;
            int i5 = i4 + 1;
            this.f7231b = i5;
            byte b = bArr2[i4];
            int i6 = this.f7232c;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 != 0) {
            byte b3 = (byte) (bArr[i2] & (PrivateKeyType.INVALID >> i7));
            bArr[i2] = b3;
            int i8 = this.f7232c;
            if (i8 + i7 > 8) {
                byte[] bArr3 = this.f7230a;
                int i9 = this.f7231b;
                this.f7231b = i9 + 1;
                b3 = (byte) (b3 | ((bArr3[i9] & 255) << i8));
                bArr[i2] = b3;
                i8 -= 8;
            }
            int i10 = i8 + i7;
            this.f7232c = i10;
            byte[] bArr4 = this.f7230a;
            int i11 = this.f7231b;
            bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | b3);
            if (i10 == 8) {
                this.f7232c = 0;
                this.f7231b = i11 + 1;
            }
            mo6121f();
        }
    }

    /* renamed from: o */
    public final void mo6130o(byte[] bArr, int i) {
        C2601a.m6832d(this.f7232c == 0);
        System.arraycopy(this.f7230a, this.f7231b, bArr, 0, i);
        this.f7231b += i;
        mo6121f();
    }
}
