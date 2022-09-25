package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p5462h.p5473f.p5475b.C69658h;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.a */
/* compiled from: PG */
public final class C34217a implements Set, C69640a {

    /* renamed from: a */
    private final Set f91048a;

    public C34217a(Set set) {
        C69664n.m101061g(set, "delegate");
        this.f91048a = set;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C34043bf)) {
            return false;
        }
        C34043bf bfVar = (C34043bf) obj;
        C69664n.m101061g(bfVar, "element");
        return this.f91048a.contains(bfVar);
    }

    public final boolean containsAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        return this.f91048a.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C34217a) && C69664n.m101066l(this.f91048a, ((C34217a) obj).f91048a);
    }

    public final int hashCode() {
        return this.f91048a.hashCode();
    }

    public final boolean isEmpty() {
        return this.f91048a.isEmpty();
    }

    public final Iterator iterator() {
        return this.f91048a.iterator();
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return this.f91048a.size();
    }

    public final Object[] toArray() {
        return C69658h.m101049a(this);
    }

    public final Object[] toArray(Object[] objArr) {
        C69664n.m101061g(objArr, "array");
        return C69658h.m101050b(this, objArr);
    }

    public final String toString() {
        Set set = this.f91048a;
        return "AwaitStatePropagationSources(delegate=" + set + ")";
    }
}
