package kotlinx.coroutines.p5574b;

import android.support.p033v7.widget.LinearLayoutManager;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69567e;

@C69567e(mo61343b = "kotlinx.coroutines.flow.StartedLazily$command$1$1", mo61344c = "SharingStarted.kt", mo61345d = "emit", mo61346e = {158})
/* renamed from: kotlinx.coroutines.b.dn */
/* compiled from: PG */
final class C71564dn extends C69565c {

    /* renamed from: a */
    /* synthetic */ Object f190977a;

    /* renamed from: b */
    final /* synthetic */ C71565do f190978b;

    /* renamed from: c */
    int f190979c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71564dn(C71565do doVar, C69577g gVar) {
        super(gVar);
        this.f190978b = doVar;
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        this.f190977a = obj;
        this.f190979c |= LinearLayoutManager.INVALID_OFFSET;
        return this.f190978b.mo62815b(0, this);
    }
}
