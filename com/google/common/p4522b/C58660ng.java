package com.google.common.p4522b;

import com.google.common.base.C58832aw;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.common.b.ng */
/* compiled from: PG */
class C58660ng extends AbstractCollection {

    /* renamed from: c */
    final Map f156389c;

    public C58660ng(Map map) {
        this.f156389c = map;
    }

    public final void clear() {
        this.f156389c.clear();
    }

    public final boolean contains(Object obj) {
        return this.f156389c.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.f156389c.isEmpty();
    }

    public final Iterator iterator() {
        return new C58639mm(this.f156389c.entrySet().iterator());
    }

    public boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            for (Map.Entry entry : this.f156389c.entrySet()) {
                if (C58832aw.m90831a(obj, entry.getValue())) {
                    this.f156389c.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    public final int size() {
        return this.f156389c.size();
    }

    public boolean removeAll(Collection collection) {
        collection.getClass();
        try {
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : this.f156389c.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.f156389c.keySet().removeAll(hashSet);
        }
    }

    public boolean retainAll(Collection collection) {
        collection.getClass();
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : this.f156389c.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.f156389c.keySet().retainAll(hashSet);
        }
    }
}
