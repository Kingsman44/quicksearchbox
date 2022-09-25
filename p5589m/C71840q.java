package p5589m;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: m.q */
/* compiled from: PG */
public final class C71840q extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    final /* synthetic */ C71841r f191369a;

    public C71840q(C71841r rVar) {
        this.f191369a = rVar;
    }

    public final int available() {
        C71841r rVar = this.f191369a;
        if (!rVar.f191372c) {
            return (int) Math.min(rVar.f191371b.f191356b, 2147483647L);
        }
        throw new IOException("closed");
    }

    public final void close() {
        this.f191369a.close();
    }

    public final int read() {
        C71841r rVar = this.f191369a;
        if (!rVar.f191372c) {
            C71828e eVar = rVar.f191371b;
            if (eVar.f191356b == 0 && rVar.f191370a.mo62472a(eVar, 8192) == -1) {
                return -1;
            }
            return this.f191369a.f191371b.mo63062c() & 255;
        }
        throw new IOException("closed");
    }

    public final String toString() {
        C71841r rVar = this.f191369a;
        new StringBuilder().append(rVar);
        return rVar.toString().concat(".inputStream()");
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr, int i, int i2) {
        C69664n.m101061g(bArr, "data");
        if (!this.f191369a.f191372c) {
            C71824ab.m105127a((long) bArr.length, (long) i, (long) i2);
            C71841r rVar = this.f191369a;
            C71828e eVar = rVar.f191371b;
            if (eVar.f191356b == 0 && rVar.f191370a.mo62472a(eVar, 8192) == -1) {
                return -1;
            }
            return this.f191369a.f191371b.mo63064d(bArr, i, i2);
        }
        throw new IOException("closed");
    }
}
