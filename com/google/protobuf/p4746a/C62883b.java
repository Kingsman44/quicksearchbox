package com.google.protobuf.p4746a;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p3186j$.lang.Iterable$CC;
import p3186j$.util.Collection;
import p3186j$.util.List;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntFunction;
import p3186j$.util.function.Predicate;
import p3186j$.util.function.UnaryOperator;
import p3186j$.util.stream.Stream;
import p5462h.p5473f.p5475b.C69658h;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: com.google.protobuf.a.b */
/* compiled from: PG */
public final class C62883b implements List, p3186j$.util.List, C69640a {

    /* renamed from: a */
    private final List f169783a;

    public C62883b(List list) {
        C69664n.m101061g(list, "delegate");
        this.f169783a = list;
    }

    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        return this.f169783a.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        C69664n.m101061g(collection, "elements");
        return this.f169783a.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return C69664n.m101066l(this.f169783a, obj);
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    public final Object get(int i) {
        return this.f169783a.get(i);
    }

    public final int hashCode() {
        return this.f169783a.hashCode();
    }

    public final int indexOf(Object obj) {
        return this.f169783a.indexOf(obj);
    }

    public final boolean isEmpty() {
        return this.f169783a.isEmpty();
    }

    public final Iterator iterator() {
        return new C62887f(this.f169783a.iterator());
    }

    public final int lastIndexOf(Object obj) {
        return this.f169783a.lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        return new C62888g(this.f169783a.listIterator());
    }

    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    public final Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(java.util.Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(java.util.Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return this.f169783a.size();
    }

    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    public final java.util.List subList(int i, int i2) {
        return this.f169783a.subList(i, i2);
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

    public final String toString() {
        return this.f169783a.toString();
    }

    public final ListIterator listIterator(int i) {
        return new C62888g(this.f169783a.listIterator(i));
    }
}
