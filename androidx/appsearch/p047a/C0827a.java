package androidx.appsearch.p047a;

import androidx.p060c.C0977g;
import androidx.p060c.C0984n;

/* renamed from: androidx.appsearch.a.a */
/* compiled from: PG */
public final class C0827a {

    /* renamed from: a */
    public C0977g f2784a = new C0977g();

    /* renamed from: b */
    public C0977g f2785b = new C0977g();

    /* renamed from: c */
    public C0977g f2786c = new C0977g();

    /* renamed from: d */
    public boolean f2787d = false;

    /* renamed from: a */
    public final void mo3371a() {
        if (this.f2787d) {
            this.f2784a = new C0977g((C0984n) this.f2784a);
            this.f2785b = new C0977g((C0984n) this.f2785b);
            this.f2786c = new C0977g((C0984n) this.f2786c);
            this.f2787d = false;
        }
    }

    /* renamed from: b */
    public final void mo3372b(Object obj, C0838c cVar) {
        obj.getClass();
        mo3371a();
        if (cVar.mo3387c()) {
            C0977g gVar = this.f2784a;
            if (cVar.mo3387c()) {
                gVar.put(obj, cVar.f2817b);
                this.f2785b.remove(obj);
            } else {
                new StringBuilder("AppSearchResult is a failure: ").append(cVar);
                throw new IllegalStateException("AppSearchResult is a failure: ".concat(cVar.toString()));
            }
        } else {
            this.f2785b.put(obj, cVar);
            this.f2784a.remove(obj);
        }
        this.f2786c.put(obj, cVar);
    }
}
