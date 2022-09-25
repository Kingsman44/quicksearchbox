package p5488io.grpc.p5523c;

import com.google.common.base.C58838bb;
import java.nio.ByteBuffer;
import p5488io.grpc.p5525e.C70680lz;

/* renamed from: io.grpc.c.n */
/* compiled from: PG */
final class C70270n implements C70680lz {

    /* renamed from: a */
    public final ByteBuffer f187342a;

    public C70270n(ByteBuffer byteBuffer) {
        C58838bb.m90866a(byteBuffer, "buffer");
        this.f187342a = byteBuffer;
    }

    /* renamed from: a */
    public final int mo61934a() {
        return this.f187342a.position();
    }

    /* renamed from: b */
    public final int mo61935b() {
        return this.f187342a.remaining();
    }

    /* renamed from: c */
    public final void mo61936c(byte b) {
        this.f187342a.put(b);
    }

    /* renamed from: d */
    public final void mo61937d(byte[] bArr, int i, int i2) {
        this.f187342a.put(bArr, i, i2);
    }
}
