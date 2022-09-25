package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.f */
/* compiled from: PG */
abstract class C63035f extends AbstractList implements C62971cq {

    /* renamed from: a */
    public boolean f170142a = true;

    public void add(int i, Object obj) {
        mo59080lH();
        super.add(i, obj);
    }

    public boolean addAll(int i, Collection collection) {
        mo59080lH();
        return super.addAll(i, collection);
    }

    /* renamed from: b */
    public final void mo58947b() {
        this.f170142a = false;
    }

    /* renamed from: c */
    public final boolean mo58948c() {
        return this.f170142a;
    }

    public void clear() {
        mo59080lH();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: lH */
    public final void mo59080lH() {
        if (!this.f170142a) {
            throw new UnsupportedOperationException();
        }
    }

    public Object remove(int i) {
        mo59080lH();
        return super.remove(i);
    }

    public final boolean removeAll(Collection collection) {
        mo59080lH();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        mo59080lH();
        return super.retainAll(collection);
    }

    public Object set(int i, Object obj) {
        mo59080lH();
        return super.set(i, obj);
    }

    public boolean add(Object obj) {
        mo59080lH();
        return super.add(obj);
    }

    public boolean addAll(Collection collection) {
        mo59080lH();
        return super.addAll(collection);
    }

    public final boolean remove(Object obj) {
        mo59080lH();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
