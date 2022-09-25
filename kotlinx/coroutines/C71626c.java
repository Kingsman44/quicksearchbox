package kotlinx.coroutines;

import java.util.ArrayList;
import kotlinx.p5572a.C71340c;
import kotlinx.p5572a.C71342e;
import kotlinx.p5572a.C71343f;
import p5462h.C69788q;

/* renamed from: kotlinx.coroutines.c */
/* compiled from: PG */
final class C71626c extends C71648cu {

    /* renamed from: a */
    public C71615bp f191066a;

    /* renamed from: b */
    public final C71342e f191067b = new C71342e((Object) null, C71343f.f190534a);

    /* renamed from: c */
    final /* synthetic */ C71691e f191068c;

    /* renamed from: g */
    private final C71807q f191069g;

    public C71626c(C71691e eVar, C71807q qVar) {
        this.f191068c = eVar;
        this.f191069g = qVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        mo62762b((Throwable) obj);
        return C69788q.f186170a;
    }

    /* renamed from: b */
    public final void mo62762b(Throwable th) {
        if (th == null) {
            if (C71340c.f190525a.decrementAndGet(this.f191068c.f191148b) == 0) {
                C71807q qVar = this.f191069g;
                ArrayList arrayList = new ArrayList(r2);
                for (C71604be f : this.f191068c.f191147a) {
                    arrayList.add(f.mo62826f());
                }
                qVar.mo61338mb(arrayList);
            }
        } else if (this.f191069g.mo63034e(th) != null) {
            C71807q qVar2 = this.f191069g;
            boolean z = C71600ba.f191036a;
            C71808r rVar = (C71808r) qVar2;
            rVar.mo63049z(rVar.f191046f);
            C71654d dVar = (C71654d) this.f191067b.f190532a;
            if (dVar != null) {
                dVar.mo62890b();
            }
        }
    }
}
