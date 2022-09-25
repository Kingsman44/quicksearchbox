package p5488io.p5490b.p5497e.p5502e.p5508f;

import java.util.Arrays;
import p5488io.p5490b.C70130v;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69812e;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5496d.C69822d;

/* renamed from: io.b.e.e.f.v */
/* compiled from: PG */
final class C70031v implements C70130v {

    /* renamed from: a */
    final /* synthetic */ C70032w f186670a;

    /* renamed from: b */
    private final C70130v f186671b;

    public C70031v(C70032w wVar, C70130v vVar) {
        this.f186670a = wVar;
        this.f186671b = vVar;
    }

    /* renamed from: b */
    public final void mo26091b(Throwable th) {
        Object obj;
        C69822d dVar = this.f186670a.f186673b;
        if (dVar != null) {
            try {
                obj = dVar.mo25875a(th);
            } catch (Throwable th2) {
                C69813f.m101292a(th2);
                this.f186671b.mo26091b(new C69812e(Arrays.asList(new Throwable[]{th, th2})));
                return;
            }
        } else {
            obj = null;
        }
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
            nullPointerException.initCause(th);
            this.f186671b.mo26091b(nullPointerException);
            return;
        }
        this.f186671b.mo61488d(obj);
    }

    /* renamed from: d */
    public final void mo61488d(Object obj) {
        this.f186671b.mo61488d(obj);
    }

    /* renamed from: lO */
    public final void mo61460lO(C69803b bVar) {
        this.f186671b.mo61460lO(bVar);
    }
}
