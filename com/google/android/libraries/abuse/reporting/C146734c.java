package com.google.android.libraries.abuse.reporting;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: com.google.android.libraries.abuse.reporting.c */
/* compiled from: PG */
public final class C146734c extends UploadDataProvider {

    /* renamed from: a */
    final byte[] f396254a;

    /* renamed from: b */
    int f396255b = 0;

    public C146734c(byte[] bArr) {
        this.f396254a = bArr;
    }

    public final long getLength() {
        return (long) this.f396254a.length;
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        byte[] bArr = this.f396254a;
        int i = this.f396255b;
        if (remaining < bArr.length - i) {
            byteBuffer.put(bArr, i, remaining);
            this.f396255b += remaining;
        } else {
            byteBuffer.put(bArr);
        }
        uploadDataSink.onReadSucceeded(false);
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        this.f396255b = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
