package org.chromium.net;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: org.chromium.net.aa */
/* compiled from: PG */
final class C72430aa extends UploadDataProvider {

    /* renamed from: a */
    private volatile FileChannel f192650a;

    /* renamed from: b */
    private final C72561z f192651b;

    /* renamed from: c */
    private final Object f192652c = new Object();

    public C72430aa(C72561z zVar) {
        this.f192651b = zVar;
    }

    /* renamed from: a */
    private final FileChannel m107119a() {
        if (this.f192650a == null) {
            synchronized (this.f192652c) {
                if (this.f192650a == null) {
                    this.f192650a = this.f192651b.mo64308a();
                }
            }
        }
        return this.f192650a;
    }

    public final void close() {
        FileChannel fileChannel = this.f192650a;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    public final long getLength() {
        return m107119a().size();
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int read;
        if (byteBuffer.hasRemaining()) {
            FileChannel a = m107119a();
            do {
                read = a.read(byteBuffer);
                if (read != -1) {
                    break;
                    break;
                }
                break;
            } while (read == 0);
            uploadDataSink.onReadSucceeded(false);
            return;
        }
        throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        m107119a().position(0);
        uploadDataSink.onRewindSucceeded();
    }
}
