package p5488io.p5490b.p5497e.p5502e.p5507e;

import java.util.concurrent.atomic.AtomicReference;
import org.p5649d.C72640c;
import p5488io.p5490b.C70094g;
import p5488io.p5490b.p5497e.p5500c.C69846e;
import p5488io.p5490b.p5497e.p5509f.C70037c;
import p5488io.p5490b.p5497e.p5512i.C70079c;

/* renamed from: io.b.e.e.e.e */
/* compiled from: PG */
final class C70001e extends AtomicReference implements C70094g {
    private static final long serialVersionUID = 8410034718427740355L;

    /* renamed from: a */
    final C70002f f186598a;

    /* renamed from: b */
    final int f186599b;

    /* renamed from: c */
    final int f186600c;

    /* renamed from: d */
    long f186601d;

    /* renamed from: e */
    volatile C69846e f186602e;

    public C70001e(C70002f fVar, int i) {
        this.f186598a = fVar;
        this.f186599b = i;
        this.f186600c = i - (i >> 2);
    }

    /* renamed from: a */
    public final void mo61494a(C72640c cVar) {
        long j = (long) this.f186599b;
        if (C70079c.m101975f(this, cVar)) {
            cVar.mo61489e(j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C69846e mo61566b() {
        C69846e eVar = this.f186602e;
        if (eVar != null) {
            return eVar;
        }
        C70037c cVar = new C70037c(this.f186599b);
        this.f186602e = cVar;
        return cVar;
    }

    /* renamed from: f */
    public final void mo61497f(Throwable th) {
        this.f186598a.mo61570f(th);
    }

    /* renamed from: g */
    public final void mo61498g(Object obj) {
        this.f186598a.mo61571g(this, obj);
    }

    /* renamed from: lK */
    public final void mo61499lK() {
        this.f186598a.mo61569c();
    }
}
