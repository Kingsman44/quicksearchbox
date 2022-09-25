package com.bumptech.glide.p291h;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Queue;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.bumptech.glide.h.f */
/* compiled from: PG */
public final class C5619f extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    public static final Queue f16956a = C5632s.m14615h(0);

    /* renamed from: b */
    public InputStream f16957b;

    /* renamed from: c */
    public IOException f16958c;

    /* renamed from: a */
    public final void mo12062a() {
        this.f16958c = null;
        this.f16957b = null;
        Queue queue = f16956a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public final int available() {
        return this.f16957b.available();
    }

    public final void close() {
        this.f16957b.close();
    }

    public final void mark(int i) {
        this.f16957b.mark(i);
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() {
        try {
            return this.f16957b.read();
        } catch (IOException e) {
            this.f16958c = e;
            throw e;
        }
    }

    public final synchronized void reset() {
        this.f16957b.reset();
    }

    public final long skip(long j) {
        try {
            return this.f16957b.skip(j);
        } catch (IOException e) {
            this.f16958c = e;
            throw e;
        }
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr) {
        try {
            return this.f16957b.read(bArr);
        } catch (IOException e) {
            this.f16958c = e;
            throw e;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        try {
            return this.f16957b.read(bArr, i, i2);
        } catch (IOException e) {
            this.f16958c = e;
            throw e;
        }
    }
}
