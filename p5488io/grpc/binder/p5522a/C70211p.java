package p5488io.grpc.binder.p5522a;

import com.google.common.p4575r.C60757n;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;
import p5488io.grpc.C70157au;
import p5488io.grpc.C70255bz;

/* renamed from: io.grpc.binder.a.p */
/* compiled from: PG */
final class C70211p extends InputStream implements InputStreamRetargetInterface, C70255bz, C70157au {

    /* renamed from: a */
    private byte[][] f187137a;

    /* renamed from: b */
    private byte[] f187138b;

    /* renamed from: c */
    private int f187139c;

    /* renamed from: d */
    private int f187140d;

    /* renamed from: e */
    private int f187141e;

    /* renamed from: f */
    private boolean f187142f;

    public C70211p(byte[] bArr) {
        this.f187137a = null;
        int length = bArr.length;
        this.f187138b = length <= 0 ? null : bArr;
        this.f187141e = length;
    }

    /* renamed from: b */
    private final void m102333b() {
        int i = this.f187139c + 1;
        this.f187139c = i;
        this.f187140d = 0;
        byte[][] bArr = this.f187137a;
        if (bArr == null || i >= bArr.length) {
            this.f187138b = null;
        } else {
            this.f187138b = bArr[i];
        }
    }

    /* renamed from: a */
    public final int mo61730a(OutputStream outputStream) {
        int i = this.f187141e;
        while (true) {
            int i2 = this.f187141e;
            if (i2 <= 0) {
                return i;
            }
            int min = Math.min(this.f187138b.length - this.f187140d, i2);
            outputStream.write(this.f187138b, this.f187140d, min);
            this.f187141e -= min;
            m102333b();
        }
    }

    public final int available() {
        return this.f187141e;
    }

    public final void close() {
        if (!this.f187142f) {
            this.f187142f = true;
            byte[][] bArr = this.f187137a;
            if (bArr != null) {
                for (byte[] a : bArr) {
                    C70212q.m102335a(a);
                }
            } else {
                byte[] bArr2 = this.f187138b;
                if (bArr2 != null) {
                    C70212q.m102335a(bArr2);
                }
            }
            this.f187138b = null;
            this.f187137a = null;
        }
    }

    public final int read() {
        byte[] bArr = this.f187138b;
        if (bArr == null) {
            return -1;
        }
        int i = this.f187140d;
        int i2 = i + 1;
        this.f187140d = i2;
        byte b = bArr[i];
        this.f187141e--;
        if (i2 == bArr.length) {
            m102333b();
        }
        return b;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public C70211p(byte[][] bArr, int i) {
        this.f187137a = bArr;
        this.f187141e = i;
        if (bArr.length > 0) {
            this.f187138b = bArr[0];
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (true) {
            byte[] bArr2 = this.f187138b;
            if (bArr2 == null) {
                break;
            }
            int length = bArr2.length;
            int i4 = this.f187140d;
            int h = C60757n.m92747h(i3, length - i4, this.f187141e);
            System.arraycopy(bArr2, i4, bArr, i, h);
            i += h;
            i3 -= h;
            this.f187141e -= h;
            if (i3 == 0) {
                int i5 = this.f187140d + h;
                this.f187140d = i5;
                if (i5 == this.f187138b.length) {
                    m102333b();
                }
            } else {
                m102333b();
            }
        }
        int i6 = i2 - i3;
        if (i6 > 0 || this.f187141e > 0) {
            return i6;
        }
        return -1;
    }
}
