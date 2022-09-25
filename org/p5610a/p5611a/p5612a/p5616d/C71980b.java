package org.p5610a.p5611a.p5612a.p5616d;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.p5610a.p5611a.p5612a.C71989i;

/* renamed from: org.a.a.a.d.b */
/* compiled from: PG */
public final class C71980b extends C71979a {

    /* renamed from: a */
    private final OutputStream f191689a;

    /* renamed from: b */
    private final boolean f191690b = true;

    public C71980b(InputStream inputStream, OutputStream outputStream) {
        super(inputStream);
        this.f191689a = outputStream;
    }

    public final void close() {
        try {
            C71989i.m105291f(this.in);
            if (this.f191690b) {
                this.f191689a.close();
            }
        } catch (Throwable th) {
            if (this.f191690b) {
                this.f191689a.close();
            }
            throw th;
        }
    }

    public final int read() {
        try {
            int read = this.in.read();
            if (read != -1) {
                this.f191689a.write(read);
            }
            return read;
        } catch (IOException e) {
            throw e;
        }
    }

    public final int read(byte[] bArr) {
        try {
            byte[] bArr2 = C71989i.f191703a;
            int read = this.in.read(bArr);
            if (read != -1) {
                this.f191689a.write(bArr, 0, read);
            }
            return read;
        } catch (IOException e) {
            throw e;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        try {
            int read = this.in.read(bArr, i, i2);
            if (read != -1) {
                this.f191689a.write(bArr, i, read);
            }
            return read;
        } catch (IOException e) {
            throw e;
        }
    }
}
