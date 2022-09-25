package kotlinx.coroutines.android;

import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: kotlinx.coroutines.android.c */
/* compiled from: PG */
final class C71410c extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C71411d f190617a;

    /* renamed from: b */
    final /* synthetic */ Runnable f190618b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71410c(C71411d dVar, Runnable runnable) {
        super(1);
        this.f190617a = dVar;
        this.f190618b = runnable;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        Throwable th = (Throwable) obj;
        this.f190617a.f190619c.removeCallbacks(this.f190618b);
        return C69788q.f186170a;
    }
}
