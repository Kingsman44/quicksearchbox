package p5462h.p5466c.p5467a;

import p5462h.C69714l;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69570h;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69651ah;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.c.a.c */
/* compiled from: PG */
public final class C69556c extends C69570h {

    /* renamed from: a */
    final /* synthetic */ C69626l f185960a;

    /* renamed from: b */
    private int f185961b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69556c(C69577g gVar, C69626l lVar) {
        super(gVar);
        this.f185960a = lVar;
        C69664n.m101059e(gVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        int i = this.f185961b;
        if (i == 0) {
            this.f185961b = 1;
            C69714l.m101134b(obj);
            C69664n.m101059e(this.f185960a, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-0>, kotlin.Any?>");
            C69626l lVar = this.f185960a;
            C69651ah.m101037b(lVar, 1);
            return lVar.mo5761a(this);
        } else if (i == 1) {
            this.f185961b = 2;
            C69714l.m101134b(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed");
        }
    }
}
