package com.google.common.p4522b;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.common.b.ev */
/* compiled from: PG */
public abstract class C58432ev extends C58443ff implements Collection {
    protected C58432ev() {
    }

    public boolean add(Object obj) {
        return mo55040b().add(obj);
    }

    public boolean addAll(Collection collection) {
        return mo55040b().addAll(collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Collection mo55040b();

    public void clear() {
        mo55040b().clear();
    }

    public boolean contains(Object obj) {
        return mo55040b().contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return mo55040b().containsAll(collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: hU */
    public /* bridge */ /* synthetic */ Object mo5948hU() {
        throw null;
    }

    public final boolean isEmpty() {
        return mo55040b().isEmpty();
    }

    public Iterator iterator() {
        return mo55040b().iterator();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object[] mo55252r() {
        return toArray(new Object[size()]);
    }

    public boolean remove(Object obj) {
        return mo55040b().remove(obj);
    }

    public boolean removeAll(Collection collection) {
        return mo55040b().removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        return mo55040b().retainAll(collection);
    }

    public final int size() {
        return mo55040b().size();
    }

    public Object[] toArray() {
        return mo55040b().toArray();
    }

    public Object[] toArray(Object[] objArr) {
        return mo55040b().toArray(objArr);
    }
}
