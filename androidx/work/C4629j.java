package androidx.work;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", mo61344c = "CoroutineWorker.kt", mo61345d = "invokeSuspend", mo61346e = {134})
/* renamed from: androidx.work.j */
/* compiled from: PG */
final class C4629j extends C69572j implements C69630p {

    /* renamed from: a */
    Object f14543a;

    /* renamed from: b */
    int f14544b;

    /* renamed from: c */
    final /* synthetic */ C4642w f14545c;

    /* renamed from: d */
    final /* synthetic */ CoroutineWorker f14546d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4629j(C4642w wVar, CoroutineWorker coroutineWorker, C69577g gVar) {
        super(2, gVar);
        this.f14545c = wVar;
        this.f14546d = coroutineWorker;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C4629j) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f14544b != 0) {
            Object obj2 = this.f14543a;
            C69714l.m101134b(obj);
            ((C4642w) obj2).f14564a.mo9537e(obj);
            return C69788q.f186170a;
        }
        C69714l.m101134b(obj);
        this.f14543a = this.f14545c;
        this.f14544b = 1;
        throw new IllegalStateException("Not implemented");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C4629j(this.f14545c, this.f14546d, gVar);
    }
}
