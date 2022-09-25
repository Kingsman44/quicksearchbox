package org.chromium.net.impl;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.wrapper.java.p3189io.FileInputStreamWrapper;

/* renamed from: org.chromium.net.impl.aq */
/* compiled from: PG */
final class C72457aq implements ReadableByteChannel {

    /* renamed from: a */
    private final InputStream f192811a;

    /* renamed from: b */
    private final AtomicBoolean f192812b = new AtomicBoolean(true);

    private C72457aq(InputStream inputStream) {
        this.f192811a = inputStream;
    }

    /* renamed from: a */
    static ReadableByteChannel m107162a(InputStream inputStream) {
        if (inputStream instanceof FileInputStream) {
            return FileInputStreamWrapper.getChannel((FileInputStream) inputStream);
        }
        return new C72457aq(inputStream);
    }

    public final void close() {
        if (this.f192812b.compareAndSet(true, false)) {
            this.f192811a.close();
        }
    }

    public final boolean isOpen() {
        return this.f192812b.get();
    }

    public final int read(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int read = this.f192811a.read(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            if (read <= 0) {
                return read;
            }
            ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(byteBuffer.position() + read);
            return read;
        }
        byte[] bArr = new byte[Math.min(16384, Math.min(Math.max(this.f192811a.available(), 4096), byteBuffer.remaining()))];
        int read2 = this.f192811a.read(bArr);
        if (read2 <= 0) {
            return read2;
        }
        byteBuffer.put(bArr, 0, read2);
        return read2;
    }
}
