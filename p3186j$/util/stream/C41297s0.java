package p3186j$.util.stream;

import java.util.Collection;
import p3186j$.util.Collection;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntFunction;

/* renamed from: j$.util.stream.s0 */
final class C41297s0 implements C41277n0 {

    /* renamed from: a */
    private final Collection f108018a;

    C41297s0(Collection collection) {
        this.f108018a = collection;
    }

    /* renamed from: a */
    public final C41277n0 mo43644a(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final long count() {
        return (long) this.f108018a.size();
    }

    public final void forEach(Consumer consumer) {
        Collection.EL.forEach(this.f108018a, consumer);
    }

    /* renamed from: i */
    public final void mo43650i(Object[] objArr, int i) {
        for (Object obj : this.f108018a) {
            objArr[i] = obj;
            i++;
        }
    }

    /* renamed from: l */
    public final /* synthetic */ int mo43651l() {
        return 0;
    }

    /* renamed from: m */
    public final Object[] mo43652m(IntFunction intFunction) {
        java.util.Collection collection = this.f108018a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    /* renamed from: n */
    public final /* synthetic */ C41277n0 mo43653n(long j, long j2, IntFunction intFunction) {
        return C41241e0.m72105w(this, j, j2, intFunction);
    }

    public final Spliterator spliterator() {
        return Collection.EL.stream(this.f108018a).spliterator();
    }

    public final String toString() {
        java.util.Collection collection = this.f108018a;
        return String.format("CollectionNode[%d][%s]", new Object[]{Integer.valueOf(collection.size()), collection});
    }
}
