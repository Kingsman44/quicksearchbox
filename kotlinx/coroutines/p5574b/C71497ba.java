package kotlinx.coroutines.p5574b;

import kotlinx.coroutines.p5574b.p5575a.C71428a;
import kotlinx.coroutines.p5574b.p5575a.C71429aa;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", mo61344c = "Limit.kt", mo61345d = "invokeSuspend", mo61346e = {152})
/* renamed from: kotlinx.coroutines.b.ba */
/* compiled from: PG */
public final class C71497ba extends C69572j implements C69630p {

    /* renamed from: a */
    int f190809a;

    /* renamed from: b */
    final /* synthetic */ C71587n f190810b;

    /* renamed from: c */
    final /* synthetic */ C69631q f190811c;

    /* renamed from: d */
    private /* synthetic */ Object f190812d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71497ba(C71587n nVar, C69631q qVar, C69577g gVar) {
        super(2, gVar);
        this.f190810b = nVar;
        this.f190811c = qVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C71497ba) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C71495az azVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f190809a != 0) {
            azVar = (C71495az) this.f190812d;
            try {
                C69714l.m101134b(obj);
            } catch (C71428a e) {
                e = e;
            }
        } else {
            C69714l.m101134b(obj);
            C71587n nVar = this.f190810b;
            C71495az azVar2 = new C71495az(this.f190811c, (C71588o) this.f190812d);
            try {
                this.f190812d = azVar2;
                this.f190809a = 1;
                if (nVar.mo38165mp(azVar2, this) == aVar) {
                    return aVar;
                }
            } catch (C71428a e2) {
                e = e2;
                azVar = azVar2;
                C71429aa.m104202a(e, azVar);
                return C69788q.f186170a;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C71497ba baVar = new C71497ba(this.f190810b, this.f190811c, gVar);
        baVar.f190812d = obj;
        return baVar;
    }
}
