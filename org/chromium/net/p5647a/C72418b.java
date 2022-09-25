package org.chromium.net.p5647a;

import java.net.ProtocolException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

/* renamed from: org.chromium.net.a.b */
/* compiled from: PG */
final class C72418b extends C72427k {

    /* renamed from: a */
    public final int f192603a;

    /* renamed from: b */
    public ByteBuffer f192604b;

    /* renamed from: c */
    public boolean f192605c;

    /* renamed from: g */
    private final UploadDataProvider f192606g;

    public C72418b() {
        this.f192606g = new C72417a(this);
        this.f192603a = -1;
        this.f192604b = ByteBuffer.allocate(16384);
    }

    /* renamed from: f */
    private final void m107081f(int i) {
        if (this.f192603a != -1 && this.f192604b.position() + i > this.f192603a) {
            int i2 = this.f192603a;
            throw new ProtocolException("exceeded content-length limit of " + i2 + " bytes");
        } else if (this.f192605c) {
            throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for writing after connect");
        } else if (this.f192603a == -1 && this.f192604b.limit() - this.f192604b.position() <= i) {
            int capacity = this.f192604b.capacity();
            ByteBuffer allocate = ByteBuffer.allocate(Math.max(capacity + capacity, this.f192604b.capacity() + i));
            ByteBuffer byteBuffer = (ByteBuffer) this.f192604b.flip();
            allocate.put(this.f192604b);
            this.f192604b = allocate;
        }
    }

    /* renamed from: a */
    public final UploadDataProvider mo64120a() {
        return this.f192606g;
    }

    /* renamed from: b */
    public final void mo64121b() {
    }

    /* renamed from: c */
    public final void mo64122c() {
        this.f192605c = true;
        if (this.f192604b.position() >= this.f192603a) {
            ByteBuffer byteBuffer = (ByteBuffer) this.f192604b.flip();
            return;
        }
        throw new ProtocolException("Content received is less than Content-Length");
    }

    public final void write(int i) {
        mo64154e();
        m107081f(1);
        this.f192604b.put((byte) i);
    }

    public C72418b(long j) {
        this.f192606g = new C72417a(this);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2GB.");
        } else if (j >= 0) {
            int i = (int) j;
            this.f192603a = i;
            this.f192604b = ByteBuffer.allocate(i);
        } else {
            throw new IllegalArgumentException("Content length < 0.");
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        mo64154e();
        m107081f(i2);
        this.f192604b.put(bArr, i, i2);
    }
}
