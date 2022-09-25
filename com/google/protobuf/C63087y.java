package com.google.protobuf;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.protobuf.y */
/* compiled from: PG */
public final class C63087y extends OutputStream {

    /* renamed from: d */
    private static final byte[] f170240d = new byte[0];

    /* renamed from: a */
    public final ArrayList f170241a = new ArrayList();

    /* renamed from: b */
    public byte[] f170242b;

    /* renamed from: c */
    public int f170243c;

    /* renamed from: e */
    private final int f170244e;

    /* renamed from: f */
    private int f170245f;

    public C63087y(int i) {
        this.f170244e = i;
        this.f170242b = new byte[i];
    }

    /* renamed from: d */
    private final void m96135d(int i) {
        this.f170241a.add(new C63086x(this.f170242b));
        int length = this.f170245f + this.f170242b.length;
        this.f170245f = length;
        this.f170242b = new byte[Math.max(this.f170244e, Math.max(i, length >>> 1))];
        this.f170243c = 0;
    }

    /* renamed from: a */
    public final synchronized int mo59164a() {
        return this.f170245f + this.f170243c;
    }

    /* renamed from: b */
    public final synchronized C63088z mo59165b() {
        int i = this.f170243c;
        byte[] bArr = this.f170242b;
        if (i >= bArr.length) {
            this.f170241a.add(new C63086x(this.f170242b));
            this.f170242b = f170240d;
        } else if (i > 0) {
            this.f170241a.add(new C63086x(Arrays.copyOf(bArr, i)));
        }
        this.f170245f += this.f170243c;
        this.f170243c = 0;
        return C63088z.m96152y(this.f170241a);
    }

    /* renamed from: c */
    public final synchronized void mo59166c() {
        this.f170241a.clear();
        this.f170245f = 0;
        this.f170243c = 0;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo59164a())});
    }

    public final synchronized void write(int i) {
        if (this.f170243c == this.f170242b.length) {
            m96135d(1);
        }
        byte[] bArr = this.f170242b;
        int i2 = this.f170243c;
        this.f170243c = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.f170242b;
        int length = bArr2.length;
        int i3 = this.f170243c;
        int i4 = length - i3;
        if (i2 <= i4) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f170243c += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i4);
        int i5 = i2 - i4;
        m96135d(i5);
        System.arraycopy(bArr, i + i4, this.f170242b, 0, i5);
        this.f170243c = i5;
    }
}
