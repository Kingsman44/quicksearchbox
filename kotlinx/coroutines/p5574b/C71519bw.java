package kotlinx.coroutines.p5574b;

import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", mo61344c = "Share.kt", mo61345d = "invokeSuspend", mo61346e = {227})
/* renamed from: kotlinx.coroutines.b.bw */
/* compiled from: PG */
final class C71519bw extends C69572j implements C69630p {

    /* renamed from: a */
    int f190863a;

    /* renamed from: b */
    /* synthetic */ Object f190864b;

    /* renamed from: c */
    final /* synthetic */ C71587n f190865c;

    /* renamed from: d */
    final /* synthetic */ C71547cx f190866d;

    /* renamed from: e */
    final /* synthetic */ Object f190867e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71519bw(C71587n nVar, C71547cx cxVar, Object obj, C69577g gVar) {
        super(2, gVar);
        this.f190865c = nVar;
        this.f190866d = cxVar;
        this.f190867e = obj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C71519bw) mo5194c((C71559di) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f190863a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71559di diVar = C71559di.START;
            int ordinal = ((C71559di) this.f190864b).ordinal();
            if (ordinal == 0) {
                C71587n nVar = this.f190865c;
                C71547cx cxVar = this.f190866d;
                this.f190863a = 1;
                if (nVar.mo38165mp(cxVar, this) == aVar) {
                    return aVar;
                }
            } else if (ordinal == 2) {
                Object obj2 = this.f190867e;
                if (obj2 == C71557dg.f190963a) {
                    this.f190866d.mo62805c();
                } else {
                    this.f190866d.mo62806d(obj2);
                }
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C71519bw bwVar = new C71519bw(this.f190865c, this.f190866d, this.f190867e, gVar);
        bwVar.f190864b = obj;
        return bwVar;
    }
}
