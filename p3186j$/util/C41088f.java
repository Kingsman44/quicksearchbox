package p3186j$.util;

import java.util.AbstractCollection;
import java.util.Collection;
import p3186j$.util.Collection;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntFunction;
import p3186j$.util.function.Predicate;
import p3186j$.util.stream.Stream;

/* renamed from: j$.util.f */
abstract class C41088f extends AbstractCollection implements Collection {
    C41088f() {
    }

    public final boolean add(Object obj) {
        int i = C41329u.f108056a;
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        int i = C41329u.f108056a;
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        int i = C41329u.f108056a;
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        Collection.CC.m71619a(this, consumer);
    }

    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    public final boolean remove(Object obj) {
        int i = C41329u.f108056a;
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(java.util.Collection collection) {
        int i = C41329u.f108056a;
        throw new UnsupportedOperationException();
    }

    public final boolean removeIf(Predicate predicate) {
        int i = C41329u.f108056a;
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(java.util.Collection collection) {
        int i = C41329u.f108056a;
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection.CC.$default$toArray(this, intFunction);
    }
}
