package com.bumptech.glide.p291h;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.bumptech.glide.h.a */
/* compiled from: PG */
final class C5604a extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    private final ByteBuffer f16941a;

    /* renamed from: b */
    private int f16942b = -1;

    public C5604a(ByteBuffer byteBuffer) {
        this.f16941a = byteBuffer;
    }

    public final int available() {
        return this.f16941a.remaining();
    }

    public final synchronized void mark(int i) {
        this.f16942b = this.f16941a.position();
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() {
        if (!this.f16941a.hasRemaining()) {
            return -1;
        }
        return this.f16941a.get() & 255;
    }

    public final synchronized void reset() {
        int i = this.f16942b;
        if (i != -1) {
            this.f16941a.position(i);
        } else {
            throw new IOException("Cannot reset to unset mark position");
        }
    }

    public final long skip(long j) {
        if (!this.f16941a.hasRemaining()) {
            return -1;
        }
        long min = Math.min(j, (long) this.f16941a.remaining());
        ByteBuffer byteBuffer = this.f16941a;
        byteBuffer.position((int) (((long) byteBuffer.position()) + min));
        return min;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (!this.f16941a.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i2, this.f16941a.remaining());
        this.f16941a.get(bArr, i, min);
        return min;
    }
}
