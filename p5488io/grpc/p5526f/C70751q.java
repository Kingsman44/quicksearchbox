package p5488io.grpc.p5526f;

import kotlinx.coroutines.C71685du;
import kotlinx.coroutines.C71686dv;
import p5462h.p5466c.C69582l;
import p5462h.p5466c.C69583m;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70148al;

/* renamed from: io.grpc.f.q */
/* compiled from: PG */
public final class C70751q implements C71686dv {

    /* renamed from: a */
    public static final C70750p f188540a = new C70750p();

    /* renamed from: b */
    private final C70148al f188541b;

    public C70751q(C70148al alVar) {
        C69664n.m101061g(alVar, "grpcContext");
        this.f188541b = alVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo51648a(C69585o oVar) {
        C69664n.m101061g(oVar, "context");
        C70148al a = this.f188541b.mo61696a();
        C69664n.m101060f(a, "grpcContext.attach()");
        return a;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo51649b(C69585o oVar, Object obj) {
        C70148al alVar = (C70148al) obj;
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(alVar, "oldState");
        this.f188541b.mo61702f(alVar);
    }

    public final Object fold(Object obj, C69630p pVar) {
        return C71685du.m104779a(this, obj, pVar);
    }

    public final C69582l get(C69583m mVar) {
        return C71685du.m104780b(this, mVar);
    }

    public final C69583m getKey() {
        return f188540a;
    }

    public final C69585o minusKey(C69583m mVar) {
        return C71685du.m104781c(this, mVar);
    }

    public final C69585o plus(C69585o oVar) {
        return C71685du.m104782d(this, oVar);
    }
}
