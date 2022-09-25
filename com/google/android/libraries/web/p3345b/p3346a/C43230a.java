package com.google.android.libraries.web.p3345b.p3346a;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p5462h.p5473f.p5475b.C69658h;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69643d;

/* renamed from: com.google.android.libraries.web.b.a.a */
/* compiled from: PG */
public final class C43230a implements Set, C69643d {

    /* renamed from: a */
    private final Set f112960a;

    public C43230a() {
        this((byte[]) null);
    }

    public /* synthetic */ C43230a(byte[] bArr) {
        this.f112960a = new LinkedHashSet();
    }

    /* renamed from: a */
    public final boolean add(Class cls) {
        C69664n.m101061g(cls, "element");
        return this.f112960a.add(cls);
    }

    public final boolean addAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        return this.f112960a.addAll(collection);
    }

    public final void clear() {
        this.f112960a.clear();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Class)) {
            return false;
        }
        Class cls = (Class) obj;
        C69664n.m101061g(cls, "element");
        return this.f112960a.contains(cls);
    }

    public final boolean containsAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        return this.f112960a.containsAll(collection);
    }

    public final boolean isEmpty() {
        return this.f112960a.isEmpty();
    }

    public final Iterator iterator() {
        return this.f112960a.iterator();
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Class)) {
            return false;
        }
        Class cls = (Class) obj;
        C69664n.m101061g(cls, "element");
        return this.f112960a.remove(cls);
    }

    public final boolean removeAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        return this.f112960a.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        return this.f112960a.retainAll(collection);
    }

    public final /* bridge */ int size() {
        return this.f112960a.size();
    }

    public final Object[] toArray() {
        return C69658h.m101049a(this);
    }

    public final Object[] toArray(Object[] objArr) {
        C69664n.m101061g(objArr, "array");
        return C69658h.m101050b(this, objArr);
    }
}
