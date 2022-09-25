package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: io.grpc.e.ij */
/* compiled from: PG */
final class C70583ij extends C70492f {

    /* renamed from: a */
    final ByteBuffer f188159a;

    public C70583ij(ByteBuffer byteBuffer) {
        C58838bb.m90866a(byteBuffer, "bytes");
        this.f188159a = byteBuffer;
    }

    /* renamed from: b */
    public final void mo62093b() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f188159a.mark();
    }

    /* renamed from: c */
    public final void mo62094c() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f188159a.reset();
    }

    /* renamed from: d */
    public final boolean mo62096d() {
        return true;
    }

    /* renamed from: f */
    public final int mo62098f() {
        mo62209a(1);
        return this.f188159a.get() & 255;
    }

    /* renamed from: g */
    public final int mo62099g() {
        return this.f188159a.remaining();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C70580ig mo62100h(int i) {
        mo62209a(i);
        ByteBuffer duplicate = this.f188159a.duplicate();
        duplicate.limit(this.f188159a.position() + i);
        ByteBuffer byteBuffer = this.f188159a;
        byteBuffer.position(byteBuffer.position() + i);
        return new C70583ij(duplicate);
    }

    /* renamed from: j */
    public final void mo62102j(ByteBuffer byteBuffer) {
        C58838bb.m90866a(byteBuffer, "dest");
        int remaining = byteBuffer.remaining();
        mo62209a(remaining);
        int limit = this.f188159a.limit();
        ByteBuffer byteBuffer2 = this.f188159a;
        byteBuffer2.limit(byteBuffer2.position() + remaining);
        byteBuffer.put(this.f188159a);
        ByteBuffer byteBuffer3 = (ByteBuffer) this.f188159a.limit(limit);
    }

    /* renamed from: k */
    public final void mo62103k(OutputStream outputStream, int i) {
        mo62209a(i);
        if (this.f188159a.hasArray()) {
            outputStream.write(this.f188159a.array(), this.f188159a.arrayOffset() + this.f188159a.position(), i);
            ByteBuffer byteBuffer = this.f188159a;
            byteBuffer.position(byteBuffer.position() + i);
            return;
        }
        byte[] bArr = new byte[i];
        this.f188159a.get(bArr);
        outputStream.write(bArr);
    }

    /* renamed from: l */
    public final void mo62104l(byte[] bArr, int i, int i2) {
        mo62209a(i2);
        this.f188159a.get(bArr, i, i2);
    }

    /* renamed from: m */
    public final void mo62105m(int i) {
        mo62209a(i);
        ByteBuffer byteBuffer = this.f188159a;
        byteBuffer.position(byteBuffer.position() + i);
    }
}
