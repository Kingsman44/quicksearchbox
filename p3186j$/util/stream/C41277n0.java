package p3186j$.util.stream;

import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntFunction;

/* renamed from: j$.util.stream.n0 */
interface C41277n0 {
    /* renamed from: a */
    C41277n0 mo43644a(int i);

    long count();

    void forEach(Consumer consumer);

    /* renamed from: i */
    void mo43650i(Object[] objArr, int i);

    /* renamed from: l */
    int mo43651l();

    /* renamed from: m */
    Object[] mo43652m(IntFunction intFunction);

    /* renamed from: n */
    C41277n0 mo43653n(long j, long j2, IntFunction intFunction);

    Spliterator spliterator();
}
