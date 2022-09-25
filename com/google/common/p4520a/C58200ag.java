package com.google.common.p4520a;

import java.util.Iterator;

/* renamed from: com.google.common.a.ag */
/* compiled from: PG */
final class C58200ag extends C58262q {

    /* renamed from: b */
    final /* synthetic */ C58234bn f155640b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58200ag(C58234bn bnVar) {
        super(bnVar);
        this.f155640b = bnVar;
    }

    public final boolean contains(Object obj) {
        return this.f155640b.containsKey(obj);
    }

    public final Iterator iterator() {
        return new C58199af(this.f155640b);
    }

    public final boolean remove(Object obj) {
        return this.f155640b.remove(obj) != null;
    }
}
