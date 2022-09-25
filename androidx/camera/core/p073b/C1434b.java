package androidx.camera.core.p073b;

import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: androidx.camera.core.b.b */
/* compiled from: PG */
public final class C1434b extends OutputStream {

    /* renamed from: a */
    private final ByteBuffer f3991a;

    public C1434b(ByteBuffer byteBuffer) {
        this.f3991a = byteBuffer;
    }

    public final void write(int i) {
        if (this.f3991a.hasRemaining()) {
            this.f3991a.put((byte) i);
            return;
        }
        throw new EOFException("Output ByteBuffer has no bytes remaining.");
    }

    public final void write(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        bArr.getClass();
        if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i3 = i + i2) > length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i2 != 0) {
            if (this.f3991a.remaining() >= i2) {
                this.f3991a.put(bArr, i, i2);
                return;
            }
            throw new EOFException("Output ByteBuffer has insufficient bytes remaining.");
        }
    }
}
