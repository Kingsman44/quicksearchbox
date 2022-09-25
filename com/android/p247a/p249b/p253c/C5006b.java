package com.android.p247a.p249b.p253c;

import com.android.p247a.p254c.C5010a;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: com.android.a.b.c.b */
/* compiled from: PG */
final class C5006b implements Closeable, C5010a {

    /* renamed from: a */
    public long f15862a;

    /* renamed from: b */
    private final C5010a f15863b;

    /* renamed from: c */
    private Inflater f15864c = new Inflater(true);

    /* renamed from: d */
    private byte[] f15865d;

    /* renamed from: e */
    private byte[] f15866e;

    /* renamed from: f */
    private boolean f15867f;

    public C5006b(C5010a aVar) {
        this.f15863b = aVar;
    }

    /* renamed from: c */
    private final void m13790c() {
        if (this.f15867f) {
            throw new IllegalStateException("Closed");
        }
    }

    /* renamed from: a */
    public final void mo9925a(ByteBuffer byteBuffer) {
        m13790c();
        if (byteBuffer.hasArray()) {
            mo9926b(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(byteBuffer.limit());
            return;
        }
        if (this.f15866e == null) {
            this.f15866e = new byte[65536];
        }
        while (byteBuffer.hasRemaining()) {
            int remaining = byteBuffer.remaining();
            int length = this.f15866e.length;
            int min = Math.min(remaining, 65536);
            byteBuffer.get(this.f15866e, 0, min);
            mo9926b(this.f15866e, 0, min);
        }
    }

    /* renamed from: b */
    public final void mo9926b(byte[] bArr, int i, int i2) {
        m13790c();
        this.f15864c.setInput(bArr, i, i2);
        if (this.f15865d == null) {
            this.f15865d = new byte[65536];
        }
        while (!this.f15864c.finished()) {
            try {
                int inflate = this.f15864c.inflate(this.f15865d);
                if (inflate != 0) {
                    this.f15863b.mo9926b(this.f15865d, 0, inflate);
                    this.f15862a += (long) inflate;
                } else {
                    return;
                }
            } catch (DataFormatException e) {
                throw new IOException("Failed to inflate data", e);
            }
        }
    }

    public final void close() {
        this.f15867f = true;
        this.f15866e = null;
        this.f15865d = null;
        Inflater inflater = this.f15864c;
        if (inflater != null) {
            inflater.end();
            this.f15864c = null;
        }
    }
}
