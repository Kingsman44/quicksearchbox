package com.google.common.p4522b;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.common.b.aa */
/* compiled from: PG */
class C58303aa extends C58807y implements List {

    /* renamed from: f */
    final /* synthetic */ C58307ae f155869f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58303aa(C58307ae aeVar, Object obj, List list, C58807y yVar) {
        super(aeVar, obj, list, yVar);
        this.f155869f = aeVar;
    }

    public final void add(int i, Object obj) {
        mo56049b();
        boolean isEmpty = this.f156597b.isEmpty();
        ((List) this.f156597b).add(i, obj);
        C58307ae.m89285y(this.f155869f);
        if (isEmpty) {
            mo56046a();
        }
    }

    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f156597b).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f156597b.size();
        this.f155869f.f155874b += size2 - size;
        if (size != 0) {
            return addAll;
        }
        mo56046a();
        return true;
    }

    public final Object get(int i) {
        mo56049b();
        return ((List) this.f156597b).get(i);
    }

    public final int indexOf(Object obj) {
        mo56049b();
        return ((List) this.f156597b).indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        mo56049b();
        return ((List) this.f156597b).lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        mo56049b();
        return new C58808z(this);
    }

    public final Object remove(int i) {
        mo56049b();
        Object remove = ((List) this.f156597b).remove(i);
        C58307ae.m89286z(this.f155869f);
        mo56050c();
        return remove;
    }

    public final Object set(int i, Object obj) {
        mo56049b();
        return ((List) this.f156597b).set(i, obj);
    }

    public final List subList(int i, int i2) {
        mo56049b();
        C58307ae aeVar = this.f155869f;
        Object obj = this.f156596a;
        List subList = ((List) this.f156597b).subList(i, i2);
        C58807y yVar = this.f156598c;
        if (yVar == null) {
            yVar = this;
        }
        return aeVar.mo54912p(obj, subList, yVar);
    }

    public final ListIterator listIterator(int i) {
        mo56049b();
        return new C58808z(this, i);
    }
}
