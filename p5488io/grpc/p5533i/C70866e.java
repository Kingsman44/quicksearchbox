package p5488io.grpc.p5533i;

import com.google.common.base.C58838bb;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import p5488io.grpc.C70153aq;
import p5488io.grpc.C70769g;
import p5488io.grpc.C70846h;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.C70899n;
import p5488io.grpc.C70903r;

/* renamed from: io.grpc.i.e */
/* compiled from: PG */
public abstract class C70866e {

    /* renamed from: a */
    public final C70888j f189039a;

    /* renamed from: b */
    public final C70851i f189040b;

    protected C70866e(C70888j jVar, C70851i iVar) {
        C58838bb.m90866a(jVar, "channel");
        this.f189039a = jVar;
        C58838bb.m90866a(iVar, "callOptions");
        this.f189040b = iVar;
    }

    /* renamed from: a */
    public abstract C70866e mo17207a(C70888j jVar, C70851i iVar);

    /* renamed from: m */
    public final C70866e mo62574m(C70769g gVar) {
        C70888j jVar = this.f189039a;
        C70851i iVar = new C70851i(this.f189040b);
        iVar.f189018d = gVar;
        return mo17207a(jVar, iVar);
    }

    /* renamed from: n */
    public final C70866e mo62575n(long j, TimeUnit timeUnit) {
        return mo17207a(this.f189039a, this.f189040b.mo62565a(C70153aq.m102154c(j, timeUnit, C70153aq.f186997a)));
    }

    /* renamed from: o */
    public final C70866e mo62576o(C70899n... nVarArr) {
        return mo17207a(C70903r.m103829a(this.f189039a, Arrays.asList(nVarArr)), this.f189040b);
    }

    /* renamed from: p */
    public final C70866e mo62577p(C70846h hVar, Object obj) {
        return mo17207a(this.f189039a, this.f189040b.mo62569e(hVar, obj));
    }
}
