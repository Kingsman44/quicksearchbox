package p5488io.grpc.p5526f;

import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69644aa;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;

@C69567e(mo61343b = "io.grpc.kotlin.HelpersKt$singleOrStatusFlow$1", mo61344c = "Helpers.kt", mo61345d = "invokeSuspend", mo61346e = {62})
/* renamed from: io.grpc.f.s */
/* compiled from: PG */
final class C70753s extends C69572j implements C69630p {

    /* renamed from: a */
    int f188546a;

    /* renamed from: b */
    final /* synthetic */ C71587n f188547b;

    /* renamed from: c */
    final /* synthetic */ String f188548c = "request";

    /* renamed from: d */
    final /* synthetic */ Object f188549d;

    /* renamed from: e */
    private /* synthetic */ Object f188550e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70753s(C71587n nVar, Object obj, C69577g gVar) {
        super(2, gVar);
        this.f188547b = nVar;
        this.f188549d = obj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C70753s) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69644aa aaVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f188546a != 0) {
            aaVar = (C69644aa) this.f188550e;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C69644aa aaVar2 = new C69644aa();
            C71587n nVar = this.f188547b;
            C70752r rVar = new C70752r(aaVar2, (C71588o) this.f188550e, this.f188549d);
            this.f188550e = aaVar2;
            this.f188546a = 1;
            if (nVar.mo38165mp(rVar, this) == aVar) {
                return aVar;
            }
            aaVar = aaVar2;
        }
        if (aaVar.f186023a) {
            return C69788q.f186170a;
        }
        Status status = Status.f186915m;
        String str = this.f188548c;
        Object obj2 = this.f188549d;
        throw new StatusException(status.withDescription("Expected one " + str + " for " + obj2 + " but received none"), (C70334de) null);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C70753s sVar = new C70753s(this.f188547b, this.f188549d, gVar);
        sVar.f188550e = obj;
        return sVar;
    }
}
