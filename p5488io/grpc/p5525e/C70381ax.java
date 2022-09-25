package p5488io.grpc.p5525e;

import java.nio.ByteBuffer;

/* renamed from: io.grpc.e.ax */
/* compiled from: PG */
final class C70381ax implements C70383az {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ int mo62091a(C70580ig igVar, int i, Object obj, int i2) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        int limit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + i);
        igVar.mo62102j(byteBuffer);
        byteBuffer.limit(limit);
        return 0;
    }
}
