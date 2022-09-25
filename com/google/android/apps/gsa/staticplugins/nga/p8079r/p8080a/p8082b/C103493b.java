package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.p8082b;

import com.google.protobuf.C63088z;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Set;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.b.b */
/* compiled from: PG */
public final class C103493b extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    public final Object f288393a = new Object();

    /* renamed from: b */
    public final ByteArrayOutputStream f288394b = new ByteArrayOutputStream();

    /* renamed from: c */
    private final InputStream f288395c;

    /* renamed from: d */
    private final Set f288396d = new HashSet();

    public C103493b(InputStream inputStream) {
        this.f288395c = inputStream;
    }

    /* renamed from: a */
    private final void m171452a(byte[] bArr, int i, int i2) {
        C63088z.m96142D(bArr, i, i2);
        for (C103492a b : this.f288396d) {
            b.mo93801b();
        }
    }

    public final int available() {
        return this.f288395c.available();
    }

    public final void close() {
        this.f288395c.close();
        synchronized (this.f288393a) {
            for (C103492a a : this.f288396d) {
                a.mo93800a();
            }
            this.f288396d.clear();
        }
    }

    public final synchronized void mark(int i) {
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() {
        int read = this.f288395c.read();
        if (read != -1) {
            synchronized (this.f288393a) {
                this.f288394b.write(read);
                m171452a(new byte[]{(byte) read}, 0, 1);
            }
        }
        return read;
    }

    public final synchronized void reset() {
        throw new IOException("mark/reset not supported");
    }

    public final long skip(long j) {
        return this.f288395c.skip(j);
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr) {
        int read = this.f288395c.read(bArr);
        if (read != -1) {
            synchronized (this.f288393a) {
                this.f288394b.write(bArr, 0, read);
                m171452a(bArr, 0, read);
            }
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.f288395c.read(bArr, i, i2);
        if (read != -1) {
            synchronized (this.f288393a) {
                this.f288394b.write(bArr, i, read);
                m171452a(bArr, i, read);
            }
        }
        return read;
    }
}
