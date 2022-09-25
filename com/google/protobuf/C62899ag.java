package com.google.protobuf;

import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.protobuf.ag */
/* compiled from: PG */
public abstract class C62899ag extends C62906an {

    /* renamed from: a */
    final byte[] f169836a;

    /* renamed from: b */
    final int f169837b;

    /* renamed from: c */
    int f169838c;

    /* renamed from: d */
    public int f169839d;

    public C62899ag(int i) {
        if (i >= 0) {
            byte[] bArr = new byte[Math.max(i, 20)];
            this.f169836a = bArr;
            this.f169837b = bArr.length;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    /* renamed from: b */
    public final int mo58753b() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo58754c(byte b) {
        byte[] bArr = this.f169836a;
        int i = this.f169838c;
        this.f169838c = i + 1;
        bArr[i] = b;
        this.f169839d++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo58755d(int i) {
        byte[] bArr = this.f169836a;
        int i2 = this.f169838c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i & PrivateKeyType.INVALID);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >> 8) & PrivateKeyType.INVALID);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >> 16) & PrivateKeyType.INVALID);
        this.f169838c = i5 + 1;
        bArr[i5] = (byte) ((i >> 24) & PrivateKeyType.INVALID);
        this.f169839d += 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo58756e(long j) {
        byte[] bArr = this.f169836a;
        int i = this.f169838c;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) (j & 255));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >> 8) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((j >> 16) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) (255 & (j >> 24)));
        int i6 = i5 + 1;
        bArr[i5] = (byte) (((int) (j >> 32)) & PrivateKeyType.INVALID);
        int i7 = i6 + 1;
        bArr[i6] = (byte) (((int) (j >> 40)) & PrivateKeyType.INVALID);
        int i8 = i7 + 1;
        bArr[i7] = (byte) (((int) (j >> 48)) & PrivateKeyType.INVALID);
        this.f169838c = i8 + 1;
        bArr[i8] = (byte) (((int) (j >> 56)) & PrivateKeyType.INVALID);
        this.f169839d += 8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo58757f(int i) {
        if (C62906an.f169852e) {
            long j = (long) this.f169838c;
            while ((i & -128) != 0) {
                byte[] bArr = this.f169836a;
                int i2 = this.f169838c;
                this.f169838c = i2 + 1;
                C63054fs.m95967f(bArr, (long) i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            byte[] bArr2 = this.f169836a;
            int i3 = this.f169838c;
            this.f169838c = i3 + 1;
            C63054fs.m95967f(bArr2, (long) i3, (byte) i);
            this.f169839d += (int) (((long) this.f169838c) - j);
            return;
        }
        while ((i & -128) != 0) {
            byte[] bArr3 = this.f169836a;
            int i4 = this.f169838c;
            this.f169838c = i4 + 1;
            bArr3[i4] = (byte) ((i & 127) | 128);
            this.f169839d++;
            i >>>= 7;
        }
        byte[] bArr4 = this.f169836a;
        int i5 = this.f169838c;
        this.f169838c = i5 + 1;
        bArr4[i5] = (byte) i;
        this.f169839d++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo58758g(long j) {
        if (C62906an.f169852e) {
            long j2 = (long) this.f169838c;
            while ((j & -128) != 0) {
                byte[] bArr = this.f169836a;
                int i = this.f169838c;
                this.f169838c = i + 1;
                C63054fs.m95967f(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.f169836a;
            int i2 = this.f169838c;
            this.f169838c = i2 + 1;
            C63054fs.m95967f(bArr2, (long) i2, (byte) ((int) j));
            this.f169839d += (int) (((long) this.f169838c) - j2);
            return;
        }
        while ((j & -128) != 0) {
            byte[] bArr3 = this.f169836a;
            int i3 = this.f169838c;
            this.f169838c = i3 + 1;
            bArr3[i3] = (byte) ((((int) j) & 127) | 128);
            this.f169839d++;
            j >>>= 7;
        }
        byte[] bArr4 = this.f169836a;
        int i4 = this.f169838c;
        this.f169838c = i4 + 1;
        bArr4[i4] = (byte) ((int) j);
        this.f169839d++;
    }
}
