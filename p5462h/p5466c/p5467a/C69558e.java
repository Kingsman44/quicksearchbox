package p5462h.p5466c.p5467a;

import p5462h.C69714l;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69570h;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69651ah;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.c.a.e */
/* compiled from: PG */
public final class C69558e extends C69570h {

    /* renamed from: a */
    final /* synthetic */ C69630p f185964a;

    /* renamed from: b */
    final /* synthetic */ Object f185965b;

    /* renamed from: c */
    private int f185966c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69558e(C69577g gVar, C69630p pVar, Object obj) {
        super(gVar);
        this.f185964a = pVar;
        this.f185965b = obj;
        C69664n.m101059e(gVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        int i = this.f185966c;
        if (i == 0) {
            this.f185966c = 1;
            C69714l.m101134b(obj);
            C69664n.m101059e(this.f185964a, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
            C69630p pVar = this.f185964a;
            C69651ah.m101037b(pVar, 2);
            return pVar.mo5192a(this.f185965b, this);
        } else if (i == 1) {
            this.f185966c = 2;
            C69714l.m101134b(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed");
        }
    }
}
