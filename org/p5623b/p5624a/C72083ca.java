package org.p5623b.p5624a;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.p5623b.p5629b.p5631b.C72124a;

/* renamed from: org.b.a.ca */
/* compiled from: PG */
final class C72083ca extends C72088cf {

    /* renamed from: d */
    private static final byte[] f191897d = new byte[0];

    /* renamed from: a */
    public int f191898a;

    /* renamed from: e */
    private final int f191899e;

    public C72083ca(InputStream inputStream, int i, int i2) {
        super(inputStream, i2);
        this.f191899e = i;
        this.f191898a = i;
        if (i == 0) {
            mo63276b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final byte[] mo63264a() {
        int i = this.f191898a;
        if (i == 0) {
            return f191897d;
        }
        int i2 = this.f191908c;
        if (i < i2) {
            byte[] bArr = new byte[i];
            int a = i - C72124a.m105661a(this.f191907b, bArr, i);
            this.f191898a = a;
            if (a == 0) {
                mo63276b();
                return bArr;
            }
            int i3 = this.f191899e;
            int i4 = this.f191898a;
            throw new EOFException("DEF length " + i3 + " object truncated by " + i4);
        }
        throw new IOException("corrupted stream - out of bounds length found: " + i + " >= " + i2);
    }

    public final int read() {
        if (this.f191898a == 0) {
            return -1;
        }
        int read = this.f191907b.read();
        if (read >= 0) {
            int i = this.f191898a - 1;
            this.f191898a = i;
            if (i == 0) {
                mo63276b();
            }
            return read;
        }
        throw new EOFException("DEF length " + this.f191899e + " object truncated by " + this.f191898a);
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f191898a;
        if (i3 == 0) {
            return -1;
        }
        int read = this.f191907b.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            int i4 = this.f191898a - read;
            this.f191898a = i4;
            if (i4 == 0) {
                mo63276b();
            }
            return read;
        }
        int i5 = this.f191899e;
        int i6 = this.f191898a;
        throw new EOFException("DEF length " + i5 + " object truncated by " + i6);
    }
}
