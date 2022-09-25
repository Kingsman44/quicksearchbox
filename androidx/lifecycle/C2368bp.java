package androidx.lifecycle;

import androidx.lifecycle.p127a.C2320a;
import androidx.lifecycle.p127a.C2322c;
import androidx.lifecycle.p127a.C2324e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.lifecycle.bp */
/* compiled from: PG */
public final class C2368bp {

    /* renamed from: a */
    private final C2370br f6587a;

    /* renamed from: b */
    private final C2363bk f6588b;

    /* renamed from: c */
    private final C2322c f6589c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C2368bp(C2370br brVar, C2363bk bkVar) {
        this(brVar, bkVar, C2320a.f6515a);
        C69664n.m101061g(brVar, "store");
        C69664n.m101061g(bkVar, "factory");
    }

    public C2368bp(C2370br brVar, C2363bk bkVar, C2322c cVar) {
        C69664n.m101061g(brVar, "store");
        C69664n.m101061g(bkVar, "factory");
        C69664n.m101061g(cVar, "defaultCreationExtras");
        this.f6587a = brVar;
        this.f6588b = bkVar;
        this.f6589c = cVar;
    }

    /* renamed from: a */
    public final C2358bf mo5770a(Class cls) {
        C69664n.m101061g(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo5771b("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public final C2358bf mo5771b(String str, Class cls) {
        C2358bf bfVar;
        C69664n.m101061g(cls, "modelClass");
        C2358bf a = this.f6587a.mo5772a(str);
        if (cls.isInstance(a)) {
            C2363bk bkVar = this.f6588b;
            C2367bo boVar = bkVar instanceof C2367bo ? (C2367bo) bkVar : null;
            if (boVar != null) {
                C69664n.m101060f(a, "viewModel");
                boVar.mo5721c(a);
            }
            C69664n.m101059e(a, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return a;
        }
        C2324e eVar = new C2324e(this.f6589c);
        eVar.mo5724b(C2366bn.f6586d, str);
        try {
            bfVar = this.f6588b.mo635b(cls, eVar);
        } catch (AbstractMethodError unused) {
            bfVar = this.f6588b.mo634a(cls);
        }
        C2358bf bfVar2 = (C2358bf) this.f6587a.f6590a.put(str, bfVar);
        if (bfVar2 != null) {
            bfVar2.mo639d();
        }
        return bfVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2368bp(androidx.lifecycle.C2371bs r4) {
        /*
            r3 = this;
            java.lang.String r0 = "owner"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r0)
            androidx.lifecycle.br r1 = r4.getViewModelStore()
            java.lang.String r2 = "owner.viewModelStore"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r0)
            boolean r0 = r4 instanceof androidx.lifecycle.C2380k
            if (r0 == 0) goto L_0x0022
            r0 = r4
            androidx.lifecycle.k r0 = (androidx.lifecycle.C2380k) r0
            androidx.lifecycle.bk r0 = r0.getDefaultViewModelProviderFactory()
            java.lang.String r2 = "owner.defaultViewModelProviderFactory"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)
            goto L_0x0026
        L_0x0022:
            androidx.lifecycle.bn r0 = androidx.lifecycle.C2365bm.m6363a()
        L_0x0026:
            androidx.lifecycle.a.c r4 = androidx.lifecycle.C2369bq.m6369a(r4)
            r3.<init>(r1, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C2368bp.<init>(androidx.lifecycle.bs):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2368bp(androidx.lifecycle.C2371bs r3, androidx.lifecycle.C2363bk r4) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r0)
            androidx.lifecycle.br r0 = r3.getViewModelStore()
            java.lang.String r1 = "owner.viewModelStore"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            androidx.lifecycle.a.c r3 = androidx.lifecycle.C2369bq.m6369a(r3)
            r2.<init>(r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C2368bp.<init>(androidx.lifecycle.bs, androidx.lifecycle.bk):void");
    }
}
