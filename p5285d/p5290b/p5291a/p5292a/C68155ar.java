package p5285d.p5290b.p5291a.p5292a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70852a;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70866e;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: d.b.a.a.ar */
/* compiled from: PG */
public final class C68155ar extends C70852a {
    public C68155ar(C70888j jVar, C70851i iVar) {
        super(jVar, iVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C70866e mo17207a(C70888j jVar, C70851i iVar) {
        return new C68155ar(jVar, iVar);
    }

    /* renamed from: b */
    public final void mo60280b(C68200m mVar, C70862aj ajVar) {
        C70888j jVar = this.f189039a;
        C70338di diVar = C68156as.f184438a;
        if (diVar == null) {
            synchronized (C68156as.class) {
                diVar = C68156as.f184438a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.SERVER_STREAMING;
                    d.f187488d = C70338di.m102602c("google.search.readaloud.v1.ReadAloudService", "GenerateAudioDocStream");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C68200m.f184542g);
                    d.f187486b = C70850d.m103697c(C68142ae.f184423c);
                    diVar = d.mo62040a();
                    C68156as.f184438a = diVar;
                }
            }
        }
        C70876o.m103763d(jVar.mo39510a(diVar, this.f189040b), mVar, ajVar, true);
    }
}
