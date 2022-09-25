package p5488io.grpc.p5527g.p5528a.p5529a;

import java.util.logging.Level;
import p5589m.C71828e;
import p5589m.C71830g;
import p5589m.C71847x;

/* renamed from: io.grpc.g.a.a.h */
/* compiled from: PG */
final class C70779h implements C71847x {

    /* renamed from: a */
    int f188743a;

    /* renamed from: b */
    byte f188744b;

    /* renamed from: c */
    int f188745c;

    /* renamed from: d */
    int f188746d;

    /* renamed from: e */
    short f188747e;

    /* renamed from: f */
    private final C71830g f188748f;

    public C70779h(C71830g gVar) {
        this.f188748f = gVar;
    }

    /* renamed from: a */
    public final long mo62472a(C71828e eVar, long j) {
        int i;
        int e;
        do {
            int i2 = this.f188746d;
            if (i2 == 0) {
                this.f188748f.mo63078o((long) this.f188747e);
                this.f188747e = 0;
                if ((this.f188744b & 4) != 0) {
                    return -1;
                }
                i = this.f188745c;
                int b = C70783l.m103528b(this.f188748f);
                this.f188746d = b;
                this.f188743a = b;
                byte c = (byte) (this.f188748f.mo63062c() & 255);
                this.f188744b = (byte) (this.f188748f.mo63062c() & 255);
                if (C70783l.f188760a.isLoggable(Level.FINE)) {
                    C70783l.f188760a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$ContinuationSource", "readContinuationHeader", C70780i.m103513a(true, this.f188745c, this.f188743a, c, this.f188744b));
                }
                e = this.f188748f.mo63065e() & Integer.MAX_VALUE;
                this.f188745c = e;
                if (c != 9) {
                    throw C70783l.m103529c("%s != TYPE_CONTINUATION", Byte.valueOf(c));
                }
            } else {
                long a = this.f188748f.mo62472a(eVar, Math.min(8192, (long) i2));
                if (a == -1) {
                    return -1;
                }
                this.f188746d -= (int) a;
                return a;
            }
        } while (e == i);
        throw C70783l.m103529c("TYPE_CONTINUATION streamId changed", new Object[0]);
    }

    public final void close() {
    }
}
