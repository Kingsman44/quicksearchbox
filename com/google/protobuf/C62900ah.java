package com.google.protobuf;

import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.protobuf.ah */
/* compiled from: PG */
class C62900ah extends C62906an {

    /* renamed from: a */
    public int f169840a;

    /* renamed from: b */
    private final byte[] f169841b;

    /* renamed from: c */
    private final int f169842c;

    public C62900ah(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            int length = bArr.length;
            int i3 = i + i2;
            if ((i | i2 | (length - i3)) >= 0) {
                this.f169841b = bArr;
                this.f169840a = i;
                this.f169842c = i3;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }
        throw new NullPointerException("buffer");
    }

    /* renamed from: X */
    public final void mo58759X() {
    }

    /* renamed from: Z */
    public final void mo58761Z(int i, boolean z) {
        mo58780w(i << 3);
        mo58760Y(z ? (byte) 1 : 0);
    }

    /* renamed from: a */
    public final void mo58762a(byte[] bArr, int i, int i2) {
        mo58764e(bArr, i, i2);
    }

    /* renamed from: aa */
    public final void mo58763aa(int i, C63088z zVar) {
        mo58780w((i << 3) | 2);
        mo58765h(zVar);
    }

    /* renamed from: b */
    public final int mo58753b() {
        return this.f169842c - this.f169840a;
    }

    /* renamed from: h */
    public final void mo58765h(C63088z zVar) {
        mo58780w(zVar.mo59031d());
        zVar.mo59045q(this);
    }

    /* renamed from: i */
    public final void mo58766i(int i, int i2) {
        mo58780w((i << 3) | 5);
        mo58767j(i2);
    }

    /* renamed from: j */
    public final void mo58767j(int i) {
        try {
            byte[] bArr = this.f169841b;
            int i2 = this.f169840a;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & PrivateKeyType.INVALID);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & PrivateKeyType.INVALID);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & PrivateKeyType.INVALID);
            this.f169840a = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & PrivateKeyType.INVALID);
        } catch (IndexOutOfBoundsException e) {
            throw new C62902aj(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f169840a), Integer.valueOf(this.f169842c), 1}), e);
        }
    }

    /* renamed from: k */
    public final void mo58768k(int i, long j) {
        mo58780w((i << 3) | 1);
        mo58769l(j);
    }

    /* renamed from: l */
    public final void mo58769l(long j) {
        try {
            byte[] bArr = this.f169841b;
            int i = this.f169840a;
            int i2 = i + 1;
            bArr[i] = (byte) (((int) j) & PrivateKeyType.INVALID);
            int i3 = i2 + 1;
            bArr[i2] = (byte) (((int) (j >> 8)) & PrivateKeyType.INVALID);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((int) (j >> 16)) & PrivateKeyType.INVALID);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (((int) (j >> 24)) & PrivateKeyType.INVALID);
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & PrivateKeyType.INVALID);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & PrivateKeyType.INVALID);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & PrivateKeyType.INVALID);
            this.f169840a = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & PrivateKeyType.INVALID);
        } catch (IndexOutOfBoundsException e) {
            throw new C62902aj(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f169840a), Integer.valueOf(this.f169842c), 1}), e);
        }
    }

    /* renamed from: m */
    public final void mo58770m(int i, int i2) {
        mo58780w(i << 3);
        mo58771n(i2);
    }

    /* renamed from: n */
    public final void mo58771n(int i) {
        if (i >= 0) {
            mo58780w(i);
        } else {
            mo58782y((long) i);
        }
    }

    /* renamed from: o */
    public final void mo58772o(int i, MessageLite messageLite, C63022en enVar) {
        mo58780w((i << 3) | 2);
        mo58780w(((C62947c) messageLite).getSerializedSize(enVar));
        enVar.mo59002m(messageLite, this.f169853f);
    }

    /* renamed from: p */
    public final void mo58773p(MessageLite messageLite) {
        mo58780w(messageLite.getSerializedSize());
        messageLite.writeTo((C62906an) this);
    }

    /* renamed from: q */
    public final void mo58774q(int i, MessageLite messageLite) {
        mo58780w(11);
        mo58779v(2, i);
        mo58780w(26);
        mo58773p(messageLite);
        mo58780w(12);
    }

    /* renamed from: r */
    public final void mo58775r(int i, C63088z zVar) {
        mo58780w(11);
        mo58779v(2, i);
        mo58763aa(3, zVar);
        mo58780w(12);
    }

    /* renamed from: s */
    public final void mo58776s(int i, String str) {
        mo58780w((i << 3) | 2);
        mo58777t(str);
    }

    /* renamed from: t */
    public final void mo58777t(String str) {
        int i = this.f169840a;
        try {
            int N = m95321N(str.length() * 3);
            int N2 = m95321N(str.length());
            if (N2 == N) {
                int i2 = i + N2;
                this.f169840a = i2;
                int a = C63059fx.f170178a.mo59143a(str, this.f169841b, i2, this.f169842c - i2);
                this.f169840a = i;
                mo58780w((a - i) - N2);
                this.f169840a = a;
                return;
            }
            mo58780w(C63059fx.m95998a(str));
            byte[] bArr = this.f169841b;
            int i3 = this.f169840a;
            this.f169840a = C63059fx.f170178a.mo59143a(str, bArr, i3, this.f169842c - i3);
        } catch (C63058fw e) {
            this.f169840a = i;
            mo58789U(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new C62902aj((Throwable) e2);
        }
    }

    /* renamed from: u */
    public final void mo58778u(int i, int i2) {
        mo58780w((i << 3) | i2);
    }

    /* renamed from: v */
    public final void mo58779v(int i, int i2) {
        mo58780w(i << 3);
        mo58780w(i2);
    }

    /* renamed from: x */
    public final void mo58781x(int i, long j) {
        mo58780w(i << 3);
        mo58782y(j);
    }

    /* renamed from: z */
    public final void mo58783z(byte[] bArr, int i) {
        mo58780w(i);
        mo58764e(bArr, 0, i);
    }

    /* renamed from: Y */
    public final void mo58760Y(byte b) {
        try {
            byte[] bArr = this.f169841b;
            int i = this.f169840a;
            this.f169840a = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new C62902aj(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f169840a), Integer.valueOf(this.f169842c), 1}), e);
        }
    }

    /* renamed from: e */
    public final void mo58764e(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.f169841b, this.f169840a, i2);
            this.f169840a += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C62902aj(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f169840a), Integer.valueOf(this.f169842c), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: w */
    public final void mo58780w(int i) {
        while ((i & -128) != 0) {
            byte[] bArr = this.f169841b;
            int i2 = this.f169840a;
            this.f169840a = i2 + 1;
            bArr[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f169841b;
            int i3 = this.f169840a;
            this.f169840a = i3 + 1;
            bArr2[i3] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new C62902aj(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f169840a), Integer.valueOf(this.f169842c), 1}), e);
        }
    }

    /* renamed from: y */
    public final void mo58782y(long j) {
        if (!C62906an.f169852e || this.f169842c - this.f169840a < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f169841b;
                int i = this.f169840a;
                this.f169840a = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f169841b;
                int i2 = this.f169840a;
                this.f169840a = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new C62902aj(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f169840a), Integer.valueOf(this.f169842c), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f169841b;
                int i3 = this.f169840a;
                this.f169840a = i3 + 1;
                C63054fs.m95967f(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f169841b;
            int i4 = this.f169840a;
            this.f169840a = i4 + 1;
            C63054fs.m95967f(bArr4, (long) i4, (byte) ((int) j));
        }
    }
}
