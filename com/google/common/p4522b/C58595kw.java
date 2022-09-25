package com.google.common.p4522b;

import com.google.common.base.C58817ah;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.common.b.kw */
/* compiled from: PG */
final class C58595kw extends AbstractSequentialList implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final List f156292a;

    /* renamed from: b */
    final C58817ah f156293b;

    public C58595kw(List list, C58817ah ahVar) {
        list.getClass();
        this.f156292a = list;
        ahVar.getClass();
        this.f156293b = ahVar;
    }

    public final void clear() {
        this.f156292a.clear();
    }

    public final ListIterator listIterator(int i) {
        return new C58594kv(this, this.f156292a.listIterator(i));
    }

    public final int size() {
        return this.f156292a.size();
    }
}
