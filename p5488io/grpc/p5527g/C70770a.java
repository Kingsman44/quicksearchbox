package p5488io.grpc.p5527g;

import p5488io.p5489a.C69792b;
import p5589m.C71828e;

/* renamed from: io.grpc.g.a */
/* compiled from: PG */
final class C70770a extends C70824e {

    /* renamed from: a */
    final /* synthetic */ C70825f f188591a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70770a(C70825f fVar) {
        super(fVar);
        this.f188591a = fVar;
        int i = C69792b.f186180a;
    }

    /* renamed from: a */
    public final void mo62449a() {
        int i;
        int i2 = C69792b.f186180a;
        C71828e eVar = new C71828e();
        synchronized (this.f188591a.f188882a) {
            C71828e eVar2 = this.f188591a.f188883b;
            eVar.mo62538mq(eVar2, eVar2.mo63067f());
            C70825f fVar = this.f188591a;
            fVar.f188885d = false;
            i = fVar.f188890i;
        }
        this.f188591a.f188887f.mo62538mq(eVar, eVar.f191356b);
        synchronized (this.f188591a.f188882a) {
            this.f188591a.f188890i -= i;
        }
    }
}
