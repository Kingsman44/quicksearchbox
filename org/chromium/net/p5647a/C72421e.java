package org.chromium.net.p5647a;

import java.net.HttpRetryException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: org.chromium.net.a.e */
/* compiled from: PG */
final class C72421e extends UploadDataProvider {

    /* renamed from: a */
    final /* synthetic */ C72422f f192612a;

    public C72421e(C72422f fVar) {
        this.f192612a = fVar;
    }

    public final long getLength() {
        return this.f192612a.f192614b;
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= this.f192612a.f192615c.remaining()) {
            byteBuffer.put(this.f192612a.f192615c);
            ByteBuffer byteBuffer2 = (ByteBuffer) this.f192612a.f192615c.clear();
            uploadDataSink.onReadSucceeded(false);
            this.f192612a.f192613a.f192645a = false;
            return;
        }
        int limit = this.f192612a.f192615c.limit();
        ByteBuffer byteBuffer3 = this.f192612a.f192615c;
        ByteBuffer byteBuffer4 = (ByteBuffer) byteBuffer3.limit(byteBuffer3.position() + byteBuffer.remaining());
        byteBuffer.put(this.f192612a.f192615c);
        ByteBuffer byteBuffer5 = (ByteBuffer) this.f192612a.f192615c.limit(limit);
        uploadDataSink.onReadSucceeded(false);
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        uploadDataSink.onRewindError(new HttpRetryException("Cannot retry streamed Http body", -1));
    }
}
