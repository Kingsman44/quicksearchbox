package p5462h.p5466c.p5467a;

import p5462h.C69714l;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69651ah;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.c.a.f */
/* compiled from: PG */
public final class C69559f extends C69565c {

    /* renamed from: a */
    final /* synthetic */ C69630p f185967a;

    /* renamed from: b */
    final /* synthetic */ Object f185968b;

    /* renamed from: c */
    private int f185969c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69559f(C69577g gVar, C69585o oVar, C69630p pVar, Object obj) {
        super(gVar, oVar);
        this.f185967a = pVar;
        this.f185968b = obj;
        C69664n.m101059e(gVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        int i = this.f185969c;
        if (i == 0) {
            this.f185969c = 1;
            C69714l.m101134b(obj);
            C69664n.m101059e(this.f185967a, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
            C69630p pVar = this.f185967a;
            C69651ah.m101037b(pVar, 2);
            return pVar.mo5192a(this.f185968b, this);
        } else if (i == 1) {
            this.f185969c = 2;
            C69714l.m101134b(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed");
        }
    }
}
