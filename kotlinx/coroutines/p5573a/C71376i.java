package kotlinx.coroutines.p5573a;

import android.support.p033v7.widget.LinearLayoutManager;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69567e;

@C69567e(mo61343b = "kotlinx.coroutines.channels.AbstractChannel", mo61344c = "AbstractChannel.kt", mo61345d = "receiveCatching-JP2dKIU", mo61346e = {633})
/* renamed from: kotlinx.coroutines.a.i */
/* compiled from: PG */
final class C71376i extends C69565c {

    /* renamed from: a */
    /* synthetic */ Object f190565a;

    /* renamed from: b */
    final /* synthetic */ C71377j f190566b;

    /* renamed from: c */
    int f190567c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71376i(C71377j jVar, C69577g gVar) {
        super(gVar);
        this.f190566b = jVar;
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        this.f190565a = obj;
        this.f190567c |= LinearLayoutManager.INVALID_OFFSET;
        Object d = this.f190566b.mo62719d(this);
        return d == C69554a.COROUTINE_SUSPENDED ? d : new C71348ab(d);
    }
}
