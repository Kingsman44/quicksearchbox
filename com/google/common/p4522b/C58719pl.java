package com.google.common.p4522b;

/* renamed from: com.google.common.b.pl */
/* compiled from: PG */
final class C58719pl extends C58321as {

    /* renamed from: a */
    final Comparable f156460a;

    /* renamed from: b */
    final /* synthetic */ C58722po f156461b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58719pl(C58722po poVar, Comparable comparable) {
        super(comparable);
        this.f156461b = poVar;
        this.f156460a = poVar.first();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo54771a(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (C58722po.m90525X(comparable, this.f156460a)) {
            return null;
        }
        return ((C58418eh) this.f156461b.f156001a).mo55221b((Integer) comparable);
    }
}
