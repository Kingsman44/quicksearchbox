package p3186j$.wrapper.java.nio.channels;

import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import p3186j$.wrapper.java.nio.file.C41338b;

/* renamed from: j$.wrapper.java.nio.channels.a */
final class C41335a extends FileChannel implements ByteChannel {

    /* renamed from: a */
    private final FileChannel f108060a;

    C41335a(FileChannel fileChannel) {
        this.f108060a = fileChannel;
    }

    /* renamed from: a */
    public final C41335a position(long j) {
        try {
            return (C41335a) C41336b.m72303a(this.f108060a.position(j));
        } catch (IOException e) {
            throw C41338b.m72304a(e);
        }
    }

    /* renamed from: b */
    public final C41335a truncate(long j) {
        try {
            return (C41335a) C41336b.m72303a(this.f108060a.truncate(j));
        } catch (IOException e) {
            throw C41338b.m72304a(e);
        }
    }

    public final void force(boolean z) {
        try {
            this.f108060a.force(z);
        } catch (IOException e) {
            throw C41338b.m72304a(e);
        }
    }

    public final void implCloseChannel() {
        try {
            Method declaredMethod = AbstractInterruptibleChannel.class.getDeclaredMethod("implCloseChannel", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.f108060a, new Object[0]);
        } catch (ReflectiveOperationException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw C41338b.m72304a((IOException) cause);
            }
            throw new AssertionError(e);
        }
    }

    public final FileLock lock(long j, long j2, boolean z) {
        try {
            return this.f108060a.lock(j, j2, z);
        } catch (IOException e) {
            throw C41338b.m72304a(e);
        }
    }

    public final MappedByteBuffer map(FileChannel.MapMode mapMode, long j, long j2) {
        try {
            return this.f108060a.map(mapMode, j, j2);
        } catch (IOException e) {
            throw C41338b.m72304a(e);
        }
    }

    public final long position() {
        try {
            return this.f108060a.position();
        } catch (IOException e) {
            throw C41338b.m72304a(e);
        }
    }

    public final int read(ByteBuffer byteBuffer) {
        try {
            return this.f108060a.read(byteBuffer);
        } catch (IOException e) {
            throw C41338b.m72304a(e);
        }
    }

    public final int read(ByteBuffer byteBuffer, long j) {
        try {
            return this.f108060a.read(byteBuffer, j);
        } catch (IOException e) {
            throw C41338b.m72304a(e);
        }
    }

    public final long read(ByteBuffer[] byteBufferArr, int i, int i2) {
        try {
            return this.f108060a.read(byteBufferArr, i, i2);
        } catch (IOException e) {
            throw C41338b.m72304a(e);
        }
    }

    public final long size() {
        try {
            return this.f108060a.size();
        } catch (IOException e) {
            throw C41338b.m72304a(e);
        }
    }

    public final long transferFrom(ReadableByteChannel readableByteChannel, long j, long j2) {
        try {
            return this.f108060a.transferFrom(readableByteChannel, j, j2);
        } catch (IOException e) {
            throw C41338b.m72304a(e);
        }
    }

    public final long transferTo(long j, long j2, WritableByteChannel writableByteChannel) {
        try {
            return this.f108060a.transferTo(j, j2, writableByteChannel);
        } catch (IOException e) {
            throw C41338b.m72304a(e);
        }
    }

    public final FileLock tryLock(long j, long j2, boolean z) {
        try {
            return this.f108060a.tryLock(j, j2, z);
        } catch (IOException e) {
            throw C41338b.m72304a(e);
        }
    }

    public final int write(ByteBuffer byteBuffer) {
        try {
            return this.f108060a.write(byteBuffer);
        } catch (IOException e) {
            throw C41338b.m72304a(e);
        }
    }

    public final int write(ByteBuffer byteBuffer, long j) {
        try {
            return this.f108060a.write(byteBuffer, j);
        } catch (IOException e) {
            throw C41338b.m72304a(e);
        }
    }

    public final long write(ByteBuffer[] byteBufferArr, int i, int i2) {
        try {
            return this.f108060a.write(byteBufferArr, i, i2);
        } catch (IOException e) {
            throw C41338b.m72304a(e);
        }
    }
}
