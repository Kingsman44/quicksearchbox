package org.chromium.net.p5647a;

import java.net.HttpRetryException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: org.chromium.net.a.c */
/* compiled from: PG */
final class C72419c extends UploadDataProvider {

    /* renamed from: a */
    final /* synthetic */ C72420d f192607a;

    public C72419c(C72420d dVar) {
        this.f192607a = dVar;
    }

    public final long getLength() {
        return -1;
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= this.f192607a.f192609b.remaining()) {
            byteBuffer.put(this.f192607a.f192609b);
            ByteBuffer byteBuffer2 = (ByteBuffer) this.f192607a.f192609b.clear();
            uploadDataSink.onReadSucceeded(this.f192607a.f192610c);
            C72420d dVar = this.f192607a;
            if (!dVar.f192610c) {
                dVar.f192608a.f192645a = false;
                return;
            }
            return;
        }
        int limit = this.f192607a.f192609b.limit();
        ByteBuffer byteBuffer3 = this.f192607a.f192609b;
        ByteBuffer byteBuffer4 = (ByteBuffer) byteBuffer3.limit(byteBuffer3.position() + byteBuffer.remaining());
        byteBuffer.put(this.f192607a.f192609b);
        ByteBuffer byteBuffer5 = (ByteBuffer) this.f192607a.f192609b.limit(limit);
        uploadDataSink.onReadSucceeded(false);
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        uploadDataSink.onRewindError(new HttpRetryException("Cannot retry streamed Http body", -1));
    }
}
