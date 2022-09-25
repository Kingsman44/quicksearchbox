package androidx.camera.core.p069a.p070a;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import org.chromium.net.PrivateKeyType;

/* renamed from: androidx.camera.core.a.a.a */
/* compiled from: PG */
final class C1237a extends FilterOutputStream {

    /* renamed from: a */
    final OutputStream f3626a;

    /* renamed from: b */
    public ByteOrder f3627b;

    public C1237a(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f3626a = outputStream;
        this.f3627b = byteOrder;
    }

    /* renamed from: a */
    public final void mo4068a(int i) {
        if (this.f3627b == ByteOrder.LITTLE_ENDIAN) {
            this.f3626a.write(i & PrivateKeyType.INVALID);
            this.f3626a.write((i >>> 8) & PrivateKeyType.INVALID);
            this.f3626a.write((i >>> 16) & PrivateKeyType.INVALID);
            this.f3626a.write(i >>> 24);
        } else if (this.f3627b == ByteOrder.BIG_ENDIAN) {
            this.f3626a.write(i >>> 24);
            this.f3626a.write((i >>> 16) & PrivateKeyType.INVALID);
            this.f3626a.write((i >>> 8) & PrivateKeyType.INVALID);
            this.f3626a.write(i & PrivateKeyType.INVALID);
        }
    }

    /* renamed from: b */
    public final void mo4069b(short s) {
        if (this.f3627b == ByteOrder.LITTLE_ENDIAN) {
            this.f3626a.write(s & 255);
            this.f3626a.write((s >>> 8) & PrivateKeyType.INVALID);
        } else if (this.f3627b == ByteOrder.BIG_ENDIAN) {
            this.f3626a.write((s >>> 8) & PrivateKeyType.INVALID);
            this.f3626a.write(s & 255);
        }
    }

    /* renamed from: c */
    public final void mo4070c(int i) {
        mo4069b((short) i);
    }

    public final void write(byte[] bArr) {
        this.f3626a.write(bArr);
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.f3626a.write(bArr, i, i2);
    }
}
