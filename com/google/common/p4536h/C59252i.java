package com.google.common.p4536h;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.common.h.i */
/* compiled from: PG */
final class C59252i extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ C59257n f157357a;

    public C59252i(C59257n nVar) {
        this.f157357a = nVar;
    }

    public final boolean contains(Object obj) {
        return C59257n.m92000a(this.f157357a.f157361b.get(obj));
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        C59257n nVar = this.f157357a;
        List list = nVar.f157362c;
        if (list == null) {
            return new C59250g(nVar.f157361b.entrySet().iterator());
        }
        return new C59251h(list.iterator());
    }

    public final int size() {
        return this.f157357a.f157364e;
    }
}
