package com.google.android.libraries.storage.p3304a.p3307c.p3308a;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.android.libraries.storage.a.c.a.g */
/* compiled from: PG */
public final class C42746g extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    private final Callable f112004a;

    /* renamed from: b */
    private volatile boolean f112005b = false;

    /* renamed from: c */
    private InputStream f112006c;

    public C42746g(Callable callable) {
        this.f112004a = callable;
    }

    /* renamed from: a */
    private final void m75523a() {
        if (!this.f112005b) {
            this.f112005b = true;
            try {
                this.f112006c = new ByteArrayInputStream((byte[]) this.f112004a.call());
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new IOException(e2);
            }
        }
    }

    public final int available() {
        if (!this.f112005b) {
            return 0;
        }
        return this.f112006c.available();
    }

    public final void close() {
        m75523a();
    }

    public final void mark(int i) {
        if (this.f112005b) {
            this.f112006c.mark(i);
        }
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() {
        m75523a();
        return this.f112006c.read();
    }

    public final void reset() {
        m75523a();
        this.f112006c.reset();
    }

    public final long skip(long j) {
        m75523a();
        return this.f112006c.skip(j);
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr) {
        m75523a();
        return this.f112006c.read(bArr);
    }

    public final int read(byte[] bArr, int i, int i2) {
        m75523a();
        return this.f112006c.read(bArr, i, i2);
    }
}
