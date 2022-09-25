package p5488io.grpc.p5526f;

import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69644aa;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;

/* renamed from: io.grpc.f.r */
/* compiled from: PG */
final class C70752r implements C71588o {

    /* renamed from: a */
    final /* synthetic */ C69644aa f188542a;

    /* renamed from: b */
    final /* synthetic */ C71588o f188543b;

    /* renamed from: c */
    final /* synthetic */ String f188544c = "request";

    /* renamed from: d */
    final /* synthetic */ Object f188545d;

    public C70752r(C69644aa aaVar, C71588o oVar, Object obj) {
        this.f188542a = aaVar;
        this.f188543b = oVar;
        this.f188545d = obj;
    }

    /* renamed from: a */
    public final Object mo20883a(Object obj, C69577g gVar) {
        C69644aa aaVar = this.f188542a;
        if (!aaVar.f186023a) {
            aaVar.f186023a = true;
            Object a = this.f188543b.mo20883a(obj, gVar);
            if (a == C69554a.COROUTINE_SUSPENDED) {
                return a;
            }
            return C69788q.f186170a;
        }
        Status status = Status.f186915m;
        String str = this.f188544c;
        Object obj2 = this.f188545d;
        throw new StatusException(status.withDescription("Expected one " + str + " for " + obj2 + " but received two"), (C70334de) null);
    }
}
