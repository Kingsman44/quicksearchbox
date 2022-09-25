package kotlinx.coroutines.p5574b;

import android.support.p033v7.widget.LinearLayoutManager;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69567e;

@C69567e(mo61343b = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", mo61344c = "Context.kt", mo61345d = "emit", mo61346e = {275})
/* renamed from: kotlinx.coroutines.b.f */
/* compiled from: PG */
final class C71579f extends C69565c {

    /* renamed from: a */
    /* synthetic */ Object f191006a;

    /* renamed from: b */
    final /* synthetic */ C71580g f191007b;

    /* renamed from: c */
    int f191008c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71579f(C71580g gVar, C69577g gVar2) {
        super(gVar2);
        this.f191007b = gVar;
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        this.f191006a = obj;
        this.f191008c |= LinearLayoutManager.INVALID_OFFSET;
        return this.f191007b.mo20883a((Object) null, this);
    }
}
