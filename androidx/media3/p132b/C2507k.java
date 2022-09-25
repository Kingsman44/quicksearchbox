package androidx.media3.p132b;

import androidx.media3.common.p136b.C2601a;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: androidx.media3.b.k */
/* compiled from: PG */
public final class C2507k extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    private final C2505i f6885a;

    /* renamed from: b */
    private final C2510n f6886b;

    /* renamed from: c */
    private final byte[] f6887c;

    /* renamed from: d */
    private boolean f6888d = false;

    /* renamed from: e */
    private boolean f6889e = false;

    /* renamed from: f */
    private long f6890f;

    public C2507k(C2505i iVar, C2510n nVar) {
        this.f6885a = iVar;
        this.f6886b = nVar;
        this.f6887c = new byte[1];
    }

    /* renamed from: a */
    public final void mo5931a() {
        if (!this.f6888d) {
            this.f6885a.mo5880b(this.f6886b);
            this.f6888d = true;
        }
    }

    public final void close() {
        if (!this.f6889e) {
            this.f6885a.mo5882d();
            this.f6889e = true;
        }
    }

    public final int read() {
        byte[] bArr = this.f6887c;
        int length = bArr.length;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return this.f6887c[0] & 255;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        C2601a.m6832d(!this.f6889e);
        mo5931a();
        int a = this.f6885a.mo5879a(bArr, i, i2);
        if (a == -1) {
            return -1;
        }
        this.f6890f += (long) a;
        return a;
    }
}
