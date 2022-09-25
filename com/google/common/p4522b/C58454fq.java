package com.google.common.p4522b;

/* renamed from: com.google.common.b.fq */
/* compiled from: PG */
final class C58454fq extends C58457ft {

    /* renamed from: a */
    final /* synthetic */ C58458fu f156063a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58454fq(C58458fu fuVar) {
        super(fuVar);
        this.f156063a = fuVar;
    }

    /* renamed from: a */
    public final Object mo55310a(int i) {
        return this.f156063a.f156071a[i];
    }

    public final boolean contains(Object obj) {
        return this.f156063a.containsKey(obj);
    }

    public final boolean remove(Object obj) {
        int b = C58462fy.m89758b(obj);
        int b2 = this.f156063a.mo55333b(obj, b);
        if (b2 == -1) {
            return false;
        }
        this.f156063a.mo55341g(b2, b);
        return true;
    }
}
