package org.chromium.net.p5647a;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

/* renamed from: org.chromium.net.a.d */
/* compiled from: PG */
final class C72420d extends C72427k {

    /* renamed from: a */
    public final C72429m f192608a;

    /* renamed from: b */
    public final ByteBuffer f192609b;

    /* renamed from: c */
    public boolean f192610c;

    /* renamed from: g */
    private final UploadDataProvider f192611g = new C72419c(this);

    public C72420d(int i, C72429m mVar) {
        if (i > 0) {
            this.f192609b = ByteBuffer.allocate(i);
            this.f192608a = mVar;
            return;
        }
        throw new IllegalArgumentException("chunkLength should be greater than 0");
    }

    /* renamed from: f */
    private final void m107085f() {
        if (!this.f192609b.hasRemaining()) {
            mo64154e();
            ByteBuffer byteBuffer = (ByteBuffer) this.f192609b.flip();
            this.f192608a.mo64156a(0);
            mo64153d();
        }
    }

    /* renamed from: a */
    public final UploadDataProvider mo64120a() {
        return this.f192611g;
    }

    /* renamed from: b */
    public final void mo64121b() {
    }

    /* renamed from: c */
    public final void mo64122c() {
    }

    public final void close() {
        this.f192642e = true;
        if (!this.f192610c) {
            this.f192610c = true;
            ByteBuffer byteBuffer = (ByteBuffer) this.f192609b.flip();
        }
    }

    public final void write(int i) {
        m107085f();
        this.f192609b.put((byte) i);
    }

    public final void write(byte[] bArr, int i, int i2) {
        mo64154e();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(i3, this.f192609b.remaining());
            this.f192609b.put(bArr, (i + i2) - i3, min);
            i3 -= min;
            m107085f();
        }
    }
}
