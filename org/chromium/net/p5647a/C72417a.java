package org.chromium.net.p5647a;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: org.chromium.net.a.a */
/* compiled from: PG */
final class C72417a extends UploadDataProvider {

    /* renamed from: a */
    final /* synthetic */ C72418b f192602a;

    public C72417a(C72418b bVar) {
        this.f192602a = bVar;
    }

    public final long getLength() {
        C72418b bVar = this.f192602a;
        int i = bVar.f192603a;
        if (i != -1) {
            return (long) i;
        }
        boolean z = bVar.f192605c;
        ByteBuffer byteBuffer = bVar.f192604b;
        return (long) (z ? byteBuffer.limit() : byteBuffer.position());
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining < this.f192602a.f192604b.remaining()) {
            byteBuffer.put(this.f192602a.f192604b.array(), this.f192602a.f192604b.position(), remaining);
            ByteBuffer byteBuffer2 = this.f192602a.f192604b;
            ByteBuffer byteBuffer3 = (ByteBuffer) byteBuffer2.position(byteBuffer2.position() + remaining);
        } else {
            byteBuffer.put(this.f192602a.f192604b);
        }
        uploadDataSink.onReadSucceeded(false);
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f192602a.f192604b.position(0);
        uploadDataSink.onRewindSucceeded();
    }
}
