package com.android.p275j.p276a;

import java.io.ByteArrayOutputStream;

/* renamed from: com.android.j.a.n */
/* compiled from: PG */
public final class C5184n extends ByteArrayOutputStream {

    /* renamed from: a */
    private final C5174d f16461a;

    public C5184n(C5174d dVar, int i) {
        this.f16461a = dVar;
        this.buf = dVar.mo10257b(Math.max(i, 256));
    }

    /* renamed from: a */
    private final void m14141a(int i) {
        if (this.count + i > this.buf.length) {
            C5174d dVar = this.f16461a;
            int i2 = this.count + i;
            byte[] b = dVar.mo10257b(i2 + i2);
            System.arraycopy(this.buf, 0, b, 0, this.count);
            this.f16461a.mo10256a(this.buf);
            this.buf = b;
        }
    }

    public final void close() {
        this.f16461a.mo10256a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.f16461a.mo10256a(this.buf);
    }

    public final synchronized void write(int i) {
        m14141a(1);
        super.write(i);
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        m14141a(i2);
        super.write(bArr, i, i2);
    }
}
