package p3186j$.util.stream;

import java.util.Comparator;
import p3186j$.util.Spliterator;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.stream.p2 */
final class C41287p2 implements Spliterator, Consumer {

    /* renamed from: d */
    private static final Object f107998d = new Object();

    /* renamed from: a */
    private final Spliterator f107999a;

    /* renamed from: b */
    private final ConcurrentHashMap f108000b;

    /* renamed from: c */
    private Object f108001c;

    C41287p2(Spliterator spliterator) {
        this(spliterator, new ConcurrentHashMap());
    }

    private C41287p2(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.f107999a = spliterator;
        this.f108000b = concurrentHashMap;
    }

    public final void accept(Object obj) {
        this.f108001c = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final int characteristics() {
        return (this.f107999a.characteristics() & -16469) | 1;
    }

    public final long estimateSize() {
        return this.f107999a.estimateSize();
    }

    public final void forEachRemaining(Consumer consumer) {
        this.f107999a.forEachRemaining(new C41252h(8, this, consumer));
    }

    public final Comparator getComparator() {
        return this.f107999a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo43864m(Consumer consumer, Object obj) {
        Object obj2;
        if (obj != null) {
            obj2 = obj;
        } else {
            obj2 = f107998d;
        }
        if (this.f108000b.putIfAbsent(obj2, Boolean.TRUE) == null) {
            consumer.accept(obj);
        }
    }

    public final boolean tryAdvance(Consumer consumer) {
        while (this.f107999a.tryAdvance(this)) {
            Object obj = this.f108001c;
            if (obj == null) {
                obj = f107998d;
            }
            if (this.f108000b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.accept(this.f108001c);
                this.f108001c = null;
                return true;
            }
        }
        return false;
    }

    public final Spliterator trySplit() {
        Spliterator trySplit = this.f107999a.trySplit();
        if (trySplit != null) {
            return new C41287p2(trySplit, this.f108000b);
        }
        return null;
    }
}
