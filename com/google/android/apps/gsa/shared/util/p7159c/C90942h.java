package com.google.android.apps.gsa.shared.util.p7159c;

/* renamed from: com.google.android.apps.gsa.shared.util.c.h */
/* compiled from: PG */
final class C90942h extends C90880an {

    /* renamed from: a */
    final /* synthetic */ Object[] f254133a;

    /* renamed from: b */
    final /* synthetic */ C90945k f254134b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90942h(C90945k kVar, String str, int i, int i2, Object[] objArr) {
        super(str, i, i2);
        this.f254134b = kVar;
        this.f254133a = objArr;
    }

    public final Object call() {
        Object a = this.f254134b.mo77936a(this.f254133a);
        C90945k kVar = this.f254134b;
        if (!kVar.f254144f.get()) {
            kVar.f254143e.mo85151p(new C90943i(kVar, kVar.f254142d.concat(", post-execute"), a));
        } else {
            kVar.f254143e.mo85151p(new C90944j(kVar, kVar.f254142d.concat(", cancelled"), a));
        }
        return a;
    }
}
