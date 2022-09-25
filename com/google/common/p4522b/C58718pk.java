package com.google.common.p4522b;

/* renamed from: com.google.common.b.pk */
/* compiled from: PG */
final class C58718pk extends C58321as {

    /* renamed from: a */
    final Comparable f156458a;

    /* renamed from: b */
    final /* synthetic */ C58722po f156459b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58718pk(C58722po poVar, Comparable comparable) {
        super(comparable);
        this.f156459b = poVar;
        this.f156458a = poVar.last();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo54771a(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (C58722po.m90525X(comparable, this.f156458a)) {
            return null;
        }
        return ((C58418eh) this.f156459b.f156001a).mo55220a((Integer) comparable);
    }
}
