package p5285d.p5290b.p5291a.p5292a;

import com.google.common.util.concurrent.C60870cx;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70864c;
import p5488io.grpc.p5533i.C70866e;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: d.b.a.a.aq */
/* compiled from: PG */
public final class C68154aq extends C70864c {
    public C68154aq(C70888j jVar, C70851i iVar) {
        super(jVar, iVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C70866e mo17207a(C70888j jVar, C70851i iVar) {
        return new C68154aq(jVar, iVar);
    }

    /* renamed from: b */
    public final C60870cx mo60279b(C68207t tVar) {
        C70888j jVar = this.f189039a;
        C70338di diVar = C68156as.f184440c;
        if (diVar == null) {
            synchronized (C68156as.class) {
                diVar = C68156as.f184440c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.search.readaloud.v1.ReadAloudService", "CheckClientOptions");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C68207t.f184558b);
                    d.f187486b = C70850d.m103697c(C68209v.f184561d);
                    diVar = d.mo62040a();
                    C68156as.f184440c = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, this.f189040b), tVar);
    }
}
