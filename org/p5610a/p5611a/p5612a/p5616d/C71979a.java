package org.p5610a.p5611a.p5612a.p5616d;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.p5610a.p5611a.p5612a.C71989i;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: org.a.a.a.d.a */
/* compiled from: PG */
public class C71979a extends FilterInputStream implements InputStreamRetargetInterface {
    public C71979a(InputStream inputStream) {
        super(inputStream);
    }

    public final int available() {
        try {
            return super.available();
        } catch (IOException e) {
            throw e;
        }
    }

    public void close() {
        C71989i.m105291f(this.in);
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
    }

    public final boolean markSupported() {
        return this.in.markSupported();
    }

    public int read() {
        try {
            return this.in.read();
        } catch (IOException e) {
            throw e;
        }
    }

    public final synchronized void reset() {
        try {
            this.in.reset();
        } catch (IOException e) {
            throw e;
        }
        return;
    }

    public final long skip(long j) {
        try {
            return this.in.skip(j);
        } catch (IOException e) {
            throw e;
        }
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public int read(byte[] bArr) {
        try {
            byte[] bArr2 = C71989i.f191703a;
            return this.in.read(bArr);
        } catch (IOException e) {
            throw e;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.in.read(bArr, i, i2);
        } catch (IOException e) {
            throw e;
        }
    }
}
