package p3186j$.util;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import p3186j$.lang.C40948a;
import p3186j$.util.List;
import p3186j$.util.Set;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntFunction;
import p3186j$.util.function.Predicate;
import p3186j$.util.stream.Stream;
import p3186j$.util.stream.StreamSupport;

/* renamed from: j$.util.Collection */
public interface Collection<E> extends C40948a {

    /* renamed from: j$.util.Collection$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<E> {
        public static Stream $default$parallelStream(java.util.Collection collection) {
            return StreamSupport.stream(EL.m71620a(collection), true);
        }

        public static boolean $default$removeIf(java.util.Collection collection, Predicate predicate) {
            if (DesugarCollections.f107492a.isInstance(collection)) {
                return DesugarCollections.m71623c(collection, predicate);
            }
            Objects.requireNonNull(predicate);
            Iterator it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (predicate.test(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        public static Spliterator $default$spliterator(java.util.Collection collection) {
            return new C41056Y(0, (java.util.Collection) Objects.requireNonNull(collection));
        }

        public static Stream $default$stream(java.util.Collection collection) {
            return StreamSupport.stream(EL.m71620a(collection), false);
        }

        public static Object[] $default$toArray(java.util.Collection collection, IntFunction intFunction) {
            return collection.toArray((Object[]) intFunction.apply(0));
        }

        /* renamed from: a */
        public static void m71619a(java.util.Collection collection, Consumer consumer) {
            Objects.requireNonNull(consumer);
            for (Object accept : collection) {
                consumer.accept(accept);
            }
        }
    }

    /* renamed from: j$.util.Collection$-EL  reason: invalid class name */
    public final /* synthetic */ class EL {
        /* renamed from: a */
        public static Spliterator m71620a(java.util.Collection collection) {
            if (collection instanceof Collection) {
                return ((Collection) collection).spliterator();
            }
            if (collection instanceof LinkedHashSet) {
                return new C41056Y(17, (java.util.Collection) Objects.requireNonNull((LinkedHashSet) collection));
            }
            if (collection instanceof SortedSet) {
                SortedSet sortedSet = (SortedSet) collection;
                return new C41037E(sortedSet, sortedSet);
            } else if (collection instanceof Set) {
                return Set.CC.$default$spliterator((java.util.Set) collection);
            } else {
                if (collection instanceof List) {
                    return List.CC.$default$spliterator((java.util.List) collection);
                }
                return CC.$default$spliterator(collection);
            }
        }

        public static /* synthetic */ void forEach(java.util.Collection collection, Consumer consumer) {
            if (collection instanceof Collection) {
                ((Collection) collection).forEach(consumer);
            } else {
                CC.m71619a(collection, consumer);
            }
        }

        public static /* synthetic */ boolean removeIf(java.util.Collection collection, Predicate predicate) {
            return collection instanceof Collection ? ((Collection) collection).removeIf(predicate) : CC.$default$removeIf(collection, predicate);
        }

        public static /* synthetic */ Stream stream(java.util.Collection collection) {
            return collection instanceof Collection ? ((Collection) collection).stream() : CC.$default$stream(collection);
        }

        public static /* synthetic */ Object[] toArray(java.util.Collection collection, IntFunction intFunction) {
            return collection instanceof Collection ? ((Collection) collection).toArray((IntFunction<T[]>) intFunction) : CC.$default$toArray(collection, intFunction);
        }
    }

    boolean add(E e);

    boolean addAll(java.util.Collection<? extends E> collection);

    void clear();

    boolean contains(Object obj);

    boolean containsAll(java.util.Collection<?> collection);

    void forEach(Consumer<? super E> consumer);

    boolean isEmpty();

    Iterator<E> iterator();

    Stream<E> parallelStream();

    boolean remove(Object obj);

    boolean removeAll(java.util.Collection<?> collection);

    boolean removeIf(Predicate<? super E> predicate);

    boolean retainAll(java.util.Collection<?> collection);

    int size();

    Spliterator<E> spliterator();

    Stream<E> stream();

    Object[] toArray();

    <T> T[] toArray(IntFunction<T[]> intFunction);

    <T> T[] toArray(T[] tArr);
}
