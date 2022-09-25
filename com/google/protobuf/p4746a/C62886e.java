package com.google.protobuf.p4746a;

import java.util.Collection;
import java.util.Iterator;
import p3186j$.lang.Iterable$CC;
import p3186j$.util.Collection;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntFunction;
import p3186j$.util.function.Predicate;
import p3186j$.util.stream.Stream;
import p5462h.p5473f.p5475b.C69658h;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: com.google.protobuf.a.e */
/* compiled from: PG */
public class C62886e implements Collection, p3186j$.util.Collection, C69640a {

    /* renamed from: a */
    private final Collection f169785a;

    public C62886e(Collection collection) {
        C69664n.m101061g(collection, "delegate");
        this.f169785a = collection;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return this.f169785a.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        return this.f169785a.containsAll(collection);
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    public final boolean isEmpty() {
        return this.f169785a.isEmpty();
    }

    public Iterator iterator() {
        return new C62887f(this.f169785a.iterator());
    }

    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(java.util.Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(java.util.Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return this.f169785a.size();
    }

    public /* synthetic */ Spliterator spliterator() {
        return Collection.CC.$default$spliterator(this);
    }

    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    public final Object[] toArray() {
        return C69658h.m101049a(this);
    }

    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection.CC.$default$toArray(this, intFunction);
    }

    public final Object[] toArray(Object[] objArr) {
        C69664n.m101061g(objArr, "array");
        return C69658h.m101050b(this, objArr);
    }
}
