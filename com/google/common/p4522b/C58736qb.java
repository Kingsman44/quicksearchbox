package com.google.common.p4522b;

/* renamed from: com.google.common.b.qb */
/* compiled from: PG */
final class C58736qb extends C58548jc {

    /* renamed from: a */
    final /* synthetic */ C58738qd f156508a;

    public C58736qb(C58738qd qdVar) {
        this.f156508a = qdVar;
    }

    /* renamed from: a */
    public final boolean mo55032a() {
        return false;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo55447b(int i) {
        return this.f156508a.mo55200r(i);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof C58784rw) {
            C58784rw rwVar = (C58784rw) obj;
            Object a = this.f156508a.mo55009a(rwVar.mo55972b(), rwVar.mo55971a());
            if (a == null || !a.equals(rwVar.mo55973c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int size() {
        return this.f156508a.mo55196n();
    }
}
