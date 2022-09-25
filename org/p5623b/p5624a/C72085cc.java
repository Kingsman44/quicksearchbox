package org.p5623b.p5624a;

import java.io.EOFException;
import java.io.InputStream;

/* renamed from: org.b.a.cc */
/* compiled from: PG */
final class C72085cc extends C72088cf {

    /* renamed from: a */
    public boolean f191900a = true;

    /* renamed from: d */
    private int f191901d;

    /* renamed from: e */
    private int f191902e;

    /* renamed from: f */
    private boolean f191903f = false;

    public C72085cc(InputStream inputStream, int i) {
        super(inputStream, i);
        this.f191901d = inputStream.read();
        int read = inputStream.read();
        this.f191902e = read;
        if (read >= 0) {
            mo63267a();
            return;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    public final boolean mo63267a() {
        if (!this.f191903f && this.f191900a && this.f191901d == 0 && this.f191902e == 0) {
            this.f191903f = true;
            mo63276b();
        }
        return this.f191903f;
    }

    public final int read() {
        if (mo63267a()) {
            return -1;
        }
        int read = this.f191907b.read();
        if (read >= 0) {
            int i = this.f191901d;
            this.f191901d = this.f191902e;
            this.f191902e = read;
            return i;
        }
        throw new EOFException();
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (this.f191900a || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.f191903f) {
            return -1;
        }
        int read = this.f191907b.read(bArr, i + 2, i2 - 2);
        if (read >= 0) {
            bArr[i] = (byte) this.f191901d;
            bArr[i + 1] = (byte) this.f191902e;
            this.f191901d = this.f191907b.read();
            int read2 = this.f191907b.read();
            this.f191902e = read2;
            if (read2 >= 0) {
                return read + 2;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }
}
