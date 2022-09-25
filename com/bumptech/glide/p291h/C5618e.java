package com.bumptech.glide.p291h;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.bumptech.glide.h.e */
/* compiled from: PG */
public final class C5618e extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    private final long f16954a;

    /* renamed from: b */
    private int f16955b;

    public C5618e(InputStream inputStream, long j) {
        super(inputStream);
        this.f16954a = j;
    }

    /* renamed from: a */
    private final void m14588a(int i) {
        if (i >= 0) {
            this.f16955b += i;
            return;
        }
        long j = this.f16954a;
        int i2 = this.f16955b;
        if (j - ((long) i2) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + j + ", but read: " + i2);
        }
    }

    public final synchronized int available() {
        return (int) Math.max(this.f16954a - ((long) this.f16955b), (long) this.in.available());
    }

    public final synchronized int read() {
        int read;
        read = super.read();
        m14588a(read >= 0 ? 1 : -1);
        return read;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final synchronized int read(byte[] bArr, int i, int i2) {
        int read;
        read = super.read(bArr, i, i2);
        m14588a(read);
        return read;
    }
}
