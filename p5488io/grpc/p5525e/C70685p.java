package p5488io.grpc.p5525e;

import p5488io.grpc.C70275cd;
import p5488io.grpc.C70282ck;
import p5488io.grpc.C70283cl;

/* renamed from: io.grpc.e.p */
/* compiled from: PG */
public final class C70685p {

    /* renamed from: a */
    public final C70275cd f188421a;

    /* renamed from: b */
    public C70282ck f188422b;

    /* renamed from: c */
    public C70283cl f188423c;

    /* renamed from: d */
    final /* synthetic */ C70690u f188424d;

    public C70685p(C70690u uVar, C70275cd cdVar) {
        this.f188424d = uVar;
        this.f188421a = cdVar;
        C70283cl a = uVar.f188426a.mo61971a(uVar.f188427b);
        this.f188423c = a;
        if (a != null) {
            this.f188422b = a.mo61940a(cdVar);
            return;
        }
        throw new IllegalStateException("Could not find policy '" + uVar.f188427b + "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
    }
}
