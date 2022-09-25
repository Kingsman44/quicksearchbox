package com.android.p247a.p249b.p252b;

import com.android.p247a.p254c.C5010a;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: com.android.a.b.b.c */
/* compiled from: PG */
public final class C5002c {

    /* renamed from: a */
    public final FileChannel f15847a;

    /* renamed from: b */
    public final long f15848b;

    /* renamed from: c */
    public final long f15849c;

    public C5002c(FileChannel fileChannel, long j, long j2) {
        if (j < 0) {
            throw new IndexOutOfBoundsException("offset: " + j2);
        } else if (j2 >= 0) {
            this.f15847a = fileChannel;
            this.f15848b = j;
            this.f15849c = j2;
        } else {
            throw new IndexOutOfBoundsException("size: " + j2);
        }
    }

    /* renamed from: c */
    public final void mo9960c(long j, long j2, C5010a aVar) {
        m13786b(j, j2, this.f15849c);
        if (j2 != 0) {
            long j3 = this.f15848b + j;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect((int) Math.min(j2, 1048576));
            while (j2 > 0) {
                int min = (int) Math.min(j2, (long) allocateDirect.capacity());
                ByteBuffer byteBuffer = (ByteBuffer) allocateDirect.limit(min);
                synchronized (this.f15847a) {
                    this.f15847a.position(j3);
                    int i = min;
                    while (i > 0) {
                        int read = this.f15847a.read(allocateDirect);
                        if (read >= 0) {
                            i -= read;
                        } else {
                            throw new IOException("Unexpected EOF encountered");
                        }
                    }
                }
                ByteBuffer byteBuffer2 = (ByteBuffer) allocateDirect.flip();
                aVar.mo9925a(allocateDirect);
                ByteBuffer byteBuffer3 = (ByteBuffer) allocateDirect.clear();
                long j4 = (long) min;
                j3 += j4;
                j2 -= j4;
            }
        }
    }

    /* renamed from: a */
    public final ByteBuffer mo9959a(long j, int i) {
        int read;
        if (i >= 0) {
            ByteBuffer allocate = ByteBuffer.allocate(i);
            m13786b(j, (long) i, this.f15849c);
            if (i != 0) {
                if (i <= allocate.remaining()) {
                    long j2 = this.f15848b + j;
                    int limit = allocate.limit();
                    try {
                        ByteBuffer byteBuffer = (ByteBuffer) allocate.limit(allocate.position() + i);
                        while (i > 0) {
                            synchronized (this.f15847a) {
                                this.f15847a.position(j2);
                                read = this.f15847a.read(allocate);
                            }
                            j2 += (long) read;
                            i -= read;
                        }
                        ByteBuffer byteBuffer2 = (ByteBuffer) allocate.limit(limit);
                    } catch (Throwable th) {
                        ByteBuffer byteBuffer3 = (ByteBuffer) allocate.limit(limit);
                        throw th;
                    }
                } else {
                    throw new BufferOverflowException();
                }
            }
            ByteBuffer byteBuffer4 = (ByteBuffer) allocate.flip();
            return allocate;
        }
        throw new IndexOutOfBoundsException("size: " + i);
    }

    /* renamed from: b */
    public static void m13786b(long j, long j2, long j3) {
        if (j < 0) {
            throw new IndexOutOfBoundsException("offset: " + j);
        } else if (j2 < 0) {
            throw new IndexOutOfBoundsException("size: " + j2);
        } else if (j <= j3) {
            long j4 = j + j2;
            if (j4 < j) {
                throw new IndexOutOfBoundsException("offset (" + j + ") + size (" + j2 + ") overflow");
            } else if (j4 > j3) {
                throw new IndexOutOfBoundsException("offset (" + j + ") + size (" + j2 + ") > source size (" + j3 + ")");
            }
        } else {
            throw new IndexOutOfBoundsException("offset (" + j + ") > source size (" + j3 + ")");
        }
    }
}
