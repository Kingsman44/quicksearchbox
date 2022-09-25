package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;
import p5488io.grpc.C70255bz;

/* renamed from: io.grpc.e.ih */
/* compiled from: PG */
final class C70581ih extends InputStream implements InputStreamRetargetInterface, C70255bz {

    /* renamed from: a */
    private final C70580ig f188154a;

    public C70581ih(C70580ig igVar) {
        C58838bb.m90866a(igVar, "buffer");
        this.f188154a = igVar;
    }

    public final int available() {
        return ((C70386bb) this.f188154a).f187592b;
    }

    public final void close() {
        this.f188154a.close();
    }

    public final void mark(int i) {
        this.f188154a.mo62093b();
    }

    public final boolean markSupported() {
        return this.f188154a.mo62096d();
    }

    public final int read() {
        C70580ig igVar = this.f188154a;
        if (((C70386bb) igVar).f187592b == 0) {
            return -1;
        }
        return igVar.mo62098f();
    }

    public final void reset() {
        this.f188154a.mo62094c();
    }

    public final long skip(long j) {
        int min = (int) Math.min((long) ((C70386bb) this.f188154a).f187592b, j);
        this.f188154a.mo62105m(min);
        return (long) min;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = ((C70386bb) this.f188154a).f187592b;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i3, i2);
        ((C70386bb) this.f188154a).mo62097e(C70386bb.f187587a, min, bArr, i);
        return min;
    }
}
