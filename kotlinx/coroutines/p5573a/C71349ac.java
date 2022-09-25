package kotlinx.coroutines.p5573a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69702k;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", mo61344c = "Channels.kt", mo61345d = "invokeSuspend", mo61346e = {39})
/* renamed from: kotlinx.coroutines.a.ac */
/* compiled from: PG */
final class C71349ac extends C69572j implements C69630p {

    /* renamed from: a */
    int f190541a;

    /* renamed from: b */
    final /* synthetic */ C71367au f190542b;

    /* renamed from: c */
    final /* synthetic */ Object f190543c;

    /* renamed from: d */
    private /* synthetic */ Object f190544d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71349ac(C71367au auVar, Object obj, C69577g gVar) {
        super(2, gVar);
        this.f190542b = auVar;
        this.f190543c = obj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C71349ac) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        Object obj3;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f190541a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                obj2 = C69714l.m101133a(th);
            }
        } else {
            C69714l.m101134b(obj);
            C71422aw awVar = (C71422aw) this.f190544d;
            C71367au auVar = this.f190542b;
            Object obj4 = this.f190543c;
            this.f190541a = 1;
            if (auVar.mo62729v(obj4, this) == aVar) {
                return aVar;
            }
        }
        obj2 = C69788q.f186170a;
        if (C69702k.m101125b(obj2)) {
            obj3 = C69788q.f186170a;
        } else {
            obj3 = new C71393z(C69702k.m101124a(obj2));
        }
        return new C71348ab(obj3);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C71349ac acVar = new C71349ac(this.f190542b, this.f190543c, gVar);
        acVar.f190544d = obj;
        return acVar;
    }
}
