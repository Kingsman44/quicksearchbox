package com.google.protobuf;

import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.protobuf.el */
/* compiled from: PG */
final class C63020el extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    final /* synthetic */ C63021em f170105a;

    /* renamed from: b */
    private C63019ek f170106b;

    /* renamed from: c */
    private C63085w f170107c;

    /* renamed from: d */
    private int f170108d;

    /* renamed from: e */
    private int f170109e;

    /* renamed from: f */
    private int f170110f;

    /* renamed from: g */
    private int f170111g;

    public C63020el(C63021em emVar) {
        this.f170105a = emVar;
        m95766d();
    }

    /* renamed from: a */
    private final int m95763a() {
        return this.f170105a.f170114d - (this.f170110f + this.f170109e);
    }

    /* renamed from: b */
    private final int m95764b(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            m95765c();
            if (this.f170107c == null) {
                break;
            }
            int min = Math.min(this.f170108d - this.f170109e, i3);
            if (bArr != null) {
                this.f170107c.mo59172L(bArr, this.f170109e, i, min);
                i += min;
            }
            this.f170109e += min;
            i3 -= min;
        }
        return i2 - i3;
    }

    /* renamed from: c */
    private final void m95765c() {
        int i;
        if (this.f170107c != null && this.f170109e == (i = this.f170108d)) {
            this.f170110f += i;
            int i2 = 0;
            this.f170109e = 0;
            if (this.f170106b.hasNext()) {
                C63085w a = this.f170106b.next();
                this.f170107c = a;
                i2 = a.mo59031d();
            } else {
                this.f170107c = null;
            }
            this.f170108d = i2;
        }
    }

    /* renamed from: d */
    private final void m95766d() {
        C63019ek ekVar = new C63019ek(this.f170105a);
        this.f170106b = ekVar;
        C63085w a = ekVar.next();
        this.f170107c = a;
        this.f170108d = a.mo59031d();
        this.f170109e = 0;
        this.f170110f = 0;
    }

    public final int available() {
        return m95763a();
    }

    public final void mark(int i) {
        this.f170111g = this.f170110f + this.f170109e;
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() {
        m95765c();
        C63085w wVar = this.f170107c;
        if (wVar == null) {
            return -1;
        }
        int i = this.f170109e;
        this.f170109e = i + 1;
        return wVar.mo59029a(i) & 255;
    }

    public final synchronized void reset() {
        m95766d();
        m95764b((byte[]) null, 0, this.f170111g);
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final long skip(long j) {
        if (j >= 0) {
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return (long) m95764b((byte[]) null, 0, (int) j);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        int b = m95764b(bArr, i, i2);
        if (b == 0) {
            return (i2 > 0 || m95763a() == 0) ? -1 : 0;
        }
        return b;
    }
}
