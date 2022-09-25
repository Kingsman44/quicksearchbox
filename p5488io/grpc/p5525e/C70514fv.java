package p5488io.grpc.p5525e;

import java.util.concurrent.Executor;
import p5488io.grpc.C70148al;
import p5488io.grpc.C70161ay;
import p5488io.grpc.C70245bp;
import p5488io.grpc.C70246bq;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.C70897l;
import p5488io.grpc.C70898m;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.fv */
/* compiled from: PG */
final class C70514fv extends C70161ay {

    /* renamed from: a */
    public final C70148al f187897a;

    /* renamed from: b */
    private final C70246bq f187898b;

    /* renamed from: c */
    private final C70888j f187899c;

    /* renamed from: d */
    private final Executor f187900d;

    /* renamed from: e */
    private final C70338di f187901e;

    /* renamed from: f */
    private C70851i f187902f;

    /* renamed from: g */
    private C70898m f187903g;

    public C70514fv(C70246bq bqVar, C70888j jVar, Executor executor, C70338di diVar, C70851i iVar) {
        this.f187898b = bqVar;
        this.f187899c = jVar;
        this.f187901e = diVar;
        Executor executor2 = iVar.f189017c;
        executor = executor2 != null ? executor2 : executor;
        this.f187900d = executor;
        this.f187902f = iVar.mo62566b(executor);
        this.f187897a = C70148al.m102135m();
    }

    /* renamed from: a */
    public final void mo27478a(C70897l lVar, C70334de deVar) {
        new C70576ic(this.f187901e, deVar, this.f187902f);
        C70245bp a = this.f187898b.mo61899a();
        Status status = a.f187242a;
        if (status.mo61679g()) {
            C70552hf b = ((C70554hh) a.f187243b).mo62301b(this.f187901e);
            if (b != null) {
                this.f187902f = this.f187902f.mo62569e(C70552hf.f188067a, b);
            }
            C70898m a2 = this.f187899c.mo39510a(this.f187901e, this.f187902f);
            this.f187903g = a2;
            a2.mo27478a(lVar, deVar);
            return;
        }
        this.f187900d.execute(new C70513fu(this, lVar, C70460dv.m102874b(status)));
        this.f187903g = C70542gw.f187965h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C70898m mo61735c() {
        return this.f187903g;
    }

    /* renamed from: d */
    public final void mo27480d(String str, Throwable th) {
        C70898m mVar = this.f187903g;
        if (mVar != null) {
            mVar.mo27480d(str, th);
        }
    }
}
