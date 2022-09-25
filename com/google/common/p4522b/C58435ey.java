package com.google.common.p4522b;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.common.b.ey */
/* compiled from: PG */
public abstract class C58435ey extends C58432ev implements List {
    protected C58435ey() {
    }

    public void add(int i, Object obj) {
        mo55257c().add(i, obj);
    }

    public boolean addAll(int i, Collection collection) {
        return mo55257c().addAll(i, collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Collection mo55040b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract List mo55257c();

    public final boolean equals(Object obj) {
        return obj == this || mo55257c().equals(obj);
    }

    public final Object get(int i) {
        return mo55257c().get(i);
    }

    public final int hashCode() {
        return mo55257c().hashCode();
    }

    public final int indexOf(Object obj) {
        return mo55257c().indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        return mo55257c().lastIndexOf(obj);
    }

    public ListIterator listIterator() {
        return mo55257c().listIterator();
    }

    public final Object remove(int i) {
        return mo55257c().remove(i);
    }

    public Object set(int i, Object obj) {
        return mo55257c().set(i, obj);
    }

    public List subList(int i, int i2) {
        return mo55257c().subList(i, i2);
    }

    public ListIterator listIterator(int i) {
        return mo55257c().listIterator(i);
    }
}
