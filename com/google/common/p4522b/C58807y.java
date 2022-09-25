package com.google.common.p4522b;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: com.google.common.b.y */
/* compiled from: PG */
class C58807y extends AbstractCollection {

    /* renamed from: a */
    final Object f156596a;

    /* renamed from: b */
    Collection f156597b;

    /* renamed from: c */
    final C58807y f156598c;

    /* renamed from: d */
    final Collection f156599d;

    /* renamed from: e */
    final /* synthetic */ C58307ae f156600e;

    public C58807y(C58307ae aeVar, Object obj, Collection collection, C58807y yVar) {
        this.f156600e = aeVar;
        this.f156596a = obj;
        this.f156597b = collection;
        this.f156598c = yVar;
        this.f156599d = yVar == null ? null : yVar.f156597b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo56046a() {
        C58807y yVar = this.f156598c;
        if (yVar != null) {
            yVar.mo56046a();
        } else {
            this.f156600e.f155873a.put(this.f156596a, this.f156597b);
        }
    }

    public final boolean add(Object obj) {
        mo56049b();
        boolean isEmpty = this.f156597b.isEmpty();
        boolean add = this.f156597b.add(obj);
        if (!add) {
            return add;
        }
        C58307ae.m89285y(this.f156600e);
        if (!isEmpty) {
            return add;
        }
        mo56046a();
        return true;
    }

    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f156597b.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f156597b.size();
        this.f156600e.f155874b += size2 - size;
        if (size != 0) {
            return addAll;
        }
        mo56046a();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo56049b() {
        Collection collection;
        C58807y yVar = this.f156598c;
        if (yVar != null) {
            yVar.mo56049b();
            if (this.f156598c.f156597b != this.f156599d) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f156597b.isEmpty() && (collection = (Collection) this.f156600e.f155873a.get(this.f156596a)) != null) {
            this.f156597b = collection;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo56050c() {
        C58807y yVar = this.f156598c;
        if (yVar != null) {
            yVar.mo56050c();
        } else if (this.f156597b.isEmpty()) {
            this.f156600e.f155873a.remove(this.f156596a);
        }
    }

    public final void clear() {
        int size = size();
        if (size != 0) {
            this.f156597b.clear();
            this.f156600e.f155874b -= size;
            mo56050c();
        }
    }

    public final boolean contains(Object obj) {
        mo56049b();
        return this.f156597b.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        mo56049b();
        return this.f156597b.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        mo56049b();
        return this.f156597b.equals(obj);
    }

    public final int hashCode() {
        mo56049b();
        return this.f156597b.hashCode();
    }

    public final Iterator iterator() {
        mo56049b();
        return new C58806x(this);
    }

    public final boolean remove(Object obj) {
        mo56049b();
        boolean remove = this.f156597b.remove(obj);
        if (remove) {
            C58307ae.m89286z(this.f156600e);
            mo56050c();
        }
        return remove;
    }

    public boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f156597b.removeAll(collection);
        if (removeAll) {
            int size2 = this.f156597b.size();
            this.f156600e.f155874b += size2 - size;
            mo56050c();
        }
        return removeAll;
    }

    public final int size() {
        mo56049b();
        return this.f156597b.size();
    }

    public final String toString() {
        mo56049b();
        return this.f156597b.toString();
    }

    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f156597b.retainAll(collection);
        if (retainAll) {
            int size2 = this.f156597b.size();
            this.f156600e.f155874b += size2 - size;
            mo56050c();
        }
        return retainAll;
    }
}
