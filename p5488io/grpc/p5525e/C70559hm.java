package p5488io.grpc.p5525e;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.hm */
/* compiled from: PG */
final class C70559hm extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    private final int f188082a;

    /* renamed from: b */
    private final C70670lp f188083b;

    /* renamed from: c */
    private long f188084c;

    /* renamed from: d */
    private long f188085d;

    /* renamed from: e */
    private long f188086e = -1;

    public C70559hm(InputStream inputStream, int i, C70670lp lpVar) {
        super(inputStream);
        this.f188082a = i;
        this.f188083b = lpVar;
    }

    /* renamed from: a */
    private final void m103068a() {
        if (this.f188085d > this.f188084c) {
            this.f188083b.mo62419h();
            this.f188084c = this.f188085d;
        }
    }

    /* renamed from: b */
    private final void m103069b() {
        if (this.f188085d > ((long) this.f188082a)) {
            Status status = Status.f186911i;
            throw new C70761fa(status.withDescription("Decompressed gRPC message exceeds maximum size " + this.f188082a), (C70334de) null, true);
        }
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.f188086e = this.f188085d;
    }

    public final int read() {
        int read = this.in.read();
        if (read != -1) {
            this.f188085d++;
        }
        m103069b();
        m103068a();
        return read;
    }

    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f188086e != -1) {
            this.in.reset();
            this.f188085d = this.f188086e;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j) {
        long skip = this.in.skip(j);
        this.f188085d += skip;
        m103069b();
        m103068a();
        return skip;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            this.f188085d += (long) read;
        }
        m103069b();
        m103068a();
        return read;
    }
}
