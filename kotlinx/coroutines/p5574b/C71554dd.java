package kotlinx.coroutines.p5574b;

import kotlinx.coroutines.C71615bp;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.dd */
/* compiled from: PG */
final class C71554dd implements C71615bp {

    /* renamed from: a */
    public final C71556df f190944a;

    /* renamed from: b */
    public final long f190945b;

    /* renamed from: c */
    public final Object f190946c;

    /* renamed from: d */
    public final C69577g f190947d;

    public C71554dd(C71556df dfVar, long j, Object obj, C69577g gVar) {
        this.f190944a = dfVar;
        this.f190945b = j;
        this.f190946c = obj;
        this.f190947d = gVar;
    }

    /* renamed from: lT */
    public final void mo62732lT() {
        C71556df dfVar = this.f190944a;
        synchronized (dfVar) {
            if (this.f190945b >= dfVar.mo62809f()) {
                Object[] objArr = dfVar.f190955a;
                C69664n.m101058d(objArr);
                if (C71557dg.m104443a(objArr, this.f190945b) == this) {
                    C71557dg.m104446d(objArr, this.f190945b, C71557dg.f190963a);
                    dfVar.mo62811j();
                }
            }
        }
    }
}
