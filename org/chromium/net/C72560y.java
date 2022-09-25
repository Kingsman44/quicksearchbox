package org.chromium.net;

import java.nio.ByteBuffer;

/* renamed from: org.chromium.net.y */
/* compiled from: PG */
final class C72560y extends UploadDataProvider {

    /* renamed from: a */
    private final ByteBuffer f193084a;

    public C72560y(ByteBuffer byteBuffer) {
        this.f193084a = byteBuffer;
    }

    public final long getLength() {
        return (long) this.f193084a.limit();
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            if (byteBuffer.remaining() >= this.f193084a.remaining()) {
                byteBuffer.put(this.f193084a);
            } else {
                int limit = this.f193084a.limit();
                ByteBuffer byteBuffer2 = this.f193084a;
                byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
                byteBuffer.put(this.f193084a);
                this.f193084a.limit(limit);
            }
            uploadDataSink.onReadSucceeded(false);
            return;
        }
        throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        this.f193084a.position(0);
        uploadDataSink.onRewindSucceeded();
    }
}
