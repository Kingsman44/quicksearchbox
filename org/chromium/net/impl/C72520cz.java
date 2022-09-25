package org.chromium.net.impl;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: org.chromium.net.impl.cz */
/* compiled from: PG */
public final class C72520cz extends UploadDataProvider {

    /* renamed from: a */
    public final UploadDataProvider f192966a;

    public C72520cz(UploadDataProvider uploadDataProvider) {
        this.f192966a = uploadDataProvider;
    }

    public final void close() {
        this.f192966a.close();
    }

    public final long getLength() {
        return this.f192966a.getLength();
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        this.f192966a.read(uploadDataSink, byteBuffer);
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        this.f192966a.rewind(uploadDataSink);
    }
}
