package org.chromium.net.p5647a;

import java.net.ProtocolException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

/* renamed from: org.chromium.net.a.f */
/* compiled from: PG */
final class C72422f extends C72427k {

    /* renamed from: a */
    public final C72429m f192613a;

    /* renamed from: b */
    public final long f192614b;

    /* renamed from: c */
    public final ByteBuffer f192615c;

    /* renamed from: g */
    private final UploadDataProvider f192616g = new C72421e(this);

    /* renamed from: h */
    private long f192617h;

    public C72422f(long j, C72429m mVar) {
        if (j >= 0) {
            this.f192614b = j;
            this.f192615c = ByteBuffer.allocate((int) Math.min(j, 16384));
            this.f192613a = mVar;
            this.f192617h = 0;
            return;
        }
        throw new IllegalArgumentException("Content length must be larger than 0 for non-chunked upload.");
    }

    /* renamed from: f */
    private final void m107089f(int i) {
        if (this.f192617h + ((long) i) > this.f192614b) {
            long j = this.f192614b;
            long j2 = this.f192617h;
            throw new ProtocolException("expected " + (j - j2) + " bytes but received " + i);
        }
    }

    /* renamed from: g */
    private final void m107090g() {
        if (!this.f192615c.hasRemaining()) {
            m107091h();
        }
    }

    /* renamed from: h */
    private final void m107091h() {
        mo64154e();
        ByteBuffer byteBuffer = (ByteBuffer) this.f192615c.flip();
        this.f192613a.mo64156a(0);
        mo64153d();
    }

    /* renamed from: i */
    private final void m107092i() {
        if (this.f192617h == this.f192614b) {
            m107091h();
        }
    }

    /* renamed from: a */
    public final UploadDataProvider mo64120a() {
        return this.f192616g;
    }

    /* renamed from: b */
    public final void mo64121b() {
        if (this.f192617h < this.f192614b) {
            throw new ProtocolException("Content received is less than Content-Length.");
        }
    }

    /* renamed from: c */
    public final void mo64122c() {
    }

    public final void write(int i) {
        mo64154e();
        m107089f(1);
        m107090g();
        this.f192615c.put((byte) i);
        this.f192617h++;
        m107092i();
    }

    public final void write(byte[] bArr, int i, int i2) {
        mo64154e();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        m107089f(i2);
        int i3 = i2;
        while (i3 > 0) {
            m107090g();
            int min = Math.min(i3, this.f192615c.remaining());
            this.f192615c.put(bArr, (i + i2) - i3, min);
            i3 -= min;
        }
        this.f192617h += (long) i2;
        m107092i();
    }
}
