package com.google.common.p4522b;

/* renamed from: com.google.common.b.fr */
/* compiled from: PG */
final class C58455fr extends C58457ft {

    /* renamed from: a */
    final /* synthetic */ C58458fu f156064a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58455fr(C58458fu fuVar) {
        super(fuVar);
        this.f156064a = fuVar;
    }

    /* renamed from: a */
    public final Object mo55310a(int i) {
        return this.f156064a.f156072b[i];
    }

    public final boolean contains(Object obj) {
        return this.f156064a.containsValue(obj);
    }

    public final boolean remove(Object obj) {
        int b = C58462fy.m89758b(obj);
        int c = this.f156064a.mo55334c(obj, b);
        if (c == -1) {
            return false;
        }
        this.f156064a.mo55343i(c, b);
        return true;
    }
}
