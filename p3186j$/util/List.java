package p3186j$.util;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.RandomAccess;
import p3186j$.time.temporal.ChronoUnit;
import p3186j$.util.function.UnaryOperator;

/* renamed from: j$.util.List */
public interface List<E> extends Collection<E> {

    /* renamed from: j$.util.List$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<E> {
        public static Spliterator $default$spliterator(java.util.List list) {
            if (list instanceof RandomAccess) {
                return new C41058a(list);
            }
            return new C41056Y(16, (Collection) Objects.requireNonNull(list));
        }

        /* renamed from: a */
        public static java.util.List m71630a() {
            int i = C41329u.f108056a;
            return C41117l.f107691b;
        }

        /* renamed from: b */
        public static java.util.List m71631b(Serializable serializable, Serializable serializable2) {
            return new C41115j(serializable, serializable2);
        }

        /* renamed from: c */
        public static java.util.List m71632c(Object... objArr) {
            int length = objArr.length;
            if (length == 0) {
                int i = C41329u.f108056a;
                return C41117l.f107691b;
            } else if (length == 1) {
                return new C41115j(objArr[0]);
            } else {
                if (length != 2) {
                    return new C41117l(objArr);
                }
                return new C41115j(objArr[0], objArr[1]);
            }
        }

        /* renamed from: d */
        public static void m71633d(ChronoUnit chronoUnit, ChronoUnit chronoUnit2, ChronoUnit chronoUnit3) {
            new C41117l(chronoUnit, chronoUnit2, chronoUnit3);
        }
    }

    /* renamed from: j$.util.List$-EL  reason: invalid class name */
    public final /* synthetic */ class EL {
        public static void sort(java.util.List list, Comparator comparator) {
            if (list instanceof List) {
                ((List) list).sort(comparator);
                return;
            }
            Object[] array = list.toArray();
            Arrays.sort(array, comparator);
            ListIterator listIterator = list.listIterator();
            for (Object obj : array) {
                listIterator.next();
                listIterator.set(obj);
            }
        }
    }

    void add(int i, E e);

    boolean add(E e);

    boolean addAll(int i, Collection<? extends E> collection);

    boolean addAll(Collection<? extends E> collection);

    void clear();

    boolean contains(Object obj);

    boolean containsAll(Collection<?> collection);

    boolean equals(Object obj);

    E get(int i);

    int hashCode();

    int indexOf(Object obj);

    boolean isEmpty();

    Iterator<E> iterator();

    int lastIndexOf(Object obj);

    ListIterator<E> listIterator();

    ListIterator<E> listIterator(int i);

    E remove(int i);

    boolean remove(Object obj);

    boolean removeAll(Collection<?> collection);

    void replaceAll(UnaryOperator<E> unaryOperator);

    boolean retainAll(Collection<?> collection);

    E set(int i, E e);

    int size();

    void sort(Comparator<? super E> comparator);

    Spliterator<E> spliterator();

    java.util.List<E> subList(int i, int i2);

    Object[] toArray();

    <T> T[] toArray(T[] tArr);
}
