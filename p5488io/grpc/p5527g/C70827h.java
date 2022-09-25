package p5488io.grpc.p5527g;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p5488io.grpc.p5527g.p5528a.p5529a.C70772a;
import p5488io.grpc.p5527g.p5528a.p5529a.C70774c;
import p5488io.grpc.p5527g.p5528a.p5529a.C70786o;
import p5589m.C71828e;
import p5589m.C71831h;
import p5589m.C71832i;

/* renamed from: io.grpc.g.h */
/* compiled from: PG */
public final class C70827h implements C70774c {

    /* renamed from: d */
    private static final Logger f188894d = Logger.getLogger(C70844y.class.getName());

    /* renamed from: a */
    public final C70826g f188895a;

    /* renamed from: b */
    public final C70774c f188896b;

    /* renamed from: c */
    public final C70808ab f188897c = new C70808ab(Level.FINE, C70844y.class);

    public C70827h(C70826g gVar, C70774c cVar) {
        this.f188895a = gVar;
        this.f188896b = cVar;
    }

    /* renamed from: a */
    public final void mo62450a(C70786o oVar) {
        throw null;
    }

    /* renamed from: b */
    public final void mo62451b() {
        throw null;
    }

    /* renamed from: c */
    public final void mo62452c(boolean z, int i, C71828e eVar, int i2) {
        throw null;
    }

    public final void close() {
        Level level;
        try {
            this.f188896b.close();
        } catch (IOException e) {
            IOException iOException = e;
            Logger logger = f188894d;
            if (iOException.getClass().equals(IOException.class)) {
                level = Level.FINE;
            } else {
                level = Level.INFO;
            }
            logger.logp(level, "io.grpc.okhttp.ExceptionHandlingFrameWriter", "close", "Failed closing connection", iOException);
        }
    }

    /* renamed from: d */
    public final void mo62453d() {
        try {
            this.f188896b.mo62453d();
        } catch (IOException e) {
            this.f188895a.mo62539a(e);
        }
    }

    /* renamed from: e */
    public final void mo62454e(boolean z, int i, int i2) {
        if (z) {
            C70808ab abVar = this.f188897c;
            long j = (4294967295L & ((long) i2)) | (((long) i) << 32);
            if (abVar.mo62511a()) {
                abVar.f188842a.logp(abVar.f188843b, "io.grpc.okhttp.OkHttpFrameLogger", "logPingAck", C70845z.m103689a(2) + " PING: ack=true bytes=" + j);
            }
        } else {
            this.f188897c.mo62514d(2, (4294967295L & ((long) i2)) | (((long) i) << 32));
        }
        try {
            C70774c cVar = this.f188896b;
            if (z) {
                ((C70823d) cVar).f188880a.f188889h++;
            }
            ((C70828i) cVar).f188898b.mo62454e(z, i, i2);
        } catch (IOException e) {
            this.f188895a.mo62539a(e);
        }
    }

    /* renamed from: f */
    public final void mo62455f(int i, C70772a aVar) {
        this.f188897c.mo62515e(2, i, aVar);
        try {
            C70774c cVar = this.f188896b;
            ((C70823d) cVar).f188880a.f188889h++;
            ((C70828i) cVar).f188898b.mo62455f(i, aVar);
        } catch (IOException e) {
            this.f188895a.mo62539a(e);
        }
    }

    /* renamed from: g */
    public final void mo62456g(C70786o oVar) {
        throw null;
    }

    /* renamed from: h */
    public final void mo62457h(int i, long j) {
        this.f188897c.mo62517g(2, i, j);
        try {
            ((C70828i) this.f188896b).f188898b.mo62457h(i, j);
        } catch (IOException e) {
            this.f188895a.mo62539a(e);
        }
    }

    /* renamed from: i */
    public final void mo62458i(C70772a aVar, byte[] bArr) {
        C70808ab abVar = this.f188897c;
        C71832i iVar = C71832i.f191357a;
        abVar.mo62513c(2, 0, aVar, C71831h.m105171b(bArr));
        try {
            ((C70828i) this.f188896b).f188898b.mo62458i(aVar, bArr);
            this.f188896b.mo62453d();
        } catch (IOException e) {
            this.f188895a.mo62539a(e);
        }
    }

    /* renamed from: j */
    public final void mo62459j(boolean z, int i, List list) {
        throw null;
    }
}
