package com.google.ads.interactivemedia.p367v3.internal;

import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.ads.interactivemedia.v3.internal.abz */
/* compiled from: PG */
public final class abz extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    private final abx f20225a;

    /* renamed from: b */
    private final acb f20226b;

    /* renamed from: c */
    private final byte[] f20227c;

    /* renamed from: d */
    private boolean f20228d = false;

    /* renamed from: e */
    private boolean f20229e = false;

    /* renamed from: f */
    private long f20230f;

    public abz(abx abx, acb acb) {
        this.f20225a = abx;
        this.f20226b = acb;
        this.f20227c = new byte[1];
    }

    /* renamed from: b */
    private final void m18176b() {
        if (!this.f20228d) {
            this.f20225a.mo14389c(this.f20226b);
            this.f20228d = true;
        }
    }

    /* renamed from: a */
    public final void mo14409a() {
        m18176b();
    }

    public final void close() {
        if (!this.f20229e) {
            this.f20225a.mo14391f();
            this.f20229e = true;
        }
    }

    public final int read() {
        if (read(this.f20227c) == -1) {
            return -1;
        }
        return this.f20227c[0] & 255;
    }

    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        ary.m19464q(!this.f20229e);
        m18176b();
        int a = this.f20225a.mo14388a(bArr, i, i2);
        if (a == -1) {
            return -1;
        }
        this.f20230f += (long) a;
        return a;
    }
}
