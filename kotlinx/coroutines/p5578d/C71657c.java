package kotlinx.coroutines.p5578d;

import kotlinx.coroutines.C71345a;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.d.c */
/* compiled from: PG */
final class C71657c extends C71345a {

    /* renamed from: b */
    public final C71656b f191108b = new C71656b(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71657c(C69585o oVar) {
        super(oVar, true, true);
        C69664n.m101061g(oVar, "context");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo62681j(Throwable th, boolean z) {
        C69664n.m101061g(th, "cause");
        this.f191108b.mo62892a(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo62682k(Object obj) {
        this.f191108b.f191105a.mo57356n(obj);
    }
}
