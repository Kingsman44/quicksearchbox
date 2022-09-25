package kotlinx.coroutines.p5574b;

import android.support.p033v7.widget.LinearLayoutManager;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69567e;

@C69567e(mo61343b = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", mo61344c = "Distinct.kt", mo61345d = "emit", mo61346e = {81})
/* renamed from: kotlinx.coroutines.b.k */
/* compiled from: PG */
final class C71584k extends C69565c {

    /* renamed from: a */
    /* synthetic */ Object f191014a;

    /* renamed from: b */
    final /* synthetic */ C71585l f191015b;

    /* renamed from: c */
    int f191016c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71584k(C71585l lVar, C69577g gVar) {
        super(gVar);
        this.f191015b = lVar;
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        this.f191014a = obj;
        this.f191016c |= LinearLayoutManager.INVALID_OFFSET;
        return this.f191015b.mo20883a((Object) null, this);
    }
}
