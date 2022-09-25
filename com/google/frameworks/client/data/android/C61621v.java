package com.google.frameworks.client.data.android;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: com.google.frameworks.client.data.android.v */
/* compiled from: PG */
final class C61621v extends UploadDataProvider {

    /* renamed from: a */
    private final ByteBuffer f166493a;

    public C61621v(C61364af afVar) {
        this.f166493a = afVar.f165937b.duplicate();
    }

    public final long getLength() {
        return (long) this.f166493a.remaining();
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (this.f166493a.remaining() > byteBuffer.remaining()) {
            int limit = this.f166493a.limit();
            ByteBuffer byteBuffer2 = this.f166493a;
            byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
            byteBuffer.put(this.f166493a);
            this.f166493a.limit(limit);
        } else {
            byteBuffer.put(this.f166493a);
        }
        uploadDataSink.onReadSucceeded(false);
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        this.f166493a.rewind();
        uploadDataSink.onRewindSucceeded();
    }
}
