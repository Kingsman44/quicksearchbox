package androidx.work;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "androidx.work.CoroutineWorker$startWork$1", mo61344c = "CoroutineWorker.kt", mo61345d = "invokeSuspend", mo61346e = {68})
/* renamed from: androidx.work.k */
/* compiled from: PG */
final class C4630k extends C69572j implements C69630p {

    /* renamed from: a */
    int f14547a;

    /* renamed from: b */
    final /* synthetic */ CoroutineWorker f14548b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4630k(CoroutineWorker coroutineWorker, C69577g gVar) {
        super(2, gVar);
        this.f14548b = coroutineWorker;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C4630k) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f14547a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                this.f14548b.f13983a.mo9538f(th);
            }
        } else {
            C69714l.m101134b(obj);
            CoroutineWorker coroutineWorker = this.f14548b;
            this.f14547a = 1;
            obj = coroutineWorker.mo9298c(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        this.f14548b.f13983a.mo9537e((C4377aa) obj);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C4630k(this.f14548b, gVar);
    }
}
