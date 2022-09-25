package com.google.common.p4541l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.common.l.y */
/* compiled from: PG */
public final class C59342y extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    public long f157530a;

    /* renamed from: b */
    private long f157531b = -1;

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.f157531b = this.f157530a;
    }

    public final int read() {
        int read = this.in.read();
        if (read != -1) {
            this.f157530a++;
        }
        return read;
    }

    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f157531b != -1) {
            this.in.reset();
            this.f157530a = this.f157531b;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j) {
        long skip = this.in.skip(j);
        this.f157530a += skip;
        return skip;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59342y(InputStream inputStream) {
        super(inputStream);
        inputStream.getClass();
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            this.f157530a += (long) read;
        }
        return read;
    }
}
